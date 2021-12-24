import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class AddCustomerTest extends login {
    Home home = new Home();
    Customer cust = new Customer();


    //blank field
    @Test
    public void TC_DA_LO1_ADDCUSTOMERBLANK() throws InterruptedException, SQLException {
        username.setText("Shantanu");
        Thread.sleep(2000);
        password.setText("shan@123");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        home.CustomersBtn.doClick();
        Thread.sleep(2000);
        cust.jButton1.doClick();
        Thread.sleep(2000);
        String QUERY = "SELECT email FROM customer";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        String mail = "";
        while(rs.next())
        {
            mail = rs.getString("email");
        }
        System.out.println(mail);
        assertFalse(mail.equals("gaurav@test.com"));
    }

    //added successfully
    @Test
    public void TC_DA_LO2_ADDCUSTOMERSUCCESSFUL() throws InterruptedException, SQLException {
        username.setText("Shantanu");
        Thread.sleep(2000);
        password.setText("shan@123");
        Thread.sleep(2000);
        LoginBtn.doClick();
        Thread.sleep(2000);
        home.CustomersBtn.doClick();
        Thread.sleep(2000);
        cust.tbCustomerName.setText("Gaurav");
        Thread.sleep(2000);
        cust.tbMobile.setText("4852158962");
        Thread.sleep(2000);
        cust.tbEmail.setText("gaurav@test.com");
        Thread.sleep(2000);
        cust.taAddress.setText("Nashik");
        Thread.sleep(2000);
        cust.jButton1.doClick();
        Thread.sleep(2000);
        String QUERY = "SELECT email FROM customer";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        String mail = "";
        while(rs.next())
        {
            mail = rs.getString("email");
        }
        System.out.println(mail);
        assertTrue(mail.equals("gaurav@test.com"));
    }


}