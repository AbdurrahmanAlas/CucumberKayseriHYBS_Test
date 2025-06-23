package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.PageHYBS;
import utilities.ReusableMethods;

public class US_17_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();

    @Given("click on the financial transactions")
    public void click_on_the_financial_transactions() {


        pageHYBS.firmaListesi_MaliIslemlerbutton.click();

    }
    @Given("Click on the top up balance button and verify that the balance has been loaded by entering the information.")
    public void click_on_the_top_up_balance_button_and_verify_that_the_balance_has_been_loaded_by_entering_the_information() {

    pageHYBS.firmaListesi_MaliIslemler_BakiyeYüklemeButton.click();
    pageHYBS.firmaListesi_MaliIslemler_BakiyeYükle_TUTARINPUT.sendKeys("900");
    }



    @Given("Click on the balance deduction button and enter the information to confirm the balance deduction.")
    public void click_on_the_balance_deduction_button_and_enter_the_information_to_confirm_the_balance_deduction() {


        ReusableMethods.wait(2);
    pageHYBS.firmaListesi_MaliIslemlerBAKIYEDUSUMUBUTTON.click();


    pageHYBS.firmaListesi_MaliIslemlerBAKIYEDUSUMUTUTARINPUT.sendKeys("900");
    ReusableMethods.wait(1);
        pageHYBS.firmaListesi_MaliIslemlerBAKIYEDUSUMUACIKLAMAINPUT.sendKeys("Deneme yapıyoruz");

    }


    @Given("Click on the payment check button and Verify that it has been checked successfully\"")
    public void click_on_the_payment_check_button_and_verify_that_it_has_been_checked_successfully() {






    }


    @Given("WHEN THE TRANSPORT PERMIT CERTIFICATE CREATION BUTTON IS CLICKED, IT SHOULD BE CONFIRMED THAT IT HAS BEEN CREATED WITHOUT PROBLEM.\"")
    public void when_the_transport_permıt_certıfıcate_creatıon_button_ıs_clıcked_ıt_should_be_confırmed_that_ıt_has_been_created_wıthout_problem() {





    }

    @Given("WHEN THE TRANSPORT PERMIT CERTIFICATE RENEWAL BUTTON IS CLICKED, IT SHOULD BE VERIFIED THAT THE RENEWAL PROCESS HAS BEEN COMPLETED.\"")
    public void when_the_transport_permıt_certıfıcate_renewal_button_ıs_clıcked_ıt_should_be_verıfıed_that_the_renewal_process_has_been_completed() {





    }


}
