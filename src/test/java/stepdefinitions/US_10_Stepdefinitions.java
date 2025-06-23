package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.PageHYBS;
import utilities.ReusableMethods;

public class US_10_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();

    @Given("User should be able to click on COMPLAINT FORMLIST")
    public void user_should_be_able_to_click_on_complaınt_formlıst() {
      pageHYBS.sikayetListesiLink.click();
        ReusableMethods.wait(1);

    }
    @Given("I fill the form with complaint details for the date {string}")
    public void i_fill_the_form_with_complaint_details_for_the_date(String date) {
        pageHYBS.createDateInput.clear();
        pageHYBS.createDateInput.sendKeys(date);
        pageHYBS.createDateInput.sendKeys(Keys.ENTER); // Örneğin, Enter tuşuna basarak tarihi onaylayabiliriz
        pageHYBS.complainingUserInput.sendKeys("Deneme Giris");
        ReusableMethods.wait(1);
        pageHYBS.sikayetphoneInput.sendKeys("123456789");
        ReusableMethods.wait(1);
        pageHYBS.sikayetmailInput.sendKeys("example@example.com");
        ReusableMethods.wait(1);
        pageHYBS.sikayetreasonInput.sendKeys("Complaint about product quality");
        ReusableMethods.wait(2);
        pageHYBS.sikayetOlusturButton.click();

      // burada dogrulama yap
    }

}
