package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import static utilities.Driver.driver;

public class US_4_Stepdefinitions {

    PageHYBS pageHYBS = new PageHYBS();
    Actions actions = new Actions(Driver.getDriver());

    @Given("click on the inspect eye icon")
    public void click_on_the_inspect_eye_icon() {
        pageHYBS.incelegözsimgesi.click();
    }

    @Given("Company Name and Registration number must appear.")
    public void company_name_and_registration_number_must_appear() {


        Assert.assertTrue(pageHYBS.firmaAdıveSicilNoGeldimi.isDisplayed());


    }

    @Given("The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible")
    public void the_company_s_balance_ats_document_extend_blacklıst_buttons_should_be_visible() {
        Assert.assertTrue(pageHYBS.ATSOnayBelgesiButton.isDisplayed());
        Assert.assertTrue(pageHYBS.karaListeyeAlbutton.isDisplayed());

    }

    @Given("The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST and their functions should work properly when clicked.")
    public void the_company_s_balance_ats_document_extend_blacklıst_and_their_functions_should_work_properly_when_clicked() {

        pageHYBS.ATSOnayBelgesiButton.click();

        Assert.assertTrue(pageHYBS.ATSBelgesiUzatText.isDisplayed());
        ReusableMethods.wait(3);
        pageHYBS.ATSBelgesiUzatTextinUzerindekiCarpı.click();
        ReusableMethods.wait(3);
        pageHYBS.karaListeyeAlbutton.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(pageHYBS.karalisteText.isDisplayed());
        pageHYBS.KaralisteTextIptalbutonu.click();


    }


    @Given("the user clicks on Company_Information,Company_Personnel,Company_Users,Company_Documents,Vehicles,Vehicle_Documents,Financial_Transactions,TIB,Balance_Movements,Call_List,Construction_Fill_List,Penalty_List,Complaint_List,CONTRACT link")
    public void the_user_clicks_on_company_ınformation_company_personnel_company_users_company_documents_vehicles_vehicle_documents_financial_transactions_tıb_balance_movements_call_list_construction_fill_list_penalty_list_complaint_list_contract_link() {

        pageHYBS.companyInformationLink.click();
        Assert.assertTrue(pageHYBS.companyInformationlinkTable.isDisplayed());
        pageHYBS.companyPersonnelLink.click();
        Assert.assertTrue(pageHYBS.companyPersonnelLinkTable.isDisplayed());
        pageHYBS.companyUsersLink.click();
        Assert.assertTrue(pageHYBS.companyUsersLinkTable.isDisplayed());
        pageHYBS.companyDocumentsLink.click();
        Assert.assertTrue(pageHYBS.companyDocumentsLinkTable.isDisplayed());
        pageHYBS.vehicleDocumentsLink.click();
        Assert.assertTrue(pageHYBS.vehicleDocumentsLinkTable.isDisplayed());
        pageHYBS.financialTransactionsLink.click();
        Assert.assertTrue(pageHYBS.financialTransactionsLinkTable.isDisplayed());
        pageHYBS.TIBLink.click();
        Assert.assertTrue(pageHYBS.TIBLinkTable.isDisplayed());
        pageHYBS.balanceMovementsLink.click();
        Assert.assertTrue(pageHYBS.balanceMovementsLinkTable.isDisplayed());
        pageHYBS.callListLink.click();
        Assert.assertTrue(pageHYBS.callListLinkTable.isDisplayed());
        pageHYBS.constructionFillListLink.click();
        Assert.assertTrue(pageHYBS.constructionFillListLinkTable.isDisplayed());
        pageHYBS.penaltyListLink.click();
        Assert.assertTrue(pageHYBS.penaltyListLinkTable.isDisplayed());
        pageHYBS.complaintListLink.click();
        Assert.assertTrue(pageHYBS.complaintListLinkTable.isDisplayed());

    }

    @Given("the user clicks on the {string} link and the user verifies that the company information is correctly loaded")
    public void the_user_clicks_on_the_link_and_the_user_verifies_that_the_company_information_is_correctly_loaded(String string) {

        pageHYBS.companyInformationLink.click();
        Assert.assertTrue(pageHYBS.companyInformationlinkTable.isDisplayed());


    }

    @Given("the user clicks on the {string} button the user verifies that the company information update form is opened")
    public void the_user_clicks_on_the_button_the_user_verifies_that_the_company_information_update_form_is_opened(String string) {

        pageHYBS.companyinformationUpdateButton.click();

    }

    @Given("the user enters new information the user verifies that the information is updated")
    public void the_user_enters_new_information_the_user_verifies_that_the_information_is_updated() {


        // Alanları doldurma
        pageHYBS.taxIdInputt.clear();
        pageHYBS.taxIdInputt.sendKeys("52625");
        ReusableMethods.wait(1);
        pageHYBS.titleInputt.clear();
        pageHYBS.titleInputt.sendKeys("GUNCELLEMEDeniyoruz");
        ReusableMethods.wait(2);
        pageHYBS.nameInputt.clear();
        pageHYBS.nameInputt.sendKeys("XYZ Ltd.");
        ReusableMethods.wait(3);
        pageHYBS.phoneInputt.clear();
        pageHYBS.phoneInputt.sendKeys("1234567890");
        ReusableMethods.wait(2);
        pageHYBS.emailInputt.clear();
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
        pageHYBS.companyAddLıstINPUT.sendKeys("Kocasinan" + Keys.ENTER);
        ReusableMethods.scrolldown_bypixel_2000();
        ReusableMethods.wait(6);
        pageHYBS.vergidairesiLİST.click();
        ReusableMethods.wait(2);
        pageHYBS.vergidairesiLİSTINPUT.sendKeys("GEVHER NESİBE VERGİ DAİRESİ" + Keys.ENTER);


        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        ReusableMethods.wait(3);
        pageHYBS.companyAddHAFRIYATCIKAMULIST.click();
        ReusableMethods.wait(1);
        pageHYBS.companyAddHAFRIYATCIKAMUINPUT.sendKeys("İLÇE" + Keys.ENTER);


        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        pageHYBS.companyAddaddressINPUT.sendKeys(" ABDURRAHMAN GÜNCELLEME DENİYOR");


    }


    @Given("the user clicks on the COMPANY PERSONNEL link and the user verifies that the company information is correctly loaded")
    public void the_user_clicks_on_the_company_personnel_link_and_the_user_verifies_that_the_company_information_is_correctly_loaded() {

        pageHYBS.companyPersonnelLink.click();
        Assert.assertTrue(pageHYBS.companyPersonnelLinkTable.isDisplayed());


    }

    @Given("the user enters CompanyPersonnel new information the user verifies that the information is enter")
    public void the_user_enters_company_personnel_new_information_the_user_verifies_that_the_information_is_enter() {


        pageHYBS.companyPersonelNameGiris.sendKeys("DenemeA");
        pageHYBS.companyPersonelTelefonGiris.sendKeys("05050505");
        pageHYBS.companyPersonelTelefonGiris2.sendKeys("050505064+46405");
        pageHYBS.companyPersonelEmailGiris.sendKeys("apo@gmail");

        pageHYBS.CompanydocumentDropdownTicaretSicilSAVEBUTTON.click();


    }

    @Given("the user clicks on the COMPANY DOCUMENTS  button the user verifies that the company information update form is opened")
    public void the_user_clicks_on_the_company_documents_button_the_user_verifies_that_the_company_information_update_form_is_opened() {

        pageHYBS.companyDocumentsLink.click();
        Assert.assertTrue(pageHYBS.companyDocumentsLinkTable.isDisplayed());

    }

    @Given("the user enters CompanyDocuments new information the user verifies that the information is enter")
    public void the_user_enters_company_documents_new_information_the_user_verifies_that_the_information_is_enter() throws FileNotFoundException {


        pageHYBS.CompanyDocumentName.sendKeys("2.denemeyapıyoruz la");

        Select select = new Select(pageHYBS.CompanydocumentDropdownTicaretSicil);
        select.selectByVisibleText("Fatura");

        ReusableMethods.wait(3);
        actions.sendKeys(Keys.PAGE_DOWN);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(5);


        String dosyaYolu = "C:\\Users\\aalas\\Desktop\\resim\\java.docx.docx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        System.out.println(System.getProperty("user.dir"));

        WebElement dosyaSecButonu = driver.findElement(By.xpath("(//input[@id=\"id_path\"])[1]"));
        /*
          dosya sec butonuna bastiktan sonra
          bilgisayardan selenium ile dosya secmemiz mumkun degil
          onun yerine
          dosyaSecButonu.sendKeys("DosyaYolu") yaparsak
          dosya secme islemi yapilmis olacaktir
         */

        String yuklenecekDosyaYolu = System.getProperty("user.home") +
                "\\Desktop\\resimler\\zabıta.png";

        //    "/Users/ahmetbulutluoz/Desktop/FileTesti/deneme.txt"

        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);

        ReusableMethods.wait(5);

        pageHYBS.companydocumentFILEUPLOADsave.click();


    }

    @Given("the user clicks on the VEHICLE link and the user verifies that the company information is correctly loaded")
    public void the_user_clicks_on_the_vehıcle_link_and_the_user_verifies_that_the_company_information_is_correctly_loaded() {

        pageHYBS.vehiclesLink.click();
        ReusableMethods.wait(2);


    }

    @Given("the user enters VEHICLE new information the user verifies that the information is enter")
    public void the_user_enters_vehıcle_new_information_the_user_verifies_that_the_information_is_enter() {

        pageHYBS.vehicleplate.click();
        pageHYBS.vehicleplate.sendKeys("38DE345");
        pageHYBS.vehicleAge.sendKeys("1989");
        pageHYBS.vehicleHgs.sendKeys("123123123");
        pageHYBS.vehicleKAPASITE.sendKeys("130000");
        pageHYBS.vehicleMARKADROPDOWN.click();
        pageHYBS.companyAddLıstINPUT.sendKeys("MAN" + Keys.ENTER);
        pageHYBS.vehicleTIPDROPDOWN.click();
        pageHYBS.vehicleTIPDROPDOWNINPUT.sendKeys("Kamyon" + Keys.ENTER);
        pageHYBS.vehicleCIHAZIMEI.click();
        pageHYBS.vehicleKAPASITE.sendKeys("19000" + Keys.ENTER);
        pageHYBS.vehicleMODELDROPDOWN.click();
        pageHYBS.vehicleMODELDROPDOWNINPUT.sendKeys("CF");
        pageHYBS.vehicleSIMKARTNO.sendKeys("1234");
        pageHYBS.vehicleDAMPERSENSORUVARYOK.click();
        pageHYBS.vehicleSAVEBUTTON.click();


    }

    @Given("the user clicks on the VEHICLEDOCUMENT link and the user verifies that the company information is correctly loaded")
    public void the_user_clicks_on_the_vehıcledocument_link_and_the_user_verifies_that_the_company_information_is_correctly_loaded() {
        pageHYBS.vehicleDocumentsLink.click();
        ReusableMethods.wait(2);
    }

    @Given("the user enters VEHICLEDOCUMENT new information the user verifies that the information is enter")
    public void the_user_enters_vehıcledocument_new_information_the_user_verifies_that_the_information_is_enter() throws FileNotFoundException {

        pageHYBS.vehicleDOCUMENTPLATE.click();
        pageHYBS.vehicleDOCUMENTPLATEINPUT.sendKeys("38DE345" + Keys.ENTER);
        pageHYBS.vehicleDOCUMENTNAME.sendKeys("belge yukleniyor");
        ReusableMethods.wait(1);
        Select select = new Select(pageHYBS.vehicleDOCUMENTALTTIP);
        select.selectByVisibleText("Servis Formu");
        ReusableMethods.wait(5);

        String dosyaYolu = "C:\\Users\\aalas\\Desktop\\resim\\java.docx.docx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        System.out.println(System.getProperty("user.dir"));
        ReusableMethods.wait(5);

        WebElement dosyaSecButonu = driver.findElement(By.xpath("(//input[@id=\"id_path\"])[1]"));

        String yuklenecekDosyaYolu = System.getProperty("user.home") +
                "\\Desktop\\resimler\\zabıta.png";

        //    "/Users/ahmetbulutluoz/Desktop/FileTesti/deneme.txt"

        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);


        pageHYBS.companydocumentFILEUPLOADsave.click();
    }

    @Given("you click on the FINANCIAL TRANSACTIONS heading, the relevant page should appear and BALANCE LOADING,BALANCE DECLINE,PAYMENT CONTROL,CREATING A TRANSPORT PERMIT CERTIFICATE,TRANSPORT PERMIT RENEWAL\"The buttons must be clickable and these titles must work without any problems.\"")
    public void you_click_on_the_fınancıal_transactıons_heading_the_relevant_page_should_appear_and_balance_loadıng_balance_declıne_payment_control_creatıng_a_transport_permıt_certıfıcate_transport_permıt_renewal_the_buttons_must_be_clickable_and_these_titles_must_work_without_any_problems() {

        pageHYBS.financialTransactionsLink.click();
        ReusableMethods.wait(1);

        Assert.assertTrue(pageHYBS.financialTransactionsLinkTable.isDisplayed());
        // BURASINI API TESTIİ YAPARKEN TESTLERİ ALINMALI API BAĞLANTISI VAR ***************************************************************

    }

    @Given("clicked on the TIB header, the relevant page should appear, and the ATS APPROVAL CODE should be entered.\"")
    public void clicked_on_the_tıb_header_the_relevant_page_should_appear_and_the_ats_approval_code_should_be_entered() {

        pageHYBS.TIBLink.click();
        Assert.assertTrue(pageHYBS.TIBLinkTable.isDisplayed());


    }


    @Given("When clicked on the BALANCE TRANSACTIONS header, the relevant page should appear. Users should be able to perform queries smoothly using the Search box and checkboxes")
    public void when_clicked_on_the_balance_transactıons_header_the_relevant_page_should_appear_users_should_be_able_to_perform_queries_smoothly_using_the_search_box_and_checkboxes() {

        pageHYBS.balanceMovementsLink.click();


// Başlangıç tarih alanının JavaScript elementini bul
        WebElement startDateInput = driver.findElement(By.id("start_date"));

// JavaScript executor oluştur
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

// Başlangıç tarih alanındaki mevcut tarihi sil
        jsExecutor.executeScript("arguments[0].value = '';", startDateInput);

// İstenilen tarihi giriş alanına gir
        jsExecutor.executeScript("arguments[0].value = '02/02/2024';", startDateInput);


        // BİTİS tarih alanının JavaScript elementini bul
        WebElement startDateInput1 = driver.findElement(By.id("stop_date"));

// JavaScript executor oluştur
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;

// Başlangıç tarih alanındaki mevcut tarihi sil
        jsExecutor.executeScript("arguments[0].value = '';", startDateInput1);

// İstenilen tarihi giriş alanına gir
        jsExecutor.executeScript("arguments[0].value = '12/02/2024';", startDateInput1);

        pageHYBS.vehiclePleaseSelect.click();

        pageHYBS.balancemovementsSearch.click();


    }


    @Given("When you click on the CALL LIST, CONSTRUCTION FILLER LIST, PENALTY LIST, COMPLAINT LIST, the relevant page should appear. and querying can be done without any problems with Searchbox and checkboxes.")
    public void when_you_click_on_the_call_lıst_constructıon_fıller_lıst_penalty_lıst_complaınt_lıst_the_relevant_page_should_appear_and_querying_can_be_done_without_any_problems_with_searchbox_and_checkboxes() {


        pageHYBS.callListLink.click();
        Assert.assertTrue(pageHYBS.callListLinkTable.isDisplayed());
        ReusableMethods.wait(1);
        pageHYBS.constructionFillListLink.click();
        Assert.assertTrue(pageHYBS.constructionFillListLinkTable.isDisplayed());
        ReusableMethods.wait(1);
        pageHYBS.penaltyListLink.click();
        Assert.assertTrue(pageHYBS.penaltyListLinkTable.isDisplayed());
        ReusableMethods.wait(1);
        pageHYBS.complaintListLink.click();
        Assert.assertTrue(pageHYBS.complaintListLinkTable.isDisplayed());

    }


    @Given("verify TAAHHUTNAME page")
    public void verify_taahhutname_page() {

        // "Taahhütname" düğmesini bul
        WebElement undertakingButton = driver.findElement(By.xpath("//button[contains(text(), 'Taahhütname')]"));

        // Düğmeye tıkla
        undertakingButton.click();

        ReusableMethods.wait(3);
        // Şu anki pencereyi sakla
        String mainWindowHandle = driver.getWindowHandle();

        // Diğer açılan pencereleri sakla
        Set<String> windowHandles = driver.getWindowHandles();

        // Yeni pencereyi bul ve geçiş yap
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Yeni pencerenin başlığını kontrol et
        String newWindowTitle = driver.getTitle();
        if (newWindowTitle.contains("Taahhütname")) {
            System.out.println("Taahhütname penceresi başarıyla açıldı.");
        } else {
            System.out.println("Taahhütname penceresi açılmadı veya beklenmeyen bir başlık var.");
        }


    }
}





