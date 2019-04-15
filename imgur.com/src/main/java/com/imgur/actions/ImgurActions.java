package com.imgur.actions;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.imgur.locators.ImgurLocators;
import com.imgur.utils.Utils;

public class ImgurActions {
	ImgurLocators locators = new ImgurLocators();
	Actions actions = new Actions(Utils.getWebDriver());
	
	public void clickOnSignIn() {
		locators.getSignIn(Utils.getWebDriver()).click();
	}
	public void setUserName(String username) {
		locators.getUserName(Utils.getWebDriver()).sendKeys(username);
	}
	public void setPassword(String password) {
		locators.getPassword(Utils.getWebDriver()).sendKeys(password);
	}
	public void clickOnSubmit() {
		locators.getSignInButton(Utils.driver).click();
	}
	public void clickOnNewPost() {
		locators.getNewPostButton(Utils.driver).click();
	}
	public void clickOnBrowse() {
		locators.getBrowseButton(Utils.driver).click();
	}
	public void browseSamplePicture() throws AWTException, InterruptedException {
		StringSelection imagePath = new StringSelection(Utils.getImagePath());		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath, null);
		Utils.copyPaste();
	}
	public void insertPostTitle(String title) {
		locators.getPostTitle(Utils.driver).sendKeys(title);
	}
	public void clickOnShareToCommunityButton() {
		//locators.getShareToCommunityButton(Utils.driver).click();
		actions.moveToElement(locators.getShareToCommunityButton(Utils.driver)).click().build().perform();
	}
	public void clickOnPostPubliclyButton() {
		locators.getPostPubliclyButon(Utils.driver).click();
	}
	public void insertSearchText(String searchtext) {
		locators.getSearchBox(Utils.driver).sendKeys(searchtext+Keys.ENTER);
	}
	public String  getTitleOfFirstPost() {
		return locators.getTitleOfFirsImage(Utils.driver).getText();
	}
	public int getNumberOfResult() {
		return Integer.parseInt(locators.getNumberOfSearchResult(Utils.driver).getText());
	}
	public void clickOnModeDropDown() {
		locators.getDropDownIcon(Utils.driver).click();
	}
	public void clickOnRandomMode() {
		locators.getRandomMode(Utils.driver).click();
	}
}
