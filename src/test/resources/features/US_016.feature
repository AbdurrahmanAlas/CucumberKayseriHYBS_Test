
  Feature: US_016 When clicking on the User Request Lists/CONSTRUCTION LICENSED WORK PROCESSES heading, the functions on the page should work properly.
    # Kullanici Talep Listeleri/YAPI RUHSATLI İŞ SÜRECLERİ basligina tiklanildiginda sayfadaki islevler düzgün calismalidir

    @us16
Scenario: TC_01601 When "EXTERNAL EXCAVATION WORK PROCESSES" is clicked, information about the added building permits should be listed. When you search in searchboxes, it is checked that it is searched correctly.

  Given Login to HYBS site, click the Login button and log in with your User information.
  * click on the ısSurecleri
  * click on the yapıRuhsatliIsSurecleri
  * In building permit work processes, it must be verified that the search criteria are entered and searched.
