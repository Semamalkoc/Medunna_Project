package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaSettingPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03_TC_05Last_Name_Bos_Birakarak_Guncelleme_Yapamama {

    @Test
    public void Last_Name_Bos_Bırakarak_Guncelleme_Yapamama  () {

        //Anasayfaya git ve kullanici girsi yap
        MedunnaSettingPage medunnaSettingPage = new MedunnaSettingPage();
        ReusableMethods.Login();

        //Settings ten Last Name i bos bırak ve güncelle
        ReusableMethods.EmptyLastName();

        // "Bu alan bos bırakılamaz" textinin göründüğünü doğrula
        Assert.assertTrue(medunnaSettingPage.lastNameAlert.isDisplayed());
        Driver.closeDriver();
    }
}
