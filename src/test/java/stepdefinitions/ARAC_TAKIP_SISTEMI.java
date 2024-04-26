package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHYBS;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

import static utilities.Driver.driver;

public class ARAC_TAKIP_SISTEMI {

    PageHYBS pageHYBS = new PageHYBS();
    int i;
    @Given("Log in n2mobil to the website.")
    public void log_in_n2mobil_to_the_website() {


        ReusableMethods.TakipLoginHYBS("abddurrahman.alas", "alas.54786");
        ReusableMethods.wait(10);
        pageHYBS.aractakipgirisdeOKBUTONU.click();
    }

    @Given("Access the History Tracking Module.")
    public void access_the_history_tracking_module() {

        ReusableMethods.wait(3);

        pageHYBS.aractakipsagusttekarelerisareti.click();
        pageHYBS.gecmisIzlemeRaporuLink.click();
        ReusableMethods.wait(5);

    }


    @Given("Generate historical reports for all vehicles.")
    public void generate_historical_reports_for_all_vehicles() throws InterruptedException {

        ReusableMethods.wait(10);
   // Locatorunu al
        WebElement dropdownelement=driver.findElement(By.id("//*[@id=\"fleet_select2_\"]"));

        // select nesne uret

        Select select=new Select(dropdownelement);

        select.selectByVisibleText("ADEM BÖLÜKBAŞ");







    }
















    @Given("Verify the reports.allurereport")
    public void verify_the_reports_allurereport() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Log out.\"")
    public void log_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
