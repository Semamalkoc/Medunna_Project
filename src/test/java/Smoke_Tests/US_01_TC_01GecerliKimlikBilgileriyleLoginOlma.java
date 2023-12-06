package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_01_TC_01GecerliKimlikBilgileriyleLoginOlma {
    @Test
    public void TC_01KullaniciBasariliGirisYapabilmeli() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

      //Login Ol
        ReusableMethods.Login("username","password");

        //Login olduğunu doğrula
        Assert.assertTrue(medunnaHomePage.profil.isDisplayed());
        Driver.closeDriver();

    }
}