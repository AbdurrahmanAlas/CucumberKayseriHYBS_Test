Feature: US_012 When the "User Request Lists/Building Permit Request" title is clicked, the functions on the page should work correctly.
       # Kullanici Talep Listeleri/YAPI RUHSAT TALEBİ basligina tiklanildiginda sayfadaki islevler düzgün calismalidir

  Scenario:TC_01201 BUILDING PERMIT REQUEST is clicked, the information related to the added building permits should be listed.
  It should be verified that the search is performed correctly in the search boxes.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * User should be able to click on BUILDING PERMIT REQUEST
    * t should be verified that the building permit request page has been opened.


      # Senaryo:TC_01201 İNŞAAT İZNİ TALEBİ tıklandığında eklenen yapı ruhsatlarına ilişkin bilgilerin listelenmesi gerekmektedir.
      #    Arama kutularında aramanın doğru şekilde yapıldığı doğrulanmalıdır.
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
      #      * Kullanıcı İNŞAAT İZNİ TALEBİ seçeneğine tıklayabilmelidir
      #      *İnşaat ruhsatı talep sayfasının açılmış olduğunun doğrulanması gerekmektedir.




  Scenario:TC_01202 BUILDING PERMIT REQUEST is clicked, the information related to the added building permits should be listed.
  It should be verified that the search is performed correctly in the search boxes.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * User should be able to click on BUILDING PERMIT REQUEST
    * User should be able to click on NEW BUILDING PERMIT REQUEST BUTTON
    * Enter the information related to the new building permit request and click on the create button.
    * Verify that the added information has arrived

      ## burda ada parsel degiştir dene oluyor

      # Senaryo:TC_01202 İNŞAAT İZNİ TALEBİ tıklandığında eklenen yapı ruhsatlarına ilişkin bilgilerin listelenmesi gerekmektedir.
      #    Arama kutularında aramanın doğru şekilde yapıldığı doğrulanmalıdır.
      #     HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * Kullanıcı İŞLEM MODÜLÜ'ne tıklayabilmelidir
      #      * Kullanıcı İNŞAAT İZNİ TALEBİ seçeneğine tıklayabilmelidir
      #      * Kullanıcı YENİ İNŞAAT İZNİ TALEP BUTONUNA basabilmelidir.
      #      * Yeni yapı ruhsatı talebine ilişkin bilgileri giriniz ve oluştur butonuna tıklayınız.
      #      * Eklenen bilgilerin ulaştığını doğrulayın


  Scenario:TC_01203 When BUILDING PERMIT REQUEST is clicked, the DEACTIVATE, DELETE, -2 buttons on the right side regarding building permits should be active.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * click  YapıRuhsatTaleb
    * User should be able to click on BUILDINGlıst
    * Click the Deactivate job button and verify
    * click the Delete job button and verify

      #Senaryo:TC_01203 İNŞAAT İZNİ TALEBİ tıklandığında yapı ruhsatlarına ilişkin sağ tarafta bulunan DEVRE DIŞI BIRAK, SİL, -2 butonlarının aktif olması gerekmektedir.
      #
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      *YapıRuhsatTaleb'e tıklayın
      #      * Kullanıcı BUILDINGlist'e tıklayabilmelidir
      #      * İşi devre dışı bırak düğmesine tıklayın ve doğrulayın
      #      * İşi sil düğmesine tıklayın ve doğrulayın


  Scenario:TC_01204 When BUILDING PERMIT REQUEST is clicked, the  APPENDIX-2 buttons on the right side regarding building permits should be active.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * click  YapıRuhsatTaleb
    * click on EK2 and verify it has arrived

      #  Senaryo:TC_01204 YAPI İZNİ TALEBİ tıklandığında yapı ruhsatlarına ilişkin sağ tarafta bulunan EK-2 butonlarının aktif olması gerekmektedir.
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      *YapıRuhsatTaleb'e tıklayın
      #      * EK2'ye tıklayın ve geldiğini doğrulayın


  Scenario:TC_01205 When BUILDING PERMIT REQUEST is clicked, the UPDATE buttons on the right side regarding building permits should be active.

    Given Login to HYBS site, click the Login button and log in with your User information.
    * click  YapıRuhsatTaleb
    * click on UPDATE and verify it has arrived

    # HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
    #    *YapıRuhsatTaleb'e tıklayın
    #    * GÜNCELLEME'ye tıklayın ve geldiğini doğrulayın









