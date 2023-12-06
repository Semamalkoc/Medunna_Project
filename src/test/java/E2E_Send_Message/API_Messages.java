package E2E_Send_Message;

import base_url.MedunnaApiBaseUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.MessagePojo;


import static io.restassured.RestAssured.given;

public class API_Messages extends MedunnaApiBaseUrl{
        MessagePojo expected;
        MessagePojo actual;
        @Test
        public void Mesaj_Dogrulama() {


                // Set the URLhttps://medunna.com/api/c-messages/82162

                spec.pathParams("first", "api", "second", "c-messages", "third", 82162);
                expected=new MessagePojo(82162,"Mark","semamalkoc01@gmail.com","Hello!","How are you?");
                Response response = given(spec).when().get("{first}/{second}/{third}");
                response.prettyPrint();
                actual=response.as(MessagePojo.class);

                Assert.assertEquals(expected.getMessage(),actual.getMessage());
                Assert.assertEquals(expected.getSubject(),actual.getSubject());
                Assert.assertEquals(expected.getEmail(),actual.getEmail());
                Assert.assertEquals(expected.getName(),actual.getName());


        }



}
