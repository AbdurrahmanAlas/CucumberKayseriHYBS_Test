package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class US_15_Stepdefinitions {

    PageHYBS pageHYBS = new PageHYBS();


    @Given("click the KucukAracModuleLink")
    public void click_the_kucuk_arac_module_link() {


        pageHYBS.kucukaraclink.click();
    }

    @Given("click on the Kucuk AracIslemleri link")
    public void click_on_the_kucuk_arac_ıslemleri_link() {
        pageHYBS.kucukaracislemleri.click();
    }

    @Given("click on the Kucuk Arac Ekle button")
    public void click_on_the_kucuk_arac_ekle_button() {
        pageHYBS.KucukAracEkleButton.click();
    }

    @Given("Enter information about the vehicle to be added and verify that the addition has been made.")
    public void enter_information_about_the_vehicle_to_be_added_and_verify_that_the_addition_has_been_made() {


        pageHYBS.plateInput.sendKeys("38 RL 433");
        pageHYBS.kucukAractaxId.sendKeys("12345678944");

        pageHYBS.kucukAracnameInput.sendKeys("Deneme");

        pageHYBS.kucukAracSurnameInput.sendKeys("Doe");


        ReusableMethods.wait(3);
        pageHYBS.kucukAracTipiDropdownn.click();
        pageHYBS.kucukAracTipiDropdownnInput.sendKeys("kamyonet" + Keys.ENTER);


        pageHYBS.kucukAracTipiTelefon.sendKeys("05422522325");
        pageHYBS.kucukAracTipigmail.sendKeys("deneme@gmali.com");
        // Diğer form alanlarını doldur...

        // pageHYBS.kucukAracTipiEKLEBUTTON.click();
        ReusableMethods.wait(3);

        pageHYBS.kucukaraclink.click();
        pageHYBS.KucukAracIslemleriLink.click();


        Assert.assertTrue(pageHYBS.kucukAracPlakaGeldimi.isDisplayed());
        Assert.assertTrue(pageHYBS.kucukAractaxIDgeldimi.isDisplayed());
    }


    @Given("click on the Kucuk_AracIncelebutton")
    public void click_on_the_kucuk_arac_ıncelebutton() {

        pageHYBS.kucukAracislemleriINCELEBUTTON.click();


    }
    @Given("click on the Kucuk_AracGuncellbutton")
    public void click_on_the_kucuk_arac_guncellbutton() {
       pageHYBS.kucukAracislemleriGUNCELLEBUTTON.click();

    }
    @Given("It should be verified that it can be updated")
    public void ıt_should_be_verified_that_it_can_be_updated() {

        pageHYBS.plateInput.clear();
        pageHYBS.plateInput.sendKeys("38 RL 352");
        pageHYBS.kucukAractaxId.clear();
        pageHYBS.kucukAractaxId.sendKeys("12345678944");

        pageHYBS.kucukAracnameInput.clear();
        pageHYBS.kucukAracnameInput.sendKeys("Deneme");

        pageHYBS.kucukAracSurnameInput.clear();
        pageHYBS.kucukAracSurnameInput.sendKeys("denemeyapıyoruz");


        ReusableMethods.wait(3);
        pageHYBS.kucukAracTipiDropdownn.click();
        pageHYBS.kucukAracTipiDropdownnInput.sendKeys("kamyonet" + Keys.ENTER);


        pageHYBS.kucukAracTipiTelefon.sendKeys("05422522325");
        pageHYBS.kucukAracTipigmail.sendKeys("deneme@gmali.com");
        // Diğer form alanlarını doldur...

         pageHYBS.kucukAracTipiGUNCELLEBUTTON.click();
        ReusableMethods.wait(3);

        pageHYBS.kucukaraclink.click();
        pageHYBS.KucukAracIslemleriLink.click();


        Assert.assertTrue(pageHYBS.kucukAracGuncelPlakaGeldimi.isDisplayed());
        Assert.assertTrue(pageHYBS.kucukAractaxIDgeldimi.isDisplayed());
    }


    @Given("click on the document_button")
    public void click_on_the_document_button() {

        pageHYBS.kucukAracislemleriBELGELERLINK.click();


    }
    @Given("Document information must be entered and verified that it has been entered correctly.")
    public void document_information_must_be_entered_and_verified_that_it_has_been_entered_correctly() {

 pageHYBS.kucukAracislemleriBELGELERNAME.sendKeys("DenemeBelge");

        Select select=new Select(pageHYBS.kucukAracislemleriBELGELERDROPDOWNKISI);
        select.selectByIndex(2);

        WebElement dosyaSecButonu = driver.findElement(By.xpath("(//input[@id=\"id_path\"])[1]"));

        String yuklenecekDosyaYolu = System.getProperty("user.home") +
                "\\Desktop\\resimler\\deneme.jpeg";

        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);

        ReusableMethods.wait(2);

        pageHYBS.kucukAracislemleriBELGELERekleButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.kucukAracislemleriBELGELEREKLENDIMICONTROL.isDisplayed());

    }


    @Given("An entered document should be able to be deleted")
    public void an_entered_document_should_be_able_to_be_deleted() {


        pageHYBS.kucukAracislemleriBELGELER_deleteButton.click();
        //burda delete butonu yok BUG VAR

    }
}








