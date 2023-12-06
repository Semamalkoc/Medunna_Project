package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaContactPage;
import pages.MedunnaHomePage;
import utilities.ReusableMethods;

public class US_04_TC_01Mesaj_Gonderme {

    @Test
    public void MesajGonderme() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaContactPage medunnaContactPage=new MedunnaContactPage();
        ReusableMethods.Contact();

        //Mesaj bilgilerini gir
        ReusableMethods.sendMessage("name","eMail","subject","message");

        //Mesajın basarılı bir şekilde iltildiğini doğrula
       Assert.assertTrue(medunnaContactPage.positiveVerify.isDisplayed());
       //Driver.closeDriver();












    }
}
