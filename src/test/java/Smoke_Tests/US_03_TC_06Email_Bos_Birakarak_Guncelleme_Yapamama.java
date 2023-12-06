package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaSettingPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03_TC_06Email_Bos_Birakarak_Guncelleme_Yapamama {
    @Test
    public void Email_Name_Bos_Birakarak_Guncelleme_Yapamama  () {

        //Anasayfaya git ve kullanici girsi yap
        MedunnaSettingPage medunnaSettingPage = new MedunnaSettingPage();
        ReusableMethods.Login();

        //Settings ten Email i bos bırak ve güncelle
        ReusableMethods.EmptyEmail();

        // "SBu alan bos bırakılamaz" textinin göründüğünü doğrula
        Assert.assertTrue(medunnaSettingPage.emailAlert.isDisplayed());
        Driver.closeDriver();
    }


}
