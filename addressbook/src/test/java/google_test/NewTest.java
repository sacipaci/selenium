package google_test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://google.co.in");
	  WebElement element = driver.findElement(By.xpath("//span[text()='Google Search']"));
	  String strng = element.getText();
	  System.out.println(strng);
	  Assert.assertEquals("Google Search", strng);
  }
  //@BeforeMethod
 // public void beforeMethod() {
//	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	//  ChromeDriver driver = new ChromeDriver();
	//  driver.manage().window().maximize();
 // }

}
