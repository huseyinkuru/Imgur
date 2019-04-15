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

public class RandomModeTest {
	public Utils utils;
	public ImgurActions actions;
	
	@Test(priority=1)
	public void randomModeTestChrome() throws IOException, AWTException, InterruptedException {
		utils = new Utils("chrome");
		actions = new ImgurActions();
		utils.setUp();
		String titleOfFirstPostOnNewestMode = actions.getTitleOfFirstPost();
		actions.clickOnModeDropDown();
		actions.clickOnRandomMode();
		Thread.sleep(5000L);
		String titleOfFirstPostOnRandomtMode = actions.getTitleOfFirstPost();
		AssertJUnit.assertFalse(titleOfFirstPostOnNewestMode.equals(titleOfFirstPostOnRandomtMode));
	}
	
	@Test(priority=2)
	public void randomModeTestFirefox() throws InterruptedException, IOException, AWTException {
		utils = new Utils("firefox");
		actions = new ImgurActions();
		utils.setUp();
		String titleOfFirstPostOnNewestMode = actions.getTitleOfFirstPost();
		actions.clickOnModeDropDown();
		actions.clickOnRandomMode();
		Thread.sleep(5000L);
		String titleOfFirstPostOnRandomtMode = actions.getTitleOfFirstPost();
		AssertJUnit.assertFalse(titleOfFirstPostOnNewestMode.equals(titleOfFirstPostOnRandomtMode));
	}
	
	@AfterMethod
	public void tearUp() {
		utils.tearUp();
	}

}
