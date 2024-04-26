Feature: US_003 When the user has climbed to the company, the relevant titles should be able to display and click.
  # Kullanıcı FİRMA LİSTESİ başligina tikladiginda ilgili başlıklar görüntülenebilmeli ve tıklanabilmeli
  @tc03
  Scenario: TC_0301  When clicking on the company list, information about the company should be listed.
   # Firma listesine tıklandıgında firma ile ilgili  bilgiler listelenmelidir.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."


    # "1. Login to HYBS site, click the Login button and log in with your User
    #2.Kullanici ISLETME MODÜLÜNE tiklayabilmeli
    #3.Kullanici FİRMA LİSTESİ linkine tiklar ve ilgili sayfaya gittigi test edilir firmalar ile ilgili bilgiler listelendigi test edilir"

  Scenario: TC0302 When the group dropdown is clicked on the company list, the relevant categories should be opened
  and when clicked to the relevant category, it should be determined that the companies belonging to that category are listed

      # Firma listesinde Grup dropdownına tıklandıgında ilgili Kategoriler acılmalı
          # ve ilgili kategoriye tıklandıgında o kategoriye ait firmaların listelendigini tespit edilmelidir
    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click group dropdown
# ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
    # 22.02 persembe burda kaldım hata alıyorum dropdowna tıklamıyor
    * Verifies that category dropbox options are visible and selectable
  @tc05
    Scenario: TC0303 Passipt, blacklist, deleted, checkboxes are clicked on the relevant headings should be sorted correctly.
      #Pasife alınanlar,Kara Listeye alınanlar,Silinenler checkboxlarina tıklandıgında  ilgili baslıklar dogru şekilde sıralanmalıdır.

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * click user passive radiobutton and verify user passive list
    * click cleaning company radiobutton and verify cleaning company list
    * click black list radiobutton and black list


     Scenario: TC0304 Searchbox Lara should be listed according to the categories to be searched when you are clicking on ong by one.
        #SearchBox lara tek tek tıklandıgında arama yapılacak kategorilere göre listeleme yapılabilmelidir.

       Given Login to HYBS site, click the Login button and log in with your User information.
       * User should be able to click on OPERATION MODULE
       * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
       * When the user clicks on the SearchBoxes one by one, a listing should be made according to the categories to be searched."

       #degisiklik deneme




       Scenario: TC0304 It should be determined that it is on the new company page, and the new company should be added smoothly by entering the company information
       #


         Given Login to HYBS site, click the Login button and log in with your User information.
         * User should be able to click on OPERATION MODULE
         * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
         * click new company button
         * The system should confirm that it is on the New Company page,then enter the company information, and finally press the button to add the new company seamlessly.