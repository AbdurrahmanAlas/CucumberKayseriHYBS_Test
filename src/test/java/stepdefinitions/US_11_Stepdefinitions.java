package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.PageHYBS;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class US_11_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    @Given("User should be able to click on ManuelBakiyeDusumu")
    public void user_should_be_able_to_click_on_manuel_bakiye_dusumu() {

        pageHYBS.manuelBakiyeDüsümü.click();

    }

    @Given("Test whether balance reduction can be performed by entering the necessary information in the Manual Balance Reduction section.")
    public void test_whether_balance_reduction_can_be_performed_by_entering_the_necessary_information_in_the_manual_balance_reduction_section() {

        ReusableMethods.selectCompany(pageHYBS.companyList_DROPDOWN, pageHYBS.companyList_DROPDOWN_ıNPUT, "Deneme");

        pageHYBS.manuelBakiyeDüsümüBakiyeGiris.sendKeys("388");

        WebElement dosyaSecButonu = driver.findElement(By.xpath("(//input[@id=\"id_path\"])[1]"));
        String yuklenecekDosyaYolu = System.getProperty("user.home") +
                "\\Desktop\\resimler\\deneme.jpeg";
        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);

        pageHYBS.manuelBakiyeDüsümüNOTES.sendKeys("deneme yapıyoruz.");

        ReusableMethods.wait(2);

        pageHYBS.manuelBakiyeDüsümüOLUSTURBUTTON.click();

// Şirket seçme işlemi doğru bir şekilde gerçekleştirilmiş mi?
        WebElement selectedOption = pageHYBS.companyList_DROPDOWN;
        String selectedCompanyName = selectedOption.getText();
        Assert.assertEquals("Deneme", selectedCompanyName);

// Bakiye girişi doğru bir şekilde yapılmış mı?
        String enteredAmount = pageHYBS.manuelBakiyeDüsümüBakiyeGiris.getAttribute("value");
        Assert.assertEquals("388", enteredAmount);



// Not girişi doğru bir şekilde yapılmış mı?
        String enteredNote = pageHYBS.manuelBakiyeDüsümüNOTES.getAttribute("value");
        Assert.assertEquals("deneme yapıyoruz.", enteredNote);




    }

    @Given("User Manual Balance deducted part information must be received and verified.")
    public void user_manual_balance_deducted_part_information_must_be_received_and_verified() {

        ReusableMethods.wait(3);

        // Excel butonunu bul ve tıkla
        WebElement exportExcelButton = driver.findElement(By.id("export_excel"));
        exportExcelButton.click();

        // Tablodaki verileri al ve doğrula
        WebElement dataTable = driver.findElement(By.id("datatable_fixed_column"));
        WebElement tableBody = dataTable.findElement(By.tagName("tbody"));
        WebElement tableRow = tableBody.findElement(By.tagName("tr"));
        String tableData = tableRow.getText();
        String expectedData = "03/06/2021 12:23:00 Deneme 250,00 Emre Akdağ İptal";

        // Doğrulama
        assert tableData.equals(expectedData) : "Tablo verisi doğrulama hatası! Beklenen: " + expectedData + ", Bulunan: " + tableData;





    }




}
