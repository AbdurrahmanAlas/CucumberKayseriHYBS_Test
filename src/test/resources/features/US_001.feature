

  Feature: US_001 Site login scenario with user information
    # Dogru Kullanıcı Anasayfaya giriş senaryosu

    Scenario: TC_0101 Login with Correct Username and Password
      Given Login to HYBS site, click the Login button and log in with your User information.
      * it is verified that it went to the requested page
      * close page


      # Senaryo: TC_0101 Doğru Kullanıcı Adı ve Şifreyle Giriş Yapın
      #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
      #      * İstenilen sayfaya gittiği doğrulandı
      #      * sayfayı kapat

    @tc0102
    Scenario: TC_0102 Login with Wrong Username and Password
      # Yanlıs Kullanıcı bilgileri ile anasayfaya giris senaryosu

     Given Login to HYBS site, click the Login button and log in with your Wrong User information.
      * It must be verified that the warning message has arrived


