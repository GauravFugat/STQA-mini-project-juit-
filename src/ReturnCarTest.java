import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class ReturnCarTest extends login{
    Home home = new Home();
    ReturnCar retc = new ReturnCar();

    @Test
    public void TC_DA_REC1_RETURNCAR() throws InterruptedException, SQLException {
        username.setText("Shantanu");
        Thread.sleep(2000);
        password.setText("shan@123");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        home.ReturnCarBtn.doClick();
        Thread.sleep(2000);
        retc.tbCarId.setText("A0008");
        Thread.sleep(2000);
        retc.tbCustomerId.setText("Chinmay");
        Thread.sleep(2000);
        retc.tbDate.setText("2021-12-09");
        Thread.sleep(2000);
        retc.tbDaysLate.setText("0");
        Thread.sleep(2000);
        retc.tbFine.setText("0");
        Thread.sleep(2000);
        retc.add.doClick();
        Thread.sleep(2000);
        String QUERY = "SELECT Available, car_no FROM car";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        String available = "";
        String carid = "A0008";
        while(rs.next())
        {
            if (carid.equals(rs.getString("car_no"))) {
            available = rs.getString("Available");
        }
        }
        System.out.println(available);
        assertTrue(available.equals("Yes"));


    }
}