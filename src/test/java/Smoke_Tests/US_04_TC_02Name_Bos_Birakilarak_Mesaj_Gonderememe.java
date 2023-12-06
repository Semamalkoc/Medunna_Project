package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaContactPage;
import pages.MedunnaHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04_TC_02Name_Bos_Birakilarak_Mesaj_Gonderememe {
    @Test
    public void Name_Bos_Birakilarak_Mesaj_Gonderememe() {
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaContactPage medunnaContactPage = new MedunnaContactPage();
        ReusableMethods.Contact();

        //Name i boş bırak mesaj gönder
        ReusableMethods.EmptyName("name","eMail","subject","message");

        //Bu alan gerekli yazısının göründüğünü doğrula
        Assert.assertTrue(medunnaContactPage.nameAlert.isDisplayed());
        Driver.closeDriver();
    }
}