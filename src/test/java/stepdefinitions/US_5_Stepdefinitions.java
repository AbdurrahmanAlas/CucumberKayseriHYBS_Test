package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.ReusableMethods;

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

        pageHYBS.DELETEBUTTONFİRMALİSTESİ.click();
        Assert.assertTrue(pageHYBS.DELETEBUTTONFİRMALİSTESİGORUNDUMU.isDisplayed());



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

}
