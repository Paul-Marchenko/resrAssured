package baseTests;

import baseTests.helper.EndPoint;
import org.testng.annotations.Test;

import javax.xml.ws.Endpoint;

import static io.restassured.RestAssured.given;

public class Users {

    @Test
    public void validUsers() {
       /* given().get("https://developer.twitter.com/en/docs/accounts-and-users/manage-account-settings/api-reference/get-account-settings")
                .then().statusCode(200).log().all();*/
        given().get("https://swapi.co/api/people/2").then().statusCode(200).log().all();
        /*given().get("https://api.trello.com/1/boards?")
                .then().statusCode(200).log().all();
        //30b1fe528af95379ec7a8a44a57ed057
        // token f0f2275b34069f086d870a42da068a1ba58257d5946f35043f1be4ed64822577*/

    }

    @Test(groups = "demo")
    public void validUser2() {
        given().get(EndPoint.GET_USER).then().statusCode(200).log().all();


    }
}
