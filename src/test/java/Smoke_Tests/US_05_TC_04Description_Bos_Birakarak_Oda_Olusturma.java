package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_TC_04Description_Bos_Birakarak_Oda_Olusturma {
    MedunnaRoomPage medunnaRoomPage = new MedunnaRoomPage();
    @Test
    public void DescriptionBosBirakilabilmeli() {
        //Anasayfaya git ve login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login("username", "password");

        //"Description"" bos bırakılarak oda olusturma
        ReusableMethods.emptyDescrption();

        //Basarılı bir şekilde oda olusturuldugunu doğrula
        Assert.assertTrue(medunnaRoomPage.positiveVerify.isDisplayed());
        Driver.closeDriver();




    }
}
