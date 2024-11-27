
  Feature: "US_005 When the user clicks on the 'Disable/Enable Module/Company List/PASIVE' (X) button, the functionalities on the page should work properly."
    # Kullanici İsletmeModulu/FirmaListesi/PASİFE AL(X) butonuna tikladiginda sayfadaki islevler düzgün calismalidir

    Scenario: TC_0501 When the 'Disable/Enable (X)' button of any company is clicked, that company should be disabled.
      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * When the 'Disable/Enable (X)' button of any company is clicked, that company should be disabled.

          # Senaryo: TC_0501 Herhangi bir şirketin 'Devre Dışı/Etkinleştir (X)' butonuna tıklandığında o şirketin devre dışı bırakılması gerekir.
          #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
          #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
          #      *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
          #      * Herhangi bir firmanın 'Devre Dışı/Etkinleştir (X)' butonuna tıklandığında o firmanın devre dışı bırakılması gerekmektedir.


      #### BURADA BUG VAR FİRMA PASİFTEN TEKRAR AKTİF HALE ALMAK İCİN BUTON BULUNMUYOR
    @tc0502
      Scenario: TC_0502 A company that has been disabled should be able to be viewed again in the ACTIVE company list."
        Given Login to HYBS site, click the Login button and log in with your User information.
        * User should be able to click on OPERATION MODULE
        * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
        * The user clicks on the disabled button
        * The 'Enable' button for the company should be displayed, and the company should be able to be sent back to the ACTIVE company list.

           # Senaryo: TC_0502 Devre dışı bırakılan bir şirketin, AKTİF şirket listesinde tekrar görünebilmesi gerekir."
           #        HYBS sitesine giriş yaptıktan sonra Giriş butonuna tıklayın ve kullanıcı bilgilerinizle giriş yapın.
           #        * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
           #        *Kullanıcı ŞİRKET LİSTESİ linkine tıklayarak ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
           #        * Kullanıcı devre dışı bırakılan düğmeye tıklar
           #        * Firmaya ait 'Etkinleştir' butonunun görüntülenmesi ve firmanın AKTİF firma listesine geri gönderilmesi gerekmektedir.


    Scenario: TC_0503 "When the 'Delete (U)' button of any company is clicked, that company should be deleted."
      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * When the 'Delete (U)' button of any company is clicked, that company should be deleted.

          # Senaryo: TC_0503 "Herhangi bir şirketin 'Sil (U)' butonuna tıklandığında o şirketin silinmesi gerekiyor."
          #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
          #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
          #      *Kullanıcı FİRMA LİSTESİ linkine tıklayıp ilgili sayfaya gider ve firmalara ait bilgilerin listelenip listelenmediği test edilir."
          #      * Herhangi bir firmaya ait 'Sil (U)' butonuna tıklandığında o firmanın silinmesi gerekmektedir.
    Scenario: TC_0504 "When the 'Delete (U)' button of any company is clicked, that company should be deleted."
      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
      * When the 'Delete (U)' button of any company is clicked, that company should be deleted.

