package Smoke_Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaAppointmentPage;
import pages.MedunnaHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02_TC_06Physician_Patient_Status_Menu_Gorunurlugu {
    @Test
    public void Physician_Patient_Status_Menu_Gorunurlugu() {



        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

        //Anasayfaya git ve Login ol
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
        ReusableMethods.Login();
        medunnaHomePage.itemsdAndTitles.click();
        medunnaHomePage.appoint.click();
        medunnaAppointmentPage.createAppoint.click();

        //Status menusunun görundugunu doğrula
        Assert.assertTrue(medunnaAppointmentPage.status.isDisplayed());

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 650);
        actions.perform();

        //Physician menusunun gorundugunu dogrula
        Assert.assertTrue(medunnaAppointmentPage.physicians.isDisplayed());

        //Patient menusunun gorundugunu dogrula
        Assert.assertTrue(medunnaAppointmentPage.patient.isDisplayed());
        Driver.closeDriver();
    }
}
