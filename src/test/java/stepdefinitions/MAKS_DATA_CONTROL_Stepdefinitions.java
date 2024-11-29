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
                "3687/13", "3040/16", "4617/11", "4546/28", "5134/9", "5128/2", "234/11", "2026/13", "1592/12",
                "1211/5", "1011/1", "3235/7", "10468/4", "10411/2", "10478/6", "10948/18", "10948/4", "10955/2",
                "14944/1", "13663/1", "750/13", "11661/5", "10386/10", "212/2", "7855/10", "13839/1", "5467/8",
                "4387/5", "4303/3", "4280/17", "4402/1", "4257/11", "4362/9", "12967/12", "7417/12", "6602/16",
                "6346/4", "958/16", "136/4", "134/2", "7256/3", "166/4", "14755/5", "8098/16", "4087/12", "4131/7",
                "4043/3", "3977/10", "4006/2", "4085/8", "3670/30", "3917/3", "3791/15", "3727/10", "3908/18", "3838/1",
                "3780/5", "3807/20", "3694/1", "13137/1", "2214/2", "760/1", "2050/23", "2050/22", "2050/21", "2050/20",
                "2050/4", "2050/3", "2050/2", "3683/1", "3551/11", "2048/20", "2352/1", "769/3", "950/4", "1109/13"



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

    @Given("The relevant plot should be verified by searching for the AdaParcel in the listt.")
    public void the_relevant_plot_should_be_verified_by_searching_for_the_ada_parcel_in_the_listt() {

        pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys("101/11");
        pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(Keys.RETURN); // Press the search button

        // Create a list of plot numbers
        List<String> adaParselList = Arrays.asList(
                "101/11", "6852/11"


        );
        List<String> notFoundAdaParselList = new ArrayList<>();

        // Check each plot number
        for (String adaParsel : adaParselList) {
            // Clear the search box and enter the new plot number
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.clear();
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(adaParsel);
            pageHYBS.cezaTaahhütCEZA_LIST_SEARCH.sendKeys(Keys.RETURN);

            // Wait 2 seconds after the search
            try {
                Thread.sleep(1000); // 2000 ms = 2 seconds
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
