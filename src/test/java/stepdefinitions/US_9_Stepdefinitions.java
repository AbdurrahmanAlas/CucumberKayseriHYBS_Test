package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.ReusableMethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Key;

import static utilities.Driver.driver;

public class US_9_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    @Given("User should be able to click on CEZA_tAAHHUT_LIST")
    public void user_should_be_able_to_click_on_ceza_t_aahhut_lıst() {
       pageHYBS.cezaTaahhütListLINK.click();
        ReusableMethods.AssertUrlControl("https://kayserihybs.n2mobil.com.tr/hafriyat/get_fine_list");

    }
    @Given("Perform a search using the penalty search function and verify if the search results are displayed correctly.")
    public void perform_a_search_using_the_penalty_search_function_and_verify_if_the_search_results_are_displayed_correctly() {

        // Başlangıç tarihini seçin
        WebElement startDateInput = driver.findElement(By.id("filter_s_date"));
        startDateInput.click(); // Tarih seçiciyi açmak için tıklama
        startDateInput.sendKeys("01/01/2024"); // Tarih girişi

        // Bitiş tarihini seçin
        WebElement endDateInput = driver.findElement(By.id("filter_e_date"));
        endDateInput.click(); // Tarih seçiciyi açmak için tıklama
        endDateInput.sendKeys("17/03/2024"); // Tarih girişi

        // Enter tuşuna basarak seçiciyi kapat
        endDateInput.sendKeys(Keys.ENTER);

        pageHYBS.cezaTaahhütSEARCH_EKLEYEN_KISI.sendKeys("Özgür");


     // METHODA ALINACAK
        ReusableMethods.selectCompany(pageHYBS.companyList_DROPDOWN,pageHYBS.companyList_DROPDOWN_ıNPUT,"SUNGUR İNŞAAT(HALİL BEY)");

        pageHYBS.cezaTaahhütSEARCH_VEHICLEDROPDOWN.click();
        pageHYBS.cezaTaahhütSEARCH_VEHICLEDROPDOWN_INPUT.sendKeys("FİRMA ARACI GELMİYOR BU VAR"+Keys.ENTER);
        ReusableMethods.wait(3);

        pageHYBS.cezaTaahhütSEARCH_arabutton.click();



        ReusableMethods.wait(3);
    }



    @Given("When searching in the penalty search, the relevant property ID should appear")
    public void when_searching_in_the_penalty_search_the_relevant_property_ıd_should_appear() {

        pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys("3620");

         String expected="3620";
         String actual=pageHYBS.cezaTaahhütCEZA_LIST_geldimi.getText();

         ReusableMethods.wait(3);
         Assert.assertTrue(actual.contains(expected));


    }


    @Given("In any penalty, when the view button on the right side is clicked, images should be displayed.\"")
    public void ın_any_penalty_when_the_view_button_on_the_right_side_is_clicked_images_should_be_displayed() {

        pageHYBS.cezaTaahhütCEZA_LIST.click();
        pageHYBS.cezaTaahhütCEZA_GORUNTULEBUTTON.click();
        ReusableMethods.wait(3);

        Assert.assertTrue(pageHYBS.cezaTaahhütCEZA_RESIMGORUNDUMU.isDisplayed());


    }

    @Given("When the view button on the right side is clicked in any penalty, the image uploading page should be displayed, and images related to the penalty should be uploadable.")
    public void when_the_view_button_on_the_right_side_is_clicked_in_any_penalty_the_image_uploading_page_should_be_displayed_and_images_related_to_the_penalty_should_be_uploadable() {


            pageHYBS.cezaTaahhütCEZA_LIST.click();
            pageHYBS.cezaTaahhütCEZA_RESIMYUKLEMEBUTTON.click();

            pageHYBS.cezaTaahhütCEZA_RESIMYUKLE_DOKUMANADI.sendKeys("Deneme");
        Select select=new Select(pageHYBS.cezaTaahhütCEZA_RESIMYUKLE_DOKUMAN_DROPDOWN);
        select.selectByVisibleText("Araç Cezası");

        WebElement dosyaSecButonu = driver.findElement(By.xpath("(//input[@id=\"id_path\"])[1]"));
        /*
          dosya sec butonuna bastiktan sonra
          bilgisayardan selenium ile dosya secmemiz mumkun degil
          onun yerine
          dosyaSecButonu.sendKeys("DosyaYolu") yaparsak
          dosya secme islemi yapilmis olacaktir
         */

        String yuklenecekDosyaYolu = System.getProperty("user.home") +
                "\\Desktop\\resimler\\deneme.jpeg";

        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);

        ReusableMethods.wait(5);

        ReusableMethods.scrolldown_Action6();

        pageHYBS.cezaTaahhütCEZA_RESIMYUKLE_DOSYA_EKLE.click();
        ReusableMethods.wait(3);

        String imageUrl = "http://example.com/media/belgeler/Deneme_d67ea1fd86f243d2914867f26ba9a80c.jpeg";

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
            int responseCode = connection.getResponseCode();
            assert responseCode == HttpURLConnection.HTTP_OK : "Resim yüklenirken bir hata oluştu. HTTP response code: " + responseCode;
            System.out.println("Resim başarıyla yüklendi.");
        } catch (IOException e) {
            System.out.println("Resim yüklenirken bir hata oluştu: " + e.getMessage());
        }


    }

    @Given("In any penalty, when the UPDATE button on the right side is clicked, the information regarding the penalty should be updatable.")
    public void ın_any_penalty_when_the_update_button_on_the_right_side_is_clicked_the_information_regarding_the_penalty_should_be_updatable() {

        pageHYBS.cezaTaahhütCEZA_GUNCELLEMEBUTTON.click();

        Select select = new Select(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_DOKUMANTIPDROPDOWN);
        select.selectByVisibleText("Firma Cezası");

        ReusableMethods.selectCompany(pageHYBS.companyList_DROPDOWN, pageHYBS.cezaTaahhütCEZA_GUNCELLEME_COMPANY_IPDROPDOWN_INPUT, "BAĞCI" + Keys.ENTER);

        Select select1 = new Select(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_cezaTIP);
        select1.selectByVisibleText("Belediye");

        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_ISLEMIYAPAN.clear();
        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_ISLEMIYAPAN.sendKeys("Abdurrahman" + Keys.ENTER);
        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_ANKETACIKLAMA.sendKeys("DENEME");

// Başlangıç tarihini seçin
        WebElement startDateInput = driver.findElement(By.id("id_date"));
        startDateInput.click(); // Tarih seçiciyi açmak için tıklama
        startDateInput.sendKeys("01/01/2024"); // Tarih giriş
// Enter tuşuna basarak seçiciyi kapat
        startDateInput.sendKeys(Keys.ENTER);

        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_TUTAR.sendKeys("590");

        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_geziciEkip.sendKeys("Abdurrahman" + Keys.ENTER);

        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_zabıtaAcıklama.clear();
        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_zabıtaAcıklama.sendKeys("Deniyoruz");

// Doğrulamalar
        // Doğrulamalar
        Assert.assertTrue(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_ANKETACIKLAMA.isDisplayed(), "Anket açıklama alanı görüntülendi.");
        Assert.assertTrue(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_zabıtaAcıklama.isDisplayed(), "Zabıta açıklama alanı görüntülendi.");
        Assert.assertEquals(new Select(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_DOKUMANTIPDROPDOWN).getFirstSelectedOption().getText(), "Firma Cezası", "Doküman tipi doğru seçilmiş.");
        Assert.assertEquals(new Select(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_cezaTIP).getFirstSelectedOption().getText(), "Belediye", "Ceza tipi doğru seçilmiş.");
        Assert.assertEquals(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_ISLEMIYAPAN.getAttribute("value"), "Abdurrahman", "İşlemi yapan kişi doğru girilmiş.");
        Assert.assertEquals(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_ANKETACIKLAMA.getAttribute("value"), "DENEME", "Anket açıklama doğru girilmiş.");
        Assert.assertEquals(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_TUTAR.getAttribute("value"), "590", "Tutar doğru girilmiş.");
        Assert.assertEquals(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_geziciEkip.getAttribute("value"), "Abdurrahman", "Gezici ekip doğru girilmiş.");
        Assert.assertEquals(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_zabıtaAcıklama.getAttribute("value"), "Deniyoruz", "Zabıta açıklama doğru girilmiş.");


    }


    @Given("When the ADD PENALTY button located in the top right corner of the Penalty List page is clicked, a new penalty should be added smoothly.")
    public void when_the_add_penalty_button_located_in_the_top_right_corner_of_the_penalty_list_page_is_clicked_a_new_penalty_should_be_added_smoothly() {
        pageHYBS.cezaTaahhüt_YENICEZAEKLE.click();

        Select select = new Select(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_DOKUMANTIPDROPDOWN);
        select.selectByVisibleText("Firma Cezası");

        ReusableMethods.selectCompany(pageHYBS.companyList_DROPDOWN,pageHYBS.cezaTaahhütCEZA_GUNCELLEME_COMPANY_IPDROPDOWN_INPUT,"GEMA");

        Select select1 = new Select(pageHYBS.cezaTaahhütCEZA_GUNCELLEME_cezaTIP);
        select1.selectByVisibleText("Belediye");

        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_ANKETACIKLAMA.sendKeys("DENEME");

// Başlangıç tarihini seçin
        WebElement startDateInput = driver.findElement(By.id("id_date"));
        startDateInput.click(); // Tarih seçiciyi açmak için tıklama
        startDateInput.sendKeys("02/01/2024"); // Tarih giriş
// Enter tuşuna basarak seçiciyi kapat
        startDateInput.sendKeys(Keys.ENTER);

        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_TUTAR.sendKeys("590");

        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_geziciEkip.sendKeys("Abdurrahman"+Keys.ENTER);

        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_zabıtaAcıklama.clear();
        pageHYBS.cezaTaahhütCEZA_GUNCELLEME_zabıtaAcıklama.sendKeys("Deniyoruz");
        pageHYBS.cezaTaahhüt_YENICEZADOKUMANEKLE.sendKeys("Yeni ceza ekleniyor");

        WebElement dosyaSecButonu = driver.findElement(By.xpath("(//input[@id=\"id_path\"])[1]"));
        /*
          dosya sec butonuna bastiktan sonra
          bilgisayardan selenium ile dosya secmemiz mumkun degil
          onun yerine
          dosyaSecButonu.sendKeys("DosyaYolu") yaparsak
          dosya secme islemi yapilmis olacaktir
         */

        String yuklenecekDosyaYolu = System.getProperty("user.home") +
                "\\Desktop\\resimler\\deneme.jpeg";

        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);

        ReusableMethods.wait(5);



    }




}
