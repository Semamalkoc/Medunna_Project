package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_01_TC_05SigninSayfasındakiButonlarınGorunurlugu {
    @Test
    public void SigninSayfasındakiButonlarınGorunurlugu() {

        //Anaysayfaya git Sign In butonuna tıkla

        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

        //Anasayfaya git "Sign in" butonuna tikla
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        medunnaHomePage.userIcon.click();
        medunnaHomePage.signInOption.click();
        ReusableMethods.bekle(5);

        //"Did you forget your password?" textinin görünürlüğünü doğrula
        Assert.assertTrue(medunnaLoginPage.helpBox1.isDisplayed());

        //"You don't have an account yet? Register a new account" textinin göründüğünü doğrula
        Assert.assertTrue(medunnaLoginPage.helpBox2.isDisplayed());

        //"Cancel" butonunun göründüğünü doğrula
        Assert.assertTrue(medunnaLoginPage.cancel.isDisplayed());
        Driver.closeDriver();



    }
}