import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest extends login{
    Home home = new Home();

    //blank submit login
    @Test
    public void TC_DA_LO1_BLANKLOGIN() throws InterruptedException
    {
        username.setText("");
        Thread.sleep(2000);
        password.setText("");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        String actualTitle = "Incorrect Credentials!!!!";
        String expectedTitle = jLabel1.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //username blank login
    @Test
    public void TC_DA_LO2_UBLANKLOGIN() throws InterruptedException
    {
        username.setText("");
        Thread.sleep(2000);
        password.setText("shan@123");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        String actualTitle = "Incorrect Credentials!!!!";
        String expectedTitle = jLabel1.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //password blank login
    @Test
    public void TC_DA_LO3_PBLANKLOGIN() throws InterruptedException
    {
        username.setText("Shantanu");
        Thread.sleep(2000);
        password.setText("");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        String actualTitle = "Incorrect Credentials!!!!";
        String expectedTitle = jLabel1.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //both incorrect login
    @Test
    public void TC_DA_LO4_WRONGLOGIN() throws InterruptedException
    {
        username.setText("hkjahsd");
        Thread.sleep(2000);
        password.setText("user@123");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        String actualTitle = "Incorrect Credentials!!!!";
        String expectedTitle = jLabel1.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //correct login
    @Test
    public void TC_DA_LO5_CORRECTLOGIN() throws InterruptedException
    {
        username.setText("Shantanu");
        Thread.sleep(2000);
        password.setText("shan@123");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        String actualTitle = "Home";
        String expectedTitle = home.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


}