Feature: verify different GET operations for RatesAPI

  Scenario: verify RatesAPI is available
    Given Rates API
    When The API is available
    Then validate the status


  Scenario: verify Rates API for Latest Foreign Exchange rates is available
    Given Rates API for Latest Foreign Exchange rates
    When The API for Latest Foreign Exchange rates is available
    Then validate the status

  Scenario: verify Rates API for Latest Foreign Exchange rates is available
    Given Rates API for Latest Foreign Exchange rates
    When The Base is EUR for Latest Foreign Exchange rates is available
    Then validate the status

  Scenario: Rates API for Specific date Foreign Exchange rates
    Given Rates API for Specific date Foreign Exchange rates
    When The API for Specific date Foreign Exchange rates is available
    Then validate the status

  Scenario: Rates API for Future date Foreign Exchange rates
    Given Rates API for Future date Foreign Exchange rates
    When The API for Future date Foreign Exchange rates is available
    Then validate the status today vs future

  Scenario: Rates API for Specific date Foreign Exchange rates
    Given Rates API for Specific date Foreign Exchange rates
    When The Base for Specific date Foreign Exchange rates is available
    Then validate the status

  Scenario: Verify the RatesAPI invalid scenario
    Given I perform GET operation for "api"
    Then I should see the status Bad Request

