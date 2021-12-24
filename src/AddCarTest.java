import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class AddCarTest extends login {
    Home home = new Home();
    ManageCars mc = new ManageCars();

    //add successful
    @Test
    public void TC_DA_NC1_ADDCARINFOSUCCESSFUL() throws InterruptedException, SQLException {
        username.setText("Shantanu");
        Thread.sleep(2000);
        password.setText("shan@123");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        home.AddCarBtn.doClick();
        Thread.sleep(2000);
        mc.tbCarRegNo.setText("MH12BC5050");
        Thread.sleep(2000);
        mc.tbBrand.setText("Skoda");
        Thread.sleep(2000);
        mc.tbModel.setText("Octavia");
        Thread.sleep(2000);
        mc.jButton6.doClick();
        Thread.sleep(2000);
        String QUERY = "SELECT car_reg_no FROM car";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        String cr_no = "";
        while(rs.next())
        {
             cr_no = rs.getString("car_reg_no");
        }
        System.out.println(cr_no);
        assertTrue(cr_no.equals("MH12BC5050"));
    }

}