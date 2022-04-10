package FlipAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequest {
    @Test
    public void GetAllData(){
        RestAssured.baseURI = "https://gorest.co.in/public/v2/users";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type","Application/json");

        Response resp = httpRequest.get();
        ResponseBody respBody = resp.getBody();
        int statusCode = resp.getStatusCode();
        Assert.assertEquals(statusCode,200);
        System.out.println("Response body is "+respBody.asPrettyString());
    }

    @Test
    public void GetInactive(){
        RestAssured.baseURI = "https://gorest.co.in/public/v2/users";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type","Application/json");

        Response resp = httpRequest.get("?status=inactive");
        ResponseBody respBody = resp.getBody();
        int statusCode = resp.getStatusCode();
        Assert.assertEquals(statusCode,200);
        System.out.println("Response body is "+respBody.asPrettyString());
    }
}
