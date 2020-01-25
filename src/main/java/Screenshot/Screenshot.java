package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("pass")).sendKeys("hjh");
TakesScreenshot ts=(TakesScreenshot)driver;
File sourcefile = ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(sourcefile, new File("./screenshot/facebook.png"));

System.out.println("takensourcefile");



	}

}
