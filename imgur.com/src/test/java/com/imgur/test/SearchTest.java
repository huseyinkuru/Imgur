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

public class SearchTest {
	public Utils utils;
	public ImgurActions actions;
	
	@Test
	public void searchTest() throws IOException, AWTException {
		utils = new Utils("chrome");
		actions = new ImgurActions();
		utils.setUp();
		String searchtext = actions.getTitleOfFirstPost();
		actions.insertSearchText(searchtext);
		int numberOfSearchResult = actions.getNumberOfResult();
		AssertJUnit.assertTrue(numberOfSearchResult>0);
	}
	
	@Test(priority=2)
	public void searchTestFireFox() throws IOException, AWTException {
		utils = new Utils("firefox");
		actions = new ImgurActions();
		utils.setUp();
		String searchtext = actions.getTitleOfFirstPost();
		actions.insertSearchText(searchtext);
		int numberOfSearchResult = actions.getNumberOfResult();
		AssertJUnit.assertTrue(numberOfSearchResult>0);
	}
	@AfterMethod
	public void tearUp() {
		utils.tearUp();
	}

}
