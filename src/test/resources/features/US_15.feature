
  Feature: US_015 The functions on the page must work properly in the KÜCÜKARAC module.
    # KÜCÜKARAC modülünde  sayfadaki islevler düzgün calismalidir

    Scenario: TC_01501 When the ADD SMALL VEHICLE button is clicked, the required
    information must be entered and it must be verified that it has been added correctly.
      # KÜCÜK ARAC EKLE butonuna tıklandıgında gerekli bilgiler
          # girildiginde dogru bir şekilde eklendigi dogrulanmalı

      Given Login to HYBS site, click the Login button and log in with your User information.
      * click the KucukAracModuleLink
      * click on the Kucuk AracIslemleri link
      * click on the Kucuk Arac Ekle button
      * Enter information about the vehicle to be added and verify that the addition has been made.

      # Given Login to HYBS site, click the Login button and log in with your User information.
      #      * click the KucukAracModuleLink
      #      * click on the Kucuk AracIslemleri link
      #      * click on the Add Small Vehicle button
      #      * Enter information about the vehicle to be added and verify that the addition has been made.



      Scenario: TC_01502 Functions should work properly when the UPDATE button is clicked

        Given Login to HYBS site, click the Login button and log in with your User information.
        * click the KucukAracModuleLink
        * click on the Kucuk AracIslemleri link
        * click on the Kucuk_AracIncelebutton
        * click on the Kucuk_AracGuncellbutton
        * It should be verified that it can be updated

      # Senaryo: TC_01602 GÜNCELLEME düğmesi tıklandığında işlevler düzgün çalışmalıdır
      #
      #        HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #        * KucukAracModuleLink'e tıklayın
      #        *Küçük Araç İşlemleri linkine tıklayın
      #        * Kucuk_AracReview butonuna tıklayın
      #        * Kucuk_AracGuncell butonuna tıklayın
      #        * Güncellenebildiği doğrulanmalıdır.


    Scenario: TC_01503 When the DOCUMENTS button is clicked and information about the document file is entered, it must be verified that the document has been added.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * click the KucukAracModuleLink
      * click on the Kucuk AracIslemleri link
      * click on the Kucuk_AracIncelebutton
      * click on the document_button
      * Document information must be entered and verified that it has been entered correctly.

      #Senaryo: TC_01503 BELGELER butonuna basılıp belge dosyasına ait bilgiler girildiğinde belgenin eklendiği doğrulanmalıdır.
      #
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * KucukAracModuleLink'e tıklayın
      #      *Küçük Araç İşlemleri linkine tıklayın
      #      *Kucuk_AracIncelebutton'a tıklayın
      #      * document_button'a tıklayın
      #      *Belge bilgileri girilmeli ve doğru girildiği doğrulanmalıdır.


    @01303
    Scenario: TC_01503  An entered document should be able to be deleted

      Given Login to HYBS site, click the Login button and log in with your User information.
      * click the KucukAracModuleLink
      * click on the Kucuk AracIslemleri link
      * click on the Kucuk_AracIncelebutton
      * click on the document_button
      * An entered document should be able to be deleted

      #DELETE BUTOONU YOK BUG VAR

    #Senaryo: TC_01503 Girilen bir belgenin silinebilmesi gerekir
    #
    #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
    #      * KucukAracModuleLink'e tıklayın
    #      *Küçük Araç İşlemleri linkine tıklayın
    #      *Kucuk_AracIncelebutton'a tıklayın
    #      * document_button'a tıklayın
    #      * Girilen bir belge silinebilmelidir

