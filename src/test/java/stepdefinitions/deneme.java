package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Set;

import static stepdefinitions.FIRMA_LISTESI_BELGE_INDIRME.getCompanyName;
import static utilities.Driver.driver;

public class deneme {
    PageHYBS pageHYBS = new PageHYBS();


    @Given("TUM FIRMALAR ICIN The ability to download documents from the document list should be tested.")
    public void tum_fırmalar_ıcın_the_ability_to_download_documents_from_the_document_list_should_be_tested() {



        ReusableMethods.wait(10);


        try {
            // İnternet sitesini ziyaret et
            driver.get("http://example.com");

            // İncele butonlarını bul
            List<WebElement> inceleButtons = driver.findElements(By.cssSelector("button[class='btn btn-sm btn-primary']"));

            // Her bir incele butonu için döngü
            for (WebElement inceleButton : inceleButtons) {
                inceleButton.click(); // İncele butonuna tıkla

                // Firma belgeleri linkini bul ve tıkla
                WebElement firmaBelgeleriLink = driver.findElement(By.xpath("//a[contains(text(), 'Firma Belgeleri')]"));
                firmaBelgeleriLink.click();

                // "Görüntüle" butonlarını bul
                List<WebElement> viewButtons = driver.findElements(By.cssSelector("a[data-original-title='Görüntüle']"));

                // Her bir "Görüntüle" butonu için döngü
                for (int i = 0; i < viewButtons.size(); i++) {
                    // Butonu tıkla
                    WebElement viewButton = viewButtons.get(i);
                    viewButton.click();

                    // Ana pencereyi kaydet
                    String mainWindowHandle = driver.getWindowHandle();

                    // Tüm pencere kollarını al
                    Set<String> allWindowHandles = driver.getWindowHandles();
                    for (String handle : allWindowHandles) {
                        // Ana pencere dışındaki bir pencereye geçiş yap
                        if (!handle.equals(mainWindowHandle)) {
                            driver.switchTo().window(handle);
                            break;
                        }
                    }

                    // Belge yüklenmesini bekle
                    ReusableMethods.wait(3);

                    // Firma adını al
                    String companyName = getCompanyName(driver);

                    // Firma adına göre klasör oluştur
                    File companyDirectory = new File("pdf_files/" + companyName);
                    if (!companyDirectory.exists()) {
                        companyDirectory.mkdir();
                    }

                    // PDF dosyasının URL'sini al
                    String pdfUrl = driver.getCurrentUrl();

                    // PDF dosyasını indir ve ilgili klasöre kaydet
                    String fileName = "pdf_files/" + companyName + "/document_" + i + ".pdf";
                    downloadPDF(pdfUrl, fileName);

                    // Yeni pencereyi kapat
                    driver.close();

                    // Ana pencereye geri dön
                    driver.switchTo().window(mainWindowHandle);
                }

                // WebDriver'ı kapat
                driver.quit();
            }
        } finally {

        }
    }
    // PDF dosyasını indiren metot
    public static void downloadPDF(String pdfUrl, String fileName) {
        try (InputStream in = new URL(pdfUrl).openStream();
             FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            // PDF dosyasını indir
            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//fdssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss


/*
 String[] alarmTurleri = {"Cihaz Müdahele", "Giriş Cihazı", "Kapı Açılma"};

        // Her bir firma için alarmların oluşturulması işlemi
        for (String firma : firmalar) {
            // Her bir alarm türü için işlemleri gerçekleştir
            for (String alarmTuru : alarmTurleri) {
                olusturAlarm(firma, alarmTuru);
            }
        }
    }

    public void olusturAlarm(String firmaAdi, String alarmTuru) {
        PageN2MOBIL pageN2MOBIL = new PageN2MOBIL();
        pageN2MOBIL.alarmbuttonlink.click();
        pageN2MOBIL.dropdownFırmalar.click();
        pageN2MOBIL.DropdownINPUT.sendKeys(firmaAdi + Keys.ENTER);
        pageN2MOBIL.alarmCLICK.click();
        pageN2MOBIL.yeniAlarm.click();
        ReusableMethods.wait(2);
        pageN2MOBIL.TumunuSecDropdown.click();
        ReusableMethods.wait(5);

        pageN2MOBIL.DropdownALARMLAR.click();
        ReusableMethods.wait(3);
        pageN2MOBIL.DropdownALARMLAR_INPUT.sendKeys(alarmTuru + " " + Keys.ENTER);
        pageN2MOBIL.DropdownBILDIRIM.click();
        pageN2MOBIL.DropdownBILDIRIM_INPUT.sendKeys("Mobil Bildirim" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR.click();
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ramazan Korkmaz" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ozgur Yıldırım" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Furkan Kocer" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Burak Per" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Abdurrahman Alas" + Keys.ENTER);
        pageN2MOBIL.BOSLUGATIKLA.click();
        pageN2MOBIL.ALARM_KAYDET.click();
        pageN2MOBIL.basarılıOK.click();
        ReusableMethods.wait(2);
        ReusableMethods.wait(7);
 */