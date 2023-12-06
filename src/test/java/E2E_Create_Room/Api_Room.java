package E2E_Create_Room;


import base_url.MedunnaApiBaseUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.ResponseRoomPojo;

import static io.restassured.RestAssured.given;


public class Api_Room extends MedunnaApiBaseUrl {

    ResponseRoomPojo actual;
    Response response;
    ResponseRoomPojo expected;
    @Test
    public void Oda_Dogrulama() {

        // Set the URLhttps://medunna.com/api/rooms/86485

        spec.pathParams("first", "api", "second", "rooms", "third", 86485);

        expected=new ResponseRoomPojo("mark_twain","2023-12-02T18:58:47.578244Z",86485,39150,"TWIN",true,100.00,"");
       Response response = given(spec).when().get("{first}/{second}/{third}");
       response.prettyPrint();
        actual=response.as(ResponseRoomPojo.class);

       //Body yi doğrula

        Assert.assertEquals(expected.getRoomNumber(),actual.getRoomNumber());
        Assert.assertEquals(expected.getCreatedBy(),actual.getCreatedBy());
        Assert.assertEquals(expected.getId(),actual.getId());
        Assert.assertEquals(expected.getCreatedDate(),actual.getCreatedDate());
        Assert.assertEquals(expected.getRoomType(),actual.getRoomType());
        Assert.assertEquals(expected.getPrice(),actual.getPrice());
        Assert.assertEquals(expected.isStatus(),actual.isStatus());

    }

}
