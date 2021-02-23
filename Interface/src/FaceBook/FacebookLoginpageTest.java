package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLoginpageTest {
		
		@Test
		public void Loginpage() 
		{
		System.setProperty("webdriver.chrome.driver" , "C:\\TAME\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FacebookLoginpage MoM = new FacebookLoginpage(driver);
		MoM.EmailId().sendKeys("tamiratdibaba@yahoo.com");
		MoM.password().sendKeys("0911757776");
		MoM.login().click();
		}
		
	}



