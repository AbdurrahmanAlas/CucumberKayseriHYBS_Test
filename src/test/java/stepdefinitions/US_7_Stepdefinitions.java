package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class US_7_Stepdefinitions {
    PageHYBS pageHYBS=new PageHYBS();
    @Given("User should be able to click on VEHICLE RENTAL")
    public void user_should_be_able_to_click_on_vehıcle_rental() {

        pageHYBS.vehicleRentalLink.click();

    }
    @Given("The relevant company should be selected from the company dropdown.")
    public void the_relevant_company_should_be_selected_from_the_company_dropdown() {

     String expectedUrl="https://kayserihybs.n2mobil.com.tr/hafriyat/vehicle/select-hire";
     String actualUrl= driver.getCurrentUrl();

        assertTrue(actualUrl.contains(expectedUrl));


    }
    @Given("The appropriate company and vehicle should be selectable from the list of available vehicles.")
    public void the_appropriate_company_and_vehicle_should_be_selectable_from_the_list_of_available_vehicles() {

        ReusableMethods.selectCompany(pageHYBS.companyList_DROPDOWN, pageHYBS.companyList_DROPDOWN_ıNPUT, "Baloğlu");

        pageHYBS.vehicleRental_KIRALANABILIRVEHICLES.sendKeys("MASTARCIOĞLU"+ Keys.ENTER);

        //BURADA MASTARCIOGLU SEARCHDEN GELİYOR ANCAK ONU SECEMİYORUZ SECMEK İCİN Bİ BUTON Bİ BELİRLEYİCİ YOK

        //burada olmayan bir buton için arama yapıyorum buton yok ise not found verecek
        try {
            WebElement button = driver.findElement(By.id("button_Selected_Id"));
            button.click();
        } catch (NoSuchElementException e) {
            System.out.println("Button not found!");
        }



    }
    @Given("The list of rented vehicles should appear when the date and company are entered in the rented vehicles list.")
    public void the_list_of_rented_vehicles_should_appear_when_the_date_and_company_are_entered_in_the_rented_vehicles_list() {

        pageHYBS.vehicleRental_KiralananVEHICLE_DATE.click();
        pageHYBS.vehicleRental_KiralananVEHICLE_COMPANYNAME.sendKeys("MASTARCIOGLU");

        // Beklenen kelime
        String expectedKelime = "MASTARCIOGLU";

        // Gerçekleşen kelimeyi alınması gereken yerden alalım (Örneğin: pageHYBS.vehicleRental_KiralananVEHICLE_COMPANYNAME_LIST.toString())
        String actualKelime = pageHYBS.vehicleRental_KiralananVEHICLE_COMPANYNAME_LIST.toString();

        // Assert kullanarak beklenen kelimenin gerçek kelime içinde olup olmadığını kontrol edelim
        Assert.assertTrue(actualKelime.contains(expectedKelime), "Expected word '" + expectedKelime + "' not found in actual word: " + actualKelime);

    }


}
