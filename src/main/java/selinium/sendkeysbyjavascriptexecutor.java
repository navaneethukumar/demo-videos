package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeysbyjavascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//F:\chromedriver_win32 (1)
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("naresh");
		//driver.findElement(By.name("pass")).sendKeys(Keys.TAB);
		

		//by using java script executor
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.name("q"));
		js.executeAsyncScript("arguments[0].value='naresh'", ele);
		Thread.sleep(3000);*/
		//driver.findElement(By.id("u_0_2")).submit();
		//by using enter button
		//driver.findElement(By.id("u_0_2")).sendKeys(Keys.ENTER);
		
		
		
	}

}
