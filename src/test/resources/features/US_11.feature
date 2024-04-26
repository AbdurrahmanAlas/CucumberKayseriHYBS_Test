
  Feature: US_011 When the user clicks on the İsletmeModulu/MANUELBAKIYEDUSUMU title, the functions on the page should work properly.

    @01101
    Scenario: TC_01101 When the 'Manuel Bakiye Düsümü' title is clicked, the corresponding page should open and be identified.
    At the top of the 'Manuel Bakiye Düsümü' page, balance reduction should be possible by entering the information related to the company whose balance is to be reduced.

      # Manuel Bakiye Düsümü basligina tiklanildiginda ilgili sayfa acilmali tespit edilmeli
      #*Manuel Bakiye Düsümü üst kısımda bakiye düşürülecek firmaya ait bilgiler girilerek düşüm gerçekleştirilebilmeli

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on ManuelBakiyeDusumu
      * Test whether balance reduction can be performed by entering the necessary information in the Manual Balance Reduction section.


    @01101
    Scenario: TC_01102 When the 'Manuel Bakiye Düsümü' title is clicked, the corresponding page should open and be identified.
    At the top of the 'Manuel Bakiye Düsümü' page, balance reduction should be possible by entering the information related to the company whose balance is to be reduced.

      # Manuel Bakiye Düsümü basligina tiklanildiginda ilgili sayfa acilmali tespit edilmeli
      #*Manuel Bakiye Düsümü üst kısımda bakiye düşürülecek firmaya ait bilgiler girilerek düşüm gerçekleştirilebilmeli

      Given Login to HYBS site, click the Login button and log in with your User information.
      * User should be able to click on OPERATION MODULE
      * User should be able to click on ManuelBakiyeDusumu
      * User Manual Balance deducted part information must be received and verified.