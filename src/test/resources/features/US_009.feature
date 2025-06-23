
  Feature: US_009 When the user clicks on the 'Business Module/Penalty Commitment' title, the functions on the page should work properly.
    # Kullanici İsletmeModulu/CezaTaahhüt  basligina tiklanildiginda sayfadaki islevler düzgün calismalidir

    Scenario: TC_0901 When clicked on the 'Penalty Commitment' title, the corresponding page should open and be verified.
    In the penalty list, search should be possible by entering titles into the search boxes at the top."

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on CEZA_tAAHHUT_LIST
      * Perform a search using the penalty search function and verify if the search results are displayed correctly.

      # Senaryo: TC_0901 'Ceza Taahhüdü' başlığına tıklandığında ilgili sayfanın açılması ve doğrulanması gerekmektedir.
      #    Ceza listesinde üst kısımdaki arama kutularına başlıklar girilerek arama yapılabilmelidir."
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
      #      * Kullanıcı CEZA_tAAHHUT_LIST'e tıklayabilmelidir
      #      * Ceza arama fonksiyonunu kullanarak bir arama yapın ve arama sonuçlarının doğru şekilde görüntülenip görüntülenmediğini doğrulayın.


      # ??????????????????????? burda ki sıkıntı SEARCH KISMINDA FİRMA SECİYORUZ ARACI SECILEMIYOR İLGİLEN????? BUG VAR



    Scenario: TC_0902 The relevant titles should be displayed in the penalty list, and the searched penalty should
    appear based on the criteria entered in the search section

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on CEZA_tAAHHUT_LIST9
      * When searching in the penalty search, the relevant property ID should appear

       # Senaryo: TC_0902 İlgili başlıklar ceza listesinde görüntülenmeli ve aranan ceza
       #     arama bölümüne girilen kriterlere göre görünür
       #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
       #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
       #      * Kullanıcı CEZA_tAAHHUT_LIST'e tıklayabilmelidir
       #      *Ceza aramasında arama yaparken ilgili mülkün ID'si görünmelidir.



    Scenario: TC_0903 In any penalty, when the view button on the right side is clicked, images should be displayed."

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on CEZA_tAAHHUT_LIST
      * In any penalty, when the view button on the right side is clicked, images should be displayed."

           # Senaryo: TC_0903 Herhangi bir cezada sağ taraftaki görüntüle butonuna tıklandığında görsellerin görüntülenmesi gerekmektedir."
           #
           #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
           #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
           #      * Kullanıcı CEZA_tAAHHUT_LIST'e tıklayabilmelidir
           #      * Herhangi bir ceza durumunda sağ taraftaki görüntüle butonuna tıklandığında görsellerin görüntülenmesi gerekmektedir."


    Scenario: TC_0904 When the view button on the right side is clicked in any penalty, the image uploading page should be displayed, and images related to the penalty should be uploadable.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on CEZA_tAAHHUT_LIST
      * When the view button on the right side is clicked in any penalty, the image uploading page should be displayed, and images related to the penalty should be uploadable.


           # Senaryo: TC_0904 Herhangi bir cezada sağ taraftaki görüntüle butonuna basıldığında resim yükleme sayfası gelmeli ve cezaya ilişkin görseller yüklenebilir olmalıdır.
           #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
           #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
           #      * Kullanıcı CEZA_tAAHHUT_LIST'e tıklayabilmelidir
           #      * Herhangi bir cezada sağ taraftaki görüntüle butonuna basıldığında resim yükleme sayfası gelmeli, cezaya ilişkin görseller yüklenebilir olmalıdır.



    Scenario: TC_0905 In any penalty, when the UPDATE button on the right side is clicked, the information regarding the penalty should be updatable.


      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on CEZA_tAAHHUT_LIST
      * In any penalty, when the UPDATE button on the right side is clicked, the information regarding the penalty should be updatable.


          # Senaryo: TC_0905 Herhangi bir ceza durumunda sağ taraftaki GÜNCELLE butonuna basıldığında cezaya ilişkin bilgilerin güncellenebilir olması gerekmektedir.
          #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
          #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
          #      * Kullanıcı CEZA_tAAHHUT_LIST'e tıklayabilmelidir
          #      * Herhangi bir ceza durumunda sağ taraftaki GÜNCELLE butonuna basıldığında cezaya ilişkin bilgilerin güncellenebilir olması gerekmektedir.

    @US008

    Scenario: TC_0906 When the "ADD PENALTY" button located in the top right corner of the Penalty List page is clicked, a new penalty should be added smoothly.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on CEZA_tAAHHUT_LIST
      * When the ADD PENALTY button located in the top right corner of the Penalty List page is clicked, a new penalty should be added smoothly.

    # BURDA TÜM İŞLEMLERİ YAPTIM SADECE OLUSTUR BUTONUNA TIKLAMADIM TIKLANINCA GERÇEKLEŞTİRDİGİNİ TESTİNİ YAP


        # Senaryo: TC_0906 Ceza Listesi sayfasının sağ üst köşesinde yer alan "CEZA EKLE" butonuna tıklandığında yeni bir cezanın sorunsuz bir şekilde eklenmesi gerekmektedir.
        #
        #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
        #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
        #      * Kullanıcı CEZA_tAAHHUT_LIST'e tıklayabilmelidir
        #      * Ceza Listesi sayfasının sağ üst köşesinde bulunan CEZA EKLE butonuna tıklandığında yeni bir cezanın sorunsuz bir şekilde eklenmesi gerekmektedir.