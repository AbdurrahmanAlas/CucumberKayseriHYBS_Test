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

                "135/8",
                "462/10",
                "2931/1",
                "128/9",
                "3620/6",
                "3620/6",
                "3046/2",
                "195/15",
                "145/1",
                "2867/3",
                "459/11",
                "3518/2",
                "5180/3",
                "3416/6",
                "3416/5",
                "5114/2",
                "508/1",
                "2622/4",
                "2913/4",
                "5140/3",
                "237/17",
                "3222/6",
                "229/16",
                "3168/17",
                "217/5",
                "3152/5",
                "5151/2",
                "3152/12",
                "3780/2",
                "5161/2",
                "5225/3",
                "3423/1",
                "3424/1",
                "3232/3",
                "2652/10",
                "2489/1",
                "3355/5",
                "1340/17",
                "3342/19",
                "1035/8",
                "1377/12",
                "1377/11",
                "3403/10",
                "3450/3",
                "1121/8",
                "1816/18",
                "1387/7",
                "15081/1",
                "14001/1",
                "284/2",
                "284/2",
                "15123/1",
                "346/5",
                "346/5",
                "865/11",
                "477/11",
                "865/11",
                "750/4",
                "10741/10",
                "367/10",
                "927/2",
                "12303/6",
                "881/4",
                "927/2",
                "927/2",
                "12303/7",
                "9150/11",
                "13636/12",
                "273/2",
                "10722/15",
                "273/2",
                "845/10",
                "13139/2",
                "13107/9",
                "12383/11",
                "12382/1",
                "12382/1",
                "11635/3",
                "5085/8",
                "11682/10",
                "13814/6",
                "11757/2",
                "13473/20",
                "15618/10",
                "13308/6",
                "2561/13",
                "12175/14",
                "8980/4",
                "6001/13",
                "6453/6",
                "1711/4",
                "191/10",
                "229/9",
                "276/17",
                "17109/1",
                "7845/4",
                "13567/8",
                "7838/10",
                "4688/7",
                "4688/7",
                "15245/3",
                "16515/11",
                "16459/3",
                "8474/12",
                "5379/3",
                "4817/4",
                "5322/14",
                "13835/1",
                "7870/7",
                "639/9",
                "G/3115",
                "555/5",
                "329/3",
                "2689/7",
                "6151/1",
                "148/8",
                "295/7",
                "169/11",
                "17088/1",
                "17088/3",
                "17088/2",
                "127/69",
                "4622/16",
                "4622/16",
                "14909/2",
                "7376/12",
                "278/6",
                "1440/2",
                "7555/98",
                "7555/97",
                "7560/22",
                "13741/4",
                "423/8",
                "976/5",
                "460/3",
                "460/3",
                "0/5595",
                "0/5595",
                "136/37",
                "12237/4",
                "3284/9",
                "3067/199",
                "2267/1",
                "2287/3",
                "1148/2",
                "2485/1",
                "2173/1",
                "3630/13",
                "3630/12",
                "3549/10",
                "136/5"

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
                "145/1", "5140/3", "8044/9", "80455/2", "656256/4", "145/1"
        ));

        List<String> notFoundAdaParselList = new ArrayList<>();
        List<String> foundAdaParselList = new ArrayList<>();

        for (String adaParsel : adaParselSet) {
            // Arama kutusunu temizle ve yeni değeri gir
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(adaParsel);
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(Keys.RETURN);

            // 2 saniye bekle
            ReusableMethods.wait(2);

            List<WebElement> resultRows = pageHYBS.getSearchResultsRowsCeza();

            // Gelen satırların hepsini ekrana bas (debug)
            System.out.println("🔍 Arama sonucu - Ada/Parsel: " + adaParsel);
            for (WebElement row : resultRows) {
                System.out.println("📄 Satır metni: " + row.getText());
            }

            String normalizedAdaParsel = adaParsel.replaceAll("\\s+", "").trim();

            // Tüm satır metinleri normalize edilerek kontrol ediliyor
            boolean isAdaParselFound = resultRows.stream()
                    .map(WebElement::getText)
                    .map(text -> text.replaceAll("\\s+", "").trim().toLowerCase())  // normalize + lowercase
                    .anyMatch(text -> text.contains(normalizedAdaParsel.toLowerCase()));

            if (isAdaParselFound) {
                foundAdaParselList.add(adaParsel);
                System.out.println("✔ Bulundu: " + adaParsel);
            } else {
                notFoundAdaParselList.add(adaParsel);
                System.out.println("✘ Bulunamadı: " + adaParsel);
            }

            System.out.println("-----------------------------------------------------");
        }

        System.out.println("\n--- ✅ Bulunan Ada/Parseller ---");
        foundAdaParselList.forEach(System.out::println);

        System.out.println("\n--- ❌ Bulunamayan Ada/Parseller ---");
        notFoundAdaParselList.forEach(System.out::println);
    }
}