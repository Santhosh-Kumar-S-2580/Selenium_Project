package rest;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
//import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SampleGetReq {
	@Test(enabled=false)
   public void GetReq() {
	  Response res =RestAssured.get("https://simple-tool-rental-api.glitch.me/");
	int stscode= res.statusCode();
	String stsLine= res.statusLine();
	System.out.println(stscode);
	System.out.print(stsLine);
   }
   @Test(enabled=false)
public void SampleGetReqBody() { //https://rickandmortyapi.com/api/character
	//without BDD
	/*
	 * Response res =RestAssured.get("https://rickandmortyapi.com/api/character");
	 * ResponseBody resBdy=res.getBody(); System.out.println(resBdy.asString());
	 * System.out.println(resBdy.asPrettyString());
	 */
	 
	//WithBDD & Without Static Import "import static io.restassured.RestAssured.*"
	   /*RestAssured.baseURI="https://simple-tool-rental-api.glitch.me";
	   Response res1=RestAssured.given().when().get("/status");
	   System.out.println(res1.asPrettyString());*/
	   
	   
	//withBDD & with static Import "import static io.restassured.RestAssured.*"
	   RestAssured.baseURI="https://simple-tool-rental-api.glitch.me";
	    System.out.println(  RestAssured.given().when().get("/status").thenReturn().body().asPrettyString());
	 ValidatableResponse Vres=  RestAssured.given().when().get().then().statusCode(200);
	   
}
   @Test(enabled=false)
   public void GetReqNonBDD() {
	   RestAssured.baseURI="https://reqres.in/";
	  RequestSpecification resSpec= RestAssured.given();
	  Response res=resSpec.request(Method.GET,"api/users/2");
	  System.out.println(res.asPrettyString());
	  System.out.println(res.getStatusCode());
	  System.out.println(res.getStatusLine());
   }
   @Test(enabled=false)
   public void PostreqNonBDD() {
	   RestAssured.baseURI="https://reqres.in/";
		  RequestSpecification resSpec= RestAssured.given()
				  .header("Content-Type","application/json")
				  .body("{\r\n"
				  		+ "    \"name\": \"Raja\",\r\n"
				  		+ "    \"job\": \"Engineer\"\r\n"
				  		+ "}");
		  Response res=resSpec.request(Method.POST,"api/users");
		  System.out.println(res.asPrettyString());
		  System.out.println(res.getStatusCode());
		  System.out.println(res.getStatusLine());
		//result
		/*
		 * { "name": "Raja", "job": "Engineer", "id": "231", "createdAt":
		 * "2023-02-13T13:52:37.142Z" } 201 HTTP/1.1 201 Created
		 */
   }
   @Test(enabled=false)
   public void PutreqNonBDD() {
	   RestAssured.baseURI="https://reqres.in/";
		  RequestSpecification resSpec= RestAssured.given()
				  .header("Content-Type","application/json")
				  .body("{\r\n"
				  		+ "    \"name\": \"Raja\",\r\n"
				  		+ "    \"job\": \"Doctor\"\r\n"
				  		+ "}");
		  Response res=resSpec.request(Method.PUT,"api/users/2");
		  System.out.println(res.asPrettyString());
		  System.out.println(res.getStatusCode());
		  System.out.println(res.getStatusLine());
		//result
		/*
		 * { "name": "Raja", "job": "Engineer", "id": "231", "createdAt":
		 * "2023-02-13T13:52:37.142Z" } 201 HTTP/1.1 201 Created
		 */
   }
   @Test(enabled=false)
   public void deleteReqNonBDD() {
	   RestAssured.baseURI="https://reqres.in/";
		  RequestSpecification resSpec= RestAssured.given();
		  Response res=resSpec.request(Method.DELETE,"api/users/2");
		  System.out.println(res.asPrettyString());
		  System.out.println(res.getStatusCode());
		  
		  System.out.println(res.getStatusLine());
   

}}