package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageHYBS;

import java.time.Duration;
import java.util.*;



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
    public void check_multiple_plot_numbers_and_print_those_not_found_in_the_list() {
        // Create a list of plot numbers
        List<String> adaParselList = Arrays.asList(


                "5424/20", "5838/11", "5006/24", "13314/1", "5424/20", "4636/4", "12643/20", "5823/3", "12643/20", "4946/12", "7719/14", "3466/18", "6797/9", "8464/11", "8464/12", "8019/5", "13519/6", "7719/14", "17023/1", "4946/12",
                "13328/1", "16161/1", "13026/2", "8562/6", "13880/1", "13880/1", "17050/1", "6079/9", "921/9", "945/2", "615/13", "686/11", "958/16", "956/10", "878/3", "599/6", "599/5", "626/4", "389/13", "613/2", "609/14",
                "599/11", "389/7", "619/12", "6059/5", "7512/3", "12149/5", "7551/1", "234/13", "238/20", "174/8", "238/20", "192/14", "259/1", "259/1", "174/2", "11982/1", "464/9", "261/17", "236/5", "273/6", "247/7", "185/6",
                "601/12", "698/7", "545/5", "605/10", "594/12", "582/1", "615/6", "484/3", "810/7", "810/6", "641/10", "16175/2", "692/3", "527/7", "570/8", "516/8", "529/7", "509/10", "509/6", "509/5", "509/4", "683/5", "556/8",
                "637/15", "644/6", "318/5", "13462/8", "13462/7", "16117/1", "2596/2", "6317/3", "2246/64", "13600/1", "7629/1", "136/4", "134/2", "148/6", "166/18", "8899/1", "8899/1", "8899/1", "14302/2", "336/8", "336/8",
                "187/10", "7373/4", "189/5", "182/9", "132/5", "294/1", "169/16", "169/15", "12129/4", "332/18", "339/14", "339/14", "266/4", "8262/1", "279/10", "13291/9", "13291/8", "13291/7", "13291/6", "13291/5", "181/11",
                "13286/1", "141/8", "408/3", "338/8", "338/7", "363/5", "14336/2", "181/3", "177/3", "206/7", "164/8", "112/4", "171/6", "5132/4", "0/3270", "12943/5", "7256/3", "7257/7", "7820/5", "8720/6", "6650/2", "10970/5",
                "5061/4", "6609/4", "291/4", "14951/3", "14757/7", "13176/7", "13562/1", "13298/2", "266/6", "8402/3", "12217/14", "153/3", "166/4", "13562/1", "14755/5", "12738/11", "15088/5", "7376/6", "190/15", "258/12", "13174/2",
                "213/2", "12738/11", "16949/2", "1370/121", "12018/3", "12118/6", "632/4", "1436/2", "1447/9", "1108/3", "307/3", "1440/5", "334/2", "321/1", "334/2", "1448/13", "1434/10", "307/2", "325/4", "13898/4", "8106/6",
                "8098/16", "8150/2", "7555/90", "2320/6", "1099/399", "3948/13", "4189/16", "3948/5", "4206/19", "4087/12", "4131/7", "4043/3", "3977/10", "4006/2", "4085/8", "4201/9", "3944/9", "3945/23", "4462/23", "4032/5",
                "4220/8", "4208/5", "13255/3", "3877/11", "3825/24", "3809/9", "3690/12", "3667/15", "3902/7", "3670/15", "3940/18", "3836/5", "3661/7", "3881/11", "3670/30", "3917/3", "3791/15", "3727/10", "3908/18", "3838/1",
                "3780/5", "3807/20", "3694/1", "3843/5", "3657/20", "3744/6", "3675/15", "3768/16", "3789/4", "3671/9", "16896/1", "504/5", "566/2", "439/8", "451/3", "149/8", "447/4", "16675/1", "439/3", "726/11", "502/6",
                "707/2", "580/4", "717/11", "706/1", "717/11", "439/3", "132/161", "132/161", "6385/5", "0/5592", "0/5548", "0/5544", "7546/1", "13137/1", "13137/1", "15207/10", "8931/14", "8931/5", "8930/9", "12010/2", "17094/1",
                "4698/2", "8622/8", "8625/5", "8625/8", "8615/7", "115/4", "8609/5", "8631/1", "136/12", "8625/8", "8625/5", "12046/6", "8529/5", "8902/3", "14332/1", "14684/3", "12046/6"


        );
        List<String> notFoundAdaParselList = new ArrayList<>();

        // Check each plot number
        for (String adaParsel : adaParselList) {
            // Clear the search box and enter the new plot number
            pageHYBS.searchYapiRuhsatliisSureci.clear();
            pageHYBS.searchYapiRuhsatliisSureci.sendKeys(adaParsel);
            pageHYBS.searchYapiRuhsatliisSureci.sendKeys(Keys.RETURN);

            // Wait 2 seconds after the search
            try {
                Thread.sleep(2000); // 2000 ms = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Get all the rows from the result table
            List<WebElement> resultRows = pageHYBS.getSearchResultsRows();

            boolean isAdaParselFound = false;

            // Check each row for the plot number
            for (WebElement row : resultRows) {
                String rowText = row.getText();
                if (rowText.contains("Ada: " + adaParsel.split("/")[0] + " Parsel: " + adaParsel.split("/")[1])) {
                    isAdaParselFound = true;
                    break;
                }
            }

            // If the plot number is not found, add it to the list of not found plot numbers
            if (!isAdaParselFound) {
                notFoundAdaParselList.add(adaParsel);
            }
        }

        // Print the plot numbers that were not found
        if (!notFoundAdaParselList.isEmpty()) {
            System.out.println("The following plot numbers were not found in the list:");
            for (String notFoundAdaParsel : notFoundAdaParselList) {
                System.out.println(notFoundAdaParsel);
            }
        } else {
            System.out.println("All plot numbers were found in the list.");
        }
    }

    @Given("The relevant plot should be verified by searching for the AdaParcel in the list.")
    public void the_relevant_plot_should_be_verified_by_searching_for_the_ada_parcel_in_the_list() {

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // Max 3 saniye bekleme

        Set<String> adaParselSet = new LinkedHashSet<>(Arrays.asList(
                "1736/2", "107/107", "107/103", "107/102", "108/30", "1239/6", "2304/1", "2489/5",
                "4190/1", "4833/1", "2277/3", "4849/1", "4846/1", "4853/1", "2214/3", "2214/2",
                "2207/3", "2207/10", "3024/10", "1188/2", "1698/1", "2344/3", "1091/2", "1972/3",
                "1965/1", "1963/1", "2085/4", "760/1", "1844/1", "1148/2", "922/1", "3667/2",
                "4755/2", "2158/2", "3683/1", "3551/11", "2048/21", "2049/6", "2049/5", "2049/3",
                "2049/9", "2049/2", "2049/8", "209/12", "267/10", "999/7", "447/11", "987/5",
                "2352/1", "769/3", "417/2", "2272/1", "254/32", "1422/9", "1487/1", "2201/1",
                "698/8", "950/4", "1109/13", "1098/4", "728/3", "161/24", "161/23", "2063/6",
                "2229/4"
        ));

        List<String> notFoundAdaParselList = new ArrayList<>();

        for (String adaParsel : adaParselSet) {
            // Önceki aramayı temizle ve yeni değer gir
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.clear();
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(adaParsel);
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(Keys.RETURN);

            // İlk sonucu bekle (dinamik bekleme)
            try {
                //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//tr")));
            } catch (TimeoutException e) {
                System.out.println("No results loaded for: " + adaParsel);
            }

            // Sonuçları al
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