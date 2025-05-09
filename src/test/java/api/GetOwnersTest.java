package api;

import config.TestConfig;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;

public class GetOwnersTest {

    @Test
    public void shouldReturnListOfOwners() {
        RestAssured.baseURI = TestConfig.getApiUrl();

        given()
                .when()
                .get("/owners")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

}