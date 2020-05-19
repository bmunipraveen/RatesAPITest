package utilities;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.net.URISyntaxException;

public class RestAssuredExtension {


    public static RequestSpecification Request;
    private final RequestSpecification requestSpec;


    public RestAssuredExtension() {
//        Arrange
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("https://api.ratesapi.io/");
        builder.setContentType(ContentType.JSON);
        requestSpec = builder.build();
        Request = RestAssured.given().spec(requestSpec);

    }
    public static ResponseOptions<Response> GetOps(String url) throws URISyntaxException {
       return Request.get(new URI(url));

    }


}
