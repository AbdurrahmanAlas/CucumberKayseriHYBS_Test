
  Feature: US_011 When the user clicks on the İsletmeModulu/MANUELBAKIYEDUSUMU title, the functions on the page should work properly.
    # Özellik: US_011 Kullanıcı İsletmeModulu/MANUELBAKIYEDUSUMU başlığına tıkladığında sayfadaki fonksiyonların düzgün çalışması gerekmektedir.

    @01101
    Scenario: TC_01101 When the 'Manuel Bakiye Düsümü' title is clicked, the corresponding page should open and be identified.
    At the top of the 'Manuel Bakiye Düsümü' page, balance reduction should be possible by entering the information related to the company whose balance is to be reduced.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on ManuelBakiyeDusumu
      * Test whether balance reduction can be performed by entering the necessary information in the Manual Balance Reduction section.

     # Senaryo: TC_01101 'Manuel Bakiye Düşüncesi' başlığına tıklandığında ilgili sayfanın açılması ve tanımlanması gerekmektedir.
     #    'Manuel Bakiye Düşümü' sayfasının üst kısmında bakiyesi azaltılacak firmaya ait bilgiler girilerek bakiye azaltımı mümkün olmalıdır.
     #
     #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
     #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
     #      * Kullanıcı ManuelBakiyeDusumu'na tıklayabilmelidir
     #      * Manuel Bakiye Azaltma kısmına gerekli bilgileri girerek bakiye azaltma yapılıp yapılamayacağını test edin.

   # ?????????????? BURDA API TESTİ YAPMAK GEREKİYOR API DOCUMENTATIONLARINI TALEP ETMEK GEREKLİDİR.


    @01101
    Scenario: TC_01102 When the 'Manuel Bakiye Düsümü' title is clicked, the corresponding page should open and be identified.
    At the top of the 'Manuel Bakiye Düsümü' page, balance reduction should be possible by entering the information related to the company whose balance is to be reduced.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on ManuelBakiyeDusumu
      * User Manual Balance deducted part information must be received and verified.

          # Senaryo: TC_01102 'Manuel Bakiye Düşüncesi' başlığına tıklandığında ilgili sayfanın açılması ve tanımlanması gerekmektedir.
          #    'Manuel Bakiye Düşümü' sayfasının üst kısmında bakiyesi azaltılacak firmaya ait bilgiler girilerek bakiye azaltımı mümkün olmalıdır.
          #
          #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
          #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
          #      * Kullanıcı ManuelBakiyeDusumu'na tıklayabilmelidir
          #      * Kullanım Kılavuzu Bakiye düşülen parça bilgisi alınmalı ve doğrulanmalıdır.