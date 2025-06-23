package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.PageHYBS;

public class US_8_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();

    @Given("User should be able to click on ADA-PARSEL")
    public void user_should_be_able_to_click_on_ada_parsel() {

        pageHYBS.AdaParselSorgulamaLink.click();

    }
    @Given("User should be able to click Search Ada-Parcel")
    public void user_should_be_able_to_click_search_ada_parcel() {

        pageHYBS.AdaParselSorgulamaSEARCH_ADA.sendKeys("232");
        pageHYBS.AdaParselSorgulamaSEARCH_PARSEL.sendKeys("5");



    }
    @Given("When the user clicks on the business type dropdown, the required business type should be selectable.")
    public void when_the_user_clicks_on_the_business_type_dropdown_the_required_business_type_should_be_selectable() {

        pageHYBS.AdaParselSorgulama_BUSINESS_TYPE.click();
        pageHYBS.AdaParselSorgulama_BUSINESS_TYPE_INPUT.sendKeys("Yapı Ruhsatlı"+ Keys.ENTER);
        pageHYBS.AdaParselSorgulama_SORGULAMA_BUTTON.click();


    }
    @Given("Test whether the relevant parcel number and business type are correct in the search results")
    public void test_whether_the_relevant_parcel_number_and_business_type_are_correct_in_the_search_results() {

        // Tablonun görünürlüğünü kontrol et ve doğrula
        Assert.assertTrue(pageHYBS.AdaParselSorgulama_LIST_TABLE.isDisplayed(), "Table is not displayed!");

// Tablo içinde aranan metni al ve doğrula
        String expectedSearch = "232";
        String actualSearch = pageHYBS.AdaParselSorgulama_LIST_TABLE.getText();
        Assert.assertTrue(actualSearch.contains(expectedSearch), "Expected search text '" + expectedSearch + "' not found in table!");

// Tablo bilgilerini yazdır
        System.out.println("Table Information: " + pageHYBS.AdaParselSorgulama_LIST_TABLE);



    }

}
