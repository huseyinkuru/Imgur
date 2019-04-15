package com.imgur.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
	
	public static WebDriver driver;
	static Properties properties;
	static Robot robot;
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	public static String getURL() {
		System.out.println(properties.getProperty("url"));
		return properties.getProperty("url");
	}
	
	public static String getChromePath() {
		System.out.println(properties.getProperty("chromepath"));
		return properties.getProperty("chromepath");
	}
	public static String getFirefoxPath() {
		System.out.println(properties.getProperty("chromepath"));
		return properties.getProperty("firefoxpath");
	}
	public static String getPassword() {
		return properties.getProperty("password");
	}
	public static String getImagePath() {
		return properties.getProperty("imagepath");
	}
	
	public static String getUserName() {
		return properties.getProperty("username");
	}
	
	public static String getPostTitle() {
		return properties.getProperty("posttitle");
	}

	
	public Utils(String browser) throws AWTException {
		
		try {
			FileInputStream fis=new FileInputStream("/Users/huseyinkuru/Documents/Tempus/imgur.com/src/main/java/com/imgur/utils/settings.properties");;
			properties = new Properties();
			properties.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		robot = new Robot();
		
		if(browser.equals("chrome")) { 
			System.out.println(getChromePath());
			System.setProperty("webdriver.chrome.driver",getChromePath());
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.out.println(getFirefoxPath());
			System.setProperty("webdriver.gecko.driver", getFirefoxPath());
			driver = new FirefoxDriver();
		
		}
	}
	
	public void setUp() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(getURL());
	}
	public void tearUp() {
		driver.close();
	}
	
	public static void copyPaste() throws AWTException, InterruptedException {
			
			Thread.sleep(5000L);
			
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_META);
	        robot.keyPress(KeyEvent.VK_G);
	        Thread.sleep(1000L);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_META);
	        robot.keyRelease(KeyEvent.VK_G);
	        Thread.sleep(1000L);
			
	        robot.keyPress(KeyEvent.VK_META);
	        robot.keyPress(KeyEvent.VK_A);
	        robot.keyRelease(KeyEvent.VK_META);
	        robot.keyRelease(KeyEvent.VK_A);
	        
	        robot.keyPress(KeyEvent.VK_DELETE);
	        robot.keyPress(KeyEvent.VK_DELETE);
	        Thread.sleep(1000L);
	        
	        robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000L);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000L);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000L);
		
		
	}
	

}
