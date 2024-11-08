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
                "101/11", "6852/11", "192/23", "363/7", "297/3", "5084/1", "12004/9", "5111/6", "15130/1", "5392/1",
                "4917/12", "4622/2", "8855/1", "14305/5", "14072/3", "107/7", "14911/7", "15239/4", "4354/2", "5148/2",
                "13839/2", "3941/7", "15833/7", "7515/16", "7373/2", "3594/4", "118/3", "972/19", "16151/6", "466/1",
                "4439/4", "3990/9", "4155/11", "499/8", "498/6", "4271/11", "15304/1", "14119/6", "16906/2", "7495/5",
                "6417/5", "13839/3", "13012/3", "13358/3", "108/7", "401/5", "3053/14", "178/5", "7809/16", "6385/5",
                "1434/8", "6737/4", "5991/1", "395/10", "12967/2", "8041/7", "4389/8", "181/17", "4019/10", "5905/19",
                "13519/6", "6737/6", "16133/1", "0/5548", "198/8", "7877/9", "16478/2", "4482/7", "3197/6", "4690/3",
                "13187/14", "14893/12", "1454/6", "267/1", "8946/4", "7837/14", "12959/3", "12457/11", "16464/2", "986/12",
                "338/7", "5549/19", "13359/1", "13358/1", "7419/2", "16867/1", "3466/18", "7148/13", "338/8", "12880/1",
                "200/1", "174/2", "3795/10", "4013/5", "960/6", "5757/1", "13588/6", "6280/10", "12883/7", "183/5", "5851/11",
                "5850/3", "12216/3", "182/4", "4260/3", "4288/3", "4180/14", "12262/1", "15201/7", "986/5", "6280/3", "5400/20",
                "461/7", "596/6", "4072/3", "6587/11", "6797/8", "146/1", "4320/5", "4354/16", "16364/2", "12687/3", "15217/1"
                , "12004/14", "4595/7", "16476/1", "319/16", "6773/3", "5111/5", "4315/18", "13347/4", "3595/18", "178/8", "13288/7", "12984/10"

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
