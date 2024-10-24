package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.security.Key;
import java.time.Instant;

import static org.testng.AssertJUnit.assertTrue;
import static utilities.Driver.driver;

public class US_3_Stepdefinitions {

    PageHYBS pageHYBS = new PageHYBS();
    Actions actions = new Actions(Driver.getDriver());
    String subjectText;
    String expectedKelime;
    String actualKelime;
    SoftAssert softAssert = new SoftAssert();
    private WebElement dropdown;

    private WebElement provinceContainer;

    @Given("User should be able to click on OPERATION MODULE")
    public void user_should_be_able_to_click_on_operatıon_module() {

        pageHYBS.isletmeModuluLink.click();
      //  actions.moveToElement(pageHYBS.FirmaListesi).perform();
      //  assertTrue(pageHYBS.FirmaListesi.isDisplayed());
      //  actions.moveToElement(pageHYBS.AracListesi).perform();
      //  assertTrue(pageHYBS.AracListesi.isDisplayed());


    }

    @Given("The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed.\"")
    public void the_user_clicks_on_the_company_lıst_link_and_goes_to_the_relevant_page_and_it_is_tested_that_the_information_about_the_companies_is_listed() {

        pageHYBS.FirmaListesi.click();

        softAssert.assertTrue(pageHYBS.firmaUnvanibasligi.isDisplayed());
        softAssert.assertTrue(pageHYBS.islemvemobiluygulamatelefonbasligi.isDisplayed());
        softAssert.assertTrue(pageHYBS.ilcebasligi.isDisplayed());
        softAssert.assertTrue(pageHYBS.adresbasligi.isDisplayed());
        softAssert.assertTrue(pageHYBS.epostabasligi.isDisplayed());
        softAssert.assertTrue(pageHYBS.sicilnobasligi.isDisplayed());
        softAssert.assertAll();


    }


    @Given("click group dropdown")
    public void click_group_dropdown() {


        ReusableMethods.wait(3);
        pageHYBS.firmalistesilütfengrupsecinizdropdown.click();


    }

    @Given("Verifies that category dropbox options are visible and selectable")
    public void verifies_that_category_dropbox_options_are_visible_and_selectable() throws InterruptedException {


        ReusableMethods.wait(3);
        pageHYBS.firmaListesiGrupDropdown_INPUT.sendKeys("Hafriyatçı" + Keys.ENTER);

        Assert.assertTrue(pageHYBS.firmaListesiGrupDropdown_HAFRIYATCIKONTROL.isDisplayed());

        ReusableMethods.wait(2);

        pageHYBS.firmalistesilütfengrupsecinizdropdown.click();
        pageHYBS.firmaListesiGrupDropdown_INPUT.sendKeys("ilçe belediye" +Keys.ENTER);
        ReusableMethods.wait(1);

        Assert.assertTrue(pageHYBS.firmaListesiGrupDropdown_ILCEBELEDIYECONTROL.isDisplayed());
    }


    @Given("click user passive radiobutton and verify user passive list")
    public void click_user_passive_radiobutton_and_verify_user_passive_list() {

        pageHYBS.userpassivelist.click();

        Assert.assertTrue(pageHYBS.userpassivelistEVET.isDisplayed());
        ReusableMethods.wait(2);
        pageHYBS.userpassivelist.click();

    }

    @Given("click cleaning company radiobutton and verify cleaning company list")
    public void click_cleaning_company_radiobutton_and_verify_cleaning_company_list() {

        pageHYBS.blacklist.click();
        Assert.assertTrue(pageHYBS.blacklistEVET.isDisplayed());
        ReusableMethods.wait(2);
        pageHYBS.blacklist.click();

    }

    @Given("click black list radiobutton and black list")
    public void click_black_list_radiobutton_and_black_list() {
        pageHYBS.cleancompanylist.click();
        Assert.assertTrue(pageHYBS.cleancompanyEVET.isDisplayed());
        ReusableMethods.wait(2);
        pageHYBS.cleancompanylist.click();
    }


    @Given("When the user clicks on the SearchBoxes one by one, a listing should be made according to the categories to be searched.\"")
    public void when_the_user_clicks_on_the_search_boxes_one_by_one_a_listing_should_be_made_according_to_the_categories_to_be_searched() {


        pageHYBS.nameInput.sendKeys("YERGİNLER HAFRİYAT");
        ReusableMethods.wait(1);
        pageHYBS.phoneInput.sendKeys("530 147 75 06");
        ReusableMethods.wait(1);
        pageHYBS.provinceInput.sendKeys("Kocasinan");
        ReusableMethods.wait(1);
        pageHYBS.addressInput.sendKeys("GEVHER NESİBE MH ATATÜRK BLV no:46/5 KOCASİNAN");
        ReusableMethods.wait(1);
        pageHYBS.emailInput.sendKeys("yerginlerinsaat@hotmail.com");
        pageHYBS.registerNoInput.sendKeys("19815");

        pageHYBS.taxOfficeInput.sendKeys("GEVHER NESİBE VERGİ DAİRESİ");

// Girilen metinleri kontrol et
        Assert.assertEquals(pageHYBS.nameInput.getAttribute("value"), "YERGİNLER HAFRİYAT");
        Assert.assertEquals(pageHYBS.phoneInput.getAttribute("value"), "530 147 75 06");
        Assert.assertEquals(pageHYBS.provinceInput.getAttribute("value"), "Kocasinan");
        Assert.assertEquals(pageHYBS.addressInput.getAttribute("value"), "GEVHER NESİBE MH ATATÜRK BLV no:46/5 KOCASİNAN");
        Assert.assertEquals(pageHYBS.emailInput.getAttribute("value"), "yerginlerinsaat@hotmail.com");
        Assert.assertEquals(pageHYBS.registerNoInput.getAttribute("value"), "19815");

        Assert.assertEquals(pageHYBS.taxOfficeInput.getAttribute("value"), "GEVHER NESİBE VERGİ DAİRESİ");


    }

    @Given("click new company button")
    public void click_new_company_button() {


        pageHYBS.newCompanyButton.click();
    }

    @Given("The system should confirm that it is on the New Company page,then enter the company information, and finally press the button to add the new company seamlessly.")
    public void the_system_should_confirm_that_it_is_on_the_new_company_page_then_enter_the_company_information_and_finally_press_the_button_to_add_the_new_company_seamlessly() {


        // Alanları doldurma
        pageHYBS.taxIdInputt.sendKeys("12345678");
        ReusableMethods.wait(1);
        pageHYBS.titleInputt.sendKeys("YERGİNLER HAFRİYAT");
        ReusableMethods.wait(5);
        pageHYBS.nameInputt.sendKeys("XYZ Ltd.");
        ReusableMethods.wait(3);
        pageHYBS.phoneInputt.sendKeys("1234567890");
        pageHYBS.phone1Inputt.sendKeys("0987654321");
        pageHYBS.emailInputt.sendKeys("info@companyxyz.com");
        ReusableMethods.scrolldown_bypixel_2000();

        ReusableMethods.wait(3);

        Select selectFirmaTipi = new Select(pageHYBS.firmaTipiDropdown);

        // İkinci seçeneği seç
        selectFirmaTipi.selectByIndex(1);

        // İkinci seçeneğin değerini al
        String secondSelectedOption = selectFirmaTipi.getFirstSelectedOption().getText();

        pageHYBS.companyAddilceLIST.click();
        ReusableMethods.wait(3);
        pageHYBS.companyAddLıstINPUT.sendKeys("Talas" + Keys.ENTER);
        ReusableMethods.scrolldown_bypixel_2000();
        ReusableMethods.wait(6);
        pageHYBS.vergidairesiLİST.click();
        ReusableMethods.wait(2);
        pageHYBS.vergidairesiLİSTINPUT.sendKeys("MİMARSİNAN VERGİ DAİRESİ" + Keys.ENTER);


        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        ReusableMethods.wait(3);
        pageHYBS.companyAddHAFRIYATCIKAMULIST.click();
        ReusableMethods.wait(1);
        pageHYBS.companyAddHAFRIYATCIKAMUINPUT.sendKeys("Kamu" + Keys.ENTER);


        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        pageHYBS.companyAddaddressINPUT.sendKeys("YENİ MAHALLE ABDURRAHMAN");


        ReusableMethods.wait(3);
        pageHYBS.isletmeModuluLink.click();
        pageHYBS.FirmaListesi.click();
        pageHYBS.nameInput.sendKeys("YERGİNLER HAFRİYAT");
        ReusableMethods.wait(1);


        // Bilgilerin doğru bir şekilde kaydedildiğini doğrula
         Assert.assertTrue(pageHYBS.yerginlerControl.isDisplayed());

    }

    @Given("There should be an EXCEL import button on the Company List page and all ACTIVE AND PASSIVE DELETED companies in the system should be able to be exported to Excel.")
    public void there_should_be_an_excel_import_button_on_the_company_list_page_and_all_actıve_and_passıve_deleted_companies_in_the_system_should_be_able_to_be_exported_to_excel() {

        pageHYBS.firmaListesi_EXCELBUTTON.click();
        ReusableMethods.wait(5);
        // İndirme işlemini kontrol et
        String downloadPath = System.getProperty("user.home") + "/Downloads"; // İndirme klasörü yolu
        File file = new File(downloadPath + "/export(10)"); // Beklenen dosya adını güncelle

        // Dosyanın varlığını kontrol et
        assertTrue("Dosya indirilemedi.", file.exists());



    }


}