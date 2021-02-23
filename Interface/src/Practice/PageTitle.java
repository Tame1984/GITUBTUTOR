package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageTitle {

	public static void main(String[] args) {
	System.setProperty("WebDriver.gecko.driver", "C:\\TAME\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	WebElement selectm = driver.findElement(By.xpath("//input[@value='radio1']"));
	Boolean selectMethod= selectm.isSelected();
	
	if(selectMethod==false)
	{
		
		System.out.println("the test is not selected");
	}
	else
	{
		
		System.out.println("default");
	}
	

	}

}
