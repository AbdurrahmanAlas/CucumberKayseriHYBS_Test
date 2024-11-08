package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.PageHYBS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void check_multiple_plot_numbers_and_print_those_not_found_in_the_list() {
        // Create a list of plot numbers
        List<String> adaParselList = Arrays.asList(
                "7802/6", "16140/220", "11235/1", "11234/1", "4210/2", "571/3", "11858/3", "4060/1", "12125/2",
                "12374/13", "13267/2", "11858/3", "12128/1", "13123/2", "10013/2", "2398/21", "239/33", "221/6",
                "10307/3", "239/33", "1870/2", "221/6", "7483/1", "2398/21", "7263/7", "10013/2", "182/4", "11397/7",
                "12490/3", "1509/39", "875/7", "340/9", "13634/1", "13634/1", "13634/1", "13634/1", "204/7", "138/5",
                "10714/4", "107/4", "11397/7", "204/7", "13468/8", "13099/4", "177/1", "220/2", "10741/10", "220/2",
                "10741/10", "12745/1", "1870/2", "133/2", "895/6", "6786/4", "895/5", "477/9", "13267/2", "220/2",
                "12374/7", "10714/4", "220/2", "495/13", "7183/3", "133/2", "12402/8", "497/7", "7183/3", "233/6",
                "477/9", "2390/7", "340/9", "10828/6", "5432/11", "4428/4", "7561/2", "4428/4", "10644/1", "12796/1",
                "6128/17", "11723/3", "259/16", "229/9", "10857/1", "7497/2", "5944/13", "5944/13", "5356/2", "495/13",
                "320/7", "7497/2", "320/7", "11364/11", "11362/10", "11363/6", "7561/2", "11363/6", "11360/7", "7561/2",
                "10851/2", "179/1", "4721/10", "7561/2", "4721/10", "286/9", "7649/1", "324/4", "16057/1", "2379/4",
                "10854/2", "11359/11", "4983/3", "11358/9", "518/3", "2935/10", "7640/2", "11621/2", "384/13", "2946/6",
                "11621/5", "10068/9", "190/9", "3888/6", "224/2", "225/4", "6786/4", "184/8", "174/1", "6840/8",
                "10186/1", "12164/2", "5211/13", "12164/2", "751/4", "168/17", "10178/3", "194/3", "11407/3", "168/17",
                "9191/3", "12796/1", "5743/4", "2330/1", "3980/1", "384/13", "1607/1029", "11722/3", "7053/6",
                "11696/1", "10898/6", "11358/9"
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
}
