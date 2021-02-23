package FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginpage {

WebDriver driver;
public FacebookLoginpage(WebDriver driver) {
		 this.driver = driver; 
}
  
	   By username = By.id("email");
	   By password = By .id("pass");
	   By login    = By.id("u_0_b");
	   
   public WebElement EmailId()
  {
	return driver.findElement(username);
  }
   public WebElement password()
   {
 	return driver.findElement(password );
   }
   public WebElement login ()
   {
 	return driver.findElement(login );
   }

}