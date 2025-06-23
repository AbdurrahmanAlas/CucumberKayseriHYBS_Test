package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class US_14_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    @Given("Click on the InsaatDolguTalebi link")
    public void click_on_the_ınsaat_dolgu_talebi_link() {

        pageHYBS.talepListeleriLink.click();
        pageHYBS.INSAATDOLGUTALEBI_link.click();

    }
    @Given("Click on the Add yeni insaatDolguTalebi button")
    public void click_on_the_add_yeni_insaat_dolgu_talebi_button() {

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BUTTON.click();

    }
    @Given("Add and create information in yeni insaatDolguTalebi")
    public void add_and_create_information_in_yeni_insaat_dolgu_talebi() {

        pageHYBS.companyList_DROPDOWN.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_firmaSec.sendKeys("GECICI"+ Keys.ENTER);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_ılceDropdown.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_ılceDropdown_INPUT.sendKeys("Kocasinan"+Keys.ENTER);

        ReusableMethods.wait(3);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_mahalleDropdown.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_mahalleDropdown_INPUT.sendKeys("Fevzi"+Keys.ENTER);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_NEREDEN.sendKeys("sivassyolu");
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_NEREYE.sendKeys("vanyollu");

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ADA.sendKeys("4384747");
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_PARSEL.sendKeys("4954230");

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ILCE.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ILCE_INPUT.sendKeys("Tomarza"+Keys.ENTER);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_ADA.sendKeys("454");
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_PARSEL.sendKeys("4545");

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_ILCE.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_ILCE_INPUT.sendKeys("Sarız"+Keys.ENTER);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_ARACSAYISI.sendKeys("94543");

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_TALEPEDENKISI.sendKeys("kayserili talep etti");
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_TALEPEDENTELEFON.sendKeys("1646464464");



        // buraya kadar tamam assert ile kontrol etme olayını sonra yap olustur butonuna tıkla ve kontrol et


    }



    @Given("click on the InsaatDolguTalebiGüncelleButton")
    public void click_on_the_ınsaat_dolgu_talebi_güncelle_button() {

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_GUNCELLE_BUTTON.click();

        ReusableMethods.wait(3);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_NEREDEN.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_NEREYE.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ADA.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_PARSEL.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_ADA.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_PARSEL.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_ARACSAYISI.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_TALEPEDENKISI.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_TALEPEDENTELEFON.clear();

        ReusableMethods.scrolldown();

        pageHYBS.companyList_DROPDOWN.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_firmaSec.sendKeys("GECICI"+ Keys.ENTER);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_ılceDropdown.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_ılceDropdown_INPUT.sendKeys("Melikgazi"+Keys.ENTER);

        ReusableMethods.wait(3);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_mahalleDropdown.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_mahalleDropdown_INPUT.sendKeys("Becen"+Keys.ENTER);



        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_NEREDEN.sendKeys("kayserivanyolu");
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_NEREYE.sendKeys("hatayda bulus");

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ADA.sendKeys("52266");
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_PARSEL.sendKeys("4954230");

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ILCE.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ILCE_INPUT.sendKeys("Yahyalı"+Keys.ENTER);

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_ADA.sendKeys("454");
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_PARSEL.sendKeys("4545");

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_ILCE.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_BITIS_ILCE_INPUT.sendKeys("Kocasinan"+Keys.ENTER);

        ReusableMethods.wait(3);







        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_ARACSAYISI.sendKeys("94543");


        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_TALEPEDENKISI.clear();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_TALEPEDENKISI.sendKeys("kayserili talep etti");

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_TALEPEDENKISI.clear();
        ReusableMethods.wait(3);
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_TALEPEDENTELEFON.sendKeys("1646464464");








    }



    @Given("click on the InsaatDolguTalebi sil button")
    public void click_on_the_ınsaat_dolgu_talebi_sil_button() {

        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_SIL_BUTTON.click();
        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_SIL_IPTALET.click();
        ReusableMethods.wait(3);



    }
    @Given("go back to previous page")
    public void go_back_to_previous_page() {


        driver.navigate().back();
        ReusableMethods.wait(3);


    }
    @Given("click on the InsaatDolguTalebi yuklenenbelge button")
    public void click_on_the_ınsaat_dolgu_talebi_yuklenenbelge_button() {


        pageHYBS.yeniINSAATDOLGUTALEBIEKLE_YUKLENENBELGE.click();


    }


    @Given("verify that the uploaded document has been opened")
    public void verify_that_the_uploaded_document_has_been_opened() {


  String expectedUrl="https://kayserihybs.n2mobil.com.tr/media/belgeler/is_belgeleri/";
  String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl.contains(expectedUrl),false);

    }
}
