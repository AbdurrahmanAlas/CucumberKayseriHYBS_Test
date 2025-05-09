package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHYBS;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.*;

import static utilities.Driver.driver;


public class MAKS_DATA_CONTROL_Stepdefinitions {

    PageHYBS pageHYBS = new PageHYBS();

    @Given("Click the 'Is Surecleri' link")
    public void click_the_is_surecleri_link() {

        pageHYBS.isSurecleriLink.click();
    }

    @Given("Click the 'Building Permit Process' link")
    public void click_the_building_permit_process_link() {

        pageHYBS.yapıRuhsatlıIsSurecılink.click();
    }

    @Given("Click the search field and enter the relevant plot number")
    public void click_the_search_field_and_enter_the_relevant_plot_number() {
        pageHYBS.searchYapiRuhsatliisSureci.sendKeys("7802/6");
        pageHYBS.searchYapiRuhsatliisSureci.sendKeys(Keys.RETURN); // Press the search button
    }

    @Given("Check multiple plot numbers and print those not found in the list")
    public void adaParselKontrolEtVeBulunamayanlariYazdir() {
        // Kontrol edilecek ada/parsel listesi
        List<String> adaParseller = Arrays.asList(
                "135/8", "462/10", "128/9", "3620/6", "3620/6", "3046/2", "2867/3", "459/11", "5180/3", "3416/6",
                "3416/5", "5114/2", "508/1", "2622/4", "237/17", "3222/6", "4644/7", "4621/9", "229/16", "3168/17",
                "3152/5", "5151/2", "5161/2", "5225/3", "2652/10", "2489/1", "1340/17", "1816/18", "14001/1", "284/2",
                "284/2", "865/11", "477/11", "477/11", "865/11", "750/4", "10741/10", "367/10", "927/2", "12303/6",
                "881/4", "927/2", "927/2", "12303/7", "13636/12", "13139/2", "11635/3", "11757/2", "13473/20",
                "15618/10", "13308/6", "2561/13", "12175/14", "8980/4", "6001/13", "1711/4", "17109/1", "7845/4",
                "13567/8", "4688/7", "4688/7", "15245/3", "16515/11", "16459/3", "8474/12", "5379/3", "4817/4",
                "5322/14", "13835/1", "7870/7", "639/9", "G/3115", "148/8", "295/7", "169/11", "127/69", "0/3226",
                "4560/5", "4622/16", "4622/16", "14909/2", "278/6", "1440/2", "7555/98", "7555/97", "13741/4",
                "423/8", "976/5", "0/5595", "0/5595", "136/37", "12237/4", "3284/9", "2267/1", "1148/2", "2173/1",
                "3630/13", "3630/12", "3549/10", "136/5"


        );

        List<String> bulunanlar = new ArrayList<>();
        List<String> bulunamayanlar = new ArrayList<>();

        for (String adaParsel : adaParseller) {
            // Ada ve Parsel değerlerini ayır
            String[] parca = adaParsel.split("/");
            String ada = parca[0];
            String parsel = parca[1];

            // Arama kutusuna yaz ve Enter'a bas
            pageHYBS.searchYapiRuhsatliisSureci.clear();
            pageHYBS.searchYapiRuhsatliisSureci.sendKeys(adaParsel);
            pageHYBS.searchYapiRuhsatliisSureci.sendKeys(Keys.RETURN);

            // Sonuçların yüklenmesi için bekle
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Arama sonuçlarını al
            List<WebElement> satirlar = pageHYBS.getSearchResultsRows();

            // Aranan ada/parsel bulundu mu?
            boolean bulundu = satirlar.stream()
                    .anyMatch(satir -> satir.getText().contains("Ada: " + ada + " Parsel: " + parsel));

            if (bulundu) {
                bulunanlar.add(adaParsel);
            } else {
                bulunamayanlar.add(adaParsel);
            }
        }

        /* SONUÇLARI YAZDIR
        if (!bulunanlar.isEmpty()) {
            System.out.println("Sistemde bulunan ada/parseller:");
            bulunanlar.forEach(System.out::println);
        }*/

        if (!bulunamayanlar.isEmpty()) {
            System.out.println("Sistemde BULUNAMAYAN ada/parseller:");
            bulunamayanlar.forEach(System.out::println);
        }

        if (bulunamayanlar.isEmpty()) {
            System.out.println("Tüm ada/parseller sistemde bulundu.");
        }
    }


    @Given("User should be able to click on OPERATION MODULE")
    public void user_should_be_able_to_click_on_operatıon_module() {

       pageHYBS.isletmeModuluLink.click();

    }
    @Given("User should be able to click on CEZA_tAAHHUT_LIST")
    public void user_should_be_able_to_click_on_ceza_t_aahhut_lıst() {

        pageHYBS.cezaTaahhütCEZA_LIST.click();

    }

    @Given("The relevant plot should be verified by searching for the AdaParcel in the list.")
    public void the_relevant_plot_should_be_verified_by_searching_for_the_ada_parcel_in_the_list() {

        Set<String> adaParselSet = new LinkedHashSet<>(Arrays.asList(
                "145/1", "5140/3","8044/9"

        ));

        List<String> notFoundAdaParselList = new ArrayList<>();

        for (String adaParsel : adaParselSet) {
            // Alanı tamamen temizle
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(adaParsel);
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(Keys.RETURN);

            // Sonuçların yüklenmesini bekle (uygun bir selector'la)
            ReusableMethods.wait(1);

            List<WebElement> resultRows = pageHYBS.getSearchResultsRowsCeza();

            String normalizedAdaParsel = adaParsel.replaceAll("\\s+", "").trim();

            boolean isAdaParselFound = resultRows.stream()
                    .map(WebElement::getText)
                    .map(text -> text.replaceAll("\\s+", "").trim())
                    .anyMatch(text -> text.contains(normalizedAdaParsel));

            if (!isAdaParselFound) {
                notFoundAdaParselList.add(adaParsel);
            }
        }

    }
    }