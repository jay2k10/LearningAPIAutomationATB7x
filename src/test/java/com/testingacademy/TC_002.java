package com.testingacademy;

import io.restassured.RestAssured;

public class TC_002 {
    public static void main(String[] args) {
        System.out.println("Rest Assured Test CASE");
        System.out.println("GET Request Demo");

        // Gherkins Syntax
//        given() - url, headers, body or payload
//        when() - http methods - get, post, patch, put, delete
//        then() - verify the response - Expected Result == Actual Result
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/2170").log().all()
                .when()
                .get()
                .then().log().all()
                .statusCode(200); // <201> but was <200>.


    }
}
