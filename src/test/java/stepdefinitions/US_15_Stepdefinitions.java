package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

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


        pageHYBS.plateInput.sendKeys("Deneme yapıyoruz");
        pageHYBS.kucukAractaxId.sendKeys("1234567890");

        pageHYBS.kucukAracnameInput.sendKeys("Deneme");

        pageHYBS.kucukAracSurnameInput.sendKeys("Doe");


        ReusableMethods.wait(3);
        pageHYBS.kucukAracTipiDropdownn.click();
        pageHYBS.kucukAracTipiDropdownnInput.sendKeys("kamyonet" + Keys.ENTER);


        pageHYBS.kucukAracTipiTelefon.sendKeys("05422522325");
        pageHYBS.kucukAracTipigmail.sendKeys("deneme@gmali.com");
        // Diğer form alanlarını doldur...

        pageHYBS.kucukAracTipiEKLEBUTTON.click();

        driver.navigate().back();
        ReusableMethods.wait(2);


        // Tablo satırını bul
        WebElement tableRow = driver.findElement(By.xpath("//tr[@role='row' and contains(td, 'DENEME134')]"));

        // Tablo satırının varlığını doğrula
        assertTrue(tableRow.isDisplayed());


    }
}
