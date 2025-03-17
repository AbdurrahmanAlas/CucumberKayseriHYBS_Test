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
                "10741/10", "10852/6", "14650/1", "927/2", "7554/4", "4560/5", "7555/98", "7555/97", "5368/9", "5271/12",
                "4622/16", "295/7", "15239/4", "13443/1", "13288/7", "16333/1", "16297/1", "148/8", "15618/10", "13741/4",
                "6703/10", "4303/2", "6705/2", "8474/12", "16674/1", "3871/18", "4440/7", "2561/13", "G/3115", "423/8",
                "6854/7", "976/5", "13308/6", "14909/2", "5379/3", "12680/2", "169/11", "8342/6", "6001/13", "13000/1",
                "4817/4", "3594/4", "12175/14", "13723/2", "3197/6", "16650/1", "4128/2", "2998/6", "5148/2", "608/5",
                "5852/8", "7868/10", "13725/1", "12215/7", "8980/4", "15245/3", "2678/4", "12237/4", "278/6", "136/37", "127/69", "16515/11",
                "4389/10", "6633/2", "1747/9", "1747/8", "1747/7", "2094/1", "659/3", "3284/9", "2238/3", "1413/4", "1413/3", "1939/8", "2238/2", "2173/1"

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