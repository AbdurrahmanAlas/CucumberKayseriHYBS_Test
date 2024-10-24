package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_1_Stepdefinitions {

    PageHYBS pageHYBS =new PageHYBS();


    @Given("Login to HYBS site, click the Login button and log in with your User information.")
    public void loginToHYBSSiteClickTheLoginButtonAndLogInWithYourUserInformation() {

        ReusableMethods.loginHYBS("abdurrahman.alas","Als.060619");
    }


    @Then("it is verified that it went to the requested page")
    public void it_is_verified_that_it_went_to_the_requested_page() {

        String expectedUrl="https://kayserihybs.n2mobil.com.tr/hafriyat/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

    }
    @Then("close page")
    public void close_page() {


        Driver.quitDriver();


    }


    @Then("Checks on the homepage that the title is Trendlifebuy Online Shopping")
    public void checksOnTheHomepageThatTheTitleIsTrendlifebuyOnlineShopping() {

        String expectedTitle="Trendlifebuy Online Shopping";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }

    @Given("Login to HYBS site, click the Login button and log in with your Wrong User information.")
    public void login_to_hybs_site_click_the_login_button_and_log_in_with_your_wrong_user_information() {

        ReusableMethods.loginHYBS("yanlısbilgi@gmail.com","yanlıspassword");
        ReusableMethods.wait(1);


    }

    @Given("It must be verified that the warning message has arrived")
    public void ıt_must_be_verified_that_the_warning_message_has_arrived() {
       Assert.assertTrue(pageHYBS.uyarımesajı.isDisplayed());
    }


}
