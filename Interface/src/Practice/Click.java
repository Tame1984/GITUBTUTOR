package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) {
		System.setProperty("Webdriver.gecko.driver", "C:\\TAME\\chromedriver ,,.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobutton= driver.findElement(By.xpath("//input[@value='radio']"));
	    radiobutton.click();
	    radiobutton.isSelected();
	    
	    }
	   
	}


