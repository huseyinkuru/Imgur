package com.imgur.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImgurLocators {
	public static WebElement element = null;
	
	public WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@class='Navbar-signin']"));
	}
	public WebElement getUserName(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
	public WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	public WebElement getSignInButton(WebDriver driver) {
		return driver.findElement(By.name("submit"));
	}
	public WebElement getNewPostButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[1]/div[2]/div[2]/a[1]"));
	}
	public WebElement getBrowseButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='upload-modal']/div[2]/div[2]/label"));
	}
	public WebElement getPostTitle(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='upload-global']/div/span[2]/div/div[1]/div/div[1]/div/div[2]/h1"));
	}
	public WebElement getShareToCommunityButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='post-options']/div/div/div[1]/div[1]/a[1]"));
	}
	public WebElement getPostPubliclyButon(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='share-modal']/div/div[2]/a[2]"));	
	}
	public WebElement getSearchBox(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[1]/div[2]/div[3]/div/form/input"));
	}
	public WebElement getTitleOfFirsImage(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[2]/div/div[1]/div[1]/a/div[3]/div[1]/span"));
	}
	public WebElement getNumberOfSearchResult(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='content']/div[1]/span[1]/i"));
	}
	public WebElement getDropDownIcon(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[1]/div[6]/div[1]/span[2]/div/div[1]/span[2]"));
	}
	public WebElement getRandomMode(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[1]/div[6]/div[1]/span[2]/div/div[2]/div[2]/div[3]"));
	}

}
