Feature: US_003 When the user has climbed to the company, the relevant titles should be able to display and click.
  # Kullanıcı FİRMA LİSTESİ başligina tikladiginda ilgili başlıklar görüntülenebilmeli ve tıklanabilmeli


  @tc03
  Scenario: TC_0301  When clicking on the company list, information about the company should be listed.
    # Senaryo: TC_0301 Firma listesine tıklandığında firmaya ait bilgilerin listelenmesi gerekmektedir.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."


          #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
          #    Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
          #    Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."



  Scenario: TC0302 When the group dropdown is clicked on the company list, the relevant categories should be opened
  and when clicked to the relevant category, it should be determined that the companies belonging to that category are listed

     # Senaryo: TC0302 Firma listesinde grup açılır menüsüne tıklandığında ilgili kategorilerin açılması gerekmektedir.
          #  ve ilgili kategoriye tıklandığında o kategoriye ait firmaların listelendiğinin belirlenmesi gerekmektedir.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click group dropdown
    * Verifies that category dropbox options are visible and selectable



          #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
          #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
          #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
          #    * grup açılır menüsüne tıklayın
          #    * Kategori dropbox seçeneklerinin görünür ve seçilebilir olduğunu doğrular




  @tc05
  Scenario: TC0303 Passipt, blacklist, deleted, checkboxes are clicked on the relevant headings should be sorted correctly.
      #Pasife alınanlar,Kara Listeye alınanlar,Silinenler checkboxlarina tıklandıgında  ilgili baslıklar dogru şekilde sıralanmalıdır.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click user passive radiobutton and verify user passive list
    * click cleaning company radiobutton and verify cleaning company list
    * click black list radiobutton and black list


         # Senaryo: TC0303 Passipt, blacklist, silinmiş, ilgili başlıklardaki onay kutuları tıklandığında doğru şekilde sıralanması gerekmektedir.
         #      #Pasife alınanlar,Kara Listeye alınanlar,Silinenler onay kutularına tıklandığında ilgili baslıklar doğru şekilde sıralanmalıdır.
         #
         #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
         #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
         #    * Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
         #    * Kullanıcı pasif radyo düğmesine tıklayın ve kullanıcı pasif listesini doğrulayın
         #    * temizlik şirketi radyo düğmesine tıklayın ve temizlik şirketi listesini doğrulayın
         #    * kara liste radyo düğmesini ve kara listeyi tıklayın






  Scenario: TC0304 Searchboxlara should be listed according to the categories to be searched when you are clicking on ong by one.
   #Senaryo: TC0304 Searchboxlara tek tek tıkladığınızda aranacak kategorilere göre listelenmesi gerekmektedir.
    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * When the user clicks on the SearchBoxes one by one, a listing should be made according to the categories to be searched."



        #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
        #    * Kullanıcı İŞLEtME MODÜLÜ'ne tıklayabilmelidir
        #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
        #    * Kullanıcı SearchBox'lara tek tek tıkladığında aranacak kategorilere göre listeleme yapılmalıdır."



  Scenario: TC0304 It should be determined that it is on the new company page, and the new company should be added smoothly by entering the company information
    # Senaryo: TC0304 Yeni şirket sayfasında olduğu belirlenmeli ve şirket bilgileri girilerek yeni şirket sorunsuz bir şekilde eklenmelidir.
    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click new company button
    * The system should confirm that it is on the New Company page,then enter the company information, and finally press the button to add the new company seamlessly.



    #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
    #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
    #    * Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
    #    * yeni şirket düğmesine tıklayın
    #    * Sistem Yeni Şirket sayfasında olduğunu doğrulamalı, ardından şirket bilgilerini girmeli ve son olarak yeni şirketi sorunsuz bir şekilde eklemek için butona basmalıdır.

  @tc03
  Scenario: TC_0305  There should be an EXCEL import button on the Company List page and all ACTIVE AND PASSIVE DELETED companies in the system should be able to be exported to Excel.
      # Senaryo: TC_0305 Firma Listesi sayfasında EXCEL içe aktarma butonu bulunmalı ve sistemdeki AKTİF VE PASİF SİLİNMİŞ tüm firmaların Excel'e aktarılabilmesi gerekmektedir.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * There should be an EXCEL import button on the Company List page and all ACTIVE AND PASSIVE DELETED companies in the system should be able to be exported to Excel.


        #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
        #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
        #    *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
        #    * Firma Listesi sayfasında EXCEL içe aktarma butonu bulunmalı ve sistemdeki AKTİF VE PASİF SİLİNMİŞ tüm firmaların Excel'e aktarılabilmesi gerekmektedir.

  @TC0306
  Scenario: TC_0306 On the Company List page, reactivate the DEACTIVATED COMPANY

    # Senaryo TC_0306 Firma Listesi sayfasında PASİFE ALINAN FİRMAYI tekrar AKTİF E getir

     Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * On the company list page, release the External radio button and verify that the company has become inactive.
    * Click the Deactivated button and reactivate the deactivated trial company.
  #  * Verify that the inactive company appears as active again in the company list.

      #    HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #    * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
      #    *Şirket listesi sayfasında Devre Dışı Bırak radyo düğmesini tıklayın ve firmanın pasif hale geldiğini doğrulayın.
      #    *Pasife Alınanlar butonuna tıklayın ve pasif hale alınan deneme firmasını tekrar aktif hale getirin.
      #    *Pasif hale alınan firmayı tekrar firma listesinde aktif olarak göründüğünü doğrulayın.