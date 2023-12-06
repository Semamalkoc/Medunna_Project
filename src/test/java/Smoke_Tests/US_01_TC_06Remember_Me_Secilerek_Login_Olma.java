package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_01_TC_06Remember_Me_Secilerek_Login_Olma {
    @Test
    public void Remember_Me_Secilerek_Login_Olma() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

        //Remember me seçerek login ol
        ReusableMethods.rememberLogin("username","password");

        //Remember me seçildiğini doğrula
        Assert.assertTrue(medunnaLoginPage.rememberMeCheckbox.isSelected());

        //Login olduğunu doğrula
        Assert.assertTrue(medunnaHomePage.profil.isDisplayed());
        Driver.closeDriver();
    }

}
