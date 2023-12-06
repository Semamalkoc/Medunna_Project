package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaContactPage;
import pages.MedunnaHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04_TC_04Email_Bos_Birakilarak_Mesaj_Gonderememe {
    @Test
    public void Email_Bos_Birakilarak_Mesaj_Gonderememe() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaContactPage medunnaContactPage = new MedunnaContactPage();
        ReusableMethods.Contact();

        //Email i boş bırak mesaj gönder
        ReusableMethods.EmptyEmail("name","eMail","subject","message");

        //"Bu alan gerekli"yazısının göründüğünü doğrula
        Assert.assertTrue(medunnaContactPage.emailAlert.isDisplayed());
        Driver.closeDriver();
    }



}
