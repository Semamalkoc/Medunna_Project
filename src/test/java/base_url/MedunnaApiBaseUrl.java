package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utilities.AuthenticationMedunna.generateToken;


public class MedunnaApiBaseUrl {
    protected RequestSpecification spec;
    @Before
    public void setUp(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://www.medunna.com")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + generateToken())
                .build();
    }
}
