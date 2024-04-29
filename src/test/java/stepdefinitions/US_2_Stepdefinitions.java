package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;
import static utilities.Driver.driver;

public class US_2_Stepdefinitions {


    PageHYBS pageHYBS=new PageHYBS();
    Actions actions = new Actions(Driver.getDriver());

    String expectedUrl;
    String actualUrl;
    SoftAssert softAssert = new SoftAssert();
    // bu satır, bir WebDriver nesnesi üzerinde fare eylemlerini zincirleme bir şekilde gerçekleştirmek için kullanılan Actions sınıfını başlatır.

    @Given("The Home Page, Business Module, Request Lists, Water, and Sanitation Request Lists links should be visible and clickable.")
    public void the_home_page_business_module_request_lists_water_and_sanitation_request_lists_links_should_be_visible_and_clickable() {



        softAssert.assertTrue(pageHYBS.AnasayfaLink.isDisplayed(), "it doesn't seem here");
        softAssert.assertTrue(pageHYBS.isletmeModuluLink.isDisplayed(), "it doesn't seem here");
        softAssert.assertTrue(pageHYBS.TalepListeleriLink.isDisplayed(), "it doesn't seem here");
        softAssert.assertTrue(pageHYBS.SuveKiTalepLink.isDisplayed(), "it doesn't seem here");

        softAssert.assertAll();






    }
    @Given("It should be verified that the user navigates to the Home Page, Business Module, Request Lists, Water, and Sanitation Request Lists links.")
    public void ıt_should_be_verified_that_the_user_navigates_to_the_home_page_business_module_request_lists_water_and_sanitation_request_lists_links() {



        actions.moveToElement(pageHYBS.AnasayfaLink).perform();
        assertTrue(pageHYBS.AnasayfaLink.isDisplayed());
        actions.moveToElement(pageHYBS.isletmeModuluLink).perform();
        assertTrue(pageHYBS.isletmeModuluLink.isDisplayed());
        actions.moveToElement(pageHYBS.TalepListeleriLink).perform();
        assertTrue(pageHYBS.TalepListeleriLink.isDisplayed());
        actions.moveToElement(pageHYBS.SuveKiTalepLink).perform();
        assertTrue(pageHYBS.SuveKiTalepLink.isDisplayed());




    }


    @Given("verify that the HomePage link opens")
    public void verify_that_the_home_page_link_opens() {

        pageHYBS.AnasayfaLink.click();



    }

    @Given("return to page")
    public void return_to_page() {

        ReusableMethods.wait(3);
        Driver.getDriver().navigate().back();


    }
    @Given("verify that the BusinessModule link opens")
    public void verify_that_the_business_module_link_opens() {


        PageHYBS pageHYBS=new PageHYBS();
        pageHYBS.isletmeModuluLink.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(pageHYBS.FirmaListesi.isDisplayed());
         Assert.assertTrue(pageHYBS.AracListesi.isDisplayed());

        ReusableMethods.wait(3);



    }
    @Given("verify that the RequestLists link opens")
    public void verify_that_the_request_lists_link_opens() {


        pageHYBS.TalepListeleriLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.YapıRuhsatTalebiLinki.isDisplayed());
        Assert.assertTrue(pageHYBS.HariciKazıTalebiLinki.isDisplayed());



    }
    @Given("verify that the WaterandSanitation Request Lists link opens")
    public void verify_that_the_waterand_sanitation_request_lists_link_opens() {

        pageHYBS.suveKiTalepLinki.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.altyapıTaleblink.isDisplayed());

    }


    //************************************************* 2

    @Given("Work processes, Water and KI work processes, Dump site movements, Small Tool links should be visible and clicked.")
    public void work_processes_water_and_kı_work_processes_dump_site_movements_small_tool_links_should_be_visible_and_clicked() {


     //   softAssert.assertTrue(pageHYBS.isSurecleriLink.isDisplayed(), "it doesn't seem here");
     // ReusableMethods.wait(1);
     // softAssert.assertTrue(pageHYBS.suveKiissureclerilink.isDisplayed(), "it doesn't seem here");
     // ReusableMethods.wait(1);
     // softAssert.assertTrue(pageHYBS.dokumsahasihareketleri.isDisplayed(), "it doesn't seem here");
     // ReusableMethods.wait(1);
     // softAssert.assertTrue(pageHYBS.kucukaraclink.isDisplayed(), "it doesn't seem here");

     // softAssert.assertAll();

        actions.moveToElement(pageHYBS.isSurecleriLink).perform();
        assertTrue(pageHYBS.isSurecleriLink.isDisplayed());
        actions.moveToElement(pageHYBS.suveKiissureclerilink).perform();
        assertTrue(pageHYBS.suveKiTalepLinki.isDisplayed());
        actions.moveToElement(pageHYBS.dokumsahasihareketleri).perform();
        assertTrue(pageHYBS.dokumsahasihareketleri.isDisplayed());
    }

    @Given("verify that the Work processes link opens")
    public void verify_that_the_work_processes_link_opens() {

        pageHYBS.isSurecleriLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.yapiRuhsatliisSurecleriLink.isDisplayed());
        Assert.assertTrue(pageHYBS.hariciKaziisSurecleriLink.isDisplayed());
        Assert.assertTrue(pageHYBS.insaatDolguisSurecleriLink.isDisplayed());


    }
    @Given("verify that the Water and KI work processes link opens")
    public void verify_that_the_water_and_kı_work_processes_link_opens() {

        pageHYBS.suveKiissureclerilink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.altyapıissurecilink.isDisplayed());


    }
    @Given("verify that the Small Tool link opens")
    public void verify_that_the_small_tool_link_opens() {
        pageHYBS.kucukaraclink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.kucukaracislemleri.isDisplayed());
        pageHYBS.kucukaraclink.click();


    }

    @Given("Storage and Casting, Financial List, Reports, Vehicle Tracking System links should appear and be clicked.")
    public void storage_and_casting_financial_list_reports_vehicle_tracking_system_links_should_appear_and_be_clicked() {

        actions.moveToElement(pageHYBS.dokumsahasihareketleri).perform();
        assertTrue(pageHYBS.dokumsahasihareketleri.isDisplayed());
        actions.moveToElement(pageHYBS.maliListesilinki).perform();
        assertTrue(pageHYBS.maliListesilinki.isDisplayed());
        actions.moveToElement(pageHYBS.raporlarlinki).perform();
        assertTrue(pageHYBS.raporlarlinki.isDisplayed());
        actions.moveToElement(pageHYBS.aracTakipSistemilinki).perform();
        assertTrue(pageHYBS.aracTakipSistemilinki.isDisplayed());

    }
    @Given("verify that the Stoage and Casting link opens")
    public void verify_that_the_stoage_and_casting_link_opens() {

        pageHYBS.dokumsahasihareketleri.click();
        ReusableMethods.wait(4);
        Assert.assertTrue(pageHYBS.dokumsahasihareketleri.isDisplayed());


    }
    @Given("verify that the Financial link opens")
    public void verify_that_the_financial_link_opens() {


        pageHYBS.maliListesilinki.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.maliListesilinki.isDisplayed());

    }
    @Given("verify that the Reports opens")
    public void verify_that_the_reports_opens() {

        pageHYBS.raporlarlinki.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.raporlarlinki.isDisplayed());
        ReusableMethods.wait(2);
        pageHYBS.raporlarlinki.click();


    }
    @Given("verify that the Vehicle Tracking opens")
    public void verify_that_the_vehicle_tracking_opens() {


        ReusableMethods.wait(2);
        Assert.assertTrue(pageHYBS.aracTakipSistemilinki.isDisplayed());

        // Orijinal pencereyi sakla
        String originalWindow = driver.getWindowHandle();
        pageHYBS.aracTakipSistemilinki.click();

        // Yeni açılan pencerelerin setini al
        Set<String> windows = driver.getWindowHandles();
        // Yeni açılan pencereyi bul ve ana pencereyle değiştir
        for (String window : windows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Yeni sekmedeki URL'i al
        String newTabURL = driver.getCurrentUrl();

        // Doğru URL'yi assert ile kontrol et
        assert newTabURL.equals("https://kayseri.n2mobil.com.tr/giris-yap?next=/") : "Beklenen URL doğru değil"; // Beklenen URL'yi uygun şekilde değiştirin

        System.out.println("Doğru URL");
        driver.quit();

    }


}
