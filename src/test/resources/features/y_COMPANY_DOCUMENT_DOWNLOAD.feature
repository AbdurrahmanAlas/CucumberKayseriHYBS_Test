
Feature: Firma Belgelerini download

  @newdownload
  Scenario: Tum firmalarin firma belgelerini ve arac belgelerini download et
    Given Login to HYBS site, click the Login button and log in with your User information.
    * User should be able to click on OPERATION MODULE
    * The user clicks on the COMPANY LIST link and goes to the relevant page, and it is tested that the information about the companies is listed."
    * click on the inspect eye icon
    * the user clicks on the COMPANY DOCUMENTS  button the user verifies that the company information update form is opened
    * The ability to downloadNEW documents from the document list should be tested.