package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageN2MOBIL {

    public PageN2MOBIL() {

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@id=\"__BVID__12\"]")
    public WebElement emailAddresn2MOBIL;

    @FindBy(xpath = "//input[@id=\"__BVID__13\"]")
    public WebElement passwordn2MOBIL;

    @FindBy(xpath = "//div[@class=\"bottom-btn\"]")
    public WebElement signInbutonun2MOBIL;
    @FindBy(xpath = "//a[text()=\"  Alarmlar\"]")
    public WebElement alarmbuttonlink;

    @FindBy(xpath = "//div[text()=\"Alarm\"]")
    public WebElement alarmCLICK;

    @FindBy(xpath = "//i[@class=\"sidenav-icon fas fa-plus\"]")
    public WebElement yeniAlarm;

    @FindBy(xpath = "(//div[@class=\"multiselect__tags\"])[1]")
    public WebElement dropdownFırmalar;
    //div[@class="multiselect select-bg"]

    @FindBy(xpath = "(//input[@class=\"multiselect__input\"])[1]")
    public WebElement DropdownINPUT;

    @FindBy(xpath = "//button[text()=\"Tümünü Seç\"]")
    public WebElement TumunuSecDropdown;

    @FindBy(xpath = "(//div[@class=\"multiselect__select\"])[4]")
    public WebElement DropdownALARMLAR;

    @FindBy(xpath = "(//input[@class=\"multiselect__input\"])[4]")
    public WebElement DropdownALARMLAR_INPUT;

    @FindBy(xpath = "(//div[@class=\"multiselect__select\"])[5]")
    public WebElement DropdownBILDIRIM;

    @FindBy(xpath = "(//input[@class=\"multiselect__input\"])[5]")
    public WebElement DropdownBILDIRIM_INPUT;


    @FindBy(xpath = "(//div[@class=\"multiselect__select\"])[6]")
    public WebElement DropdownKULLANICILAR;

    @FindBy(xpath = "(//input[@class=\"multiselect__input\"])[6]")
    public WebElement DropdownKULLANICILAR_INPUT;

    @FindBy(xpath = "//small[text()=\"SMS ile Bildirim Almak İçin Müşteri Temsilcinizle İrtibata Geçin!\"]")
    public WebElement BOSLUGATIKLA;
    @FindBy(xpath = "//i[@class=\"open-indicator\"]")
    public WebElement DamperDROPDOWN;
    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement DamperDROPDOWN_INPUT;


    @FindBy(xpath = "(//label[@class=\"custom-control-label\"])[9]")
    public WebElement DamperDROPDOWNwhenActive;

    @FindBy(xpath = "//button[@class=\"btn btn-primary pull-right\"]")
    public WebElement ALARM_KAYDET;


    @FindBy(xpath = "//button[text()=\"OK\"]")
    public WebElement basarılıOK;

    @FindBy(xpath = "(//small[text()=\"Bu Alanın Doldurulması Zorunludur !\"])[1]")
    public  WebElement bualanındoldurulmasımesajıgorunuyor;


    @FindBy(xpath = "//a[@id=\"vehicle_docs\"]")
    public  WebElement companylist_VEHICLE_DOCUMENT;




}
