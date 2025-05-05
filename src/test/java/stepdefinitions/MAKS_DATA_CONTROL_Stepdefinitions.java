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
                "145/1", "5140/3", "3168/37", "227/31", "217/5", "2791/9", "3152/12", "1003/4", "973/7", "973/7",
                "3342/16", "3342/19", "3342/16", "15123/1", "14720/2", "845/10", "803/3", "7832/3", "13725/1",
                "8044/9", "7855/11", "6453/6", "4354/4", "4301/4", "4295/2", "4403/4", "4270/6", "4431/4", "4345/4",
                "4310/24", "4384/13", "4384/15", "4262/18", "4384/16", "4446/13", "4320/14", "4301/7", "4321/1", "6055/9", "6363/13",
                "5759/8", "5003/2", "0/3049", "6151/1", "8859/24", "8859/24", "-/5556", "4035/15", "4462/13",
                "4463/11", "3950/11", "4164/21", "4218/15", "3945/10", "3948/10", "4192/14", "4073/2", "4073/3",
                "4462/20", "4462/11", "4087/1", "4084/4", "4004/5", "4004/6", "4004/7", "4037/9", "3770/13", "3663/2",
                "3770/14", "4484/18", "3877/5", "3663/3", "3861/14", "3783/4", "3657/16", "3808/10", "3852/12", "3866/9", "8621/7", "8621/7", "12144/3"

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

        // SONUÇLARI YAZDIR
        if (!bulunanlar.isEmpty()) {
            System.out.println("Sistemde bulunan ada/parseller:");
            bulunanlar.forEach(System.out::println);
        }

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
                "145/1", "5140/3", "3168/37", "227/31", "217/5", "2791/9", "3152/12", "1003/4", "973/7", "973/7",
                "3342/16", "3342/19", "3342/16", "15123/1", "14720/2", "845/10", "803/3", "7832/3", "13725/1",
                "8044/9", "7855/11", "6453/6", "4354/4", "4301/4", "4295/2", "4403/4", "4270/6", "4431/4", "4345/4",
                "4310/24", "4384/13", "4384/15", "4262/18", "4384/16", "4446/13", "4320/14", "4301/7", "4321/1", "6055/9", "6363/13",
                "5759/8", "5003/2", "0/3049", "6151/1", "8859/24", "8859/24", "-/5556", "4035/15", "4462/13",
                "4463/11", "3950/11", "4164/21", "4218/15", "3945/10", "3948/10", "4192/14", "4073/2", "4073/3",
                "4462/20", "4462/11", "4087/1", "4084/4", "4004/5", "4004/6", "4004/7", "4037/9", "3770/13", "3663/2",
                "3770/14", "4484/18", "3877/5", "3663/3", "3861/14", "3783/4", "3657/16", "3808/10", "3852/12", "3866/9", "8621/7", "8621/7", "12144/3"


        ));

        List<String> notFoundAdaParselList = new ArrayList<>();

        for (String adaParsel : adaParselSet) {
            // Önceki aramayı temizle ve yeni değer gir
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.clear();
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(adaParsel);
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(Keys.RETURN);


            // İlk sonucu al
            List<WebElement> resultRows = pageHYBS.getSearchResultsRows();

            boolean isAdaParselFound = resultRows.stream()
                    .anyMatch(row -> row.getText().contains(adaParsel));

            if (!isAdaParselFound) {
                notFoundAdaParselList.add(adaParsel);
            }




        }

// Eksik olanları yazdır
        if (!notFoundAdaParselList.isEmpty()) {
            System.out.println("The following plot numbers were not found in the list:");
            notFoundAdaParselList.forEach(System.out::println);
        } else {
            System.out.println("All plot numbers were found in the list.");
        }
    }
    }