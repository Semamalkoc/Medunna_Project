package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_TC_03Room_Bos_Birakilarak_Oda_Olusturma {
    MedunnaRoomPage medunnaRoomPage = new MedunnaRoomPage();
    @Test
    public void Room_BosBirakilarak_Oda_Olusturma () {
        //Anasayfaya git ve login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login("username", "password");

        //"Room"  bos bırakarak oda oluştur
        ReusableMethods.EmptyRoomNumber();

        //"Room Number" altında "bos bırakılamaz" yazısının göründüğünü doğrula
        Assert.assertTrue(medunnaRoomPage.roomNumberAlert.isDisplayed());

        Driver.closeDriver();




    }
}
