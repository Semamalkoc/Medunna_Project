package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_TC_05Price_Kutusu_Bos_Birakilarak_Oda_Olusturulamama {

    @Test
    public void Price_Bos_Birakilarak_Oda_Olusturma () {
        MedunnaRoomPage medunnaRoomPage = new MedunnaRoomPage();

        //Anasayfaya git ve login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login("username", "password");

        //"Price"  bos bırakarak oda oluştur
        ReusableMethods.EmptyPrice();

        //"Price" altında "bos bırakılamaz" yazısının göründüğünü doğrula
        Assert.assertTrue(medunnaRoomPage.priceAlert.isDisplayed());

        Driver.closeDriver();

    }

}
