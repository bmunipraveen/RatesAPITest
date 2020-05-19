package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import utilities.RestAssuredExtension;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class RatesAPISteps {
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(new Date());
    public static String futureDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 5); // Adding 5 days
        String output = sdf.format(c.getTime());
        return output;
    }

    public static ResponseOptions<Response> response;

    @Given("Rates API")
    public void ratesAPI() {
        given().contentType(ContentType.JSON);
    }

    @When("The API is available")
    public void theAPIIsAvailable() {
        BDDStyleCode.executeGET();
    }

    @Then("validate the status")
    public void validateTheStatus() {

    }

    @Given("Rates API for Latest Foreign Exchange rates")
    public void ratesAPIForLatestForeignExchangeRates() {
        given().contentType(ContentType.JSON);
    }

    @When("The API for Latest Foreign Exchange rates is available")
    public void theAPIForLatestForeignExchangeRatesIsAvailable() {
        BDDStyleCode.executePathParameter("latest", 200);
    }

    @Given("Rates API for Specific date Foreign Exchange rates")
    public void ratesAPIForSpecificDateForeignExchangeRates() {
        given().contentType(ContentType.JSON);
    }

    @When("The API for Specific date Foreign Exchange rates is available")
    public void theAPIForSpecificDateForeignExchangeRatesIsAvailable() {
        BDDStyleCode.executePathParameter(date, 200);
    }

    @When("The Base is EUR for Latest Foreign Exchange rates is available")
    public void theBaseIsEURForLatestForeignExchangeRatesIsAvailable() {
        BDDStyleCode.executeQueryParameter("base", "EUR");
    }

    @When("The Base for Specific date Foreign Exchange rates is available")
    public void theBaseForSpecificDateForeignExchangeRatesIsAvailable() {
        BDDStyleCode.executePathAndQueryParameter("2020-05-19", "base", "EUR");
    }

    @Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String url) throws Throwable {
        response = RestAssuredExtension.GetOps(url);
    }

    @Then("I should see the status Bad Request")
    public void iShouldSeeTheStatusBadRequest() {
        assertThat(response.getStatusCode(), equalTo(400));
        assertThat(response.getBody().jsonPath().get("error").toString(), equalTo("time data 'api' does not match format '%Y-%m-%d'"));

    }

    @Given("Rates API for Future date Foreign Exchange rates")
    public void ratesAPIForFutureDateForeignExchangeRates() {
        given().contentType(ContentType.JSON);
    }

    @When("The API for Future date Foreign Exchange rates is available")
    public void theAPIForFutureDateForeignExchangeRatesIsAvailable() throws Throwable{
       BDDStyleCode.executePathParameter(date,200);
       BDDStyleCode.executePathParameter(futureDate(), 200);
    }

}
