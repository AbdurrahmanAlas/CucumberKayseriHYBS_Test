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
                "5180/3", "3152/5", "128/9", "5161/2", "135/8", "3222/6", "3620/6", "4644/7", "5151/2", "229/16",
                "3168/17", "508/1", "4784/1", "5165/1", "4989/1", "2652/10", "1340/17", "1217/2", "477/11", "5720/3",
                "7060/11", "14001/1", "11757/2", "12303/6", "865/11", "881/4", "750/4", "548/1", "13139/2", "13473/20",
                "12161/4", "11397/7", "865/11", "8148/3", "0/3226", "13187/14", "12680/2", "1711/4", "16337/5",
                "632/2", "17109/1", "6826/1", "7845/4", "198/7", "13199/3", "16459/3", "13206/1", "12990/3",
                "1440/2", "0/5595", "4224/5", "4272/15", "4418/17", "16347/2", "3885/3", "6008/7", "908/11",
                "2998/6", "12229/1", "6827/7", "3947/5", "0/5544", "13567/8", "7870/7", "8819/1", "16166/1",
                "639/9", "15026/1", "4484/6", "5148/2", "669/1", "5322/14", "3959/7", "4588/3", "105/7", "13835/1",
                "4688/7", "6569/2", "2080/3", "3630/13", "3630/12", "3549/10", "2267/1", "136/5", "1148/2",
                "2094/1", "3546/10", "3546/9", "2266/1"


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
                "4296/12", "217/3", "217/3", "8348/11", "225/10", "12498/6", "238/8", "7476/1", "5847/6", "174/3",
                "13734/3", "629/15", "15094/2", "3149/1", "13734/4", "13734/4", "5148/12", "3424/9", "6363/20", "6587/8",
                "238/8", "5113/15", "8474/11", "447/4", "174/3", "5757/2", "12582/1", "6827/7", "12582/1", "8507/2",
                "16364/1", "7535/10", "13562/1", "6938/6", "424/5", "12582/1", "3848/8", "4940/5", "4351/10", "3777/9",
                "15823/5", "16298/1", "1434/6", "12639/1", "14334/10", "14334/10", "3574/7", "5848/6", "5558/11", "7026/9",
                "497/3", "8356/16", "112/7", "13519/6", "363/7", "16729/1", "7323/5", "3595/18", "8658/7", "6101/4",
                "612/7", "358/8", "414/5", "7789/17", "7789/10", "5000/2", "5891/5", "7535/10", "8458/14", "7784/5",
                "198/12", "198/12", "6055/6", "5710/14", "8911/1", "12741/9", "5744/12", "2689/9", "4588/3", "2813/10",
                "3436/12", "6675/16", "13842/1", "4919/13", "7810/12", "5006/24", "661/6", "12003/7", "7617/7", "7617/7",
                "153/3", "307/3", "12563/12", "8464/5", "3574/10", "4594/10", "7868/20", "629/16", "16726/3", "6868/3",
                "8458/2", "8458/1", "13842/2", "8348/11", "4943/9", "1670/10", "8458/3", "146/1", "7718/7", "8856/2",
                "14986/1", "14986/1", "13843/8", "4288/6", "7844/2", "12883/2", "7868/20", "7874/15", "5104/2", "6852/11",
                "13849/5", "5104/2", "14118/1", "13200/20", "12180/3", "238/20", "236/14", "14306/1", "12998/6", "12004/9",
                "5453/2", "12639/1", "960/6", "5757/1", "12262/1", "15201/7", "986/5", "6280/3", "5400/20", "6797/8",
                "6797/8", "146/1", "16364/2", "12216/3", "15217/1", "15217/1", "12004/14", "4595/7", "16476/1", "6773/3",
                "5111/5", "13347/4", "3595/18", "178/8", "13288/7", "12984/10", "15025/4", "484/3", "128/6", "15616/11",
                "3572/11", "5271/12", "12617/5", "12617/5", "5850/3", "2956/4", "15239/1", "12687/3", "14912/8", "8139/10",
                "1438/9", "13354/4", "7923/4", "3574/1", "4939/17", "13724/4", "5991/20", "339/13", "5953/8", "669/1",
                "198/7", "6352/3", "499/8", "12990/3", "7873/2", "7873/2", "3572/11", "7808/10", "7808/10", "7808/10",
                "13717/1", "8222/7", "8426/4", "6658/3", "177/3", "6051/13", "6051/13", "8658/7", "792/4", "226/16",
                "4603/40", "3595/19", "5991/20", "3595/3", "7512/3", "2368/29", "8464/5", "6079/9", "294/1", "6366/5",
                "5050/16", "5050/15", "5050/15", "6587/2", "5814/15", "7323/5", "12539/9", "13981/1", "8055/11", "237/1",
                "8376/2", "14306/1", "263/8", "12957/1", "399/17", "8348/11", "839/1", "363/7", "297/3", "5084/1",
                "12004/9", "15130/1", "5392/1", "101/11", "4917/12", "4622/2", "8855/1", "14072/3", "107/7", "14911/7",
                "15239/4", "5148/2", "13839/2", "15833/7", "7515/16", "7373/2", "3594/4", "118/3", "972/19", "16151/6",
                "466/1", "499/8", "498/6", "15304/1", "14119/6", "16906/2", "7495/5", "14072/3", "6417/5", "13839/3",
                "13358/3", "108/7", "401/5", "178/5", "7809/16", "6385/5", "6737/4", "5991/1", "395/10", "15239/4",
                "12967/2", "8041/7", "181/17", "5905/19", "13519/6", "7495/5", "6737/6", "16133/1", "198/8", "7877/9",
                "3197/6", "4690/3", "13187/14", "14893/12", "1454/6", "267/1", "8946/4", "7837/14", "12959/3", "12457/11"

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