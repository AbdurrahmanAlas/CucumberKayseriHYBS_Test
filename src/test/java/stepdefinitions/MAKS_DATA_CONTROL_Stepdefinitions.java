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

                "408/3", "363/5", "14336/2", "339/14", "266/4", "8262/1", "177/3", "112/4", "171/6", "7256/3",
                "7257/7", "8402/3", "12217/14", "153/3", "166/4", "13562/1", "14755/5", "12738/11", "258/12", "13174/2",
                "213/2", "12118/6", "307/3", "1440/5", "307/2", "13898/4", "1108/3", "8098/16", "7555/90", "8150/2",
                "1099/399", "4087/12", "4131/7", "4043/3", "3977/10", "4006/2", "4085/8", "4032/5", "4220/8", "4208/5",
                "13255/3", "3670/30", "3917/3", "3791/15", "3727/10", "3908/18", "3838/1", "3780/5", "3807/20", "3694/1",
                "3675/15", "3768/16", "3789/4", "3671/9", "3661/7", "3881/11", "726/11", "502/6", "707/2", "580/4",
                "717/11", "706/1", "439/3", "0/5544", "7546/1", "13137/1", "8930/9", "12010/2", "17094/1", "4698/2",
                "8625/5", "8625/8", "8615/7", "115/4", "14684/3", "12046/6", "-417", "2079/1", "2271/1", "129/11",
                "1239/6", "4194/1", "509/6", "2735/67", "2214/2", "659/7", "542/3", "659/7", "760/1", "1844/1",
                "2050/23", "2050/22", "2050/21", "2050/20", "2050/4", "2050/3", "2050/2", "3683/1", "2054/11", "1484/1",
                "3551/11", "2048/20", "3580/2", "3641/10", "3641/9", "3641/8", "2057/8", "2057/10", "4195/3", "2216/17",
                "3704/5", "3546/1", "2045/4","2050/1", "2048/21", "1535/2", "2352/1", "769/3", "2302/2", "916/5", "1454/10", "698/8", "950/4",
                "228/16", "1109/13", "2201/1", "1869/12", "272/9", "1489/7", "1489/6", "1579/15", "1579/14", "2229/7",
                "1985/7", "4754/6"






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
