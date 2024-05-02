
  Feature: US_016 When clicking on the User Request Lists/CONSTRUCTION LICENSED WORK PROCESSES heading, the functions on the page should work properly.
    # Kullanici Talep Listeleri/YAPI RUHSATLI İŞ SÜRECLERİ basligina tiklanildiginda sayfadaki islevler düzgün calismalidir


Scenario: TC_01601 When "BUILDING LICENSED WORK PROCESSES" is clicked, information about the added building permits should be listed. When you search in searchboxes, it is checked that it is searched correctly.

  Given Login to HYBS site, click the Login button and log in with your User information.
  * click on the ısSurecleri
  * click on the yapıRuhsatliIsSurecleri
  * In building permit work processes, it must be verified that the search criteria are entered and searched.

      # Senaryo: TC_01601 "DIŞ KAZI İŞ SÜREÇLERİ" tıklandığında eklenen yapı ruhsatlarına ilişkin bilgilerin listelenmesi gerekmektedir. Arama kutularında arama yaptığınızda doğru aranıp aranmadığı kontrol edilir.
      #
      #  HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #  * ISProcesses'a tıklayın
      #  *LicensedWorkProcesses binasına tıklayın
      #  *İnşaat ruhsatı iş süreçlerinde arama kriterlerinin girilip arandığı doğrulanmalıdır.


    Scenario: TC_01602 When "BUILDING LICENSED WORK PROCESSES" is clicked, information about the added building permits should be listed. When you search in searchboxes, it is checked that it is searched correctly.
      Given Login to HYBS site, click the Login button and log in with your User information.
      * click on the ısSurecleri
      * click on the yapıRuhsatliIsSurecleri
      * It should be verified when you go to the relevant page when the View button is clicked.

      # Senaryo: TC_01602 "DIŞ KAZI İŞ SÜREÇLERİ" tıklandığında eklenen yapı ruhsatlarına ilişkin bilgilerin listelenmesi gerekmektedir. Arama kutularında arama yaptığınızda doğru aranıp aranmadığı kontrol edilir.
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * ISProcesses'a tıklayın
      #      *LicensedWorkProcesses binasına tıklayın
      #      *Görüntüle butonuna basıldığında ilgili sayfaya gittiğinizde doğrulanmalıdır.



    Scenario: TC_01603 When "EXTERNAL EXCAVATION WORK PROCESSES" is clicked, information about the added building permits should be listed. When you search in searchboxes, it is checked that it is searched correctly.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * click on the ısSurecleri
      * click on the hariciKaziIsSurecleri
      * In building permit work processes haricikazı, it must be verified that the search criteria are entered and searched.

      # HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * ISProcesses'a tıklayın
      #      * harici KazIsProcesses'e tıklayın
      #      *İnşaat ruhsatı iş süreçlerinde arama kriterlerinin girilip arandığı doğrulanmalıdır.

    @us16
    Scenario: TC_01604 When "EXTERNAL EXCAVATION WORK PROCESSES" is clicked, information about the added building permits should be listed. When you search in searchboxes, it is checked that it is searched correctly.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * click on the ısSurecleri
      * click on the hariciKaziIsSurecleri
      * It should be verified when you go to the relevant HARİCİDETAY when the View button is clicked.