package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Scrollwebelement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		FirefoxProfile profile=new FirefoxProfile();
	profile.setEnableNativeEvents(true);
	driver.navigate().to("http://jqueryui.com/draggable/");
	
	//driver.navigate.to("http://jqueryui.com/draggable/");
	Thread.sleep(6000L);
	WebElement element=driver.findElement(By.xpath("//div[@id='draggable']"));
	Actions actn=new Actions(driver);
	actn.dragAndDropBy(element, 50, 50).build().perform();
	}

}
