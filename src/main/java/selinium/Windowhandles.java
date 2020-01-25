package selinium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.junit.ArrayAsserts;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		ArrayList<String>allwindows=new ArrayList<String>(handles);
				driver.switchTo().window(allwindows.get(0));
		

	}

}
