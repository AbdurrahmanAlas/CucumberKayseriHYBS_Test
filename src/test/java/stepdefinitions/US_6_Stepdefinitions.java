package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;

import static org.testng.AssertJUnit.assertTrue;
import static utilities.Driver.driver;

public class US_6_Stepdefinitions {
    PageHYBS pageHYBS = new PageHYBS();

    @Given("User should be able to click on VEHICLE LIST")
    public void user_should_be_able_to_click_on_vehıcle_lıst() {

        pageHYBS.araclistesiLİNK.click();
        ReusableMethods.wait(3);

    }

    @Given("Test whether the checkbox has status or not.")
    public void test_whether_the_checkbox_has_status_or_not() {


        // Checkbox'ın mevcut olduğunu ve görünür olduğunu doğrula
        Assert.assertTrue("Checkbox is not visible.", pageHYBS.araclistesindekiTASIMACHECKBOXU.isDisplayed());
       // Checkbox'a tıkla
        pageHYBS.araclistesindekiTASIMACHECKBOXU.click();

        ReusableMethods.wait(3);
        Assert.assertTrue(pageHYBS.checkboxatıklayıncaTARIHGELDIMI.isDisplayed());


    }


    @Given("Test whether the ATS checkbox has status or not.")
    public void test_whether_the_ats_checkbox_has_status_or_not() {


        // Checkbox'a tıkla
        pageHYBS.ATScheckbox.click();

        ReusableMethods.wait(4);
        Assert.assertTrue(pageHYBS.checkboxATSyetıklayıncaTARIHGELDIMI.isDisplayed());


    }

    @Given("Verify that when clicking on the dropdown, Construction and Public are selected, and the relevant categories are displayed.")
    public void verify_that_when_clicking_on_the_dropdown_construction_and_public_are_selected_and_the_relevant_categories_are_displayed() {

        // Dropdown elementini bul
        pageHYBS.dropdownKAMU.click();

        // Seçenekleri içeren Select nesnesi oluştur
        Select select = new Select(pageHYBS.dropdownKAMU);

        // "Hafriyatçı" seçeneğini seç ve doğrula
        select.selectByValue("0");
        WebElement selectedOption = select.getFirstSelectedOption();
        assert selectedOption.getText().equals("Hafriyatçı") : "Hafriyatçı seçeneği doğrulanamadı.";

      ReusableMethods.wait(3);

        // "Kamu" seçeneğini seç ve doğrula
        select.selectByValue("100");
        selectedOption = select.getFirstSelectedOption();
        assert selectedOption.getText().equals("Kamu") : "Kamu seçeneği doğrulanamadı.";


    }

    @Given("Verify that when clicking on the go to Company")
    public void verify_that_when_clicking_on_the_go_to_company() {

        pageHYBS.gotoCompany.click();
        Assert.assertTrue(pageHYBS.gotoCompanyGELDIMI.isDisplayed());
        driver.navigate().back();
        pageHYBS.gotoVehicleDetay.click();

        ReusableMethods.wait(3);
        String expectedUrl = "https://kayserihybs.n2mobil.com.tr/hafriyat/vehicle/vehicle-details/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }


    @Given("There should be an EXCEL import button on the Vehicle List page and all ACTIVE AND PASSIVE DELETED companies in the system should be able to be exported to Excel.")
    public void there_should_be_an_excel_import_button_on_the_vehicle_list_page_and_all_actıve_and_passıve_deleted_companies_in_the_system_should_be_able_to_be_exported_to_excel() {

        pageHYBS.aracListesi_EXCELBUTTON.click();

        ReusableMethods.wait(5);
        // İndirme işlemini kontrol et
        String downloadPath = System.getProperty("user.home") + "/Downloads"; // İndirme klasörü yolu
        File file = new File(downloadPath + "/export(10)"); // Beklenen dosya adını güncelle

        // Dosyanın varlığını kontrol et
        assertTrue("Dosya indirilemedi.", file.exists());

        // bu kısımda EXCEL butonu olup firmaların tüm bilgilerin dökülmesi gerekiyor ancak EXCEL butonu yok.
        // EXCEL BUTONU EKLENİNCE DOGRULAMA YAPILACAK.



    }
}
