
# ????????????????? 2 tane BUG VAR 0701 VE 0702

  Feature: US_007 When the user clicks on the 'Business Module/VEHICLE RENTAL' button, the functions on the page should work properly."
          #Kullanici İsletmeModulu/ARAC KIRALAMA butonuna tikladiginda sayfadaki islevler düzgün calismalidir
   @arack
    Scenario: "TC_0701  When clicked on the 'Vehicle Rental' title, it should navigate to the relevant page.
    Vehicle rental operations should be performed on this page.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on VEHICLE RENTAL
      * The relevant company should be selected from the company dropdown.
      * The appropriate company and vehicle should be selectable from the list of available vehicles.


      # Senaryo: "TC_0701 'Araç Kiralama' başlığına tıklandığında ilgili sayfaya gitmesi gerekiyor.
      #    Araç kiralama işlemlerinin bu sayfa üzerinden yapılması gerekmektedir.
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
      #      * Kullanıcı ARAÇ KİRALAMA seçeneğine tıklayabilmelidir
      #      * Firma açılır menüsünden ilgili firma seçilmelidir.
      #      * Mevcut araçlar listesinden uygun firma ve araç seçilmelidir.



    Scenario: " TC_0702 When clicked on the 'Vehicle Rental' title, it should navigate to the relevant page.
     The list of rented vehicles and available vehicles should be displayed on the screen."
      #"Arac kiralama baslıgına tiklandiginda ilgili sayfaya gitmelidir.
      #*Arac kiralama islemleri bu sayfada yapilmalidir .Kiralanan arac ve Kiralanabilir araç listesi ekranda görüntülenmelidir"

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on VEHICLE RENTAL
      * The list of rented vehicles should appear when the date and company are entered in the rented vehicles list.