package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaHomePage;
import pages.MedunnaSettingPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03_TC_07Eksik_Mail_Adresiyle_Guncelleme_Yapamama {
    @Test
    public void EksikMailAdresiyleGuncellemeYapamama () {
        MedunnaSettingPage medunnaSettingPage=new MedunnaSettingPage();
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();

        //Anasayfaya git ve "Settings" e tıkla
        ReusableMethods.Settings();
        medunnaSettingPage.emailBox.clear();
        medunnaSettingPage.emailBox.sendKeys(ConfigReader.getProperty("negEmail"));
        medunnaSettingPage.saveButton.click();

        //Eksik mail ile guncelleme yaptığını doğrula
        Assert.assertTrue(medunnaSettingPage.positiveVerify.isDisplayed());
        Driver.closeDriver();







    }
}
