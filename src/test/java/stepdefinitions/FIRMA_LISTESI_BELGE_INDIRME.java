package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import static utilities.Driver.driver;

public class FIRMA_LISTESI_BELGE_INDIRME {

    PageHYBS pageHYBS = new PageHYBS();
    Actions actions = new Actions(Driver.getDriver());

    @Given("click on the companyDocuments")
    public void click_on_the_company_documents() {

        pageHYBS.companyDocumentsLink.click();
        ReusableMethods.wait(2);
        actions
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        ReusableMethods.wait(2);


    }

    @Given("The ability to download documents from the document list should be tested.")
    public void the_ability_to_download_documents_from_the_document_list_should_be_tested() {
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

        // Eğer "Görüntüle" butonu bulunamazsa ekran görüntüsü al
        if (viewButtons.isEmpty()) {
            // Ekran görüntüsü al
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

            // Dosyayı kaydet
            try {
                File destinationFile = new File("pdf_files/no_view_button_screenshot.png");
                FileUtils.copyFile(screenshotFile, destinationFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // WebDriver'ı kapat
        driver.quit();
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





























