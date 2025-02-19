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

                "13354/4", "12747/8", "118/4", "5164/9", "12736/15", "282/14", "6437/20", "12599/2", "5990/17", "5462/2", "6280/10", "5953/6", "5850/3", "7250/3", "3149/4", "13045/3", "13533/1", "6633/7", "4580/9", "8637/1", "8622/1", "7719/14", "282/14", "4240/14", "13827/2", "6111/1", "12597/1", "4354/9", "4314/8", "6630/5", "153/10", "3636/14", "8004/1", "13316/5", "339/15", "15094/1", "13712/5", "5394/1", "8356/16", "5990/23",
                "508/4", "13491/1", "8636/4", "12745/7", "8016/8", "3714/15", "6854/1", "6494/16", "6482/9", "6497/17", "6491/14", "6492/7", "12781/8", "13533/1", "142/6", "6633/9", "3834/4", "7874/2", "237/14", "4385/7", "4319/7", "12604/2", "5458/15", "12236/3", "16120/1", "3789/7", "15088/5", "12993/5", "806/19", "5394/1", "5583/1", "4370/6", "13728/1", "4091/2", "702/9", "6852/5", "298/20", "12131/4", "3508/11", "4460/11",
                "3658/10", "231/6", "12881/3", "3864/3", "4340/8", "3875/8", "1748/3", "707/2", "211/13", "3946/11", "15228/1", "928/1", "13074/1", "7797/9", "4214/22", "4400/6", "8653/1", "492/7", "4470/26", "3979/19", "7919/12", "12563/12", "4104/8", "495/1", "4407/6", "3996/15", "973/11", "6826/8", "3799/7", "5410/10", "601/15", "3881/21", "6000/5", "277/1", "4357/11", "4191/14", "4166/16", "4180/10", "3825/26", "4470/25",
                "3684/10", "4205/3", "3959/15", "13359/4", "4091/12", "4182/17", "3704/15", "3677/15", "7535/9", "4103/12", "4484/17", "862/2", "3670/27", "8550/10", "3776/9", "4035/14", "5844/5", "15071/1", "4436/18", "7755/4", "4135/12", "236/16", "184/1", "13012/1", "4083/12", "4343/10", "12679/1", "3775/9", "163/3", "3703/2", "3810/10", "3660/28", "3820/17", "4323/16", "3693/3", "4124/8", "3875/3", "4067/14", "4289/23",
                "3679/3", "4379/11", "4442/2", "4422/20", "3746/4", "3887/4", "3751/1", "10893/5", "4157/12", "4217/17", "4201/5", "3916/20", "4294/10", "3751/6", "4012/16", "4086/10", "7309/7", "4398/11", "12960/2", "4442/25", "4455/10", "13130/1", "4126/8", "3814/5", "7176/2", "13790/1", "4345/12", "3731/3", "8035/4", "16297/1", "16333/1", "8035/4", "6675/16", "3481/23", "6957/5", "1114/3", "6026/5", "13354/4", "304/6", "4691/12",
                "3486/8", "12781/4", "13734/4", "13734/3", "5328/1", "13006/4", "215/15", "5600/9", "4173/1", "6363/20", "4617/15", "15198/1", "4693/12", "582/1", "5162/6", "5749/1", "5502/3", "3713/13", "642/3", "3445/2", "5757/5", "13297/2", "15297/3", "3764/7", "286/9", "7905/19", "6948/4", "145/5", "1436/2", "8388/8", "4165/11", "366/3", "508/4", "12610/6", "12610/5", "6051/1", "8205/1", "4382/6", "3869/11", "854/3", "5550/11",
                "15244/6", "15237/6", "12001/1", "7515/15", "832/1", "8981/4", "12962/8", "357/1", "439/8", "439/3", "6308/48", "12215/8", "12004/9", "5155/11", "582/1", "3820/23", "6827/13", "3779/9", "1405/2", "13066/1", "661/5", "501/10", "13562/3", "6437/20", "13190/4", "5838/2", "183/10", "388/14", "4326/14", "15016/1", "3669/24", "8392/3", "8016/8", "4235/15", "4235/20", "3795/6", "4445/10", "3679/6", "3729/6", "13600/1",
                "3806/1", "4318/14", "15819/8", "185/13", "5162/6", "8065/4", "4676/12", "6512/12", "6512/11", "6488/13", "15220/1", "7638/1", "6481/16", "8820/13", "8759/1", "6703/9", "5104/2", "3738/7", "12296/13", "183/12", "183/11", "7322/7", "4350/11", "13568/1", "12687/3", "3466/8", "3734/11", "3799/10", "13757/1", "2562/6", "4618/16", "407/2", "666/2", "7877/9", "591/4", "4284/15", "700/5", "7912/1", "4597/10", "8845/10","4284/15", "700/5", "7912/1", "4597/10", "8845/10", "3672/7", "13020/1", "8081/3", "4274/15", "354/8", "3636/14", "6647/5", "6497/15", "6491/14", "6492/7", "3731/4", "7800/5", "3854/10", "8653/1", "4470/26", "3979/19", "7919/12", "12563/12", "4104/8", "495/1", "4407/6", "3996/15", "973/11", "6826/8", "3799/7", "5410/10", "601/15", "3881/21", "6000/5", "277/1", "4357/11", "4191/14", "4166/16", "4180/10", "3825/26",
                "4470/25", "3684/10", "4205/3", "3959/15", "13359/4", "4091/12", "4182/17", "3704/15", "3677/15", "7535/9", "4103/12", "4484/17", "862/2", "3670/27", "8550/10", "3776/9", "4035/14", "5844/5", "15071/1", "4436/18", "7755/4", "4135/12", "236/16", "184/1", "13012/1", "4083/12", "4343/10", "12679/1", "3775/9", "163/3", "3703/2", "3810/10", "3660/28", "3820/17", "4323/16", "3693/3", "4124/8", "3875/3", "4067/14", "4289/23",
                "3679/3", "4379/11", "4442/2", "4422/20", "3746/4", "3887/4", "3751/1", "10893/5", "4157/12", "4217/17", "4201/5", "3916/20", "4294/10", "3751/6", "4012/16", "4086/10", "7309/7", "4398/11", "12960/2", "4442/25", "4455/10", "13130/1", "4126/8", "3814/5", "7176/2", "13790/1", "4345/12", "3731/3", "8035/4", "16297/1", "16333/1", "8035/4", "6675/16", "3481/23", "6957/5", "1114/3", "6026/5", "13354/4", "304/6", "4691/12",
                "3486/8", "12781/4", "13734/4", "13734/3", "5328/1", "13006/4", "215/15", "5600/9", "4173/1", "6363/20", "4617/15", "15198/1", "4693/12", "582/1", "5162/6", "5749/1", "5502/3", "3713/13", "642/3", "3445/2", "5757/5", "13297/2", "15297/3", "3764/7", "286/9", "7905/19", "6948/4", "145/5", "1436/2", "8388/8", "4165/11", "366/3", "508/4", "12610/6", "12610/5", "6051/1", "8205/1", "4382/6", "3869/11", "854/3", "5550/11",
                "15244/6", "15237/6", "12001/1", "7515/15", "832/1", "8981/4", "12962/8", "357/1", "439/8", "439/3", "6308/48", "12215/8", "12004/9", "5155/11", "582/1", "3820/23", "6827/13", "3779/9", "1405/2", "13066/1", "661/5", "501/10", "13562/3", "6437/20", "13190/4", "5838/2", "183/10", "388/14", "4326/14", "15016/1", "3669/24", "8392/3", "8016/8", "4235/15", "4235/20", "3795/6", "4445/10", "3679/6", "3729/6", "13600/1"




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