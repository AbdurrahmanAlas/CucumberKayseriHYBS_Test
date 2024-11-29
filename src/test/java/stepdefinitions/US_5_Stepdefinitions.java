package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class US_5_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    @Given("When the {string} button of any company is clicked, that company should be disabled.")
    public void when_the_button_of_any_company_is_clicked_that_company_should_be_disabled(String string) {

        pageHYBS.nameInput.sendKeys("Deneme" + Keys.ENTER);
        pageHYBS.disableEnableButton.click();
        ReusableMethods.wait(2);
        pageHYBS.disableEnableButtonEVET.click();
        ReusableMethods.wait(2);
        pageHYBS.userpassivelist.click();

        ReusableMethods.wait(2);

        Assert.assertTrue(pageHYBS.userdisableEnableAACOMPANYGORUNDUMU.isDisplayed());








    }


    @Given("When the {string} button of any company is clicked, that company should be deleted.")
    public void when_the_button_of_any_company_is_clicked_that_company_should_be_deleted(String string) {

        pageHYBS.nameInput.sendKeys("Deneme" + Keys.ENTER);

        pageHYBS.DELETEBUTTONFİRMALİSTESİ.click();
        ReusableMethods.wait(3);
        pageHYBS.DELETEBUTTONFİRMALİSTESİGORUNDUMU.click();

        ReusableMethods.wait(3);

        pageHYBS.deleteradiobuton.click();

        String expectedKelime="Deneme";
        String actualKelime= pageHYBS.DeleteList_SilinenVarmı.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));



    }
    @Given("When you click on the Delete radio button, the deleted items should appear.")
    public void when_you_click_on_the_delete_radio_button_the_deleted_items_should_appear() {

        pageHYBS.deleteradiobuton.click();

        String expectedKelime="Deneme";
        String actualKelime= pageHYBS.DeleteList_SilinenVarmı.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));



    }


    @Given("The user clicks on the disabled button")
    public void the_user_clicks_on_the_disabled_button() {

        pageHYBS.userpassivelist.click();


    }
    @Given("The {string} button for the company should be displayed, and the company should be able to be sent back to the ACTIVE company list.")
    public void the_button_for_the_company_should_be_displayed_and_the_company_should_be_able_to_be_sent_back_to_the_actıve_company_list(String string) {

        pageHYBS.nameInput.sendKeys("Deneme" +Keys.ENTER);
        ReusableMethods.wait(2);
        pageHYBS.AktifEtbutonu.click();
        pageHYBS.disableEnableButtonEVET.click();
        ReusableMethods.wait(2);
        pageHYBS.userpassivelist.click();
        ReusableMethods.wait(2);


        Assert.assertTrue(pageHYBS.denemefirmaAdı.isDisplayed());

    }


    @Given("The user clicks on the deleted button")
    public void the_user_clicks_on_the_deleted_button() {

        pageHYBS.deleteradiobuton.click();
        pageHYBS.nameInput.sendKeys("Deneme" +Keys.ENTER);
        ReusableMethods.wait(2);
        pageHYBS.AktifEtbutonu.click();
        pageHYBS.disableEnableButtonEVET.click();
        ReusableMethods.wait(2);
        pageHYBS.deleteradiobuton.click();
        ReusableMethods.wait(2);

        Assert.assertTrue(pageHYBS.denemefirmaAdı.isDisplayed());


    }








}
