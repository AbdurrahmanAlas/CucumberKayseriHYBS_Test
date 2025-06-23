package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.ReusableMethods;

import java.util.Set;

import static utilities.Driver.driver;

public class US_13_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();


    @Given("Click on the External Excavation Request link")
    public void click_on_the_external_excavation_request_link() {
        pageHYBS.talepListeleriLink.click();

        pageHYBS.HariciKazıTalebiLinki.click();


    }
    @Given("Click on the Add new External Excavation request button")
    public void click_on_the_add_new_external_excavation_request_button() {

        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI.click();




    }
    @Given("Add and create information in new External excavation request")
    public void add_and_create_information_in_new_external_excavation_request() {

        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıName.sendKeys("Deneme Harici Kazı");
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıPHONE.sendKeys("080181718");
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıADDRESS.sendKeys("DenemeAdres");
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ADA.sendKeys("456");
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_PARSEL.sendKeys("3333");

        // Adım 2: İlçe seçimi yapılır ve beklenir
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ILCESEC.click();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ILCE_INPUT.sendKeys("Tomarza" + Keys.ENTER);
        ReusableMethods.wait(3);

        // Sayfanın belirli bir elemente kadar kaydırılması
        ReusableMethods.scrolldown();
        ReusableMethods.wait(3);

        // Adım 3: Tarih seçimi yapılır
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_DATE.click();

        // Adım 4: Tipteki seçim yapılır
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_TIPSEC.click();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_TIPSEC_INPUT.sendKeys("Harici Kazı" + Keys.ENTER);
        ReusableMethods.scrolldown();

        // Adım 5: Dokum sahası seçimi yapılır
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_DOKUMSAHASI.click();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_DOKUMSAHASI_INPUT.sendKeys("Yılanlı" + Keys.ENTER);
        ReusableMethods.wait(3);

        // Assert: Metin alanlarına doğru metin girildiğini kontrol et
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıName.getAttribute("value"), "Deneme Harici Kazı", "Uretici name alanına yanlış metin girildi.");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıPHONE.getAttribute("value"), "080181718", "Telefon alanına yanlış metin girildi.");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıADDRESS.getAttribute("value"), "DenemeAdres", "Adres alanına yanlış metin girildi.");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ADA.getAttribute("value"), "456", "Ada alanına yanlış metin girildi.");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_PARSEL.getAttribute("value"), "3333", "Parsel alanına yanlış metin girildi.");

    }
    @Given("Edit verify new external dig request has been added")
    public void edit_verify_new_external_dig_request_has_been_added() {


// Verilerin doğru bir şekilde girildiğini kontrol etmek için assert ifadeleri ekleyelim
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıName.getText(), "Deneme Harici Kazı");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıPHONE.getText(), "080181718");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıADDRESS.getText(), "DenemeAdres");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ADA.getText(), "456");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_PARSEL.getText(), "3333");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ILCE_INPUT.getText(), "Tomarza");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_TIPSEC_INPUT.getText(), "Harici Kazı");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_DOKUMSAHASI_INPUT.getText(), "Yılanlı");


    }


    @Given("click on the Update button")
    public void click_on_the_update_button() {

        pageHYBS.hariciKaziTalebi_HARICIKAZI_Updatebutton.click();


    }
    @Given("Test that the data can be updated correctly")
    public void test_that_the_data_can_be_updated_correctly() {

        // Adım 1: Metin alanlarındaki mevcut değerleri temizle
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıName.clear();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıPHONE.clear();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıADDRESS.clear();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ADA.clear();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_PARSEL.clear();

// Yeni değerleri gir
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıName.sendKeys("Deneme Harici Kazı");
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıPHONE.sendKeys("080181718");
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıADDRESS.sendKeys("DenemeAdres");
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ADA.sendKeys("456");
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_PARSEL.sendKeys("3333");

// Adım 2: İlçe seçimi yapılır ve beklenir
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ILCESEC.click();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ILCE_INPUT.sendKeys("Tomarza" + Keys.ENTER);
        ReusableMethods.wait(3);

// Sayfanın belirli bir elemente kadar kaydırılması
        ReusableMethods.scrolldown();
        ReusableMethods.wait(3);

// Adım 3: Tarih seçimi yapılır
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_DATE.click();

// Adım 4: Tipteki seçim yapılır
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_TIPSEC.click();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_TIPSEC_INPUT.sendKeys("Harici Kazı" + Keys.ENTER);
        ReusableMethods.scrolldown();

// Adım 5: Dokum sahası seçimi yapılır
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_DOKUMSAHASI.click();
        pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_DOKUMSAHASI_INPUT.sendKeys("Yılanlı" + Keys.ENTER);
        ReusableMethods.wait(3);

// Assert: Metin alanlarına doğru metin girildiğini kontrol et
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıName.getAttribute("value"), "Deneme Harici Kazı", "Uretici name alanına yanlış metin girildi.");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıPHONE.getAttribute("value"), "080181718", "Telefon alanına yanlış metin girildi.");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_uretıcıADDRESS.getAttribute("value"), "DenemeAdres", "Adres alanına yanlış metin girildi.");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_ADA.getAttribute("value"), "456", "Ada alanına yanlış metin girildi.");
        Assert.assertEquals(pageHYBS.hariciKaziTalebi_YENIHARICIKAZI_PARSEL.getAttribute("value"), "3333", "Parsel alanına yanlış metin girildi.");



    }
    @Given("click on the Delete button")
    public void click_on_the_delete_button() {

        pageHYBS.hariciKaziTalebi_HARICIKAZI_Deletebutton.click();

    }

    @Given("Test that the data can be delete correctly")
    public void test_that_the_data_can_be_delete_correctly() {


        pageHYBS.hariciKaziTalebi_HARICIKAZI_DeleteAcıklama.sendKeys("Deneme yapıyor alasssssss");
ReusableMethods.wait(3);
        pageHYBS.hariciKaziTalebi_HARICIKAZI_DeleteKAPAT.click();



    }


    @Given("click on the EK2 button")
    public void click_on_the_ek2_button() {

        pageHYBS.hariciKaziTalebi_HARICIKAZI_EK2BUTTON.click();
    }
    @Given("Test that the data can be EK2 correctly")
    public void test_that_the_data_can_be_ek2_correctly() {

        // Orijinal pencereyi sakla
        String originalWindow = driver.getWindowHandle();
        pageHYBS.hariciKaziTalebi_HARICIKAZI_EK2BUTTON.click();

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
        assert newTabURL.equals("https://kayserihybs.n2mobil.com.tr/media/belgeler/is_belgeleri/4425/Ruhsat-Belgesi") : "Beklenen URL doğru değil"; // Beklenen URL'yi uygun şekilde değiştirin

        System.out.println("Doğru URL");

    }

}
