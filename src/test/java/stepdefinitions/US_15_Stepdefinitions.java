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


        pageHYBS.plateInput.sendKeys("Deneme yapıy");
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
        ReusableMethods.wait(6);

        pageHYBS.kucukaraclink.click();
        pageHYBS.KucukAracIslemleriLink.click();


        ReusableMethods.wait(3);
        // Listede kontrol et

        // Listeyi kontrol et
        boolean isInfoCorrect = checkList("Deneme yapıy", "1234567890", "Deneme", "Doe");

        // Doğrulama
        assertTrue(isInfoCorrect);
    }

    public boolean checkList(String plate, String taxId, String name, String surname) {
        // Listede kontrol et
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sm_list_dt']//tr"));
        boolean found = false;
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() >= 4) {
                String cellPlate = cells.get(0).getText();
                String cellTaxId = cells.get(1).getText();
                String cellName = cells.get(2).getText();
                String cellSurname = cells.get(3).getText();
                if (cellPlate.equals(plate) && cellTaxId.equals(taxId) && cellName.equals(name) && cellSurname.equals(surname)) {
                    found = true;
                    break;
                }
            }
        }
        return found;

    }



}

