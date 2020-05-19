package POJO;

import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.config.XmlPathConfig;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RatesPOJO implements Response {
    public RatesPOJO(String base, List<String>[] rates) {
        this.base = base;
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<String>[] getRates() {
        return rates;
    }

    public void setRates(List<String>[] rates) {
        this.rates = rates;
    }

    private String base;
    private List<String> rates[];

    public String print() {
        return null;
    }

    public String prettyPrint() {
        return null;
    }

    public Response peek() {
        return null;
    }

    public Response prettyPeek() {
        return null;
    }

    public <T> T as(Class<T> aClass) {
        return null;
    }

    public <T> T as(Class<T> aClass, ObjectMapperType objectMapperType) {
        return null;
    }

    public <T> T as(Class<T> aClass, ObjectMapper objectMapper) {
        return null;
    }

    public <T> T as(TypeRef<T> typeRef) {
        return null;
    }

    public <T> T as(Type type) {
        return null;
    }

    public <T> T as(Type type, ObjectMapperType objectMapperType) {
        return null;
    }

    public <T> T as(Type type, ObjectMapper objectMapper) {
        return null;
    }

    public JsonPath jsonPath() {
        return null;
    }

    public JsonPath jsonPath(JsonPathConfig jsonPathConfig) {
        return null;
    }

    public XmlPath xmlPath() {
        return null;
    }

    public XmlPath xmlPath(XmlPathConfig xmlPathConfig) {
        return null;
    }

    public XmlPath xmlPath(XmlPath.CompatibilityMode compatibilityMode) {
        return null;
    }

    public XmlPath htmlPath() {
        return null;
    }

    public <T> T path(String s, String... strings) {
        return null;
    }

    public String asString() {
        return null;
    }

    public byte[] asByteArray() {
        return new byte[0];
    }

    public InputStream asInputStream() {
        return null;
    }

    public Response andReturn() {
        return null;
    }

    public Response thenReturn() {
        return null;
    }

    public ResponseBody body() {
        return null;
    }

    public ResponseBody getBody() {
        return null;
    }

    public Headers headers() {
        return null;
    }

    public Headers getHeaders() {
        return null;
    }

    public String header(String s) {
        return null;
    }

    public String getHeader(String s) {
        return null;
    }

    public Map<String, String> cookies() {
        return null;
    }

    public Cookies detailedCookies() {
        return null;
    }

    public Map<String, String> getCookies() {
        return null;
    }

    public Cookies getDetailedCookies() {
        return null;
    }

    public String cookie(String s) {
        return null;
    }

    public String getCookie(String s) {
        return null;
    }

    public Cookie detailedCookie(String s) {
        return null;
    }

    public Cookie getDetailedCookie(String s) {
        return null;
    }

    public String contentType() {
        return null;
    }

    public String getContentType() {
        return null;
    }

    public String statusLine() {
        return null;
    }

    public String getStatusLine() {
        return null;
    }

    public String sessionId() {
        return null;
    }

    public String getSessionId() {
        return null;
    }

    public int statusCode() {
        return 0;
    }

    public int getStatusCode() {
        return 0;
    }

    public long time() {
        return 0;
    }

    public long timeIn(TimeUnit timeUnit) {
        return 0;
    }

    public long getTime() {
        return 0;
    }

    public long getTimeIn(TimeUnit timeUnit) {
        return 0;
    }

    public ValidatableResponse then() {
        return null;
    }
}
