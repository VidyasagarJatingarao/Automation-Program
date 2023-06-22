package com.getcalley.testscript;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		//Taking User Input of browser name
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browsers = sc.nextLine();
		
		//Changing the pop-up notification for Chrome
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		//Changing the pop-up notification for FireFox
		FirefoxOptions fox=new FirefoxOptions();
		fox.addArguments("--disable-notifications");
		
		// if browser is chrome it will be executed
		if(browsers.equals("chrome"))
		{
			WebDriver driver=new ChromeDriver(op);
			driver.manage().window().maximize();
			driver.get("https://www.getcalley.com/page-sitemap.xml");
	
			//click on the first link and take screenshot
			driver.findElement(By.linkText("https://www.getcalley.com/blog/")).click();
			Thread.sleep(2000);
			TakesScreenshot t=(TakesScreenshot)driver;
			File src=t.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshot/ss1.png");
			FileUtils.copyFile(src, dest);
			
			//click on the second link and take screenshot
			driver.navigate().back();
			driver.findElement(By.linkText("https://www.getcalley.com/")).click();
			File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			FileUtils.copyFile(f2, new File("./Screenshot/ss2.png"));
			
			//click on the third link and take screenshot
			driver.navigate().back();
			driver.findElement(By.linkText("https://www.getcalley.com/pricing/")).click();
			File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			FileUtils.copyFile(f3, new File("./Screenshot/ss3.png"));
			
			//click on the fourth link and take screenshot
			driver.navigate().back();
			driver.findElement(By.linkText("https://www.getcalley.com/1-usd-offer/")).click();
			File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			FileUtils.copyFile(f4, new File("./Screenshot/ss4.png"));
			
			//click on the fifth link and take screenshot
			driver.navigate().back();
			driver.findElement(By.linkText("https://www.getcalley.com/free-trial-existing-user/")).click();
			File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			FileUtils.copyFile(f5, new File("./Screenshot/ss5.png"));
			driver.close();
		}
		
		//if browser is firefox it will be executed
		if(browsers.equals("firefox"))
		{
			WebDriver driver=new FirefoxDriver(fox);
			driver.manage().window().maximize();
			driver.get("https://www.getcalley.com/page-sitemap.xml");
			
			//click on the first link and take screenshot
			driver.findElement(By.linkText("https://www.getcalley.com/blog/")).click();
			Thread.sleep(2000);
			TakesScreenshot t=(TakesScreenshot)driver;
			File src=t.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshot/ss1.png");
			FileUtils.copyFile(src, dest);
			
			//click on the second link and take screenshot
			driver.navigate().back();
			driver.findElement(By.linkText("https://www.getcalley.com/")).click();
			File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			FileUtils.copyFile(f2, new File("./Screenshot/ss2.png"));
			
			//click on the third link and take screenshot
			driver.navigate().back();
			driver.findElement(By.linkText("https://www.getcalley.com/pricing/")).click();
			File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			FileUtils.copyFile(f3, new File("./Screenshot/ss3.png"));
			
			//click on the fourth link and take screenshot
			driver.navigate().back();
			driver.findElement(By.linkText("https://www.getcalley.com/1-usd-offer/")).click();
			File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			FileUtils.copyFile(f4, new File("./Screenshot/ss4.png"));
			
			//click on the fifth link and take screenshot
			driver.navigate().back();
			driver.findElement(By.linkText("https://www.getcalley.com/free-trial-existing-user/")).click();
			File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(2000);
			FileUtils.copyFile(f5, new File("./Screenshot/ss5.png"));
			driver.close();
		}
	}

}
