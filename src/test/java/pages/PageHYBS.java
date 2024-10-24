package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class PageHYBS {

    public PageHYBS() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // 1- Login>email


    @FindBy(xpath = "//*[@id=\"id_username\"]")
    public WebElement emailAddres;





    @FindBy(xpath = "//a[text()=\"  Alarmlar\"]")
    public WebElement alarmbuttonlink;



    //2- Login > Password

    @FindBy(xpath = "//input[@id=\"id_password\"]")
    public WebElement password;

    //3- Login > Sign In butonu
    @FindBy(xpath = "//button[@id=\"login_button\"]")
    public WebElement signInbutonu;


    @FindBy(xpath = "//p[text()=\"Bilgileriniz hatalı lütfen bilgilerinizi kontrol ediniz\"]")
    public WebElement uyarımesajı;


    @FindBy(xpath = "//button[@id=\"yapi_ruhsat_job_list_excel\"]")
    public WebElement yapı_ruhsat_job_list_excel;


    //4- Anaysayfalinki
    @FindBy(xpath = "//*[@id=\"sidebar_nav\"]/ul/li[1]/a")
    public WebElement AnasayfaLink;


    //5- IsletmeModuluLink
    @FindBy(xpath = "//*[@id=\"sidebar_nav\"]/ul/li[2]/a")
    public WebElement isletmeModuluLink;


    //6- IsletmeModuluLink
    @FindBy(xpath = "//*[@id=\"sidebar_nav\"]/ul/li[4]/a/span")
    public WebElement TalepListeleriLink;


    //7- Su ve K.i
    @FindBy(xpath = "//*[@id=\"sidebar_nav\"]/ul/li[5]/a/span")
    public WebElement SuveKiTalepLink;

    // 8- FirmaListesi
    @FindBy(xpath = "//a[text()=\"Firma Listesi\"]")
    public WebElement FirmaListesi;

    @FindBy(xpath = "//a[text()=\"Araç Listesi\"]")
    public WebElement AracListesi;


    @FindBy(xpath = "//a[text()=\"Araç Kiralama\"]")
    public WebElement AracKiralama;


    @FindBy(xpath = "//a[text()=\"Yapı Ruhsat Talebi\"]")
    public WebElement YapıRuhsatTalebiLinki;

    @FindBy(xpath = " //a[text()=\"Harici Kazı Talebi\"]")
    public WebElement HariciKazıTalebiLinki;


    @FindBy(xpath = "//span[text()=\"Su ve K.İ. Talep Listeleri\"]")
    public WebElement suveKiTalepLinki;


    @FindBy(xpath = "//a[text()=\"Alt Yapı İş Talebi\"]")
    public WebElement altyapıTaleblink;

    @FindBy(xpath = "//span[text()=\"İş Süreçleri\"]")
    public WebElement isSurecleriLink;


    @FindBy(xpath = "//a[text()=\"Yapı Ruhsatlı İş Süreci\"]")
    public WebElement yapiRuhsatliisSurecleriLink;


    @FindBy(xpath = "//a[text()=\"Harici Kazı İş Süreci\"]")
    public WebElement hariciKaziisSurecleriLink;


    @FindBy(xpath = "//a[text()=\"İnşaat Dolgu İş Süreci\"]")
    public WebElement insaatDolguisSurecleriLink;


    @FindBy(xpath = "//span[text()=\"Su ve K.İ. İş Süreçleri\"]")
    public WebElement suveKiissureclerilink;

    @FindBy(xpath = "//a[text()=\"Döküm Sahası Hareketleri\"]")
    public WebElement dokumsahasihareketleri;


    @FindBy(xpath = "//span[text()=\"Küçük Araç\"]")
    public WebElement kucukaraclink;


    @FindBy(xpath = "//a[text()=\"Alt Yapı İş Süreci\"]")
    public WebElement altyapıissurecilink;


    @FindBy(xpath = "//a[text()=\"Küçük Araç İşlemleri\"]")
    public WebElement kucukaracislemleri;


    @FindBy(xpath = "//span[text()=\"Sistem Yönetimi\"]")
    public WebElement sistemyonetimilinki;


    @FindBy(xpath = "//a[text()=\"Mali Listesi\"]")
    public WebElement maliListesilinki;


    @FindBy(xpath = "//span[text()=\"Raporlar\"]")
    public WebElement raporlarlinki;

    @FindBy(xpath = "//a[text()=\"Araç Takip Sistemi\"]")
    public WebElement aracTakipSistemilinki;

    @FindBy(xpath = "//a[text()=\"Döküm Sahası Listesi\"]")
    public WebElement dokumsahasılistesi;

    @FindBy(xpath = "//a[text()=\"Kullanıcı Listesi\"]")
    public WebElement kullanicilistesi;

    @FindBy(xpath = "//span[@class=\"select2-selection__rendered\"]")
    public WebElement firmaListesiGrupDropdown;

    @FindBy(xpath = "//*[@class=\"select2-search__field\"]")
    public WebElement firmaListesiGrupDropdown_INPUT;

    @FindBy(xpath = "//td[text()=\"ADEM BÖLÜKBAŞ\"]")
    public WebElement firmaListesiGrupDropdown_HAFRIYATCIKONTROL;

    @FindBy(xpath = "//td[text()=\"HACILAR BELEDİYESİ\"]")
    public WebElement firmaListesiGrupDropdown_ILCEBELEDIYECONTROL;


    @FindBy(xpath = "(//i[@class=\"fa fa-close\"])[1]")
    public WebElement pasifeAlbutonuFIRMA;

    @FindBy(xpath = "//button[@id=\"bot2-Msg1\"]")
    public WebElement pasifeAlSilinsinmiEvet;








    @FindBy(xpath = "//a[text()=\"Log Listesi\"]")
    public WebElement loglistesi;


    @FindBy(id = " company_list_dt")
    public WebElement firmalistesitablosu;

    @FindBy(xpath = " //th[text()=\" Firma Ünvanı\"]")
    public WebElement firmaUnvanibasligi;

    @FindBy(xpath = "//th[text()=\"Işlem ve Mobil Uygulama Yetklisi Telefon\"]")
    public WebElement islemvemobiluygulamatelefonbasligi;

    @FindBy(xpath = "//th[text()=\"İlçe\"]")
    public WebElement ilcebasligi;


    @FindBy(xpath = "//th[text()=\"Adres\"]")
    public WebElement adresbasligi;


    @FindBy(xpath = "//th[text()=\"E-Posta\"]")
    public WebElement epostabasligi;


    @FindBy(xpath = "//th[text()=\"Sicil No\"]")
    public WebElement sicilnobasligi;

    @FindBy(xpath = "//*[@id=\"logFrom\"]/fieldset/div/div/section[1]/div/label[2]/span/span[1]/span/span[2]")
    public WebElement firmalistesilütfengrupsecinizdropdown;


    @FindBy(xpath = "//span[text()=\"Hafriyatçı\"]")
    public WebElement dropdowndakihafriyatci;


    @FindBy(xpath = "//span[text()=\"İlçe Belediye\"]")
    public WebElement dropdowndakiilcebelediye;


    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement companygroupCurrentsearchtext;

    @FindBy(xpath = "(//label[@class=\"onoffswitch-label\"])[1]")
    public WebElement userpassivelist;

    @FindBy(xpath = "//td[text()=\"Deneme\"]")
    public WebElement denemefirmaAdı;


    @FindBy(xpath = "//i[@class=\"fa fa-reply\"]")
    public WebElement AktifEtbutonu;


    @FindBy(xpath = "//*[@id=\"logFrom\"]/fieldset/div/div/section[2]/div[1]/span")
    public WebElement userpassivelistEVET;


    @FindBy(xpath = "//*[@id=\"logFrom\"]/fieldset/div/div/section[2]/div[2]/span/label")
    public WebElement blacklist;

    @FindBy(xpath = "//td[text()=\"SADIK DOĞALTAŞ\"]")
    public WebElement blacklistEVET;

    @FindBy(xpath = "//*[@id=\"logFrom\"]/fieldset/div/div/section[2]/div[3]/span/label")
    public WebElement cleancompanylist;

    @FindBy(xpath = "//td[text()=\"Deneme\"]")
    public WebElement cleancompanyEVET;


    @FindBy(xpath = "(//input[@class=\"form-control filter-input\"])[1]")
    public WebElement nameInput;

    @FindBy(xpath = "(//input[@class=\"form-control filter-input\"])[2]")
    public WebElement phoneInput;

    @FindBy(id = "province_filter")
    public WebElement provinceInput;

    @FindBy(id = "address_filter")
    public WebElement addressInput;

    @FindBy(id = "email_filter")
    public WebElement emailInput;

    @FindBy(id = "register_no_filter")
    public WebElement registerNoInput;


    @FindBy(id = "tax_office_filter")
    public WebElement taxOfficeInput;


    @FindBy(name = "tax_id")
    public WebElement taxIdInput;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement titleInput;


    @FindBy(xpath = "//input[@name=\"phone1\"]")
    public WebElement phone1Input;


    @FindBy(id = "id_type")
    public WebElement typeDropdown;

    @FindBy(id = "id_province")
    public WebElement provinceDropdown;

    @FindBy(id = "id_tax_administration")
    public WebElement taxAdministrationDropdown;

    @FindBy(id = "id_group_type")
    public WebElement groupTypeDropdown;

    @FindBy(xpath = "//*[@id=\"company_form\"]/fieldset/div[6]/div[2]")
    public WebElement addressTextarea;

    @FindBy(xpath = "//*[@id=\"company_form\"]/fieldset/div[1]/div[2]/div/div")
    public WebElement companyshortname;

    @FindBy(xpath = "//input[@id=\"id_phone\"]")
    public WebElement islemmailphone;
    @FindBy(xpath = "//input[@id=\"id_email\"]")
    public WebElement eposta;
    @FindBy(id = "save")
    public WebElement saveButton;


    @FindBy(xpath = "//td[text()=\"YERGİNLER HAFRİYAT\"]")
    public WebElement yerginlerControl;




    // Footer buttons
    @FindBy(xpath = "//footer[@id='add_footer']//button[@type='reset']")
    public WebElement cancelButton;

    @FindBy(xpath = "//footer[@id='add_footer']//button[@id='save']")
    public WebElement createButton;

    @FindBy(xpath = "//footer[@id='edit_footer']//button[@id='reset_company']")
    public WebElement editCancelButton;

    @FindBy(xpath = "//footer[@id='edit_footer']//button[@id='update_button']")
    public WebElement updateButton;

    @FindBy(linkText = "Yeni Firma")
    public WebElement newCompanyButton;


    // Locatorlar
    @FindBy(id = "id_tax_id")
    public WebElement taxIdField;

    @FindBy(id = "id_title")
    public WebElement shortNameField;

    @FindBy(id = "id_name")
    public WebElement titleField;

    @FindBy(id = "id_phone")
    public WebElement phoneField;

    @FindBy(id = "id_phone1")
    public WebElement secondPhoneField;

    @FindBy(id = "id_email")
    public WebElement emailField;


    @FindBy(xpath = "//label[text()='Firma Tipi']/following-sibling::div//span")
    public WebElement companyTypeDropdown;

    @FindBy(xpath = "//label[text()='İlçe']/following-sibling::div//span")
    public WebElement provinceDropdownn;

    @FindBy(xpath = "//label[text()='Vergi Dairesi']/following-sibling::div//span")
    public WebElement taxAdministrationDropdownn;

    @FindBy(xpath = "//label[text()='Firma Grup']/following-sibling::div//span")
    public WebElement companyGroupDropdown;

    @FindBy(id = "id_address")
    public WebElement addressField;

//*************************************************************************************************

    @FindBy(id = "id_tax_id")
    public WebElement taxIdInputt;

    @FindBy(xpath = "//input[@id=\"id_title\"]")
    public WebElement titleInputt;

    @FindBy(id = "id_name")
    public WebElement nameInputt;

    @FindBy(id = "id_phone")
    public WebElement phoneInputt;


    @FindBy(id = "id_phone1")
    public WebElement phone1Inputt;

    @FindBy(id = "id_email")
    public WebElement emailInputt;
    @FindBy(xpath = "//textarea[@id=\"id_address\"]")
    public WebElement companyAddaddressINPUT;
    @FindBy(name = "type")
    public WebElement firmaTipiDropdown;


    @FindBy(xpath = "//*[text()=\"Kayıt bulunamadı\"]")
    public WebElement firmaTipiDropdownKAMUSECILDIMI;


    //(//select[@name="subtype"])[2]


    @FindBy(xpath = "//span[@id=\"select2-id_tax_administration-container\"]")
    public WebElement vergidairesiLİST;

    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement vergidairesiLİSTINPUT;

    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement companyAddLıstINPUT;
    @FindBy(xpath = "//span[@id=\"select2-id_province-container\"]")
    public WebElement companyAddilceLIST;

    @FindBy(xpath = "//span[@id=\"select2-id_group_type-container\"]")
    public WebElement companyAddHAFRIYATCIKAMULIST;
    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement companyAddHAFRIYATCIKAMUINPUT;
    @FindBy(xpath = "//select[@id='id_province']//following-sibling::span[@class='dropdown-wrapper']")
    public WebElement provinceDropdownWrapper;

    @FindBy(xpath = "//select[@id='id_tax_administration']//following-sibling::span[@class='dropdown-wrapper']")
    public WebElement taxAdministrationDropdownWrapper;

    @FindBy(xpath = "//select[@id='id_group_type']//following-sibling::span[@class='dropdown-wrapper']")
    public WebElement companyGroupDropdownWrapper;

    @FindBy(id = "id_address")
    public WebElement addressTextareat;

    @FindBy(id = "save")
    public WebElement saveButtont;

    @FindBy(id = "reset_company")
    public WebElement cancelButtont;

    @FindBy(id = "update_button")
    public WebElement updateButtont;


    @FindBy(xpath = "//input[@id=\"newVehiclePlate\"]")
    public WebElement vehicleplate;
    @FindBy(xpath = "//*[@id=\"newVehicleAge\"]")
    public WebElement vehicleAge;
    @FindBy(xpath = "//*[@id=\"newVehicleHgs\"]")
    public WebElement vehicleHgs;
    @FindBy(xpath = "//*[@id=\"newVehicleTare\"]")
    public WebElement vehicleTare;

    @FindBy(xpath = "//*[@id=\"select2-newVehicleBrand-container\"]")
    public WebElement vehicleMARKADROPDOWN;

    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement vehicleMARKADROPDOWNINPUT;


    @FindBy(xpath = "//span[@id=\"select2-newVehicleType-container\"]")
    public WebElement vehicleTIPDROPDOWN;
    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement vehicleTIPDROPDOWNINPUT;

    @FindBy(xpath = "//input[@id=\"newVehicleImei\"]")
    public WebElement vehicleCIHAZIMEI;

    @FindBy(xpath = "//input[@id=\"newVehicleCapacity\"]")
    public WebElement vehicleKAPASITE;


    @FindBy(xpath = "//span[@id=\"select2-newVehicleModel-container\"]")
    public WebElement vehicleMODELDROPDOWN;
    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement vehicleMODELDROPDOWNINPUT;

    @FindBy(xpath = "//input[@id=\"newVehicleSim\"]")
    public WebElement vehicleSIMKARTNO;

    @FindBy(xpath = "//*[@id=\"vehicle_add_form\"]/fieldset/div[3]/div[3]/div/label[2]/i")
    public WebElement vehicleDAMPERSENSORUVARYOK;

    @FindBy(xpath = "//button[@id=\"saveVehicle\"]")
    public WebElement vehicleSAVEBUTTON;


    @FindBy(xpath = "//span[@id=\"select2-plate-container\"]")
    public WebElement vehicleDOCUMENTPLATE;
    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement vehicleDOCUMENTPLATEINPUT;

    @FindBy(xpath = "(//input[@id=\"id_name\"])[3]")
    public WebElement vehicleDOCUMENTNAME;


    @FindBy(xpath = "(//select[@name=\"subtype\"])[2]")
    public WebElement vehicleDOCUMENTALTTIP;


    @FindBy(xpath = "(//span[@class=\"col-sm-4 text-center no-padding\"])[1]")
    public WebElement incelegözsimgesi;
    @FindBy(xpath = " //div[@class=\"col-md-6 col-lg-6 no-padding\"]")
    public WebElement firmaAdıveSicilNoGeldimi;

    @FindBy(xpath = "//button[text()=\"ATS Belgesi Süresi Uzat\"]")
    public WebElement ATSOnayBelgesiButton;

    @FindBy(xpath = "//div/a[text()=\"Kara Listeye Al\"]")
    public WebElement karaListeyeAlbutton;

    @FindBy(xpath = "//h4[text()=\"ATS Belgesi Uzat\"]")
    public WebElement ATSBelgesiUzatText;
    @FindBy(xpath = "//*[@id=\"form_ats_doc_extend\"]/footer/button[2]")
    public WebElement ATSBelgesiUzatTextinUzerindekiCarpı;

    @FindBy(xpath = "//h4[text()=\"Kara Liste\"]")
    public WebElement karalisteText;


    @FindBy(xpath = "//*[@id=\"blackListForm\"]/footer/button[2]")
    public WebElement KaralisteTextIptalbutonu;

    @FindBy(xpath = "//span[@id=\"select2-fleet_select2_-container\"]")
    public WebElement filoDropdown;

    @FindBy(xpath = "//div[@id='filoDropdown']//option[@value='firma1']")
    public WebElement secilenFirma;

    @FindBy(id = "aracDropdown")
    public WebElement aracDropdown;

    @FindBy(xpath = "//div[@id='aracDropdown']//option[@value='arac1']")
    public WebElement secilenArac;

    @FindBy(id = "baslangicTarih")
    public WebElement baslangicTarih;

    @FindBy(id = "bitisTarih")
    public WebElement bitisTarih;

    @FindBy(id = "olusturButton")
    public WebElement n2olusturbutton;


    @FindBy(xpath = " //div[@id=\"right-menu-open\"]")
    public WebElement aractakipsagusttekarelerisareti;


    @FindBy(xpath = "//input[@id=\"username\"]")
    public WebElement aractakipEmailgiris;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement aractakipPasswordgiris;


    @FindBy(xpath = "//button[@id=\"login-button\"]")
    public WebElement aractakipgirisbutonu;

    @FindBy(xpath = "//button[text()=\"OK\"]")
    public WebElement aractakipgirisdeOKBUTONU;


    @FindBy(xpath = "//li/a[@href=\"/track_history_page\"]")
    public WebElement gecmisIzlemeRaporuLink;


    @FindBy(xpath = "//*[@id=\"fleet_select2_\"]")
    public WebElement firmadropdown;


    @FindBy(xpath = "//select[@id=\"fleet_select2_\"]")
    public List<WebElement> aractakipfirmalist;


    @FindBy(xpath = "//ul[@id='myTab2']/li[contains(@class, 'active')]/a")
    public WebElement companyInformationLink;


    @FindBy(xpath = "//form[@id=\"company_form\"]")
    public WebElement companyInformationlinkTable;


    @FindBy(xpath = "//a[@id='companyEmployeTab']")
    public WebElement companyPersonnelLink;
    @FindBy(xpath = "(//div[@id=\"__specifications4\"])[1]")
    public WebElement companyPersonnelLinkTable;

    @FindBy(xpath = "//a[@id='companyUserTab']")
    public WebElement companyUsersLink;

    @FindBy(xpath = "(//div[@id=\"__specifications13\"])[1]")
    public WebElement companyUsersLinkTable;

    @FindBy(xpath = "//a[@id='company_docs']")
    public WebElement companyDocumentsLink;

    @FindBy(xpath = "(//form[@id=\"uploadDocumentForm\"])[1]")
    public WebElement companyDocumentsLinkTable;

    @FindBy(xpath = "//li[@id='vehicleLi']/a")
    public WebElement vehiclesLink;

    @FindBy(xpath = "(//div[@id=\"__specifications4Table\"])[1]")
    public WebElement vehiclesLinkTable;

    @FindBy(xpath = "//a[@id='vehicle_docs']")
    public WebElement vehicleDocumentsLink;

    @FindBy(xpath = "(//form[@id=\"uploadVehicleDocumentForm\"])[1]")
    public WebElement vehicleDocumentsLinkTable;

    @FindBy(xpath = "//li[@id='budget_li']/a")
    public WebElement financialTransactionsLink;

    @FindBy(xpath = "//div[@id=\"budget_dt_table_wrapper\"]")
    public WebElement financialTransactionsLinkTable;

    @FindBy(xpath = "//a[@id='tib_li']")
    public WebElement TIBLink;

    @FindBy(xpath = "//table[@id=\"vehicleTibDT\"]")
    public WebElement TIBLinkTable;

    @FindBy(xpath = "//a[contains(@href, 'specifications12')]")
    public WebElement balanceMovementsLink;

    @FindBy(xpath = "//form[@id=\"logFrom\"]")
    public WebElement balanceMovementsLinkTable;


    @FindBy(xpath = "//a[@id='companyCallListTab']")
    public WebElement callListLink;

    @FindBy(xpath = "//div[@id=\"company_call_list_wrapper\"]")
    public WebElement callListLinkTable;

    @FindBy(xpath = "//a[@id='construction_fillListTab']")
    public WebElement constructionFillListLink;
    @FindBy(xpath = "//table[@id=\"construction_fill_list\"]")
    public WebElement constructionFillListLinkTable;

    @FindBy(xpath = "(//a[@id='fineListTab'])[1]")
    public WebElement penaltyListLink;

    @FindBy(xpath = "//div[@id=\"fine_list_dt_wrapper\"]")
    public WebElement penaltyListLinkTable;

    @FindBy(xpath = "(//a[@id='fineListTab'])[2]")
    public WebElement complaintListLink;


    @FindBy(xpath = "//div[@id=\"plaint_page_form_wrapper\"]")
    public WebElement complaintListLinkTable;

    @FindBy(xpath = "//button[contains(text(), 'Taahhütname')]")
    public WebElement createUndertakingButton;

    @FindBy(xpath = "(//button[text()=\"Güncelle\"])[1]")
    public WebElement companyinformationUpdateButton;

    @FindBy(xpath = "//input[@id=\"id_tax_id\"]")
    public WebElement companyinformationUpdateTAXNO;


    @FindBy(xpath = "(//input[@id=\"id_name\"])[1]")
    public WebElement companyinformationUpdateNAME;

    @FindBy(xpath = "//input[@id=\"id_phone1\"]")
    public WebElement companyinformationUpdatePHONE;

    @FindBy(xpath = "(//select[@id=\"id_type\"])[1]")
    public WebElement companyinformationUpdateCOMPANYTIP;

    @FindBy(xpath = "//span[@id=\"select2-id_tax_administration-container\"]")
    public WebElement companyinformationUpdateTAXADDRESS;

    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement companyinformationINPUTTAXADDRESS;
    @FindBy(xpath = "//textarea[@id=\"id_address\"]")
    public WebElement companyinformationADDRESS;

    @FindBy(xpath = "//*[@id=\"id_title\"]")
    public WebElement companyinformationCOMPANYSHORTNAME;


    @FindBy(xpath = "//input[@id=\"id_phone\"]")
    public WebElement companyinformationPHONE;


    @FindBy(xpath = "(//span[@class=\"select2-selection select2-selection--single\"])[1]")
    public WebElement companyinformationILCE;

    @FindBy(xpath = "//input[@id=\"id_email\"]")
    public WebElement companyinformationEMAIL;

    @FindBy(xpath = "//select[@id=\"id_group_type\"]")
    public WebElement companyinformationHAFRIYATCI;


    @FindBy(xpath = "//input[@id=\"newPersonName\"]")
    public WebElement companyPersonelNameGiris;

    @FindBy(xpath = "//input[@id=\"newPersonTelephone\"]")
    public WebElement companyPersonelTelefonGiris;

    @FindBy(xpath = "//input[@id=\"newPersonTelephone2\"]")
    public WebElement companyPersonelTelefonGiris2;


    @FindBy(xpath = "//input[@id=\"newPersonEmail\"]")
    public WebElement companyPersonelEmailGiris;

    @FindBy(xpath = "(//select[@name=\"subtype\"])[1]")
    public WebElement CompanydocumentDropdownTicaretSicil;

    @FindBy(xpath = "//button[@id=\"savePerson\"]")
    public WebElement CompanydocumentDropdownTicaretSicilSAVEBUTTON;

    @FindBy(xpath = "//button[@id=\"uploadCompanyDocument\"]")
    public WebElement companydocumentFILEUPLOADsave;

    @FindBy(xpath = "(//input[@id=\"id_path\"])[1]")
    public WebElement VehicleDocumentUpload;

    @FindBy(xpath = "//span[@id=\"select2-balance_plate-container\"]")
    public WebElement vehiclePleaseSelect;

    @FindBy(xpath = "//button[@id=\"budget_activitySearch\"]")
    public WebElement balancemovementsSearch;


    @FindBy(xpath = "//span[@class='col-sm-4 text-center no-padding']/a[@class='btn btn-xs btn-danger']")
    public WebElement disableEnableButton;
    @FindBy(xpath = "//button[@id=\"bot2-Msg1\"]")
    public WebElement disableEnableButtonEVET;

    @FindBy(xpath = "//td[text()=\"AATestCompany\"]")
    public WebElement userdisableEnableAACOMPANYGORUNDUMU;

    @FindBy(xpath = "(//span[@class=\"col-sm-4 text-center no-padding\"])[3]")
    public WebElement DELETEBUTTONFİRMALİSTESİ;


    @FindBy(xpath = "//button[@id=\"bot1-Msg1\"]")
    public WebElement DELETEBUTTONFİRMALİSTESİGORUNDUMU;


    @FindBy(xpath = "(//label[@for=\"st3\"])[2]")
    public WebElement araclistesindekiTASIMACHECKBOXU;

    @FindBy(xpath = "//a[text()=\"Araç Listesi\"]")
    public WebElement araclistesiLİNK;


    @FindBy(xpath = "(//*[text()=\"2023-12-02\"])[1]")
    public WebElement checkboxatıklayıncaTARIHGELDIMI;

    @FindBy(xpath = "(//label[@for=\"ats\"])[2]")
    public WebElement ATScheckbox;

    @FindBy(xpath = "(//*[text()=\"2026-01-16\"])[1]")
    public WebElement checkboxATSyetıklayıncaTARIHGELDIMI;


    @FindBy(xpath = "//select[@id=\"type\"]")
    public WebElement dropdownKAMU;

    @FindBy(xpath = "(//i[@class=\"fa fa-eye\"])[1]")
    public WebElement gotoCompany;


    @FindBy(xpath = "//ul[@id=\"myTab2\"]")
    public WebElement gotoCompanyGELDIMI;


    @FindBy(xpath = "(//a[@class=\"label label-success \"])[1]")
    public WebElement gotoVehicleDetay;


    @FindBy(xpath = "//i[@class=\"fa fa-eye\"]")
    public List<WebElement> ıncelebutonhepsi;


    @FindBy(xpath = "//a[text()=\"Araç Kiralama\"]")
    public WebElement vehicleRentalLink;


    @FindBy(xpath = "//span[@class=\"select2-selection__rendered\"]")
    public WebElement companyList_DROPDOWN;

    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement companyList_DROPDOWN_ıNPUT;
    @FindBy(xpath = "//label[text()=\"Araç\"]")
    public WebElement aractext;

    @FindBy(xpath = "//input[@id=\"filter_company_hire\"]")
    public WebElement vehicleRental_KIRALANABILIRVEHICLES;


    @FindBy(xpath = "//input[@id=\"id_date\"]")
    public WebElement vehicleRental_KiralananVEHICLE_DATE;

    @FindBy(xpath = "//input[@id=\"filter_company_unhire\"]")
    public WebElement vehicleRental_KiralananVEHICLE_COMPANYNAME;


    @FindBy(xpath = "(//td[text()=\"Kayıt bulunamadı\"])[1]")
    public List<WebElement> vehicleRental_KiralananVEHICLE_COMPANYNAME_LIST;
    //i[text() ="Sorgula"]
    @FindBy(xpath = "//a[text()=\"Ada-Parsel Sorgulama\"]")
    public WebElement AdaParselSorgulamaLink;

    @FindBy(xpath = "//input[@id=\"lot\"]")
    public WebElement AdaParselSorgulamaSEARCH_ADA;

    @FindBy(xpath = "//input[@id=\"plot\"]")
    public WebElement AdaParselSorgulamaSEARCH_PARSEL;

    @FindBy(xpath = "//table[@id=\"lip_table\"]")
    public WebElement AdaParselSorgulama_LIST_TABLE;

    @FindBy(xpath = "//span[@class=\"select2-selection__rendered\"]")
    public WebElement AdaParselSorgulama_BUSINESS_TYPE;


    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement AdaParselSorgulama_BUSINESS_TYPE_INPUT;

    @FindBy(xpath = "//button[text() =\"Sorgula\"]")
    public WebElement AdaParselSorgulama_SORGULAMA_BUTTON;


    @FindBy(xpath = "//a[text()=\"Ceza/Taahhüt Listesi\"]")
    public WebElement cezaTaahhütListLINK;


    @FindBy(xpath = "//input[@id=\"filter_s_date\"]")
    public WebElement cezaTaahhütSEARCH_START_DATE;

    @FindBy(xpath = "//input[@id=\"filter_e_date\"]")
    public WebElement cezaTaahhütSEARCH_FINISH_DATE;


    @FindBy(xpath = "//input[@id=\"user_name\"]")
    public WebElement cezaTaahhütSEARCH_EKLEYEN_KISI;

    @FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[2]")
    public WebElement cezaTaahhütSEARCH_VEHICLEDROPDOWN;


    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[1]")
    public WebElement cezaTaahhütSEARCH_VEHICLEDROPDOWN_INPUT;


    @FindBy(xpath = "//button[text()=\"Ara\"]")
    public WebElement cezaTaahhütSEARCH_arabutton;

    @FindBy(xpath = "(//div[@id=\"wid-id-x\"])[2]")
    public WebElement cezaTaahhütCEZA_LIST;

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement cezaTaahhütCEZA_LIST_SEARCH;

    @FindBy(xpath = "//tr[@class=\"odd\"]")
    public WebElement cezaTaahhütCEZA_LIST_geldimi;


    @FindBy(xpath = "(//a[@title=\"Görüntüle\"])[1]")
    public WebElement cezaTaahhütCEZA_GORUNTULEBUTTON;
    @FindBy(xpath = "//table[@id=\"show_picture_dt\"]")
    public WebElement cezaTaahhütCEZA_RESIMGORUNDUMU;

    @FindBy(xpath = "(//i[@class=\"fa fa-upload\"])[1]")
    public WebElement cezaTaahhütCEZA_RESIMYUKLEMEBUTTON;


    @FindBy(xpath = "//input[@id=\"doc_name\"]")
    public WebElement cezaTaahhütCEZA_RESIMYUKLE_DOKUMANADI;

    @FindBy(xpath = "//select[@id=\"doc_type\"]")
    public WebElement cezaTaahhütCEZA_RESIMYUKLE_DOKUMAN_DROPDOWN;

    @FindBy(xpath = "//button[@id=\"selectDocument\"]")
    public WebElement cezaTaahhütCEZA_RESIMYUKLE_DOSYA_EKLE;


    @FindBy(xpath = "(//i[@class=\"fa fa-edit\"])[1]")
    public WebElement cezaTaahhütCEZA_GUNCELLEMEBUTTON;

    @FindBy(xpath = "//select[@id=\"doc_type\"]")
    public WebElement cezaTaahhütCEZA_GUNCELLEME_DOKUMANTIPDROPDOWN;


    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement cezaTaahhütCEZA_GUNCELLEME_COMPANY_IPDROPDOWN_INPUT;

    @FindBy(xpath = "//select[@id=\"id_fine_type\"]")
    public WebElement cezaTaahhütCEZA_GUNCELLEME_cezaTIP;


    @FindBy(xpath = "//input[@id=\"id_police_process_user\"]")
    public WebElement cezaTaahhütCEZA_GUNCELLEME_ISLEMIYAPAN;

    @FindBy(xpath = "//textarea[@id=\"id_description\"]")
    public WebElement cezaTaahhütCEZA_GUNCELLEME_ANKETACIKLAMA;


    @FindBy(xpath = "//input[@id=\"id_amount\"]")
    public WebElement cezaTaahhütCEZA_GUNCELLEME_TUTAR;

    @FindBy(xpath = "//span[@class=\"select2-selection select2-selection--multiple\"]")
    public WebElement cezaTaahhütCEZA_GUNCELLEME_geziciEkip;

    @FindBy(xpath = "//textarea[@id=\"id_police_description\"]")
    public WebElement cezaTaahhütCEZA_GUNCELLEME_zabıtaAcıklama;


    @FindBy(xpath = "//*[text()=\" Yeni Ceza\"]")
    public WebElement cezaTaahhüt_YENICEZAEKLE;


    @FindBy(xpath = "//input[@id=\"doc_name\"]")
    public WebElement cezaTaahhüt_YENICEZADOKUMANEKLE;

    @FindBy(xpath = "//a[text()=\"Şikayet Listesi\"]")
    public WebElement sikayetListesiLink;


    // Locate elements using @FindBy annotation
    @FindBy(id = "id_create_date")
    public WebElement createDateInput;

    @FindBy(id = "id_complaining_user")
    public WebElement complainingUserInput;

    @FindBy(id = "id_phone")
    public WebElement sikayetphoneInput;

    @FindBy(id = "id_mail")
    public WebElement sikayetmailInput;

    @FindBy(id = "id_reason")
    public WebElement sikayetreasonInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='success-message']")
    public WebElement successMessage;

    @FindBy(xpath = "//button[@id=\"save\"]")
    public WebElement sikayetOlusturButton;

    @FindBy(xpath = "//a[text()=\"Manuel Bakiye Düşümü\"]")
    public WebElement manuelBakiyeDüsümü;


    @FindBy(xpath = "(//input[@type=\"number\"])[1]")
    public WebElement manuelBakiyeDüsümüBakiyeGiris;

    @FindBy(xpath = "(//textarea[@id=\"notes\"])[1]")
    public WebElement manuelBakiyeDüsümüNOTES;

    @FindBy(xpath = "//button[@id=\"send_ajax\"]")
    public WebElement manuelBakiyeDüsümüOLUSTURBUTTON;


    @FindBy(xpath = "//button[@id=\"bot2-Msg1\"]")
    public WebElement manuelBakiyeDüsümüOLUSTURBUTTONEVET;


    @FindBy(xpath = "//span[text()=\"Talep Listeleri\"]")
    public WebElement talepListeleriLink;

    @FindBy(xpath = "//a[text()=\"Yapı Ruhsat Talebi\"]")
    public WebElement talepListeleriYAPI_RUHSATLI_Link;


    @FindBy(xpath = "//a[text()=\"Ruhsatlı Yeni İş Başlangıcı\"]")
    public WebElement talepListeleriYAPI_RUHSATLI_EKLE_BUTTON;

    @FindBy(xpath = "//a[text()=\"Ruhsatlı Yeni İş Başlangıcı\"]")
    public WebElement talepListeleri_NEW_BUILDING_BUTTON;

    @FindBy(xpath = "//span[@id=\"select2-id_reason-container\"]")
    public WebElement Yapı_Ruhsatı_Talebi_YENIYAPI_DROPDOWN;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_YENIYAPI_DROPDOWN_INPUT;


    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_DROPDOWN_INPUT;

    @FindBy(xpath = "(//input[@id=\"id_licence_number\"])[1]")
    public WebElement Yapı_Ruhsatı_Talebi_RUHSAT_NO;

    @FindBy(xpath = "//input[@id=\"id_identity_no\"]")
    public WebElement Yapı_Ruhsatı_Talebi_BULTEN_NO;

    @FindBy(xpath = "//input[@id=\"id_licence_confirm_date\"]")
    public WebElement Yapı_Ruhsatı_Talebi_DATE;

    @FindBy(xpath = "//input[@id=\"id_generative_name\"]")
    public WebElement Yapı_Ruhsatı_Talebi_URETICI_NAME;


    @FindBy(xpath = "//input[@id=\"id_generative_phone\"]")
    public WebElement Yapı_Ruhsatı_Talebi_URETICI_PHONE;

    @FindBy(xpath = "//input[@id=\"id_generative_tax_id\"]")
    public WebElement Yapı_Ruhsatı_Talebi_vergı_no;


    @FindBy(xpath = "//textarea[@id=\"id_generative_address\"]")
    public WebElement Yapı_Ruhsatı_Talebi_ADRESS;


    @FindBy(xpath = "//input[@id=\"id_lot\"]")
    public WebElement Yapı_Ruhsatı_Talebi_ADA;

    @FindBy(xpath = "//input[@id=\"id_plot\"]")
    public WebElement Yapı_Ruhsatı_Talebi_PARSEL;

    @FindBy(xpath = "//input[@id=\"id_block\"]")
    public WebElement Yapı_Ruhsatı_Talebi_BLOCK;


    @FindBy(xpath = "//textarea[@id=\"id_generative_address\"]")
    public WebElement Yapı_Ruhsatı_Talebi_ADDRES;

    @FindBy(xpath = "//span[@id=\"select2-id_province-container\"]")
    public WebElement Yapı_Ruhsatı_Talebi_ILCEDROPDOWN;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_ILCEDROPDOWNINPUT;

    @FindBy(xpath = "//span[@id=\"select2-id_neighborhood-container\"]")
    public WebElement Yapı_Ruhsatı_Talebi_MAHALLEDROPDOWN;


    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_MAHALLEDROPDOWNINPUT;

    @FindBy(xpath = "//input[@id=\"id_excavation_capacity\"]")
    public WebElement Yapı_Ruhsatı_Talebi_KAZIMIKTARI;


    @FindBy(xpath = "//input[@id=\"id_filler_capacity\"]")
    public WebElement Yapı_Ruhsatı_Talebi_DOLGUMIKTARI;


    @FindBy(xpath = "//input[@id=\"id_empty_excavation_capacity\"]")
    public WebElement Yapı_Ruhsatı_Talebi_BOSKAZIMIKTARI;




    @FindBy(xpath = "//input[@id=\"id_waste_amount\"]\n")
    public WebElement Yapı_Ruhsatı_Talebi_ATIKMIKTARI;
    @FindBy(xpath = "//span[@id=\"select2-id_waste_type-container\"]")
    public WebElement Yapı_Ruhsatı_Talebi_ATIKCINSIDROPDOWN;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_ATIKCINSIDROPDOWN_INPUT;


    @FindBy(xpath = "//span[@id=\"select2-id_dump_sites-container\"]")
    public WebElement Yapı_Ruhsatı_Talebi_DOKUMSAHALARIDROPDOWN;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_DOKUMSAHALARIDROPDOWN_INPUT;

    @FindBy(xpath = "//textarea[@id=\"address\"]\n")
    public WebElement Yapı_Ruhsatı_Talebi_HAFRIYATADRESS;


    @FindBy(xpath = "//textarea[@id=\"note\"]")
    public WebElement Yapı_Ruhsatı_Talebi_HAFRIYATNOTE;



    @FindBy(xpath = "//input[@id=\"doc_name\"]")
    public WebElement Yapı_Ruhsatı_Talebi_DOKUMANADI;


    @FindBy(xpath = "//button[text()=\"Oluştur\"]")
    public WebElement Yapı_Ruhsatı_Talebi_OLUSTURBUTTON;


    @FindBy(xpath = "//button[text()=\"Güncelle\"]")
    public WebElement Yapı_Ruhsatı_Talebi_GUNCELLEBUTTON;
    @FindBy(xpath = "(//a[@title=\"İşi Pasife Al\"])[1]")
    public WebElement Yapı_Ruhsatı_Talebi_ISIPASIFEAL;

    @FindBy(xpath = "//textarea[@id=\"passive_description\"]")
    public WebElement Yapı_Ruhsatı_Talebi_PASIFEALACIKLAMA;

    @FindBy(xpath = "(//button[text()=\"İptal\"])[1]")
    public WebElement Yapı_Ruhsatı_Talebi_PASIFEAL_IPTAL;

    @FindBy(xpath = "(//button[text()=\"İptal\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_PASIFEAL_IPTAL2;
    @FindBy(xpath = "(//i[@class=\"fa fa-close\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_SIL;

    @FindBy(xpath = "(//i[@class=\"fa fa-eye\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_EK2;

    @FindBy(xpath = "(//i[@class=\"fa fa-edit\"])[2]")
    public WebElement Yapı_Ruhsatı_Talebi_GUNCELLEBUTTON_;

    @FindBy(xpath = "//a[text()=\" Yeni Harici Kazı Talebi Ekle\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI;

    @FindBy(xpath = "//input[@id=\"id_generative_name\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_uretıcıName;

    @FindBy(xpath = "//input[@id=\"id_generative_phone\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_uretıcıPHONE;

    @FindBy(xpath = "//textarea[@id=\"id_generative_address\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_uretıcıADDRESS;


    @FindBy(xpath = "//input[@id=\"id_from_lot\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_ADA;


    @FindBy(xpath = "//input[@id=\"id_from_plot\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_PARSEL;

    @FindBy(xpath = "(//span[@role=\"presentation\"])[1]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_ILCESEC;


    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_ILCE_INPUT;

    @FindBy(xpath = "(//span[@role=\"presentation\"])[2]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_MAHALLESEC;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_MAHALLE_INPUT;

    @FindBy(xpath = "//textarea[@id=\"id_from_address\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_BASLANGICADRESI;


    @FindBy(xpath = "//input[@id=\"id_date\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_DATE;

    @FindBy(xpath = "(//span[@role=\"presentation\"])[3]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_TIPSEC;
    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_TIPSEC_INPUT;

    @FindBy(xpath = "//*[@id=\"checkout-form\"]/fieldset[2]/div[3]/section[3]/div/label[2]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_FIRMASEC;


    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_FIRMASEC_INPUT;

    @FindBy(xpath = "//span[@class=\"select2 select2-container select2-container--default select2-container--focus\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_ARACSEC;


    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_ARACSEC_INPUT;


    @FindBy(xpath = "(//span[@role=\"presentation\"])[5]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_DOKUMSAHASI;


    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement hariciKaziTalebi_YENIHARICIKAZI_DOKUMSAHASI_INPUT;



//input[@id="id_date"]

    @FindBy(xpath = "(//a[@class=\"btn btn-xs btn-warning\"])[1]")
    public WebElement hariciKaziTalebi_HARICIKAZI_Updatebutton;

    @FindBy(xpath = "(//a[@class=\"btn btn-sm btn-danger\"])[1]")
    public WebElement hariciKaziTalebi_HARICIKAZI_Deletebutton;


    @FindBy(xpath = "//textarea[@id=\"input_comment\"]")
    public WebElement hariciKaziTalebi_HARICIKAZI_DeleteAcıklama;

    @FindBy(xpath = "//button[@id=\"modalCloseBtn\"]")
    public WebElement hariciKaziTalebi_HARICIKAZI_DeleteKAPAT;

    @FindBy(xpath = "(//a[@class=\"btn btn-sm btn-primary\"])[1]")
    public WebElement hariciKaziTalebi_HARICIKAZI_EK2BUTTON;

    @FindBy(xpath = "//a[text()=\"İnşaat Dolgu Talebi\"]")
    public WebElement INSAATDOLGUTALEBI_link;
    @FindBy(xpath = "//a[text()=\" Yeni İnşaat Dolgu Talebi Ekle\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BUTTON;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_firmaSec;


    @FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[2]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_ılceDropdown;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_ılceDropdown_INPUT;

    @FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[3]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_mahalleDropdown;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_mahalleDropdown_INPUT;


    @FindBy(xpath = "//textarea[@name=\"from_address\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_NEREDEN;


    @FindBy(xpath = "//textarea[@name=\"to_address\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_NEREYE;

    @FindBy(xpath = "//input[@id=\"id_from_lot\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ADA;


    @FindBy(xpath = "//input[@id=\"id_from_plot\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_PARSEL;

    @FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[4]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ILCE;

    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BASLANGIC_ILCE_INPUT;

    @FindBy(xpath = "//input[@id=\"id_to_lot\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BITIS_ADA;


    @FindBy(xpath = "//input[@id=\"id_to_plot\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BITIS_PARSEL;

    @FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[5]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BITIS_ILCE;


    @FindBy(xpath = "(//input[@class=\"select2-search__field\"])[2]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_BITIS_ILCE_INPUT;

    @FindBy(xpath = "//input[@id=\"id_truck_number\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_ARACSAYISI;


    @FindBy(xpath = "//input[@id=\"id_caller\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_TALEPEDENKISI;

    @FindBy(xpath = "//input[@id=\"id_phone\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_TALEPEDENTELEFON;


    @FindBy(xpath = "//button[text()=\"Oluştur\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_OLUSTURBUTTON;


    @FindBy(xpath = "(//i[@class=\"fa fa-edit\"])[4]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_GUNCELLE_BUTTON;

    @FindBy(xpath = "(//i[@class=\"fa fa-minus\"])[3]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_SIL_BUTTON;

    @FindBy(xpath = "(//i[@class=\"fa fa-eye\"])[3]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_YUKLENENBELGE;

    @FindBy(xpath = "//button[text()=\"İptal Et\"]")
    public WebElement yeniINSAATDOLGUTALEBIEKLE_SIL_IPTALET;


    @FindBy(xpath = "//a[text()=\"Yapı Ruhsatlı İş Süreci\"]")
    public WebElement yapıRuhsatlıIsSurecılink;


    @FindBy(xpath = "//span[text()=\"Küçük Araç\"]")
    public WebElement KucukAracModuluLink;

    @FindBy(xpath = "//a[text()=\"Küçük Araç İşlemleri\"]")
    public WebElement KucukAracIslemleriLink;


    @FindBy(xpath = "//a[text()=\" Küçük Araç Ekle\"]")
    public WebElement KucukAracEkleButton;


    @FindBy(id = "id_plate")
    public WebElement plateInput;

    @FindBy(id = "id_tax_id")
    public WebElement kucukAractaxId;


    @FindBy(id = "id_name")
    public WebElement kucukAracnameInput;

    @FindBy(id = "id_surname")
    public WebElement kucukAracSurnameInput;


    @FindBy(xpath = "//span[@class=\"select2-selection__rendered\"]")
    public WebElement kucukAracTipiDropdownn;

    @FindBy(xpath = "//input[@class=\"select2-search__field\"]")
    public WebElement kucukAracTipiDropdownnInput;


    @FindBy(xpath = "//input[@id=\"id_gsm\"]")
    public WebElement kucukAracTipiTelefon;

    @FindBy(xpath = "//input[@id=\"id_email\"]")
    public WebElement kucukAracTipigmail;



    @FindBy(xpath = "(//button[text()=\"Ekle\"])[1]")
    public WebElement kucukAracTipiEKLEBUTTON;

    @FindBy(xpath = "(//button[text()=\"Güncelle\"])[2]")
    public WebElement kucukAracTipiGUNCELLEBUTTON;


//td[text()="38RL433"]


    @FindBy(xpath = "//td[text()=\"38RL433\"]")
    public WebElement kucukAracPlakaGeldimi;

    @FindBy(xpath = "//td[text()=\"38RL352\"]")
    public WebElement kucukAracGuncelPlakaGeldimi;

    @FindBy(xpath = "//td[text()=\"12345678944\"]")
    public WebElement kucukAractaxIDgeldimi;


    @FindBy(xpath = "(//i[@class=\"fa fa-eye\"])[2]")
    public WebElement kucukAracislemleriINCELEBUTTON;

    @FindBy(xpath = "//button[@id=\"edit_button\"]")
    public WebElement kucukAracislemleriGUNCELLEBUTTON;

    @FindBy(xpath = "//a[@id=\"document_tab\"]")
    public WebElement kucukAracislemleriBELGELERLINK;

    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement kucukAracislemleriBELGELERNAME;

    @FindBy(xpath = "//select[@name=\"type\"]")
    public WebElement kucukAracislemleriBELGELERDROPDOWNKISI;

    @FindBy(xpath = "//button[@id=\"uploadDocument\"]")
    public WebElement kucukAracislemleriBELGELERekleButton;

    @FindBy(xpath = "//td[text()=\"DenemeBelge\"]")
    public WebElement kucukAracislemleriBELGELEREKLENDIMICONTROL;


    @FindBy(xpath = "//button[@id=\"delete_button\"]")
    public WebElement kucukAracislemleriBELGELER_deleteButton;


    @FindBy(xpath = "//select[@id=\"listJob\"]")
    public WebElement yapiRuhsatliIsSurecleri_ARAMADROPDOWNLISTESECENEGI;

    @FindBy(xpath = "//select[@id=\"listState\"]")
    public WebElement yapiRuhsatliIsSurecleri_ARAMADROPDOWNISLEMSECENEGI;

    @FindBy(xpath = "//input[@id=\"search_input\"]")
    public WebElement yapiRuhsatliIsSurecleri_ARAMAINPUT;


    @FindBy(xpath = "//i[@class=\"fa fa-eye\"]")
    public WebElement yapiRuhsatliIsSurecleri_GORUNTULE;

    @FindBy(xpath = "//td[text()=\": 5710 \"] ")
    public WebElement yapiRuhsatliIsSurecleri_arananbulundumu;

    @FindBy(xpath = "(//i[@class=\"fa fa-eye\"])[1]")
    public WebElement hariciKaziisSurecleri_GORUNTULE;

    @FindBy(xpath = "//select[@id=\"listJob\"]")
    public WebElement hariciKaziIsSurecleri_ARAMADROPDOWNLISTESECENEGI;

    @FindBy(xpath = "//select[@id=\"listState\"]")
    public WebElement hariciKaziIsSurecleri_ARAMADROPDOWNISLEMSECENEGI;

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement hariciKaziIsSurecleri_ARAMAINPUT;


    @FindBy(xpath = "//td[text()=\" 1510\"]")
    public WebElement haricikaziIsSurecleri_arananbulundumu;



    @FindBy(xpath = "//button[@id=\"excel_export_company\"]")
    public WebElement firmaListesi_EXCELBUTTON;


    @FindBy(xpath = "//button[@id=\"arac_excel_button\"]")
    public WebElement aracListesi_EXCELBUTTON;

    @FindBy(xpath = "//button[@id=\"id_budget_add\"]")
    public WebElement firmaListesi_MaliIslemler_BakiyeYüklemeButton;


    @FindBy(xpath = "(//input[@type=\"number\"])[1]")
    public WebElement firmaListesi_MaliIslemler_BakiyeYükle_TUTARINPUT;


    @FindBy(xpath = "//a[@id=\"budgetTab\"]")
    public WebElement firmaListesi_MaliIslemlerbutton;


    @FindBy(xpath = "//button[@id=\"id_budget_decrease\"]")
    public WebElement firmaListesi_MaliIslemlerBAKIYEDUSUMUBUTTON;

    @FindBy(xpath = "(//input[@name=\"amount\"])[2]")
    public WebElement firmaListesi_MaliIslemlerBAKIYEDUSUMUTUTARINPUT;


    @FindBy(xpath = "//textarea[@id=\"notes\"]")
    public WebElement firmaListesi_MaliIslemlerBAKIYEDUSUMUACIKLAMAINPUT;


    @FindBy(xpath = "//button[@id=\"id_budget_check\"]")
    public WebElement firmaListesi_MaliIslemlerODEMEKONTROLBUTTON;








































    /* public File getHaritaResmiScreenshot() throws IOException {
        return haritaResmi.getScreenshotAs(OutputType.FILE);

    /* public void fillForm(String taxId, String shortTitle, String fullName, String phone, String companyPhone, String email, String province, String taxAdministration, String groupType, String address) {
  taxIdInputcompanyadd.sendKeys(taxId);
  shortTitleInput.sendKeys(shortTitle);
  fullNameInput.sendKeys(fullName);
  phoneInput.sendKeys(phone);
  companyPhoneInput.sendKeys(companyPhone);
  emailInput.sendKeys(email);
  provinceSelect.sendKeys(province);
  taxAdministrationSelect.sendKeys(taxAdministration);
  groupTypeSelect.sendKeys(groupType);
  addressTextarea.sendKeys(address);
 }*/
    public void submitForm() {
        saveButton.click();
    }


    // ****************************************************************************************************************************************************
    //1- url > Subscribe pop-up exit butonu
    @FindBy(css = "#subscriptionModal > div > div.close_modal > i")
    public WebElement PopupExitButon;


    //2- Homepage/Header > playstore butonu

    @FindBy(xpath = "//span[text()='Play store']")
    public WebElement playstoreButton;

    //3- Homepage/Header > appstore butonu

    @FindBy(xpath = "//span[text()='App store']")
    public WebElement appstoreButton;

    //4- HomePage/Header > track your order butonu

    @FindBy(xpath = "//span[text()=\"Track Your Order\"]")
    public WebElement trackyourorderButton;

    //5- HomePage/Header > compare butonu

    @FindBy(xpath = "//span[text()='Compare(']")
    public WebElement compareButton;


    //6 - HomePage/Header > Login butonu

    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[2]/div/div/div/div/div[3]/div[1]/div/span/a[1]")
    public WebElement userloginButon;


    @FindBy(xpath = "(//div[@id=\"vehicle_\"])[1]")
    public WebElement aractakipListButton;


    @FindBy(xpath = "(//div[@id=\"vehicle_\"])[1]//select[@id=\"fleet_select2_\"]")
    public WebElement araclistesicurrenttext;


    @FindBy(xpath = "(//input[@id=\"id_name\"])[2]")
    public WebElement CompanyDocumentName;


    // 7 -Login > Email


    //li[@class='active']/a[@href='/hafriyat/']

    //10- Homepage/Header > wishlist button

    @FindBy(xpath = "//span[text()='Wishlist (']")
    public WebElement wishlistButton;

    //11-Homepage/Header > cart button
    @FindBy(xpath = "//span[text()='Cart (']")
    public WebElement cartButton;


    //12- Homepage/Header > logo
    @FindBy(xpath = "(//img[@src=\"https://qa.trendlifebuy.com/public/uploads/settings/63985b425a3e6.png\"])[1]")
    public WebElement logoImage;

    //13- Homepage/Header > searchbox
    @FindBy(xpath = "//*[@id=\"search_form\"]/div")
    public WebElement searchBox;


    //14- Homepage/Search Query
    @FindBy(xpath = "//h3[@class='branding_text']")
    public WebElement searchQuery;

    //15-Homepage/Header_right > register button
    @FindBy(xpath = "//a[text()='/ Register']")
    public WebElement registerButton;

    //16- Homepage/Header/Menu > blog button
    @FindBy(xpath = "(//a[text()='Blog'])[1]")
    public WebElement blogButton;

    //17- Homepage/Header/Menu > contact button
    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contactButton;


    //18- HomePage>All CAtegories Dropdown Menu
    @FindBy(xpath = "//div[@class='dropdown show category_menu']")
    public WebElement allCategories;

    //19- HomePage>All categories > Computer & Accessories
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[1]")
    public WebElement computerAndAccessoriesItem;

    //20-HomePage>All categories > Electronics Devices
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[2]")
    public WebElement electronicsDevicesItem;

    //21- HomePage>All categories > Watches & Accessories
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[3]")
    public WebElement watchesAndAccessoriesItem;

    //22- HomePage>All categories > Fashions
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[4]")
    public WebElement fashionsItem;

    //23- HomePage>All categories > Toys,Kids & Babies
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[5]")
    public WebElement toysAndKidsAndBabiesItem;

    //24- HomePage>All categories > Bag & Shoes
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[6]")
    public WebElement bagAndShoesItem;

    //25- HomePage>All categories > Lifestyle & Home
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[7]")
    public WebElement lifestyleAndHomeItem;

    //26- HomePage>All categories > TV & Home Appliances
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[8]")
    public WebElement tvAndHomeAppliancesItem;

    //27- HomePage>All categories > Auto Mobiles & bikes
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[9]")
    public WebElement autoMobilesAndBikesItem;

    //28- HomePage>All categories >Computer Menuu
    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[3]/div/div/div/div/div[2]/ul/li[1]/ul")
    public WebElement computerandAccessorMENU;

    //29- HomePage>All categories >electronicsDevicesMENU
    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[3]/div/div/div/div/div[2]/ul/li[2]/ul")
    public WebElement electronicDevicesMENU;

    //30- HomePage>All categories >watchesAndAccessoriesMENU
    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[3]/div/div/div/div/div[2]/ul/li[3]/ul")
    public WebElement watchesAndAccessoriesMENU;

    //31- HomePage>All categories >fashionsMENU
    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[3]/div/div/div/div/div[2]/ul/li[4]/ul")
    public WebElement fashionsMENU;

    //32- HomePage>All categories >toysAndKidsAndBabiesItemMENU
    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[3]/div/div/div/div/div[2]/ul/li[5]/ul")
    public WebElement toysAndKidsAndBabiesItemMENU;

    //33- HomePage>All categories >bagAndShoesItemMENU
    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[3]/div/div/div/div/div[2]/ul/li[6]/ul")
    public WebElement bagAndShoesItemMENU;

    //34 - HomePage>All categories > Lifestyle & Home Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[7]")
    public WebElement lifestyleAndHomeMENU;

    //35- HomePage>All categories > TV & Home Appliances Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[8]")
    public WebElement tvAndHomeAppliancesMENU;

    //36- HomePage>All categories > Auto Mobiles & bikes Menu
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li/ul)[9]")
    public WebElement autoMobilesAndBikesMENU;


    //37- Home page --> My Account
    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;

    //38- Home page --> Order Status
    @FindBy(xpath = "//a[text()='Order Status']")
    public WebElement orderStatus;

    //39 -Home page --> Referral
    @FindBy(xpath = "//a[text()='Referral']")
    public WebElement referral;

    //40 -Home page --> Coupons
    @FindBy(xpath = "//a[text()='Coupons']")
    public WebElement coupons;

    //41- Home page subnemu--> About Us
    @FindBy(xpath = "(//a[text()='About Us'])[3]")
    public WebElement aboutUs;

    //42- Home page subnemu--> Contact Us link
    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUs;


    //43- Home page subnemu--> Career  link
    @FindBy(xpath = "//a[text()='Career']")
    public WebElement career;

    //44- Home page subnemu--> Refund Policy link
    @FindBy(xpath = "//a[text()='Refund Policy']")
    public WebElement refundPolicy;

    //45- Home page subnemu--> Terms & Condition link
    @FindBy(xpath = "//a[text()='Terms & Condition']")
    public WebElement termsCondition;


    //46- Home page subnemu--> Google Play button
    @FindBy(xpath = "//a[@class='google_play_box d-flex align-items-center mb_10']")
    public WebElement googlePlayButton;

    //47- Home page subnemu--> Apple Store button
    @FindBy(xpath = "//*[h4='Apple Store']")
    public WebElement appleStoreButton;

    //48- Home page subnemu--> facebook icon
    @FindBy(xpath = "//*[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;

    //49- Home page subnemu--> twitter icon
    @FindBy(xpath = "//*[@class='fab fa-twitter']")
    public WebElement twitterIcon;

    //50- Home page subnemu--> liknedin icon
    @FindBy(xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;

    //51- Home page subnemu--> instagram icon
    @FindBy(xpath = "//*[@class='fab fa-instagram']")
    public WebElement instagramIcon;

    //52- Home page bodynemu--> Trending Products
    @FindBy(xpath = "//h3[text()='Trending Products']")
    public WebElement trendingProducts;

    //53- Home page bodynemu--> Hot Categories
    @FindBy(xpath = "//h3[text()='Hot  Categories']")
    public WebElement hotCategories;

    //54- Home page bodynemu--> House Appliances
    @FindBy(xpath = "//h4[text()='House Appliances']")
    public WebElement houseAppliances;

    //55- Home page bodynemu-->Recommendation For You
    @FindBy(xpath = "//h4[text()='Recommendation For You']")
    public WebElement recommendtaionForYou;

    //56- Home page bodynemu-->Top Brand
    @FindBy(xpath = "//h3[text()='Top Brand']")
    public WebElement topBrand;

    //57- Home page bodynemu-->Popular Searches
    @FindBy(xpath = "//h3[text()='Popular Searches']")
    public WebElement popularSearches;

    //58- Home page bodynemu-->Trendlifebuy | ONLINE SHOPPING
    @FindBy(xpath = "//h3[text()='Trendlifebuy | ONLINE SHOPPING']")
    public WebElement trenbuylifeOnlineShopping;

    //59- Home page bodynemu-->Trending products viewAll
    @FindBy(xpath = "(//a[@class='title_link d-flex align-items-center lh-1'])[1]")
    public WebElement viewAll_trendingProducts;

    //60- Home page bodynemu-->Hot Categories viewAll
    @FindBy(xpath = "(//span[text()='View All'])[2]")
    public WebElement viewAll_hotcategories;

    //61- Home page subnemu-->More Deals
    @FindBy(xpath = "(//span[@class='title_text'])[3]")
    public WebElement moreDealsButton;

    //62- Home page subnemu-->Load More
    @FindBy(id = "loadmore")
    public WebElement loadMoreButton;

    //63-Home page/login -->Click here

    @FindBy(xpath = "(//a[text()='Click Here'])")
    public WebElement clickHereToReset;

    //63- Home page/Password -->Reset
    @FindBy(id = "sign_in_btn")
    public WebElement resetPasswordSendButton;


    //64- Home page/login -->Sign Up
    @FindBy(xpath = "(//a[text()='Sign Up'])")
    public WebElement signUp;

    //65- Home page/Register --> Sign Up
    @FindBy(xpath = "//h3[text()='Sign Up']")
    public WebElement signUpText;

    // 66- Home page/login -->wrongmail
    @FindBy(xpath = "//span[text()=\"These credentials do not match our records.\"]")
    public WebElement wrongmailtext;

    //67- Home page/login --> Remember me
    @FindBy(xpath = "//label[@class='primary_checkbox d-flex']")
    public WebElement rememberMeCheckBox;

    //68-Home page/login --> Remember me
    @FindBy(id = "remember")
    public WebElement rememberMeCheckBox1;

    //89- Home page/trackyourorder

    @FindBy(xpath = "//*[*='Track Your Order']")
    public WebElement trackYourOrderButton;

    //90
    @FindBy(xpath = "//button[text()='Track Now']")
    public WebElement trackNowButton;

    //91
    @FindBy(xpath = "//*[*='Order ID:  ']")
    public WebElement orderID;

    //92
    @FindBy(xpath = "//input[@id=\"order_number\"]")
    public WebElement dashboardButton;

    @FindBy(id = "order_number")
    public WebElement orderTrackingNumberTextbox;


    //93

    @FindBy(xpath = "//div[@class=\"order_details_progress \"]")
    public WebElement verifytrackorder;

    //94-Homepage/blog > home
    @FindBy(xpath = "//*[@id=\"mobile-menu\"]/li[2]/a")
    public WebElement headerBlogLinki;

    //95- readmore > blog > home
    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div/div/a[2]")
    public WebElement readmorelinki;


    //96- HomePage/Blog/searchbox
    @FindBy(xpath = "//input[@placeholder=\"Search posts\"]")
    public WebElement searchpostsbox;


    //97-HomePage/Blog/Category/1jasper

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/ul/li[1]/label/a")
    public WebElement JasperScootlink;

    //98-HomePage/Blog/Category/2nature
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/ul/li[2]/label/a")
    public WebElement Naturelink;

    //99-HomePage/Blog/Category/river3
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/ul/li[3]/label/a")
    public WebElement RiverLink;

    //100-HomePage/Blog/Category/river3
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[1]/ul/li[4]/label/a")
    public WebElement carLink;

    //101- HomePage/Blog/KEyword/Programming
    @FindBy(xpath = "//a[text()=\"programming\"]")
    public WebElement keywordprogramming;

    //102- HomePage/Blog/KEyword/blog
    @FindBy(xpath = "//a[text()=\"blog\"]")
    public WebElement keywordblog;
    //103- HomePage/Blog/KEyword/medical
    @FindBy(xpath = "//a[text()=\"medical\"]")
    public WebElement keywordmedicallink;
    //104- HomePage/Blog/KEyword/medium
    @FindBy(xpath = "//a[text()=\"medium\"]")
    public WebElement keywordmediumlin;
    //105- HomePage/Blog/Keyword/qa
    @FindBy(xpath = "//a[text()=\"qa\"]")
    public WebElement keywordqalink;
    //106-HomePage/Blog/PopularPost/Connectiontocare
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/div[1]/a")
    public WebElement connectiontocareLink;

    //106-HomePage/Blog/PopularPost/NatureisAteacher
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/div[2]/a")
    public WebElement NatureisAteacher;
    //106-HomePage/Blog/PopularPost/Society – The soil in which we grow
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/div[3]/a")
    public WebElement Societylink;
    //106-HomePage/Blog/PopularPost/Nature Connection Exercise – Perceive and Receive
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/div[4]/a")
    public WebElement natureconnectionlink;

    //107- HomePage/Contact/
    @FindBy(xpath = "//*[@id=\"mobile-menu\"]/li[4]")
    public WebElement contact_link;

    // 108-HomePage/CallOrWhatsapp
    @FindBy(xpath = "//span[text()=\"Call or WhatsApp:\"]")
    public WebElement CallOrWhatsApp;

    //109- HomePage/Contact/GetInTouch
    @FindBy(xpath = "//span[text()=\"Get in touch:\"]")
    public WebElement GetInTouch;

    //110- HomePage/Contact/SocialMedia
    @FindBy(xpath = "//span[text()=\"Social Media:\"]")
    public WebElement SocialMedia;


    @FindBy(xpath = "//span[text()=\"Head office:\"]")
    public WebElement HeadOffice;


    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement ContactName;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@class=\"nice-select-search\"]")
    public WebElement searchboxgiris;

    @FindBy(xpath = "//li[@data-value=2]")
    public WebElement customersarch;


    @FindBy(xpath = "//div[text()=\"Message Sent successfully! Thankyou.\"]")
    public WebElement messagegittimi;

    @FindBy(xpath = "//textarea[@id=\"message\"]")
    public WebElement messageyaz;

    @FindBy(xpath = "//*[@id=\"contactForm\"]/div/div[3]/div")
    public WebElement installation;


    @FindBy(xpath = "//button[@id=\"sign_in_btn\"]")
    public WebElement userSignin;

    @FindBy(xpath = "//*[@id=\"contactForm\"]/div/div[5]")
    public WebElement sendbutton;


    @FindBy(xpath = "//i[@class=\"fab fa-facebook\"]")
    public WebElement facebookikon;


    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[3]/a[1]")
    public WebElement twitterikon;


    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[3]/a[3]/i")
    public WebElement instagramikon;


    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[3]/a[2]/i")
    public WebElement linkedlnikon;


    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[2]/div/div/div/div/div[3]/div[1]/div/span/a[1]")
    public WebElement loginButon;


    //Home page --> Product select
    @FindBy(xpath = "(//img[@alt='Beautiful single size sofa -0099'])[1]")
    public WebElement product1;

    @FindBy(xpath = "(//img[@alt='Single Seater sofa Premium quality -2021'])[1]")
    public WebElement product2;

    //Home page --> Product page compare
    @FindBy(xpath = "//*[@id='add_to_compare_btn']")
    public WebElement compareButtonProductPage;

    //Home page --> Home page compare
    @FindBy(xpath = "//span[text()='Compare(']")
    public WebElement compareButtonHomePage;


    //Home page/Product Compare --> picture1
    @FindBy(xpath = "(//div[@class='product_thumb_upper'])[5]")
    public WebElement comparedProduct1;

    //Home page/Product Compare --> picture2
    @FindBy(xpath = "(//div[@class='product_thumb_upper'])[6]")
    public WebElement comparedProduct2;

    //Home page/Product Compare --> Content Info1
    @FindBy(xpath = "(//ul[@class='comparison_lists'])[1]")
    public WebElement comparisonList1;

    //Home page/Product Compare --> Content Info1
    @FindBy(xpath = "(//ul[@class='comparison_lists'])[2]")
    public WebElement comparisonList2;

    //Home page/Product Compare --> Reset Compare
    @FindBy(xpath = "//*[text()='Reset Compare']")
    public WebElement compareReset;

    //Home page/Product Compare --> Reset Compare
    @FindBy(xpath = "//h4[text()='Compare list is empty.']")
    public WebElement compareListEmptyText;

    @FindBy(xpath = "//a[text()=\"/ Logout\"]")
    public WebElement logOutbutonu;

    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[2]/div/div/div/div/div[3]/div[1]/div/span/a[1]")
    public WebElement dashboardLinki;


    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[3]/ul/li[4]")
    public WebElement myorderlinki;

    @FindBy(xpath = "(//a[@href=\"https://qa.trendlifebuy.com/my-wishlist\"][1])")
    public WebElement logOutSidebar;


    @FindBy(xpath = "//div[@class='section__title2']")
    public WebElement qualityReasonblePrices;

    @FindBy(xpath = "(//a[normalize-space()='About Us'])[1]")
    public WebElement AboutUsMenu;

    @FindBy(xpath = "//div[@class='about_counter_area section_spacing6']//div[@class='container']")
    public WebElement visibleNumbersAndBoards;

    @FindBy(xpath = "//span[text()=\"online shopping easy and cost-efficient\"]")
    public WebElement onlineshoppingeasycost;


    @FindBy(xpath = "(//div[@class='container'])[8]")
    public WebElement teamMemberText;

    @FindBy(xpath = "(//div[@class='container'])[8]")
    public WebElement viesibleRobertPattinson;

    @FindBy(xpath = "(//div[@class='container'])[8]")
    public WebElement viesibleJohnnyDepp;

    @FindBy(xpath = "(//div[@class='container'])[8]")
    public WebElement viesibleJasonStatham;

    @FindBy(xpath = "(//div[@class='container'])[8]")
    public WebElement viesibleHarryCooper;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement purchaseHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Title
    @FindBy(xpath = "//h3[text()='Purchase History']")
    public WebElement purchaseHistoryTitle;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History
    @FindBy(xpath = "//div[@class='nice-select amaz_select3']")
    public WebElement purchaseHistoryAllHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>All History
    @FindBy(xpath = "(//ul[@class='list']/li)[1]")
    public WebElement purchaseHistoryAllHistoryAllHistory;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Pending Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[2]")
    public WebElement purchaseHistoryAllHistoryPendingOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Confirmed Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[3]")
    public WebElement purchaseHistoryAllHistoryConfirmedOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Completed Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[4]")
    public WebElement purchaseHistoryAllHistoryCompletedOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>All History>Refused&Cancelled Orders
    @FindBy(xpath = "(//ul[@class='list']/li)[5]")
    public WebElement purchaseHistoryAllHistoryRefusedAndCancelledOrders;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Order Summary
    @FindBy(xpath = "(//button[@class='amazy_status_btn purchase_show'])[1]")
    public WebElement purchaseHistoryActionOrderSummary;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Invoice Download
    @FindBy(xpath = "(//a[@class='amazy_status_btn'])[1]")
    public WebElement purchaseHistoryActionInvoiceDownload;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Order Summary Check
    @FindBy(xpath = "//h5[text()='Order Summary']")
    public WebElement purchaseHistoryActionOrderSummaryCheck;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Order Summary Check Exit
    @FindBy(xpath = "(//button[@class='close_modal_icon'])[1]")
    public WebElement purchaseHistoryActionOrderSummaryCheckExit;

    //HomePage>Login > Sign In Button> Dashboard> Purchase History>Action Invoice DownloadThen

    @FindBy(xpath = "//*[@id=\"download\"]")
    public WebElement purchaseHistoryActionInvoiceDownloadThen;


    @FindBy(xpath = "//*[@id=\"title\"]")
    public WebElement ikincisayfaTitle;


    // Admin Login Page > Email TextBox
    @FindBy(xpath = "//input[@name='login']")
    public WebElement adminEmailTextBox;

    // Admin Login Page > Password TextBox
    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordTextBox;

    // Admin Login Page > Sing In Button
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement adminSignInButton;


    // Admin Dashboard > List Headers
    @FindBy(xpath = "//div[@class='col-lg-6 col-md-6 col-sm-6']")
    public List<WebElement> ListHeaders;

    // Admin New Customers List > Details first Button
    @FindBy(xpath = "(//tr//a[@type='button'])[1]")
    public WebElement detailsNewCustomersButton;

    // Admin New Customers List > Lates Order first Button
    @FindBy(xpath = "(//tr//a[@type='button'])[11]")
    public WebElement latestOrderDetailsButton;

    // Admin New Customer List > First customer's name
    @FindBy(xpath = "((//tbody/tr)[11]/td)[2]")
    public WebElement nameCustomer;

    // Admin Latest Order List > First Order ID
    @FindBy(xpath = "((//tbody/tr)[41]/td/a)[1]")
    public WebElement orderId;

    @FindBy(xpath = "//button[@id='home-tab']")
    public WebElement buttonAll;

    @FindBy(xpath = "//button[@id='Pay-tab']")
    public WebElement buttonToPay;

    @FindBy(xpath = "//button[@id='Ship-tab'] ")
    public WebElement buttonToShip;

    @FindBy(xpath = "//button[@id='Receive-tab'] ")
    public WebElement buttonToReceive;

    @FindBy(xpath = "//div[@class='col-lg-12 empty_list']")
    public WebElement noOrderFound;

    @FindBy(id = "date_dynamic")
    public WebElement andPage;


    @FindBy(xpath = "//h4[text()='Order ID: ']")
    public WebElement OrderId;

    @FindBy(xpath = "//h4[text()='Status: ']")
    public WebElement Status;

    @FindBy(xpath = "//h4[text()='Order date : ']")
    public WebElement OrderDate;

    @FindBy(xpath = "//h4[text()='Order amount: ']")
    public WebElement OrderAmount;

    @FindBy(xpath = "//h4[text()='Paid By: ']")
    public WebElement PaidBy;


    @FindBy(xpath = "//*[@id=\"rnForm\"]/div/div/span")
    public WebElement last5Orders;
    //option[text()='Last 5 orders']

    @FindBy(xpath = "//*[@id=\"rnForm\"]/div/div/ul/li[1]")
    public WebElement last51Orders;

    @FindBy(xpath = "//li[text()=\"Last 20 orders\"]")
    public WebElement last2Orders;
    //option[text()='Last 20 orders']

    @FindBy(xpath = "//li[text()=\"Last 40 orders\"]")
    public WebElement last4Orders;

    @FindBy(xpath = "//div[@class='nice-select amaz_select5']")
    public WebElement searchOrders;


    // Admin Dashboard > Navbar > Support Ticket DropDown
    @FindBy(xpath = "//div[@class='nav_title']//span[text()='Support Ticket']")
    public WebElement supportTicketDropDown;

    // Admin Dashboard > Support Ticket Button ,under the Support Ticket dropdown
    @FindBy(xpath = "//li[@class='mm-active']//a[text()='Support Ticket']")
    public WebElement supportTicketLinkMenu;

    // Tickets > Add new Button
    @FindBy(id = "add_new")
    public WebElement addNewButtonOnTicketPage;

    // New Ticket > Error Messages "The subject field is required."
    @FindBy(id = "error_subject")
    public WebElement subjectErrorMessage;

    // New Ticket > Error Messages "The category id field is required."
    @FindBy(id = "error_category_id")
    public WebElement categoryErrorMessage;

    // New Ticket > Error Messages "The priority id field is required."
    @FindBy(id = "error_priority_id")
    public WebElement priorityErrorMessage;

    // New Ticket > Error Messages "The status field is required."
    @FindBy(id = "error_status")
    public WebElement statusErrorMessage;

    // New Ticket > Error Messages "The description field is required."

    // New Ticket > Submit Create Ticket
    @FindBy(xpath = "//i[@class='ti-check']")
    public WebElement createTicketButton;


    // New Ticket > Error Messages "The description field is required."
    @FindBy(id = "error_message")
    public WebElement descriptionErrorMessage;
    // New Ticket > Browser Div List
    @FindBy(xpath = "//div[@class='primary_file_uploader']")
    public List<WebElement> browserDivList;

    // New Ticket > Add Browser Button
    @FindBy(xpath = "//button[@id='ticket_file_add']")
    public WebElement addBrowserButton;

    // New Ticket > Delete Browser Button
    @FindBy(xpath = "//button[@class='primary-btn delete-ticket-message-attach small fix-gr-bg custom_plus_btn']")
    public WebElement deleteBrowserButton;

    // New Ticket > Subject TextBox
    @FindBy(id = "subject")
    public WebElement subjectTextBox;

    // New Ticket > CategoryList
    @FindBy(xpath = "(//ul[@class='list'])[2]/li")
    public List<WebElement> categoryList;

    // New Ticket > PriorityList
    @FindBy(xpath = "(//ul[@class='list'])[3]/li")
    public List<WebElement> priorityList;

    // New Ticket > User List
    @FindBy(xpath = "(//ul[@class='list'])[4]/li")
    public List<WebElement> userList;

    // New Ticket > Status List
    @FindBy(xpath = "(//ul[@class='list'])[4]/li")
    public List<WebElement> statusList;
    // New Ticket > description TextBox;
    @FindBy(xpath = "//div[@role='textbox']/p")
    public WebElement descriptionTextBox;

    // New Ticket > Category List Butonu;
    @FindBy(xpath = "(//span[@class='current'])[2]")
    public WebElement categoryListButton;
    //div[@class="nice-select primary_select mb-15 open"]
    // New Ticket > priority List Butonu;


    // New Ticket > user List Butonu;
    @FindBy(xpath = "(//span[@class='current'])[4]")
    public WebElement userListButton;

    // New Ticket > status List Butonu;
    @FindBy(xpath = "(//span[@class='current'])[4]")
    public WebElement statusListButton;

    // Support Ticket > Status List Button
    @FindBy(xpath = "(//span[@class='current'])[4]")
    public WebElement statusListButtonOnSupportTicket;

    // New Ticket > assignTo List Butonu;
    @FindBy(xpath = "(//span[@class='current'])[6]")
    public WebElement assignToListButton;

    // New Ticket > Assign to List
    @FindBy(xpath = "(//ul[@class='list'])[6]/li")
    public List<WebElement> assignToList;

    // New Ticket > attach Browser textBox;
    @FindBy(xpath = "//input[@id='ticket_file']")
    public WebElement attachFileBox;

    // Ticket List > First Subject of Ticket
    @FindBy(xpath = "(//tr/td/a)[1]")
    public WebElement firstSubjectofTicket;

    @FindBy(xpath = "(//div[@class='primary_input mb-25']//span[@class='current'])[1]")
    public WebElement categoryListCurrentText;

    // Support Ticket > Priority Current Text;


    // Support Ticket > statusList Current Text;
    @FindBy(xpath = "(//div[@class='primary_input mb-25']//span[@class='current'])[3]")
    public WebElement statusListCurrentText;
    @FindBy(xpath = "(//ul[@class='list'])[4]/li")
    public List<WebElement> statusListonSupportTicket;

    @FindBy(xpath = "//span[text()=\"Admin Reports\"]")
    public WebElement adminreports;

    @FindBy(xpath = "//td[text()=\"No matching records found\"]")
    public WebElement No_matching_records_found;

    @FindBy(xpath = "//a[text()=\"Keywords search\"]")
    public WebElement keywordsearch;


    @FindBy(xpath = "//input[@placeholder=\"Quick Search\"]")
    public WebElement quicksearch;


    @FindBy(xpath = "//td[text()=\"BALOĞLU YAPI\"]")
    public WebElement quicksearchverigeldimi;


    @FindBy(xpath = "//div[@id=\"userSearchTable_wrapper\"]")
    public WebElement keyboardlist;

    @FindBy(xpath = "//th[text()=\"Keywords\"]")
    public WebElement keywordtitle;

    @FindBy(xpath = "//th[text()=\"Number of time\"]")
    public WebElement numberofTime;


    @FindBy(xpath = "//*[@id=\"home\"]/div[1]/div[2]/div[2]/a")
    public WebElement orderdetails;

    @FindBy(xpath = "//*[@id=\"userSearchTable\"]/tbody/tr")
    public List<WebElement> satirNumber;

    @FindBy(xpath = "//i[@class='fa fa-bell']")
    public WebElement iconNotification;

    @FindBy(xpath = "//a[@class='primary-btn radius_30px text_white  fix-gr-bg']")
    public WebElement buttonSetting;

    @FindBy(id = "text")
    public WebElement adminBoxMail;

    @FindBy(id = "password")
    public WebElement adminBoxPassword;

    @FindBy(id = "sign_in_btn")
    public WebElement adminBoxSignIn;

    @FindBy(linkText = "https://trendlifebuy.com/admin/login")
    public WebElement linkAdmin;

    @FindBy(xpath = "//h4[text()='Notifications']")
    public WebElement notificationyazisi;


    //personel notification sayfasındaki mesaj tipi
    @FindBy(xpath = "//span[@class='checkmark']")
    public WebElement buttonType;

    @FindBy(xpath = "//div[text()='Success']")
    public WebElement messageUptadeSuccsess;
    //div[text()='Updated successfully!']
    //div[@class='toast-title'] id = "toast-container"
    // css = ".toast-success"

    @FindBy(xpath = "//a[text()='Read all']")
    public WebElement buttonReadAll;

    @FindBy(xpath = "//div[@class='Notification_body']")
    public WebElement screenAll;
    @FindBy(xpath = "//a[text()='View']")
    public WebElement buttonView;

    @FindBy(xpath = "//h3[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px']")
    public WebElement pagesView;


    @FindBy(xpath = "//*[text()='Support Ticket'][1]")
    public WebElement supportTicketButton;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement statusButton;

    @FindBy(xpath = "//*[@id=\"sidebar_menu\"]/li[10]/ul/li[5]")
    public WebElement myticketbutton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/section/div/div/div[1]/form/div/div[1]/div/div")
    public WebElement selectonecategory;


    @FindBy(xpath = "//li[text()=\"Installation \"] ")
    public WebElement InstallationClick;


    @FindBy(xpath = "//li[text()=\"High \"]")
    public WebElement highclick;


    @FindBy(xpath = "//li[text()=\"Pending \"]")
    public WebElement pendingclick;

    @FindBy(xpath = "//button[@id=\"search_btn\"]")
    public WebElement searchboxcclick;

    @FindBy(xpath = "//*[text()='Admin129  ']")
    public WebElement userAgentText;


    @FindBy(xpath = "//tr[@class=\"odd\"]")
    public WebElement listtable;


    //profile/dashboard --> User (name)
    @FindBy(xpath = "//h4[@class='font_20 f_w_700']")
    public WebElement userName;

    //profile/dashboard --> (user) Email
    @FindBy(xpath = "//span[@class='email_text font_14 f_w_400 mute_text position-relative']")
    public WebElement emailofUser;

    //profile/dashboard --> All Order
    @FindBy(xpath = "//span[text()=' All Order']")
    public WebElement allOrder;

    //profile/dashboard --> My Wishlist
    @FindBy(xpath = "//span[text()='My Wishlist']")
    public WebElement myWishlist;

    //profile/dashboard --> Refund Success
    @FindBy(xpath = "//span[text()='Refund Success']")
    public WebElement refundSuccess;


    // profile//dashboard//add fund-->stripe

    @FindBy(xpath = "//img[@title=\"Stripe\"]")
    public WebElement stripe;


    @FindBy(xpath = "//button[@class='amaz_primary_btn style2 text-nowrap']")
    public WebElement add_fund;
    //profile/dashboard --> Product in Cart
    @FindBy(xpath = "//span[text()=' Product in Cart']")
    public WebElement productInCart;

    //profile/dashboard --> Coupon Used
    @FindBy(xpath = "//span[text()=' Coupon Used']")
    public WebElement couponUsed;

    //profile/dashboard --> Completed Order
    @FindBy(xpath = "//span[text()=' Completed Order']")
    public WebElement completedOrder;

    //profile/dashboard --> Total Balance
    @FindBy(xpath = "//h4[@class='font_30 f_w_700 secondary_text mb_25']")
    public WebElement totalBalance;

    //profile/dashboard --> Recharge My Wallet
    @FindBy(xpath = "//span[@class='font_14 f_w_700 secondary_text text-uppercase']")
    public WebElement rechargeMyWallet;

    //profile/dashboard --> (afterclicking RechargeMyWallet) Recharge Amount
    @FindBy(xpath = "//span[@class='font_14 f_w_700 secondary_text text-uppercase']")
    public WebElement rechargeAmountButton;

    //profile/dashboard --> Recharge wallet
    @FindBy(xpath = "//input[@name='recharge_amount']")
    public WebElement rechargeAmountBox;


    //profile/dashboard --> stripe email
    @FindBy(id = "email")
    public WebElement stripe_Email;

    //profile/dashboard --> stripe card number
    @FindBy(id = "card_number")
    public WebElement stripe_CardNumber;

    //profile/dashboard --> stripe card expiry date
    @FindBy(id = "cc-exp")
    public WebElement stripe_CardExpDate;

    //profile/dashboard --> stripe Cvc
    @FindBy(id = "cc-csc")
    public WebElement stripe_Cvc;

    //profile/dashboard --> stripe Pay button
    @FindBy(id = "submitButton")
    public WebElement stripe_Pay;


    //profile/dashboard --> last transaction
    @FindBy(xpath = "//a[@class='amaz_badge_btn ']")
    public WebElement totalBalance_LastTransaction;

    //profile/dashboard --> See all button of Purchase History
    @FindBy(xpath = "//a[@class='amaz_badge_btn2 text-uppercase text-nowrap']")
    public WebElement seeAll_PurchaseHistory;

    //profile/dashboard --> See all button of My Wishlist
    @FindBy(xpath = "(//a[@class='amaz_badge_btn2 text-uppercase'])[1]")
    public WebElement seeAll_MyWishList;

    @FindBy(xpath = "//div[@class=\"white_box style2 bg-white mb_30\"]")
    public WebElement screennMyorderdetails;

    @FindBy(xpath = "//div[@class=\"order_details_progress \"]")
    public WebElement orderShippingProgress;

    @FindBy(xpath = "(//p[@class=\"font_14 f_w_400 m-0 lh-base\"])[1]")
    public WebElement OrderID;
    @FindBy(xpath = "(//p[@class=\"font_14 f_w_400 m-0 lh-base\"])[2]")
    public WebElement Orderdate;
    @FindBy(xpath = "(//p[@class=\"font_14 f_w_400 m-0 lh-base\"])[1]")
    public WebElement Orderstatus;
    @FindBy(xpath = "(//p[@class=\"font_14 f_w_400 m-0 lh-base\"])[1]")
    public WebElement Orderamount;
    @FindBy(xpath = "(//p[@class=\"font_14 f_w_400 m-0 lh-base\"])[1]")
    public WebElement PackageCode;
    @FindBy(xpath = "(//p[@class=\"font_14 f_w_400 m-0 lh-base\"])[1]")
    public WebElement taxAmount;

    @FindBy(xpath = "(//p[@class=\"lineHeight1 font_14 f_w_400 mb-0\"])[1]")
    public WebElement orderedText;
    @FindBy(xpath = "(//p[@class=\"lineHeight1 font_14 f_w_400 mb-0\"])[2]")
    public WebElement processingText;
    @FindBy(xpath = "(//p[@class=\"lineHeight1 font_14 f_w_400 mb-0\"])[3]")
    public WebElement shippedText;
    @FindBy(xpath = "(//p[@class=\"lineHeight1 font_14 f_w_400 mb-0\"])[4]")
    public WebElement recievedText;
    @FindBy(xpath = "(//p[@class=\"lineHeight1 font_14 f_w_400 mb-0\"])[5]")
    public WebElement deliveredText;
    @FindBy(xpath = "//a[text()=\"Cancel Order\"]")
    public WebElement cancelOrder;

    @FindBy(xpath = "//a[text()=\"Order Cancelled\"]")
    public WebElement orderCancelled;

    @FindBy(xpath = "//div//h3[text()=\"Select cancel reason\"]")
    public WebElement selectCancelReason;


    @FindBy(xpath = "//ul[@class=\"list\"]")
    public List<WebElement> reasonList;


    @FindBy(xpath = "(//div[@class='nice-select primary_input3 radius_3px style6 open']//span[@class='current'])[1]")
    public WebElement reasoncurrentText;

    @FindBy(xpath = "//span[@class='current']")
    public WebElement reasonButton;


    @FindBy(xpath = "//li[text()=\"ra.deneme\"]")
    public WebElement raDeneme;


    // All categories > Computer & Accessories
    @FindBy(xpath = "(//div/ul[@class='dropdown_menu catdropdown_menu dropdown_menu_active']/li)[1]")
    public WebElement computerAndAccessoriesMenu;

    // All categories > Computer & Accessories > Computer
    @FindBy(xpath = "(//a[text()='Computer'])[1]")
    public WebElement computerMenu;

    // All categories > Computer & Accessories > Computer > firstProduct
    @FindBy(xpath = "//*[@id=\"home\"]/div/div[1]/div/div[1]")
    public WebElement firstProduct;

    // All categories > Computer & Accessories > Computer > firstProduct > Add to cart Button
    @FindBy(xpath = "(//div/a[text()='Add to Cart'])[1]")
    public WebElement addToCartButton;

    // After click add to cart button, opened pop-up > View Cart Button
    @FindBy(xpath = "//div/a[text()='View cart']")
    public WebElement viewCartButton;

    // Cart > text of "Shipping charge free from"
    @FindBy(xpath = "//h5[text()='Shipping charge free from ']")
    public WebElement shippinChargeFreeFromText;

    // Cart > text of Order Summary
    @FindBy(xpath = "//div/h3[text()='Order Summary']")
    public WebElement orderSummartText;

    // Cart > text of Subtotal
    @FindBy(xpath = "//div[@class='subtotal_lists']//h4[text()='Subtotal']")
    public WebElement subtotalText;

    // Cart > text of Shipping Charge
    @FindBy(xpath = "//div[@class='subtotal_lists']//h4[text()='Shipping Charge']")
    public WebElement shippingChargeText;

    // Cart > text of Discount
    @FindBy(xpath = "//div[@class='subtotal_lists']//h4[text()='Discount']")
    public WebElement discountText;

    // Cart > Total Text > behind Order Summary
    @FindBy(xpath = "//div[@class='single_total_left flex-fill']/span[text()='Total']")
    public WebElement totalText;

    // Cart > text of VAT/TAX/GST
    @FindBy(xpath = "//div[@class='subtotal_lists']//h4[text()='VAT/TAX/GST']")
    public WebElement vatTaxGstText;

    // Cart > Added Subtotal of Product
    @FindBy(xpath = "//div[@class='col-lg col-4 order-3 order-lg-0 my-3 my-lg-0']/h4")
    public WebElement subTotalOfProduct;

    // Cart > Proceed to checkout Button
    @FindBy(xpath = "//div/a[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;
    // cart > Increase QuantityButton
    @FindBy(xpath = "//button[@class='count_single_item number_increment change_qty']")
    public WebElement quantityIncreaseButton;


    //Cart > Value of Quantity
    @FindBy(xpath = "//input[@class='count_single_item input-number qty']")
    public WebElement quantityValue;

    // Cart > Decrease QuantityButton
    @FindBy(xpath = "//button[@class='count_single_item inumber_decrement change_qty']")
    public WebElement quantityDecreaseButton;


    // Cart > Delete Product which is in cart
    @FindBy(xpath = "//div/span[@class='close_icon style_2 lh-1 cart_item_delete_btn cursor_pointer']")
    public WebElement deleteProductButton;


    // Cart > TotalPrice
    @FindBy(xpath = "(//div[@class='single_total_right']/span)[5]")
    public WebElement totalPrice;


    @FindBy(xpath = "//div[@class='col-lg col-4 order-1 order-lg-0 my-3 my-lg-0']/h4")
    public WebElement priceOfProduct;
    //profile/dashboard --> User (name)

    //profile/dashboard --> Amount Add Fund button
    @FindBy(xpath = "//button[@class='amaz_primary_btn style2 text-nowrap']")
    public WebElement rechargeAmountAddFundButton;


    //profile/dashboard --> See all button of Recent Order
    @FindBy(xpath = "(//a[@class='amaz_badge_btn2 text-uppercase'])[2]")
    public WebElement seeAll_RecentOrder;

    //profile/dashboard --> See all button of Product in Cart
    @FindBy(xpath = "(//a[@class='amaz_badge_btn2 text-uppercase'])[3]")
    public WebElement seeAll_ProductinCart;

    //profile/dashboard --> purchaseHistoryOnSideBar
    @FindBy(xpath = "//a[normalize-space()='Purchase History']")
    public WebElement purchaseHistoryOnSideBar;

    //profile/dashboard --> myWishlistOnSideBar
    @FindBy(xpath = "//a[normalize-space()='My Wishlist']")
    public WebElement myWishlistOnSideBar;

    //profile/dashboard --> myOrderOnSideBar
    @FindBy(xpath = "//a[normalize-space()='My Order']")
    public WebElement myOrderOnSideBar;

    //profile/dashboard --> giftCardOnSideBar
    @FindBy(xpath = "//a[normalize-space()='Giftcard']")
    public WebElement giftCardOnSideBar;


    @FindBy(xpath = "//a[normalize-space()='Refund & Dispute']")
    public WebElement refundDispute;


    @FindBy(xpath = "(//div[contains(@class,'d-flex align-items-center flex-wrap gap_5')])[3]")
    public WebElement statusPending;


    @FindBy(xpath = "(//div[contains(@class,'d-flex align-items-center flex-wrap gap_5')])[4]")
    public WebElement requestSentDate;


    @FindBy(xpath = "(//a[contains(@class,'amaz_primary_btn style2 text-nowrap')][normalize-space()='View Details'])[1]")
    public WebElement SViewDetailsButton;

    @FindBy(xpath = "(//div[contains(@class,'justify-content-between theme_border')])[1]")
    public WebElement CurrentStatusOfTheOrder;
    //profile/dashboard --> stripe logo/button
    @FindBy(xpath = "//img[@title='Stripe']")
    public WebElement stripe_Logo;

// *************************US_23 features*******************************

    @FindBy(xpath = "//a[normalize-space()='Support Ticket']")
    public WebElement supportTicket;

    @FindBy(xpath = "//a[normalize-space()='Support Ticket']")
    public WebElement supportTicketPage;

    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[1]")
    public WebElement AllSubmittedTicketList;

    @FindBy(xpath = "(//a[@class='amaz_badge_btn4 text-nowrap text-capitalize text-center'][normalize-space()='View'])[1]")
    public WebElement SViewButton;

    @FindBy(xpath = "(//span[normalize-space()='Status'])[1]")
    public WebElement sCustomerStatusInformation;

    @FindBy(xpath = "//button[@id='replay_box_toggler']")
    public WebElement SReplyButton;

    @FindBy(xpath = "//button[@id='replay_box_toggler']")
    public WebElement SReplyTextBox;

    @FindBy(xpath = "//button[@id='replay_box_toggler']")
    public WebElement SReplyNowButton;

    @FindBy(xpath = "(//div[@class='ticket_view_box theme_border gray_color_1 radius_5px mb_20'])[9]")
    public WebElement SticketAnswerBox;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SallTicketLink;

    @FindBy(xpath = "(//input[@placeholder='Search...'])[1]")
    public WebElement AllTicketSearchButton;

    @FindBy(xpath = "(//li[normalize-space()='Pending'])[1]")
    public WebElement SPendingLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SPendingBox;

    @FindBy(xpath = "(//li[normalize-space()='On Going'])[1]")
    public WebElement SOnGoingLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SOnGoingBox;

    @FindBy(xpath = "(//li[normalize-space()='Completed'])[1]")
    public WebElement SCompletedLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SCompletedBox;
    @FindBy(xpath = "(//li[normalize-space()='Closed'])[1]")
    public WebElement SClosedLink;

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    public WebElement SClosedBox;

    @FindBy(xpath = "(//a[normalize-space()='+ Add New'])[1]")
    public WebElement SAddNewButton;

    @FindBy(xpath = "(//div[@class='dashboard_white_box style4 bg-white mb_25'])[1]")
    public WebElement SCreateNewTicket;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement SSubjectBox;

    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[1]")
    public WebElement SCategoryBox;

    @FindBy(xpath = "//li[@data-value='55']")
    public WebElement SCategoryBoxOptions;

    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[2]")
    public WebElement SPriorityBox;

    @FindBy(xpath = "//li[@data-value='33']")
    public WebElement SPriorityBoxOptions;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement SDescriptionBox;

    @FindBy(xpath = "//button[text()='+ Create Now']")
    public WebElement SCreateNowButton;

    @FindBy(xpath = "//a[normalize-space()='Pending']")
    public WebElement SCustomerPending;
    @FindBy(xpath = "//a[normalize-space()='Very Low']]")
    public WebElement SCustomerVeryLow;
    @FindBy(xpath = "//a[normalize-space()='New Category']")
    public WebElement SCustomerVeryCategory;

    @FindBy(xpath = "//div[@class='dashboard_white_box style5 bg-white mb_25']")
    public WebElement SCustomerInformation;



}
