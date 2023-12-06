package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaContactPage;
import pages.MedunnaHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04_TC_03Eksik_Email_Adresiyle_Mesaj_Gonderememe {

    @Test
    public void EksikEmailAdresiyleMesajGonderememe() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaContactPage medunnaContactPage=new MedunnaContactPage();
        ReusableMethods.Contact();

        //Eksik mail adresiyle mesaj gönder
        ReusableMethods.negEmail("name","eMail","subject","negEmail");

        //Eksik email ile mesajın gönderildiğini doğrula
        Assert.assertTrue(medunnaContactPage.positiveVerify.isDisplayed());
        Driver.closeDriver();



    }
}
