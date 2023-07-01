package Framework;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

public class Get_fm {

public static void main(String[] args) {
		
		String BaseURI = "https://reqres.in/";
		
		RestAssured.baseURI=BaseURI;
		int statuscode=given().config(RestAssured.config().sslConfig(
				new SSLConfig().allowAllHostnames())).header("Content-Type","application/json").body("requestBody").
				when().get("/api/users/2").then().extract().statusCode();
		System.out.println(statuscode);

	}

}