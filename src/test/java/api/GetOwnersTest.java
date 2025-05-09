package api;

import config.TestConfig;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

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