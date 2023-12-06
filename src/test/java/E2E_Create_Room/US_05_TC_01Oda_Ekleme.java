package E2E_Create_Room;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_TC_01Oda_Ekleme {
    private static String roomNumber;
    MedunnaRoomPage medunnaRoomPage=new MedunnaRoomPage();

    @Test
    public void OdaEkleme() {

        //Anasayfaya git ve login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login("username","password");

        //Items&Tıtles dan "room" seç
        ReusableMethods.createRoom();

        //Başarılı bir sekilde oda oluşturulduğunu doğrula
        Assert.assertTrue(medunnaRoomPage.positiveVerify.isDisplayed());
       // Driver.closeDriver();
    }
}
