package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_01_TC_03Gecersiz_Password_ile_Login_Olamama {
    @Test
    public void Gecersiz_Password_ile_Login_Olamamame() {

        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

        //Hatalıpassword gir
        ReusableMethods.failLogin2("username", "password");

        //Login olmadğını doğrula
        Assert.assertTrue(medunnaLoginPage.alertLogin.isDisplayed());
        Driver.closeDriver();

    }
}
