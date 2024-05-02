package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;
import pages.PageHYBS;

public class US_16_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();

    @Given("click on the ısSurecleri")
    public void click_on_the_ıs_surecleri() {

        Select select=new Select(pageHYBS.yapiRuhsatliIsSurecleri_ARAMADROPDOWNLISTESECENEGI);
        select.selectByIndex(2);

    }
    @Given("click on the yapıRuhsatliIsSurecleri")
    public void click_on_the_yapı_ruhsatli_ıs_surecleri() {

    Select select=new Select(pageHYBS.yapiRuhsatliIsSurecleri_ARAMADROPDOWNISLEMSECENEGI);
    select.selectByIndex(2);


    }
    @Given("In building permit work processes, it must be verified that the search criteria are entered and searched.")
    public void ın_building_permit_work_processes_it_must_be_verified_that_the_search_criteria_are_entered_and_searched() {




    }
}
