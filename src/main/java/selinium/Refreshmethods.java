package selinium;

import java.awt.Color;
import java.awt.Font;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refreshmethods {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	//String val = driver.findElement(By.id("email")).getCssValue("Font-Color");
	//System.out.println(val);
	String fbtext = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span")).getCssValue("Font-Color");
	System.out.println(fbtext);
	/*driver.navigate().refresh();
	Thread.sleep(4000);
	System.out.println(fbtext);
	driver.get("https://www.facebook.com");
	Thread.sleep(4000);
	System.out.println("get"+fbtext);
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(4000);
	System.out.println("naviget"+fbtext);
	driver.navigate().to(driver.getCurrentUrl());*/
	Thread.sleep(4000);
/*	System.out.println("refrenaviget"+fbtext);
	driver.getCurrentUrl();*/
	//Thread.sleep(4000);
	//System.out.println("getrrrefrenaviget"+fbtext);
	/*driver.findElement(By.name("email")).sendKeys(Keys.F5);
	Thread.sleep(10000);
	System.out.println("refregetrrrefrenaviget"+fbtext);*/
	
	
	//driver.navigate().to("https://www.facebook.com");
	

}}
