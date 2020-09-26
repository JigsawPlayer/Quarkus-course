package org.acme.quarkus.sample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("_hello test! your country is Testland"));
    }


        @Test
    public void testHelloWithNameEndpoint() {
        final String name=UUID.randomUUID().toString();
        given()
          .when().get("/hello/"+name)
          .then()
             .statusCode(200)
             .body(is("Hello "  +name +",your id is 1234"));
    }

}