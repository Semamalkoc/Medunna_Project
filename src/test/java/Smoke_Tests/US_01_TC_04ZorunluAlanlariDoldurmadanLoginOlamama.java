package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_01_TC_04ZorunluAlanlariDoldurmadanLoginOlamama {
    @Test
    public void KullaniciZorunluAlanlariDoldurmadanGirisYapamamali() {

        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

        //Anasayfaya git "Username ve "Password" alanlarini bos bırak
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        medunnaHomePage.userIcon.click();
        medunnaHomePage.signInOption.click();

        //Password alanini bos bırak uyrarı yazısının göründüğünü doğrula
        medunnaLoginPage.passwordInput.click();
        medunnaLoginPage.signInSubmitButton.click();

        //Sıgn ın e tıkla ve uyarı yazısının göründüğünü doğrula
        Assert.assertTrue(medunnaLoginPage.usernameBosBirakilamaz.isDisplayed());
        Assert.assertTrue(medunnaLoginPage.passwordBosBirakilamaz.isDisplayed());


        medunnaLoginPage.signInSubmitButton.click();
        Assert.assertTrue(medunnaLoginPage.alertLogin.isDisplayed());
        Driver.closeDriver();
    }
}