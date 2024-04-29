Feature: US_004 When the user clicks on the BusinessModule/CompanyList/REVIEW(eye) button, the functions on the page should work properly.
    #Kullanici İsletmeModulu/FirmaListesi/İNCELE(göz) butonuna tikladiginda sayfadaki islevler düzgün calismalidir


  Scenario:"TC_0401 When the REVIEW (eye) button of any company is clicked, it should be directed to the page containing the DETAILS of that company.
  Company Name and Registration number should appear."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    *  click on the inspect eye icon
    *  Company Name and Registration number must appear.

       #  Senaryo:"TC_0401 Herhangi bir firmanın İNCELE (Göz) butonu tıklandığında o firmanın DETAYLARININ bulunduğu sayfaya yönlendirilmelidir.
       #    Şirket Adı ve Sicil numarası görünmelidir."
       #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
       #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
       #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
       #    * göz inceleme simgesine tıklayın
       #    * Firma Adı ve Sicil numarası görünmelidir.





  Scenario: "TC_0402 The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible and their functions should work properly when clicked.
        # Firmaya ait BAKİYE, ATS BELGE SÜRESİ UZAT ,KARALİSTEYE AL butonlari görüntülenebilmeli ve tiklandiginda fonksiyonlari düzgün calisabilmelidir

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    *  click on the inspect eye icon
    *  The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible
    *   The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST and their functions should work properly when clicked.

             # Senaryo: "TC_0402 Firmanın BALANCE, ATS DOCUMENT EXTEND, BLACKLIST butonları görünür olmalı ve tıklandığında fonksiyonları düzgün çalışmalıdır.
             #        # Firmaya ait BAKİYE, ATS BELGE SÜRESİ UZAT ,KARALİSTEYE AL butonları görüntülenebilmeli ve tiklandigda fonksiyonlari düzgün çalıştırılabilir
             #
             #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
             #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
             #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
             #    * göz inceleme simgesine tıklayın
             #    * Firmanın BAKİYE, ATS BELGE UZATMA, KARA LİSTE butonları görünür olmalıdır.
             #    * Firmanın BAKİYE, ATS BELGE UZATMA, KARA LİSTE ve fonksiyonları tıklandığında düzgün çalışmalıdır.




  Scenario: TC_0403  Company Information, Company Personnel, Company Users, Company Documents, Vehicles, Vehicle Documents, Financial Transactions, TİB, Balance Movements, Call List,
  Construction Fill List, Penalty List, Complaint List, COMMITMENT links should be displayed and when the relevant title is clicked, it should be navigated smoothly.
        # Firmaya ait Bilgiler,Firma Personelleri,Firma Kullanicilari,Firma Belgeleri,Araclar,Arac Belgeleri ,Mali İslemler,TİB,Bakiye Hareketleri,Çagrı Listesi,
          # İnsaat Dolgu Listesi,Ceza Listesi , Şikayet Listesi,TAAHHÜTNAME linkleri görüntülenmeli ve ilgili başlığa tıklandıgında sorunsuz bir sekilde gidilmeli

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * the user clicks on Company_Information,Company_Personnel,Company_Users,Company_Documents,Vehicles,Vehicle_Documents,Financial_Transactions,TIB,Balance_Movements,Call_List,Construction_Fill_List,Penalty_List,Complaint_List,CONTRACT link


  Scenario: TC_0404  When you click on the INFORMATION and COMPANY USERS heading, the entered
  information about the company should appear. and all information MUST BE UPDATED when the Update button is clicked.
        # BİLGİLER ve FİRMA KULLANICILARİ başlıgına tiklandiginda firmaya ait girilen bilgiler gelmelidir.
          # ve Güncelle butonuna tiklandiginda bütün bilgiler GÜNCELLENEBİLMELİDİR.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * the user clicks on the "INFORMATION" link and the user verifies that the company information is correctly loaded
    * the user clicks on the "UPDATE" button the user verifies that the company information update form is opened
    * the user enters new information the user verifies that the information is updated



           # Senaryo: TC_0404 BİLGİ ve ŞİRKET KULLANICILARI başlığına tıkladığınızda girilen
           #  şirket hakkında bilgi görünmelidir. ve Güncelle düğmesine basıldığında tüm bilgilerin GÜNCELLENMESİ GEREKİR.
           #        # BİLGİLER ve FİRMA KULLANICILARI başlıgına tiklandiginda firmaya ait girilen bilgiler gelmelidir.
           #          # ve Güncelle butonu tıklandığında bütün bilgiler GÜNCELLENEBİLMELİDİR.
           #
           #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
           #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
           #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
           #    * göz inceleme simgesine tıklayın
           #    *Kullanıcı "BİLGİLER" linkine tıklar ve kullanıcı firma bilgilerinin doğru yüklendiğini doğrular
           #    * Kullanıcı "GÜNCELLEME" butonuna tıklar, kullanıcı firma bilgileri güncelleme formunun açıldığını doğrular
           #    * kullanıcı yeni bilgileri girer kullanıcı bilgilerin güncellendiğini doğrular

      #Ana sayfada "Firma Personelleri ve Firma Belgeleri" başlığına tıklayın.
      #Sayfanın "Firma Personelleri" ve "Firma Belgeleri" bölümlerinin görüntülendiğini doğrulayın.
      #Yeni bir firma personeli eklemek için "Yeni Personel Ekle" butonuna tıklayın.
      #Yeni personelin adını, soyadını, departmanını ve diğer gerekli bilgileri girin.
      #Personeli kaydetmek için "Kaydet" butonuna tıklayın.
      #Eklenen personelin sağ kısımda listelendiğini doğrulayın.
      #Yeni bir firma belgesi eklemek için "Yeni Belge Ekle" butonuna tıklayın.
      #Yeni belgenin adını, türünü, tarihini ve diğer gerekli bilgileri girin.
      #Belgeyi kaydetmek için "Kaydet" butonuna tıklayın.
      #Eklenen belgenin sağ kısımda listelendiğini doğrulayın.


  Scenario: TC_0405 When you click on the "COMPANY PERSONNEL " heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * the user clicks on the COMPANY PERSONNEL link and the user verifies that the company information is correctly loaded
    * the user enters CompanyPersonnel new information the user verifies that the information is enter


    # Senaryo: TC_0405 "ŞİRKET PERSONELİ" başlığına tıkladığınızda ilgili sayfa gelmeli ve yeni bir şirket personeli eklediğimizde sorunsuz eklenmeli ve eklenen Personel sağ tarafta listelenmelidir.
    #  "Yeni bir şirket belgesi eklediğimizde sorunsuz bir şekilde eklenmeli ve eklenen belge sağ tarafta listelenmelidir."
    #
    #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
    #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
    #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
    #    * göz inceleme simgesine tıklayın
    #    *Kullanıcı ŞİRKET PERSONELİ linkine tıklar ve kullanıcı firma bilgilerinin doğru yüklendiğini doğrular
    #    * kullanıcı Şirket Personeli yeni bilgilerini girer kullanıcı bilgilerin girildiğini doğrular




  Scenario: TC_0406 When you click on the " COMPANY DOCUMENTS" heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * the user clicks on the COMPANY DOCUMENTS  button the user verifies that the company information update form is opened
    * the user enters CompanyDocuments new information the user verifies that the information is enter


    # Senaryo: TC_0406 "ŞİRKET BELGELERİ" başlığına tıkladığınızda ilgili sayfa gelmeli ve yeni bir şirket personeli eklediğimizde sorunsuz bir şekilde eklenmeli ve eklenen Personel sağ tarafta listelenmelidir.
    #  "Yeni bir şirket belgesi eklediğimizde sorunsuz bir şekilde eklenmeli ve eklenen belge sağ tarafta listelenmelidir."
    #
    #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
    #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
    #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
    #    * göz inceleme simgesine tıklayın
    #    * Kullanıcı ŞİRKET BELGELERİ butonuna tıklar, kullanıcı şirket bilgi güncelleme formunun açıldığını doğrular
    #    * kullanıcı CompanyDocuments'a yeni bilgiler girer kullanıcı bilgilerin girildiğini doğrular

  Scenario: TC_0407 When you click on the "VEHİCLE  " heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * the user clicks on the VEHICLE link and the user verifies that the company information is correctly loaded
    * the user enters VEHICLE new information the user verifies that the information is enter

           # Senaryo: TC_0407 "ARAÇ" başlığına tıkladığınızda ilgili sayfanın gelmesi ve yeni bir firma personeli eklediğimizde sorunsuz bir şekilde eklenmesi ve eklenen Personelin sağ tarafta listelenmesi gerekmektedir.
           #  "Yeni bir şirket belgesi eklediğimizde sorunsuz bir şekilde eklenmeli ve eklenen belge sağ tarafta listelenmelidir."
           #
           #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
           #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
           #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
           #    * göz inceleme simgesine tıklayın
           #    *Kullanıcı ARAÇ linkine tıklar ve kullanıcı firma bilgilerinin doğru yüklendiğini doğrular
           #    * kullanıcı ARAÇ yeni bilgilerini girer kullanıcı bilgilerin girildiğini doğrular


  @tc07
  Scenario: TC_0408 When you click on the "VEHİCLEDOCUMENT " heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * the user clicks on the VEHICLEDOCUMENT link and the user verifies that the company information is correctly loaded
    * the user enters VEHICLEDOCUMENT new information the user verifies that the information is enter


  Scenario: TC_0409 When you click on the "FINANCIAL TRANSACTIONS " heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * you click on the FINANCIAL TRANSACTIONS heading, the relevant page should appear and BALANCE LOADING,BALANCE DECLINE,PAYMENT CONTROL,CREATING A TRANSPORT PERMIT CERTIFICATE,TRANSPORT PERMIT RENEWAL"The buttons must be clickable and these titles must work without any problems."


  Scenario: TC_0410 When you click on the "TIB " heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * clicked on the TIB header, the relevant page should appear, and the ATS APPROVAL CODE should be entered."



  Scenario: TC_0411 When you click on the "BALANCE TRANSACTIONS " heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
   * When clicked on the BALANCE TRANSACTIONS header, the relevant page should appear. Users should be able to perform queries smoothly using the Search box and checkboxes

  Scenario: TC_0412 When you click on the "CALL LIST, CONSTRUCTION FILLER LIST, PENALTY LIST, COMPLAINT LIST, " heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * When you click on the CALL LIST, CONSTRUCTION FILLER LIST, PENALTY LIST, COMPLAINT LIST, the relevant page should appear. and querying can be done without any problems with Searchbox and checkboxes.
@ye
  Scenario: TC_0413 When you click on the "TAAHHUTNAME " heading, the relevant page should appear and when we add a new company personnel, it should be added without any problems and the added Personnel should be listed on the right.
  "When we add a new company document, it should be added without any problems and the added document should be listed on the right."

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * verify TAAHHUTNAME page