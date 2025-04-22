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
                "4831/5", "13253/3", "13839/1", "6515/21", "6484/8", "6480/4", "16401/1", "6494/20", "6539/9", "3648/8", "1676/4", "218/7", "1679/5", "11218/18", "5467/8", "6938/3", "14280/1",
                "5559/12", "132/50", "4315/19", "4271/4", "4387/5", "4303/3", "4280/17", "4402/1", "4257/11", "4362/9", "4401/22", "4424/11", "4381/8", "4319/9", "4350/21", "15222/1", "8897/2",
                "4616/12", "12610/1", "16360/5", "16886/7", "6587/11", "12937/4", "12747/11", "4603/43", "17023/1", "6602/16", "7913/1", "4679/17", "4829/14", "4924/3", "7942/13", "12747/2", "3619/15", "12747/2", "8464/11", "8464/12", "17023/1", "13328/1", "16161/1", "8562/6", "13880/1", "958/16", "599/11", "6059/5", "12149/5", "11982/1", "261/17", "236/5", "247/7", "698/7", "683/5", "556/8", "637/15", "644/6", "2596/2", "7629/1", "136/4", "148/6", "7373/4", "189/5", "8262/1", "13286/1", "408/3", "363/5", "14336/2", "206/7", "5132/4", "0/3270", "12943/5", "7256/3", "7257/7", "8720/6", "5061/4", "291/4", "14951/3", "166/4", "190/15", "13174/2", "16949/2", "1370/121", "12018/3", "12118/6", "632/4", "1448/13", "13898/4", "8106/6", "8098/16", "8150/2", "7555/90", "3948/13", "4189/16", "3948/5", "4206/19", "4087/12", "4131/7", "4043/3", "3977/10", "4006/2", "4085/8", "4201/9", "3944/9", "3945/23", "4462/23", "4032/5", "4220/8", "4208/5", "3877/11", "3825/24", "3809/9", "3690/12", "3667/15", "3902/7", "3670/15", "3940/18", "3836/5", "3661/7", "3881/11", "3670/30", "3917/3", "3791/15", "3727/10", "3908/18", "3838/1", "3780/5", "3807/20", "3694/1", "3843/5", "3657/20", "3744/6", "3675/15", "3768/16", "3789/4", "3671/9", "451/3", "16675/1", "726/11", "502/6", "717/11", "7546/1", "13137/1", "8931/14", "8931/5", "17094/1", "8622/8", "8625/8", "14332/1", "7553/6", "15094/7", "4594/7", "854/1850", "5357/9", "4279/3", "7842/1", "4177/13", "8820/5", "8459/8", "8459/8", "7322/7", "3731/1", "8549/6", "8517/1", "6297/1", "16723/1", "12683/1", "15016/1", "217/2", "217/2", "3498/13", "3498/13", "4248/2", "3725/12", "4043/9", "3657/7", "4292/15", "3951/9", "3812/1", "4280/12", "3716/3", "3767/7", "3687/4", "4401/5", "3866/4"


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
                Thread.sleep(2000);
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
                "7078/13", "13118/10", "12378/1", "6531/14", "12369/11", "154/6", "10854/5", "518/3", "190/9", "184/8",
                "5899/2"


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