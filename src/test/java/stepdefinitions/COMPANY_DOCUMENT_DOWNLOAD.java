package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import pages.PageHYBS;
import pages.PageN2MOBIL;
import utilities.ReusableMethods;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Set;

import static utilities.Driver.driver;

public class COMPANY_DOCUMENT_DOWNLOAD {


    PageN2MOBIL pageN2MOBIL=new PageN2MOBIL();
    @Given("The ability to downloadNEW documents from the document list should be tested.")
    public void the_ability_to_download_new_documents_from_the_document_list_should_be_tested() {


        // "Görüntüle" veya "Aç" butonlarını bul
        List<WebElement> viewButtons = driver.findElements(By.cssSelector("a[data-original-title='Görüntüle']"));

        // Her bir buton için döngü
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
            String pdfFileName = "pdf_files/" + companyName + "/document_" + i + ".pdf";
            boolean downloadSuccessful = downloadPDF(pdfUrl, pdfFileName);

            // Ekran görüntüsü al
            takeScreenshot(driver, companyName, i, downloadSuccessful);

            // Yeni pencereyi kapat
            driver.close();

            // Ana pencereye geri dön
            driver.switchTo().window(mainWindowHandle);
        }


/////////////////////////////

        ReusableMethods.wait(3);
        pageN2MOBIL.companylist_VEHICLE_DOCUMENT.click();
        ReusableMethods.wait(3);




        // Arac belgeleri "Aç" butonlarını bul
        List<WebElement> viewButtons1 = driver.findElements(By.cssSelector("a[data-original-title='Aç']"));

        // Her bir buton için döngü
        for (int i = 0; i < viewButtons1.size(); i++) {
            // Butonu tıkla
            WebElement viewButton1 = viewButtons1.get(i);
            viewButton1.click();

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
            String pdfFileName = "pdf_files/" + companyName + "/document_" + i + ".pdf";
            boolean downloadSuccessful = downloadPDF(pdfUrl, pdfFileName);

            // Ekran görüntüsü al
            takeScreenshot(driver, companyName, i, downloadSuccessful);

            // Yeni pencereyi kapat
            driver.close();

            // Ana pencereye geri dön
            driver.switchTo().window(mainWindowHandle);



        }


// ikinci firmaya geciyoruz.
        PageHYBS pageHYBS=new PageHYBS();
        pageHYBS.isletmeModuluLink.click();
        pageHYBS.FirmaListesi.click();

        WebElement incelegözsimgesi2 = driver.findElement(By.xpath("(//span[@class='col-sm-4 text-center no-padding'])[4]"));
        incelegözsimgesi2.click();

        pageHYBS.companyDocumentsLink.click();


        // "Görüntüle" veya "Aç" butonlarını bul
        List<WebElement> viewButtons2 = driver.findElements(By.cssSelector("a[data-original-title='Görüntüle']"));

        // Her bir buton için döngü
        for (int i = 0; i < viewButtons2.size(); i++) {
            // Butonu tıkla
            WebElement viewButton2 = viewButtons2.get(i);
            viewButton2.click();

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
            String pdfFileName = "pdf_files/" + companyName + "/document_" + i + ".pdf";
            boolean downloadSuccessful = downloadPDF(pdfUrl, pdfFileName);

            // Ekran görüntüsü al
            takeScreenshot(driver, companyName, i, downloadSuccessful);

            // Yeni pencereyi kapat
            driver.close();

            // Ana pencereye geri dön
            driver.switchTo().window(mainWindowHandle);
        }


        ReusableMethods.wait(3);
        pageN2MOBIL.companylist_VEHICLE_DOCUMENT.click();
        ReusableMethods.wait(3);




        // "Görüntüle" veya "Aç" butonlarını bul
        List<WebElement> viewButtons3 = driver.findElements(By.cssSelector("a[data-original-title='Aç']"));

        // Her bir buton için döngü
        for (int i = 0; i < viewButtons3.size(); i++) {
            // Butonu tıkla
            WebElement viewButton3 = viewButtons3.get(i);
            viewButton3.click();

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
            String pdfFileName = "pdf_files/" + companyName + "/document_" + i + ".pdf";
            boolean downloadSuccessful = downloadPDF(pdfUrl, pdfFileName);

            // Ekran görüntüsü al
            takeScreenshot(driver, companyName, i, downloadSuccessful);

            // Yeni pencereyi kapat
            driver.close();

            // Ana pencereye geri dön
            driver.switchTo().window(mainWindowHandle);



        }


        pageHYBS.isletmeModuluLink.click();
        pageHYBS.FirmaListesi.click();

        WebElement incelegözsimgesi3 = driver.findElement(By.xpath("(//span[@class='col-sm-4 text-center no-padding'])[7]"));
        incelegözsimgesi3.click();

        pageHYBS.companyDocumentsLink.click();






    }




















    // PDF dosyasını indiren metot
    public static boolean downloadPDF(String pdfUrl, String fileName) {
        try (InputStream in = new URL(pdfUrl).openStream();
             FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            // PDF dosyasını indir
            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            // İndirme başarılı oldu
            return true;
        } catch (IOException e) {
            // İndirme başarısız oldu
            e.printStackTrace();
            return false;
        }
    }



        // Ekran görüntüsü almak için metot
    public static void takeScreenshot(WebDriver driver, String companyName, int index, boolean downloadSuccessful) {
        // Ekran görüntüsü al
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

        // Dosyayı kaydet
        try {
            String fileName;
            if (downloadSuccessful) {
                fileName = "pdf_files/" + companyName + "/document_" + index + "_downloaded.png";
            } else {
                fileName = "pdf_files/" + companyName + "/document_" + index + "_no_download.png";
            }
            File destinationFile = new File(fileName);
            FileUtils.copyFile(screenshotFile, destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Firma adını almak için yardımcı metot
    public static String getCompanyName(WebDriver driver) {
        // Sayfanın içeriğini al
        String pageSource = driver.getPageSource();
        // İçerikte firma adını içeren bir ifade arayın
        // Örnek olarak, firmanın adı "Company Name" olsun
        if (pageSource.contains("Firma")) {
            return "Firma";
        }
        // İçerikte firma adını içeren bir ifade bulunamazsa, varsayılan değeri döndürün
        return "Unknown Company";
    }
}



