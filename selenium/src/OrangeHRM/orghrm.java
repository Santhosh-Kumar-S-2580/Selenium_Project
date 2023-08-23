package OrangeHRM;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orghrm {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/orangehrm", "root", "ssk@2508");
		System.out.println("Connection Established");
		Statement st=con.createStatement();
	    ResultSet rs
		= st.executeQuery("select * from new_table"); // Execute query
	rs.next();
	String name= rs.getString("Username"); // Retrieve name from db
	String pwd= rs.getString("Password");
	System.out.println(name); // Print result on console
	System.out.println(pwd);
	st.close(); // close statement
	//con.close(); // close connection
	System.out.println("Connection Closed....");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys(name);
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pwd+Keys.ENTER);
	System.out.println("Successfully Logged in");
	}

}
