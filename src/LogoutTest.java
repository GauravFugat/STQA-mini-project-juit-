import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogoutTest extends login {
    Home home = new Home();
    ManageCars mc = new ManageCars();

    @Test
    public void TC_DA_LO1_LOGOUTSUCCESSFUL() throws InterruptedException
    {
        username.setText("Shantanu");
        Thread.sleep(2000);
        password.setText("shan@123");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        home.AddCarBtn.doClick();
        Thread.sleep(2000);
        mc.LogoutBtn.doClick();
        Thread.sleep(2000);
        String actualTitle = "Car Rental Managment System";
        String expectedTitle = jLabel1.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}