package rest;
 
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class NonBdd {
	@Test
	public void getReqBdd() {
		 
	     given().
	      baseUri("https://reqres.in/").when().get("api/users/669").prettyPrint();
	}
	@Test
	public void postReqBdd() {
		given().baseUri("https://reqres.in/")
				  .header("Content-Type","application/json")
				  .body("{\r\n"
				  		+ "    \"name\": \"Raja\",\r\n"
				  		+ "    \"job\": \"Engineer\"\r\n"
				  		+ "}").when().post("api/users").prettyPrint();
		  
	}
@Test
	public void putReqBdd() {
		given().baseUri("https://reqres.in/")
		  .header("Content-Type","application/json")
		  .body("{\r\n"
		  		+ "    \"name\": \"Ram\",\r\n"
		  		+ "    \"job\": \"Engineer\"\r\n"
		  		+ "}").when().put("api/users/669").prettyPrint();
	}
@Test
  public void delReqBdd() {
	  given().baseUri("https://reqres.in/")
	 .when().delete("api/users/669").prettyPrint();
	  
  }
@Test
    public void postFile() {
    	File jsonfile= new File("db.json");
    	given().baseUri("https://reqres.in/")
		  .header("Content-Type","application/json")
		  .body(jsonfile).when().post("api/users").prettyPrint();
    	
    }
   }
