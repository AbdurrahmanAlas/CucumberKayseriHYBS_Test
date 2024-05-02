
  Feature: US_008 When the user clicks on the 'Business Module/AdaParcel Inquiry' title, the functions on the page should work properly
    # Kullanici İsletmeModulu/AdaParselSorgulama basligina tiklanildiginda sayfadaki islevler düzgün calismalidir

    @US008
    Scenario: TC_0801 When clicked on the 'Ada Parcel Inquiry' title, the page should enable correct inquiry based on the parcel number and plot number.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on ADA-PARSEL
      * User should be able to click Search Ada-Parcel
      * When the user clicks on the business type dropdown, the required business type should be selectable.
      * Test whether the relevant parcel number and business type are correct in the search results


           #    Senaryo: TC_0801 'Ada Parsel Sorgulama' başlığına tıklandığında sayfanın parsel numarası ve parsel numarasına göre doğru sorgulama yapması gerekmektedir.
           #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
           #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
           #      * Kullanıcı ADA-PARSEL'e tıklayabilmelidir
           #      * Kullanıcı Ada-Parsel Ara butonuna basabilmelidir.
           #      * Kullanıcı işletme türü açılır menüsüne tıkladığında gerekli işletme türü seçilebilir olmalıdır.
           #      * Arama sonuçlarında ilgili parsel numarası ve işletme tipinin doğru olup olmadığını test edin