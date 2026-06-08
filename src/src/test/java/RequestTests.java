import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RequestTests {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://postman-echo.com/";
    }

    @Test
    @DisplayName("Get request")
    public void requestGet() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .get("get?foo1=bar1&foo2=bar2")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response()
                .body()
                .jsonPath();
    }

    @Test
    @DisplayName("Post request")
    void requestPostRawText() {
        given()
                .config(RestAssured.config().encoderConfig(
                        EncoderConfig.encoderConfig()
                                .encodeContentTypeAs("text/plain", ContentType.TEXT)
                ))
                .contentType("text/plain")
                .body("This is expected to be sent back as part response body")
                .when()
                .post("post")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part response body"));
    }

    @Test
    @DisplayName("Post form data test")
    public void requestPostFormDataTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("firstName", "Petr")
                .formParam("lastName", "Sidorov")
                .formParam("email", "mail@mail.ru")
                .formParam("age", "17")
                .formParam("city", "Pskov")
                .when()
                .post("post")
                .then()
                .log().all()
                .statusCode(200)
                .body("form.firstName", equalTo("Petr"))
                .body("form.lastName", equalTo("Sidorov"))
                .body("form.email", equalTo("mail@mail.ru"))
                .body("form.city", equalTo("Pskov"));
    }

    @Test
    @DisplayName("Put request")
    void requestPut() {
        given()
                .config(RestAssured.config().encoderConfig(
                        EncoderConfig.encoderConfig()
                                .encodeContentTypeAs("text/plain", ContentType.TEXT)
                ))
                .contentType("text/plain")
                .body("Hello")
                .when()
                .put("put")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("Hello"));
    }

    @Test
    @DisplayName("Patch request")
    void requestPatch() {
        given()
                .config(RestAssured.config().encoderConfig(
                        EncoderConfig.encoderConfig()
                                .encodeContentTypeAs("text/plain", ContentType.TEXT)
                ))
                .contentType("text/plain")
                .body("Hello")
                .when()
                .patch("patch")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("Hello"));
    }

    @Test
    @DisplayName("Delete request")
    void requestDelete() {
        given()
                .config(RestAssured.config().encoderConfig(
                        EncoderConfig.encoderConfig()
                                .encodeContentTypeAs("text/plain", ContentType.TEXT)
                ))
                .contentType("text/plain")
                .body("Hello")
                .when()
                .delete("delete")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("Hello"));
    }
}

