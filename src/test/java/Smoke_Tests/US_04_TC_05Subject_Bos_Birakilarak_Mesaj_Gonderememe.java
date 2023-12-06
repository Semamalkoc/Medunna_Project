package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaContactPage;
import pages.MedunnaHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04_TC_05Subject_Bos_Birakilarak_Mesaj_Gonderememe {
    @Test
    public void Subject_Bos_Birakilarak_Mesaj_Gonderememe() {

        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaContactPage medunnaContactPage = new MedunnaContactPage();
        ReusableMethods.Contact();

        //Subject i boş bırak ve mesaj gönder
        ReusableMethods.EmptySubject("name","eMail","subject","message");

        //"Bu alan gerekli "yazısının göründüğünü doğrula
        Assert.assertTrue(medunnaContactPage.subAlert.isDisplayed());
        Driver.closeDriver();
    }






}
