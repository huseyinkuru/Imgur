package com.imgur.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.imgur.actions.ImgurActions;
import com.imgur.utils.Utils;

public class NewPostTest {
	
	public Utils utils;
	public ImgurActions actions;
	
	@Test(priority=1)
	public void newPostTestChrome() throws IOException, AWTException, InterruptedException {
		utils = new Utils("chrome");
		actions = new ImgurActions();
		utils.setUp();
		actions.clickOnSignIn();
		actions.setUserName(Utils.getUserName());
		actions.setPassword(Utils.getPassword());
		actions.clickOnSubmit();
		actions.clickOnNewPost();
		actions.clickOnBrowse();
		actions.browseSamplePicture();
		actions.insertPostTitle(Utils.getPostTitle());
		Thread.sleep(5000L);
		actions.clickOnShareToCommunityButton();
		actions.clickOnPostPubliclyButton();
		Thread.sleep(3000L);
		System.out.println(Utils.driver.getTitle());
		String actualTitle=Utils.driver.getTitle();
		AssertJUnit.assertTrue(actualTitle.contains(Utils.getPostTitle()));
	}
	@Test(priority=2)
	public void newPostTestFirefox() throws IOException, AWTException, InterruptedException {
		utils = new Utils("firefox");
		actions = new ImgurActions();
		utils.setUp();
		actions.clickOnSignIn();
		actions.setUserName(Utils.getUserName());
		actions.setPassword(Utils.getPassword());
		actions.clickOnSubmit();
		actions.clickOnNewPost();
		actions.clickOnBrowse();
		actions.browseSamplePicture();
		actions.insertPostTitle(Utils.getPostTitle());
		Thread.sleep(5000L);
		actions.clickOnShareToCommunityButton();
		actions.clickOnPostPubliclyButton();
		Thread.sleep(3000L);
		System.out.println(Utils.driver.getTitle());
		String actualTitle=Utils.driver.getTitle();
		AssertJUnit.assertTrue(actualTitle.contains(Utils.getPostTitle()));
	}
	@AfterMethod
	public void tearUp() {
		utils.tearUp();
	}
}
