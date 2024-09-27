

  Feature: US_001 Site login scenario with user information
    # Kullanıcı Anasayfaya giriş senaryosu

    Scenario: TC_0101 Login with Correct Username and Password
      Given Login to HYBS site, click the Login button and log in with your User information.
      * it is verified that it went to the requested page
      * close page



      #    Özellik: US_001 Kullanıcı bilgileriyle siteye giriş senaryosu
      #            Ana Sayfaya kullanıcı giriş senaryosu
      #
      #    Senaryo: TC_0101 Doğru Kullanıcı Adı ve Şifreyle Giriş Yapın
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * İstenilen sayfaya gittiği doğrulandı
      #      * sayfayı kapat
