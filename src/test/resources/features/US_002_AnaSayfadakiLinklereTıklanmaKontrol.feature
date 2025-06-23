

  Feature: US_002 The appearance of the Home Page, Operation Module, Demand Lists, Water and Utilities Demand List links and the passage
    to the section related to the blocked AND are detected.
  # Özellik: US_002 Ana Sayfa, Operasyon Modülü, Talep Listeleri, Su ve Tesisler Talep Listesi bağlantılarının görünümü ve engellenen AND ile ilgili bölüme geçiş tespit edilir.

    Scenario: TC_0201 The Home Page, Business Module, Request Lists, Water, and Sanitation Request Lists links should be visible and clickable.
      Given Login to HYBS site, click the Login button and log in with your User information.
      * It should be verified that the user navigates to the Home Page, Business Module, Request Lists, Water, and Sanitation Request Lists links.
      * verify that the HomePage link opens
      * verify that the BusinessModule link opens
      * verify that the RequestLists link opens
      * verify that the WaterandSanitation Request Lists link opens

            # Senaryo: TC_0201 Ana Sayfa, İş Modülü, Talep Listeleri, Su ve Temizlik Talep Listeleri bağlantıları görünür ve tıklanabilir olmalıdır.
            #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
            #      * Kullanıcının Ana Sayfa, İş Modülü, Talep Listeleri, Su ve Temizlik Talep Listeleri bağlantılarına gittiği doğrulanmalıdır.
            #      * Ana Sayfa bağlantısının açıldığını doğrulayın
            #      * BusinessModule bağlantısının açıldığını doğrulayın
            #      * RequestLists bağlantısının açıldığını doğrulayın
            #      * Su ve Sanitasyon Talep Listeleri bağlantısının açıldığını doğrulayın




    Scenario: TC_0202 Work processes, Water and KI work processes, Dump site movements, Small Vehicle should appear and the
    link should be clicked AND it should be determined that it goes to the relevant section.
      Given Login to HYBS site, click the Login button and log in with your User information.
      * Work processes, Water and KI work processes, Dump site movements, Small Tool links should be visible and clicked.
      * verify that the Work processes link opens
      * verify that the Water and KI work processes link opens
      * verify that the Small Tool link opens
      * Storage and Casting, Financial List, Reports, Vehicle Tracking System links should appear and be clicked.


            # Senaryo: TC_0202 İş süreçleri, Su ve KI iş süreçleri, Çöp sahası hareketleri, Küçük Araç görünmeli ve
            #    linke tıklanmalı VE ilgili bölüme gittiği belirlenmelidir.
            #      HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
            #      * İş süreçleri, Su ve KI iş süreçleri, Döküm sahası hareketleri, Küçük Araç bağlantıları görünür olmalı ve tıklanmalıdır.
            #      * İş süreçleri bağlantısının açıldığını doğrulayın
            #      * Su ve KI iş süreçleri bağlantısının açıldığını doğrulayın
            #      * Küçük Araç bağlantısının açıldığını doğrulayın
            #      * Depolama ve Döküm, Mali Liste, Raporlar, Araç Takip Sistemi linkleri görünüp tıklanmalıdır.


      Scenario: TC_0203 Storage and Casting, Financial List, Reports, Vehicle Tracking System links should
      appear and be clicked AND it should be determined that it moves to the relevant section.
        Given Login to HYBS site, click the Login button and log in with your User information.
        * verify that the Stoage and Casting link opens
        * verify that the Financial link opens
        * verify that the Reports opens
        * verify that the Vehicle Tracking opens

           # Senaryo: TC_0203 Depolama ve Döküm, Mali Liste, Raporlar, Araç Takip Sistemi bağlantıları
           #      görünüp tıklanmalıdır VE ilgili bölüme taşındığı belirlenmelidir.
           #        HYBS sitesine giriş yapıldıktan sonra Giriş butonuna tıklayın ve Kullanıcı bilgilerinizle giriş yapın.
           #        * Depolama ve Döküm bağlantısının açıldığını doğrulayın
           #        * Finansal bağlantının açıldığını doğrulayın
           #        * Raporların açıldığını doğrulayın
           #        * Araç Takibinin açıldığını doğrulayın