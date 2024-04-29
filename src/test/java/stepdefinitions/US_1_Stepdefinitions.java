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

        ReusableMethods.loginHYBS("abdurrahman.alas","Als.2297");
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



}
