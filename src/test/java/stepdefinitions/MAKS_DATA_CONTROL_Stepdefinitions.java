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
                "7553/6", "15094/7", "4594/7", "854/1850", "5357/9", "4279/3", "7842/1", "4177/13", "8820/5", "8459/8",
                "8459/8", "7322/7", "3731/1", "8549/6", "8517/1", "6297/1", "16723/1", "12683/1", "15016/1", "217/2",
                "217/2", "3498/13", "3498/13", "4248/2", "3725/12", "4043/9", "3657/7", "4292/15", "3951/9", "3812/1",
                "4280/12", "3716/3", "3767/7", "3687/4", "4401/5", "3866/4", "4484/5", "4067/13", "4676/23", "12638/1",
                "12638/1", "4386/16", "5099/1", "3744/5", "7267/2", "7267/2", "195/3", "207/13", "277/1", "5149/17",
                "2953/7", "641/10", "4919/15", "967/4", "6587/8", "6704/4", "594/10", "3202/21", "592/9", "15532/7",
                "209/6", "727/11", "12765/1", "8043/4", "5759/8", "16510/2", "16650/1", "15133/11", "232/5", "424/5",
                "13007/14", "13187/10", "678/8", "4636/7", "2833/5", "12004/9", "8636/4", "4594/10", "542/13", "6938/3",
                "8621/7", "15237/6", "3573/5", "12624/4", "16298/1", "16298/1", "6875/3", "13562/1", "727/11", "188/9",
                "532/2", "234/8", "12608/1", "3045/8", "3557/1", "542/13", "188/8", "7855/15", "7855/15", "7855/11",
                "391/7", "15071/1", "5112/13", "1420/11", "112/24", "12582/1", "13172/8", "13172/8", "15094/10",
                "4627/14", "8776/1", "13316/2", "314/9", "15094/7", "7941/12", "12582/1", "12582/1", "15184/2",
                "15184/1", "15184/3", "3866/3", "12683/1", "15016/1", "15016/1", "177/9", "5759/8", "4461/7",
                "7553/18", "4362/8", "7942/4", "348/5", "5104/2", "6602/14", "12002/4", "12002/3", "13840/12",
                "2678/4", "13695/4", "721/6", "13847/9", "12577/10", "7788/13", "5953/8", "820/6", "12937/10",
                "6587/11", "3979/15", "3974/3", "792/12", "182/10", "5804/18", "15025/4", "16150/3", "15287/4",
                "7874/15", "218/12", "218/11", "5424/20", "258/14", "258/14", "14754/8", "8339/8", "346/13",
                "4262/14", "15339/7", "15339/6", "15339/5", "15339/4", "15338/4", "15338/3", "15323/7", "15323/6",
                "15323/5", "15323/4", "15323/3", "15323/2", "16509/1", "15323/1", "15325/4", "15325/3", "15325/2",
                "15325/1", "15326/8", "15326/7", "15326/6", "15326/5", "15326/4", "15326/3", "15326/2", "15326/1",
                "15322/4", "15322/3", "15322/2", "15322/1", "15321/4", "15321/3", "15321/2", "15321/1", "15324/6",
                "15324/5", "15324/4", "15130/4", "307/2", "16674/1", "12733/9", "13724/4", "7718/7", "5173/19",
                "15324/3", "15324/2", "15324/1", "4032/11", "8658/7", "8658/7", "194/2", "626/6", "7340/5", "6854/7",
                "6587/11", "6658/3", "5847/6", "3489/13", "8674/7", "3851/3", "960/6", "4385/2", "3948/9", "4325/5",
                "3891/10", "5009/7", "4292/6", "4287/14", "4125/12", "3739/2", "4296/12", "217/3", "217/3", "8348/11",
                "225/10", "12498/6", "238/8", "7476/1", "5847/6", "174/3", "13734/3", "629/15", "15094/2", "3149/1",
                "13734/4", "13734/4", "5148/12", "3424/9", "6363/20", "6587/8", "238/8", "5113/15", "8474/11", "447/4",
                "174/3", "5757/2", "12582/1", "6827/7", "12582/1", "8507/2", "16364/1", "7535/10", "13562/1",
                "6938/6", "424/5", "12582/1", "3848/8", "4940/5", "4351/10", "3777/9", "15823/5", "16298/1", "1434/6",
                "12639/1", "14334/10", "14334/10", "3574/7", "5848/6", "5558/11", "7026/9", "497/3", "8356/16",
                "112/7", "13519/6", "363/7", "16729/1", "7323/5", "3595/18", "8658/7", "6101/4", "612/7", "358/8",
                "414/5", "7789/17", "7789/10", "5000/2", "5891/5", "7535/10", "8458/14", "7784/5", "198/12", "198/12",
                "6055/6", "5710/14", "8911/1", "12741/9", "5744/12", "2689/9", "4588/3", "2813/10", "3436/12",
                "6675/16", "13842/1", "4919/13", "7810/12", "5006/24", "661/6", "12003/7", "7617/7", "7617/7",
                "153/3", "307/3", "12563/12", "8464/5", "3574/10", "4594/10", "7868/20", "629/16", "16726/3",
                "6868/3", "8458/2", "8458/1"


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