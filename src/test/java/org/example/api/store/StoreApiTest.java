package org.example.api.store;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.example.model.Inventory;
import org.example.model.Order;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class StoreApiTest {
    final int id = new Random().nextInt(500);
    final int petId = new Random().nextInt(500);

    @BeforeClass
    public void prepare() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/")
                .addHeader("api_key", "APIKEY")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }

    @Test
    public void placeOrderTest() throws InterruptedException {
        Order order = new Order();
        order.setId(id);
        order.setPetId(petId);
        order.setQuantity(2);
        order.setShipDate("2021-11-09T10:49:03.494Z");
        order.setStatus("approved");
        order.setComplete(true);

        order.setComplete(true);
        given()
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);
        Order actual =
                given()
                        .pathParam("orderId", id)
                        .when()
                        .get("/store/order/{orderId}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(Order.class);
        Assert.assertEquals(actual.getId(), order.getId());
    }

    @Test(priority = 1)
    public void deleteOrderTest() throws InterruptedException {
        given()
                .pathParam("orderId", id)
                .when()
                .delete("/store/order/{orderId}")
                .then()
                .statusCode(200);
        given()
                .pathParam("orderId", id)
                .when()
                .get("/store/order/{orderId}")
                .then()
                .statusCode(404);
    }

    @Test
    public void getInventoryTest() {
        Inventory inventory = new Inventory();
        inventory.setSold2(11);
        given()
                .body(inventory)
                .when()
                .get("/store/inventory")
                .then()
                .statusCode(200)
                .extract().body().as(Inventory.class);

        Assert.assertEquals(inventory.getSold2(), 11, "Inventory не содержит статус sold=11");
    }
}