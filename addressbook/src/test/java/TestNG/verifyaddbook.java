package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class verifyaddbook {
	
	//@BeforeMethod
	//public void launch() {
	 	
	//}
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("http://35.227.78.94:7080/index.php");
	  
	  driver.findElement(By.linkText("About Us")).click();
	  //driver.findElement(By.linkText("About Us]")).click();
	 // WebElement textDemo = driver.findElement(By.xpath("/html/body/div/header/nav/a[2]"));
	//  driver.navigate().to("/html/body/div/header/nav/a[2]");
	  
	 // String test = driver.findElement(By.id("PID-ab2-pg")).getText();
	//  Assert.assertEquals(test, 
			//	"This is about page. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. Itwas popularised in the 1960s with the release of Letraset sheets containing LoremIpsum passages, and more recently with desktop publishing software like AldusPageMaker including versions of Lorem Ipsum.");
			//	  System.out.println("Test Succeeded!!");
			//	  driver.quit()
//
  }
	  
  }
  
 // @AfterMethod
 // public void close() {
	  
 // }

