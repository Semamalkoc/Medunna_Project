package E2E_Appointment;

import base_url.MedunnaApiBaseUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.AppointmentPojo;


import static io.restassured.RestAssured.given;

public class API_Appointment extends MedunnaApiBaseUrl {
    AppointmentPojo actual;
    AppointmentPojo expectedData;
    Response response;

    @Test
    public void Randevu_Dogrulama() {

        // Set the URL --> https://medunna.com/api/appointments/86522
        spec.pathParams("first", "api", "second", "appointments", "third", 86522);

        //Set the expected

        expectedData = new AppointmentPojo("mark_twain","2023-12-02T21:00:00Z",86522,"2023-12-02T21:00:00Z","2023-12-29T21:00:00Z","COMPLETED","","","","","");

        Response response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
        actual=response.as(AppointmentPojo.class);

        //Body yi doğrula

        Assert.assertEquals(expectedData.getCreatedBy(),actual.getCreatedBy());

        Assert.assertEquals(expectedData.getStartDate(),actual.getStartDate());
        Assert.assertEquals(expectedData.getEndDate(),actual.getEndDate());
        Assert.assertEquals(expectedData.getStatus(),actual.getStatus());





    }
}
