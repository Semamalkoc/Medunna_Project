package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaSettingPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03_TC_01First_Name_Guncelleme {
    @Test
    public void First_Name_Guncelleme() {

        //Anasayfaya git ve kullanici girsi yap
        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        ReusableMethods.Login();

        //Settings ten First Name güncelle
        ReusableMethods.FirstNameGuncelleme();

        // "Settings saved!" textinin göründüğünü doğrula
        Assert.assertTrue(medunnaSettingPage.positiveVerify.isDisplayed());
        Driver.closeDriver();

    }
}
