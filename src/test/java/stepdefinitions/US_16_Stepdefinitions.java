package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_16_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();

    @Given("click on the ısSurecleri")
    public void click_on_the_ıs_surecleri() {

        pageHYBS.isSurecleriLink.click();

    }
    @Given("click on the yapıRuhsatliIsSurecleri")
    public void click_on_the_yapı_ruhsatli_ıs_surecleri() {

   pageHYBS.yapıRuhsatlıIsSurecılink.click();
    }
    @Given("In building permit work processes, it must be verified that the search criteria are entered and searched.")
    public void ın_building_permit_work_processes_it_must_be_verified_that_the_search_criteria_are_entered_and_searched() {
        Select select=new Select(pageHYBS.yapiRuhsatliIsSurecleri_ARAMADROPDOWNLISTESECENEGI);
        select.selectByIndex(2);

        Select select1=new Select(pageHYBS.yapiRuhsatliIsSurecleri_ARAMADROPDOWNISLEMSECENEGI);
        select1.selectByIndex(0);

        pageHYBS.yapiRuhsatliIsSurecleri_ARAMAINPUT.sendKeys("HAYAL MİMARLIK");
        ReusableMethods.wait(3);


        Assert.assertTrue(pageHYBS.yapiRuhsatliIsSurecleri_arananbulundumu.isDisplayed());


    }



    @Given("It should be verified when you go to the relevant page when the View button is clicked.")
    public void ıt_should_be_verified_when_you_go_to_the_relevant_page_when_the_view_button_is_clicked() {

        pageHYBS.yapiRuhsatliIsSurecleri_GORUNTULE.click();
        String expectedUrl="https://kayserihybs.n2mobil.com.tr/hafriyat/job/detail/";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }


    @Given("click on the hariciKaziIsSurecleri")
    public void click_on_the_harici_kazi_ıs_surecleri() {

        pageHYBS.hariciKaziisSurecleriLink.click();


    }
    @Given("In building permit work processes haricikazı, it must be verified that the search criteria are entered and searched.")
    public void ın_building_permit_work_processes_haricikazı_it_must_be_verified_that_the_search_criteria_are_entered_and_searched() {

        Select select=new Select(pageHYBS.hariciKaziIsSurecleri_ARAMADROPDOWNLISTESECENEGI);
        select.selectByIndex(2);

        Select select1=new Select(pageHYBS.hariciKaziIsSurecleri_ARAMADROPDOWNISLEMSECENEGI);
        select1.selectByIndex(0);


        pageHYBS.hariciKaziIsSurecleri_ARAMAINPUT.sendKeys("1510");


        Assert.assertTrue(pageHYBS.haricikaziIsSurecleri_arananbulundumu.isDisplayed());

        //td[text()=" 1510"]

    }


    @Given("It should be verified when you go to the relevant HARİCİDETAY when the View button is clicked.")
    public void ıt_should_be_verified_when_you_go_to_the_relevant_haricidetay_when_the_view_button_is_clicked() {

        pageHYBS.hariciKaziisSurecleri_GORUNTULE.click();

        String expectedUrl="https://kayserihybs.n2mobil.com.tr/hafriyat/hkcd/detail/";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }

}
