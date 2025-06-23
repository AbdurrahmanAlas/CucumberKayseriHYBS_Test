package utilities;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.PageHYBS;
import pages.PageN2MOBIL;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;

import static utilities.Driver.driver;

public class ReusableMethods {


    // 1 - ************************ WAIT METHODU ********************************//
    //BU METHODDA SÜRE BELİRLERİZ
    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    // 2 - ************************ EXPLICIT METHODU ********************************//
    // ELEMENT GÖRÜNENE KADAR BEKLEME METHODU

    public static void selectDropdownOption(WebDriver driver, WebElement dropdownContainer, String optionText) {
        dropdownContainer.click();
        WebElement option = driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(), '" + optionText + "')]"));
        option.click();
    }


    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitForClickablility(List<WebElement> elements, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable((By) elements));
    }
    // 3 - ************************ STRINGI RAKAM YAPMA METHODU ********************************//
    // Bir stringi sadece rakam olarak birakir ve integer'a cast eder.
    public static int onlyTakeNumberandParseInteger(String number) {
        return Integer.parseInt(number.replaceAll("\\D", ""));
    }


    // 4 - ************************** SAYFA ÜZERİNDE İSTENİLEN ELEMENTE GİDER *****************//

    public static void focusToElement(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(element);
    }

    // 5- *************************** SAYFAYA GİRİS VE POPUP KAPANISI********************//

    public static void enterPageAndClosePopUp() {
        PageHYBS pageTrend = new PageHYBS();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitForClickablility(pageTrend.PopupExitButon, 15);
        pageTrend.PopupExitButon.click();

    }


    // 5- **************************** ADMIN VE CUSTOMER LOGIN  ****************************//
    public static void loginHYBS(String username, String password) {

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        PageHYBS pageHYBS = new PageHYBS();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        pageHYBS.emailAddres.sendKeys(username);
        pageHYBS.password.sendKeys(password);
        pageHYBS.signInbutonu.click();
        ReusableMethods.wait(3);



    }

    public static void loginn2MOBIL(String username, String password) {

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        PageN2MOBIL pageN2MOBIL = new PageN2MOBIL();
        Driver.getDriver().get(ConfigReader.getProperty("urln2MOBIL"));
        ReusableMethods.wait(5);
        pageN2MOBIL.emailAddresn2MOBIL.sendKeys(username);
        pageN2MOBIL.passwordn2MOBIL.sendKeys(password);
        ReusableMethods.wait(3);
        pageN2MOBIL.signInbutonun2MOBIL.click();
        ReusableMethods.wait(3);



    }






    public static void TakipLoginHYBS(String username, String password) {

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        PageHYBS pageHYBS = new PageHYBS();
        Driver.getDriver().get(ConfigReader.getProperty("urlTakipSistemi"));
        pageHYBS.aractakipEmailgiris.sendKeys(username);
        pageHYBS.aractakipPasswordgiris.sendKeys(password);
        pageHYBS.aractakipgirisbutonu.click();

        ReusableMethods.wait(3);



    }

    //*********************ADMIN LOGIN****************************//
    public static void AdminloginTrendlife(String username, String password) {

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        PageHYBS pagesTrend = new PageHYBS();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        // pagesTrend.PopupExitButon.click();
        // pagesTrend.userloginButon.click();
        pagesTrend.adminEmailTextBox.sendKeys(username);
        pagesTrend.adminPasswordTextBox.sendKeys(password);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        pagesTrend.adminSignInButton.click();

    }

    //*********************ADMIN LOGIN****************************//
    public static void Adminlogin075Trendlife(String username, String password) {

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        PageHYBS pagesTrend = new PageHYBS();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        // pagesTrend.PopupExitButon.click();
        // pagesTrend.userloginButon.click();
        pagesTrend.adminEmailTextBox.sendKeys(username);
        pagesTrend.adminPasswordTextBox.sendKeys(password);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        pagesTrend.adminSignInButton.click();

    }

// Its choose random item from requested menu which is in "add ticket page"

    public static void chooseItemFromMenuWhichIsInAddTicketPage(List<WebElement> listOfMenu, WebElement buttonOfMenu) {
        waitForClickablility(buttonOfMenu, 5);
        Random random = new Random();
        int index = random.nextInt(1, 5);
        buttonOfMenu.click();
        waitForClickablility(listOfMenu.get(index), 5);
        listOfMenu.get(index).click();


    }


    public static void verifyAllItemsAreClickable(List<WebElement> listOfMenu, WebElement buttonOfMenu, WebElement currentText) throws InterruptedException {
        buttonOfMenu.click();
        for (WebElement each : listOfMenu) {

            try {
                each.click();
            } catch (Exception e) {
                waitForClickablility(each, 5);
                each.click();
            }
            String actualText = each.getText();
            Thread.sleep(500);
            Assert.assertEquals(actualText, currentText.getText());
            buttonOfMenu.click();
            waitForClickablility(each, 5);
        }
    }


    // 5- **************************** ADMIN VE CUSTOMER LOGIN  ****************************//
    public static void wrongloginTrendlife(String username, String password) {

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        PageHYBS pagesTrend = new PageHYBS();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        pagesTrend.PopupExitButon.click();
        pagesTrend.userloginButon.click();
        pagesTrend.emailAddres.sendKeys(username);
        pagesTrend.password.sendKeys(password);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        pagesTrend.signInbutonu.click();

    }


    // 5- **************************** ADMIN VE CUSTOMER LOGIN  ****************************//
    public static void loginMyAccount(String username, String password) {

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        PageHYBS pagesTrend = new PageHYBS();
        pagesTrend.emailAddres.sendKeys(username);
        pagesTrend.password.sendKeys(password);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        pagesTrend.signInbutonu.click();

    }


    //6- *************************** ASSERT URL CONTROL************************


    //ABDURRAHMAN ADMIN LOGIN

 /*   public static void adminLoginTrendlife(String username,String password){

        // username ve password'ü kendiniz verebilir ya da ConfigReader class'ı verebilirsiniz.

        US_1_11_12_18_25_31_38 pages = new US_1_11_12_18_25_31_38();
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        pages.adminEmailAddress.sendKeys(username);
        pages.adminPassword.sendKeys(password);
        ReusableMethod.bekle(2);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethod.bekle(2);
        pages.adminSignIn.click();

    }


*/

    public static void AssertUrlControl(String expectedUrl) {


        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }


    public static void selectCompany(WebElement companyDropdown, WebElement companyInput, String companyName) {
        companyDropdown.click();
        companyInput.sendKeys(companyName + Keys.ENTER);
    }
    public static void selectDateWithJavaScript(WebDriver driver, WebElement dateInput, String desiredDate) {
        String script = "arguments[0].value = arguments[1];";
        ((JavascriptExecutor) driver).executeScript(script, dateInput, desiredDate);
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }


    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }

    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });

        return element;

    }

    public static void scrolldown() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    public static void scrolldown_DownViewAll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,420)");

    }

    public static void AssertUrlControl(String actualUrl, String expectedUrl) {
        actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public static void scrolldown_LoadMore() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5500)");

    }

    public static void Arrowdown() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).


                perform();


    }

    public static Actions getActions() {

        Actions actions;
        return actions = new Actions(Driver.getDriver());
    }

    public static Faker getFaker() {

        Faker faker;
        return faker = new Faker();
    }


    // Uyarı veren alertlerde ekran goruntusu alma
    public static String

    getScreenshotWebElement(String name, WebElement element) throws IOException {

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File source = element.getScreenshotAs(OutputType.FILE);
        // EKRAN GORUNTUSU NUN TAM YOLU
        String wElementSS = System.getProperty("user.dir") + "/target/WElementScreenshots/" + name + date + ".png";
        File finalDestination = new File(wElementSS);

        //EKRAN GORUNTUSU VERILEN YOLA KAYDEDER
        FileUtils.copyFile(source, finalDestination);
        return wElementSS;
    }

    public static void PurchaseHistoryWHD() {
        PageHYBS pageTrend = new PageHYBS();
        String ilkSayfaWHD = driver.getWindowHandle();
        pageTrend.purchaseHistoryActionInvoiceDownload.click();
        ReusableMethods.wait(5);
        // click yapinca yeni tab acilir ancak driver eski tab'da kalir
        // yeni tab'a driver'i gecirmek icin yeni tab'in WHD ihtiyacimiz var

        Set<String> ikiSayfannWHDegerleriSeti = driver.getWindowHandles();
        String ikinciSayfannWHD = "";

        for (String eachWHD : ikiSayfannWHDegerleriSeti
        ) {
            if (!eachWHD.equals(ilkSayfaWHD)) {
                ikinciSayfannWHD = eachWHD;
            }
            // foreach loop bittiginde ikinci sayfanin WHD'ini elde etmis olacagiz
            // bu degeri kullanarak, driver'i 2.sayfaya  gecirebiliriz
            driver.switchTo().window(ikinciSayfannWHD);
            ReusableMethods.wait(2);

            // yeni tab'a gecip sayfadaki  yazinin "Document" oldugunu test edin
            Assert.assertTrue(pageTrend.ikincisayfaTitle.isDisplayed());


        }

    }


    public static void scrolldown_600() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");

    }


    public static void scrolldown_Action6() {

        Actions actions=new Actions(Driver.getDriver());
        actions
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();

    }

    public static void scrolldown_bypixel_2000() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");

    }

    public static void scrolldown_bypixel_10000() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)");

    }


}
