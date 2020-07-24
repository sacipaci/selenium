import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class testng_new {
	WebDriver driver;
 // @BeforeMethod
 // public void beforeMethod() {
	//  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	//  ChromeDriver driver = new ChromeDriver();
	//  driver.manage().window().maximize();
	//  driver.get("http://35.227.78.94:7080/index.php");
 // }

  @Test
  public void verify()throws Exception {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://35.227.78.94:7080/index.php");
     // driver.navigate().to("http://35.227.78.94:7080/index.php");
	  //driver.get("http://35.227.78.94:7080/index.php");
	  driver.findElement(By.xpath("//*[@id=\"About Us\"]")).click();
	  //driver.findElement(By.linkText("About Us")).click();
	  String test = driver.findElement(By.id("PID-ab2-pg")).getText();
	  //String strng = element.getText();
	  //System.out.println(strng);
	  Assert.assertEquals("This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", test);
	  System.out.println("Test Succeeded!!");
	  driver.quit();
  }
}
