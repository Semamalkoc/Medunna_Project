package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaSettingPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03_TC_04First_Name_Bos_Bırakarak_Guncelleme_Yapamama {


    @Test
    public void First_Name_Bos_Bırakarak_Guncelleme_Yapamama  () {

        //Anasayfaya git ve kullanici girsi yap
        MedunnaSettingPage medunnaSettingPage = new MedunnaSettingPage();
        ReusableMethods.Login();

        //Settings ten First Name i bos bırak ve güncelle
        ReusableMethods.EmptyFirstName();

        // "Settings saved!" textinin göründüğünü doğrula
        Assert.assertTrue(medunnaSettingPage.nameAlert.isDisplayed());
        Driver.closeDriver();
    }
}