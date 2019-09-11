package IBM.Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ibm.test.TestWebappPOM;

import junit.framework.Assert;

public class TestWebappTest {

	TestWebappPOM testPOM;
	WebDriver driver;
	
	
	@BeforeTest
	public  void openBrowser(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\LOA\\Chrome\\chromedriver76\\chromedriver.exe");
	
    driver=new ChromeDriver();
	
	testPOM=new TestWebappPOM(driver);
	driver.get("http://localhost:8585/TestWebapp/");
	
	}
	
	@Test
	public void loginTest(){
	testPOM.enterName("admin");
	testPOM.enterPassword("admin123");
	testPOM.login();
	Assert.assertEquals("Try again",testPOM.text());
	}
	
	
	}

