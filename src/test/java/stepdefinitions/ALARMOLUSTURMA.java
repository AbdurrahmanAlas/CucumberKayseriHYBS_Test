package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageHYBS;
import pages.PageN2MOBIL;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class ALARMOLUSTURMA {

    PageN2MOBIL pageN2MOBIL = new PageN2MOBIL();

    @Given("Login to n2MOBIL site, click the Login button and log in with your User information.")
    public void loginTon2MOBILSiteClickTheLoginButtonAndLogInWithYourUserInformation() {


        ReusableMethods.loginn2MOBIL("abddurrahman.alas", "alas.54786");
    }

    @Given("Alarmlar linkine tıkla ve yeni Alarm linkine git")
    public void alarmlar_linkine_tıkla_ve_yeni_alarm_linkine_git() {

        String[] firmalar = {
                 "ABDULLAH AYASILI",
                 "ADEM BÖLÜKBAŞ",
                 "ADEM DURANOĞLU",
                 "ADEM ÇALDAŞ - ÖZGE HAFRİYAT",
                //"AHMET ADANALI",
                 "AHMET CEM KIŞ",
                "AHMET DURSUN",
                "AHMET KARAKAYA",
                "AHMET TURHAN CENNET",
                "AHMET YAŞMAN",
                "AHMET ÖNDER SOYKAN",
                "AHMET İLHAN",
                "AK MICIR İNŞAAT TAAH.NAKLIYAT SANAYİ VE TİC.LTD.ŞTİ",
                "AKKAŞ HAFRİYAT",
                "AKPINAR İHTİYAÇ MADDELERİ NAKLİYE HARFİYAT TAAHHÜT İNŞAAT SANAYİ TİCARET LİMİTED ŞİRKETİ",
                "ALAADDİN DEVİR",
                "ALAATTİN LEKESİZ",
                 "ALPASLAN DENİZ",
                 "ALTINKAYA GRANİT MERMERCİLİK SAN. TİC. LTD. ŞTİ.",
                "ALTUNTAŞ İNOVASYON MERMER METAL SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                "ALİ DOK - DOKOĞLU HAFRİYAT",
                 "ALİ PEHLİVAN - PEHLİVAN HAFRİYAT",
                 //"ALİ İHSAN SOLMAZ",
                 "ARABOĞLU NAKLİYE TAŞIMACILIK VE OTOMOTİV SAN. TİC. LTD. ŞTİ.",
                 "ARVEN YAPI ENDÜSTRİ A.Ş",
                 "ARİF ÇAM",
                 "ASMEN İNŞ TAAH.SAN TİC LTD ŞTİ",
                 "ASÇELİK PETROL NAKLİYAT İNŞAAT ORMAN ÜRÜNLERİ TURİZM MADENCİLİK SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                 "ATAY İNŞAAT",
                 "AYDIN ASLAN",
                 "AYDIN İNŞAAT TİC. SAN. LTD. ŞTİ.",
                 "AYŞE AKTAŞ",
                 "BAHRİ BEKTAŞ",
                 "BALOĞLU HAFRİYAT İNŞ. NAK. YAP. MALZ. SAN. TİC. LTD. ŞTİ.",
                 "BALOĞLU YAPI MALZ. İNŞ. HAR. NAK. GID. TİC. LTD. ŞTİ.",
                 "BAŞKA İNŞAAT MADENCİLİK SANAYİ VE TİC LTD ŞTİ",
                 "BEMKAY İNŞAAT",
                 "BERAT KOÇ",
                 "BKN HURDACILIK",
                 "CAHİT BAŞBEK",
                 /////////"CEMAL SIR",
                 "EMİN ALDEMİR",
                 "EMİN HUBUBAT PET.ÜRÜN.İNŞ.TAAH.HAR.NAK.OTO.GID.LOK.ISIT.TİC.VE SAN. LTD. ŞTİ.",
                 /////////"EMİROĞLU İNŞAAT MAD. HURD. TEM. NAK. SAN. VE TİC. LTD. ŞTİ.",
                 "ERDAL TOPLAK",
                 "ERDOĞAN DEMİR",
                 "ERDOĞAN IŞIK",
                 "ERKUT İNŞAAT",
                 "EROL TİREN",
                 "ERSE TAAH.MÜT.HAFR.İNŞ.PET.LTD.ŞTİ",
                 "ERSOY MERMER MADEN İNŞAAT NAK. HAYVANCILIK SAN. TİC. LTD. ŞTİ.",
                 "ETHEM İLTAŞ - İLTAŞ HAFRİYAT",
                 "FARUK DİKMEN",
                 "FARUK ŞEKER - ŞEKER HAFRİYAT",
                 "FAZLI ŞEKER",
                 "FELEK HAFRİYAT - HÜSEYİN FELEK",
                 "FEYYAZ SERÇE",
                 "FEYZULLAH IŞIK İNŞAAT MÜHENDİSLİK NAK. PET. ÜR. SAN. VE TİC. LTD. ŞTİ.",
                 "FIRAT HAFRİYAT-MEHMET FIRAT",
                 ///////////"FURKAN KÖK-UZUNOĞLU HAFRİYAT",
                 "GEMA İNŞAAT NAK. ÖZEL EĞT. TİC. LTD. ŞTİ.",
                "GÖKHAN TURHAL",
                /////////"GÖNDER HAFRİYAT-FETHİ GÖN",
                 "GÜRPINAR HAFRİYAT - HACI GÜRPINAR",
                /////////"GÜÇLÜ İNŞAAT NAK. SAN. VE TİC. LTD. ŞTİ.",
                ////////// "HACI ALİ SERÇEL",
                 "HACI ALİ YERGİN",
                 "HACI BEKİR ÖZTÜRK",
                "HACI MEHMET AHRAZ",
                 "HAKAN DAĞLI",
                 "HAMDİ AYASILI",
                 "HAMZA TOPAKTAŞ - AK TOPAKTAŞ",
                 "HANSOY İNŞAAT NAKLİYAT PETROL ÜRÜNLERİ GIDA SANAYİ TİCARET LİMİTED ŞİRKETİ",
                 "HARBİYE İNŞ MAD TAAH PET ÜRN SAN TİC A.Ş",
                 "HARUN BALLIKAYA",
                 ///////////"HATİCE KILINÇ",
                 "HAYRİ DAĞLI - DAĞLI HAFRİYAT",
                 ///////////"HÜSAMETTİN TOZKOPARAN",
                 "HÜSEYİN ATAMAN",
                 "HÜSEYİN DAĞLI",
                 "HİDAYET FIRAT - FIRAT NAKLİYE",
                 "HİLMİ TOKTAY - PAŞA HAFRİYAT",
                 "KAMER MERMER A.Ş.",
                 "SUNGUR PLAN TAAH.İNŞ.YAPI MALZ.SAN.VE TİC. LTD.ŞTİ.",
                 "SUNULLAH SERÇEL",
                "SÜLEYMAN SORGUN BUĞRA HAFRİYAT",
                 "TEST",
                 "TOROS MERMER MADENCİLİK TAAHHÜT İTHALAT İHRACAT SANAYİ TİCARET LİMİTED ŞİRKETİ",
                 "TOTAŞ DOĞALGAZ KALORİFER ISI SİSTEMLERİ İNŞAAT OTOMOTİV TURİZM SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                 //"TUNCAY SOYAL",
                 "TURHAL HAFRİYAT İNŞ. SAN.VE TİC.LTD. ŞTİ.",
                 "TURKUAZ SERAMİK SAN. VE TİC. A.Ş.",
                 "UĞUR GÜNÜÇ",
                 "UĞUR PAYZA - PAYZA DÖKÜM",
                 "VELİ YILDIZHAN",
                 "VELİ ÇAĞLAYAN",
                 "DURAN",
                 "SALİM ALTUNTAŞ",
                 "SANDAL HARFİYAT",
                 "SELAHATTİN AYASILI",
                 "SELİN KANEPE KOLTUK AKSESUAR MOBİLYA",
                 "SERVET KAPLAN",
                 "SEYİT KAYNAR",
                 //"SEYİTOĞULLARI İNŞAAT NAKL. SAN VE TİC LTD ŞTİ",
                 "SOLMAZLAR NAKLİYAT AKAR. İNŞ. TİC. SAN. LTD. ŞTİ.",
                 "NUSRETTİN ERCİYES",
                 "NİHAT DOĞRU",
                 "NİZAMETTİN HÜYÜK",
                 "OKANDAN CAM SANAYİ VE TİCARET ANONİM ŞİRKETİ",
                 "OKTAY KAYGISIZ - ENES HAFRİYAT",
                 "OKTAY PEHLİVAN",
                 "ORHAN KEMER",
                 "OSMAN TEK",
                 "OSMAN ŞENOL",
                 "RENKTAŞ",
                 "RIZA TÜRKMEN",
                 "SA-TO TAŞIMACILIK İNŞAAT TAAHHÜT GÜVENLİK VE TEMİZLİK HİZMETLERİ İTHALAT İHRACAT SAN.VE TİC.LTD.ŞTİ.",
                 "SADIK DOĞALTAŞ-SADIK",
                 "MUSTAFA UYGUN",
                 "MUTTALİP YILDIRIM",
                 //"MÜKREMİN GENÇ",
                 "NAZMİ DURSUN",
                 "NEV-KA DİYABAZ BAZALT MAD. MAK. TUR. İNŞ. NAK. SAN. VE TİC. LTD. ŞTİ.",
                 "NUH FELEK",
                 "NURETTİN YAKANER - ONUR TORNA",
                 "NURSEL KOSKA",
                 "NURİ RAYDEMİR",
                 "MUSTAFA ALTUNTAŞ - ALTUNDAŞ HAFRİYAT",
                //"MUSTAFA ARSLAN",
                 "MUSTAFA AYDOĞMUŞ",
                 "MUSTAFA BAKAÇ",
                 "MUSTAFA DOĞAN YAPI GRANİT VE GIDA MAD. SAN. VE TİC. LTD. ŞTİ.",
                 "MUSTAFA DURSUN",
                 //"MUSTAFA DURSUN-52522252870",
                 "MUSTAFA KANAL",
                 "MUSTAFA KAZU",
                 "MUSTAFA PARLAK",
                 "MEHMET FATİH ARIKAN",
                 "MEHMET KOÇYİĞİT - KOÇYİĞİT NAKLİYAT",
                // "MEHMET YALÇIN",
                 "MEHMET ÇETİNKAYA HARFİYAT ELEKTRİK İNŞ. SAN. TİC. LTD. ŞTİ.",
                 //"MEHMET İLTAŞ - İLTAŞOĞLU HAFRİYAT",
                 "MEMİŞ OLGUN",
                 "MERT TAM HTS",
                 "MERT TAM NAK. HAF. İNŞ. TAAH. SAN. VE TİC. LTD. ŞTİ.",
                "MUHAMMED DEMİREZEN",
                 "MUHSİN DEMİREL",
                 "MURAT ÇAVUŞ",
                 "KİPER MAKİNA MADENCİLİK NAK. İNŞ. TURİZM. TİC. LTD ŞTİ",
                 "LAZOLİNİ MADENCİLİK SANAYİ VE TİCARET ANONİM ŞİRKETİ",
                 "LOKMAN ÖZ",
                "MAHMUT BAĞLAMIŞ",
                 "MAHMUT TOPAL",
                "MAHMUT ÇALDAŞ",
                "MASTARCIOĞLU TARIM HAYV.GIDA PET İNŞ SAN TİC LTD ŞTİ",
                "MAYA NAKLİYAT - MEHMET MAYA",
                "MEHMET ASLAN - ASLANLAR HAFRİYAT",
                "MEHMET AYAZ - AYAZ HAFRİYAT",
                "MEHMET EROL-YILANOĞLU HAFRİYAT",
                "KARARMAZ ELEKTRİK ZİRAİ ÜRÜNLERİ TİC VE SAN LTD ŞTİ",
                "KAYSERİ BÜYÜKŞEHİR BELEDİYESİ DESTEK HİZMETLERİ DAİRESİ BAŞKANLIĞI",
                "KAYSERİ MADENCİLİK BİMS İŞLETMELERİ SAN VE TİC A.Ş.",
                "KERİM DAĞ - ERDAĞ HAFRİYAT",
                "KEZİBAN UYGUN",
                "KIŞ NAKLİYAT-EMİNE KIŞ",
                "KORAY ALTINBAŞ",
                "KUBİLAY KILIÇ",
                "KUMRULAR HAFRİYAT İNŞ. TAAH. VE TİC LTD ŞTİ",
                "EMRE TAŞ VE MADENCİLİK A.Ş.",
                "EMPAR MADENCİLİK TAŞIMACILIK İNŞAAT SANAYİ TİCARET LİMİTED ŞİRKETİ",
                "ELMAS MÜRAT",
                "DÖNEM MADENCİLİK",
                //"EGAR YAPI LİMİTED ŞİRKETİ",
                "EGE CEVHER KROM MADENCİLİK SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                "EJDER MADEN İNŞAAT VE İŞ MAKİNALARI SAN. VE TİC. LTD. ŞTİ.",
                "CENGİZ ÖZDEMİR",
                //"CENGİZHAN DURAN",
                //"CEVDET TİREN",
                "CLS MİMARLIK İNŞAAT HAFRİYAT ULUS. NAK. LTD. ŞTİ.",
                 "CM HAYVANCILIK İNŞAAT GIDA MADEN NAKLİYE ARAÇ KİRALAMA SAN VE TİC.LTD. ŞTİ",
                 "CUMA ALİ ÖZDEMİR",
                 //"CUMA TURHAN",
                 "CİHAN YAPI",
                 "DELEN MADENCİLİK",
                 "DENİZ TAŞ (HTS DEMO)",
                "DOĞAN KOÇ",
                 "DURAN DOK",
                 "DURAN DURSUN",
                 "DURMUŞ TOPAL",
                 "YAHYA KEMER",
                "YAKUP AŞKIN",
                "YAKUP KAYA",
                "YAMAN TAAHHÜT DEKORASYON NAKLİYAT HARFİYAT İNŞAAT OTOMOTİV GIDA SANAYİ VE TİCARET LİMİTED",
                "YASA İNŞAAT NAK. MAD. LTD. ŞTİ.",
                "YASİN BAŞBEK - KAYSERİ HAFRİYAT",
                "YASİN BAŞBEK-HTS",
                "YAĞMURALP LTD ŞTİ",
                "YERGİNLER HAFRİYAT İNŞAAT TAAHÜT TİC. LTD. ŞTİ.",
                 "YETER DAĞLI",
                 "YUSUF DOK",
                 "YUSUF KAPLAN",
                 "YUSUF SÖNMEZ",
                 //"YUSUF ZAVAR",
                 "YUSUF ŞAŞOĞLU HAFRİYAT İNŞAAT ANONİM ŞİRKETİ",
                 "n2mobil",
                "ÇARIKLI İNŞAAT TAAH. NAK. OTO. SAN. TİC. LTD. ŞTİ.",
                "ÇAĞLAYANGİL İNOV. ELEK. İNŞ. SAN. VE TİC. LTD. ŞTİ.",
                //"ÇAĞLI OTO KONSİNYE",
                //"ÇIBIK HAFRİYAT",
                //"ÇINAR İSG KONSİNYE",
                "ÇÖLLAV MAT",
                "ÖZGÜVEN İNŞAAT",
                "ÖZKAN ALPAY",
                "ÖZTAŞLAR İNŞAAT TAAH. VE PET. ÜRN. SAN. TİC. A.Ş",
                "ÖZYILAN HAFRİYAT - MEHMET EROL",
                "ÜLKER TAAH. PROJE İNŞ. SAN. TİC. LTD. ŞTİ.",
                "ÜNLÜLER TURİZM TİC. LTD. ŞTİ.",
                "İBRAHİM KOÇ",
                "İHSAN ATMACA",
                "İHSAN GÖN",
                "İLHAN YEREBASMAZ",
                "İLOĞLU YAPI İNŞAAT TAAHHÜT PETROL HAYVANCILIK GIDA SANAYİ VE TİCARET LİMİTED ŞİRKETİ",
                "İNOVASYON HAFRİYAT İNŞ. MALZ. LTD. ŞTİ.",
                "İSMET AKKURT",
                "İTİMAT MERMER",
                //"ŞABAN TALİP - YAĞMUR HAFRİYAT",
                "ŞABAN YILDIRIM YILDIRIM HAFRİYAT",
                "ŞAHİN ÇELİK - KIZILIRMAK NAKLİYE",
                "ŞARLI MÜHENDİSLİK",
                "ŞAŞOĞLU İNŞ. SAN. TİC. LTD. ŞTİ.",
                "ŞEHİRLİOĞLU HAFRİYAT İNŞAAT NAKLİYAT OTOMOTİV İŞ MAKİNALARI MADEN TARIM HAYV. SAN. VE TİC. LTD. ŞTİ",
                "ŞERİFE DAĞLI",
                "ŞİRİN TAŞKIRAN",

        };

        String[] alarmTurleri = {"Pasif", "Giriş Cihazı", "Cihaz Müdahele", "Kapı Açılma"};

        // Her bir firma için alarmların oluşturulması işlemi
        for (String firma : firmalar) {
            // Her bir alarm türü için işlemleri gerçekleştir
            for (String alarmTuru : alarmTurleri) {
                olusturAlarm(firma, alarmTuru);
            }
        }
    }

    public void olusturAlarm(String firmaAdi, String alarmTuru) {
        PageN2MOBIL pageN2MOBIL = new PageN2MOBIL();
        pageN2MOBIL.alarmbuttonlink.click();
        pageN2MOBIL.dropdownFırmalar.click();

        // Önceki firma adını temizle
        pageN2MOBIL.DropdownINPUT.sendKeys(Keys.CONTROL + "a");
        pageN2MOBIL.DropdownINPUT.sendKeys(Keys.DELETE);

        pageN2MOBIL.DropdownINPUT.sendKeys(firmaAdi + Keys.ENTER);
        ReusableMethods.wait(4);
        pageN2MOBIL.alarmCLICK.click();
        pageN2MOBIL.yeniAlarm.click();
        ReusableMethods.wait(1);
        pageN2MOBIL.TumunuSecDropdown.click();

        pageN2MOBIL.DropdownALARMLAR.click();
        pageN2MOBIL.DropdownALARMLAR_INPUT.sendKeys(alarmTuru + " " + Keys.ENTER);
        pageN2MOBIL.DropdownBILDIRIM.click();
        pageN2MOBIL.DropdownBILDIRIM_INPUT.sendKeys("Mobil Bildirim" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR.click();
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ramazan Korkmaz" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Ozgur Yıldırım" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Furkan Kocer" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Burak Per" + Keys.ENTER);
        pageN2MOBIL.DropdownKULLANICILAR_INPUT.sendKeys("Abdurrahman Alas" + Keys.ENTER);
        pageN2MOBIL.BOSLUGATIKLA.click();
        pageN2MOBIL.ALARM_KAYDET.click();
        pageN2MOBIL.basarılıOK.click();
        ReusableMethods.wait(8);


    }

}



