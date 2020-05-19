package steps;

import POJO.RatesPOJO;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class BDDStyleCode {


    private static RatesPOJO response;

    public static void executeGET(){
        given().contentType(ContentType.JSON).
                when().get(String.format("https://api.ratesapi.io/"))
                .then().assertThat().statusCode(200).and().statusLine("HTTP/1.1 200 OK").
                and().body("details",is("https://exchangeratesapi.io"));
    }
    public static void executePathParameter(Object pathParam,int statusCode){
        given().contentType(ContentType.JSON).
                with().pathParam("api",pathParam).
                when().get("https://api.ratesapi.io/api/{api}").
                then().statusCode(statusCode).and().
        body("base",containsString("EUR"));

    }
   public static void executeQueryParameter(String queryParam,Object queryParamValue){
        given().contentType(ContentType.JSON).
                with().queryParam(queryParam,queryParamValue).
                when().get("https://api.ratesapi.io/api/latest").
                then().statusCode(200).and().
                body("base",containsString("EUR"));

    }
    public static void executePathAndQueryParameter(Object pathParam,String queryParam,Object queryParamValue){
        given().contentType(ContentType.JSON).
                with().pathParam("api",pathParam).
                queryParam(queryParam,queryParamValue).
                when().get("https://api.ratesapi.io/api/{api}").
                then().statusCode(200).and().
                body("base",containsString("EUR"));

    }

}
