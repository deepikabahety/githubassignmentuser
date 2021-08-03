package com.github.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.util.TestBase;

public class LoginAndSearchPage extends TestBase{
	
	//Page Factory
	//Search Text box
	@FindBy(xpath="//input[contains(@class,'search-input')]")
	WebElement searchTextBox;
	
	//first repository link
	@FindBy(xpath="//div[contains(@class,'codesearch-results')]//ul/li/div[2]/div/a")
	WebElement fistSearchedRepo;
	
	//text, if no repository exist
	@FindBy(xpath="//a[text()='search all of GitHub']")
	WebElement repoNotExist;
	
	//No of stars
	@FindBy(xpath="//a[contains(@href,'stargazers')]")
	WebElement stargazers;
	
	//Initialize page object
	public LoginAndSearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterSearchStringInTextBox(String textToEnter)
	{
		searchTextBox.sendKeys(textToEnter);
	}
	
	public void PressEnterButton()
	{
		searchTextBox.sendKeys(Keys.ENTER);
	}
	
	public String getTextOfFirstSearchedRepo()
	{
		String linkName = fistSearchedRepo.getText();
		return linkName;
	}
	
	public boolean repoNotExist()
	{
		try
		{
			boolean isDisplayed = repoNotExist.isDisplayed();
			return isDisplayed;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}

	public void ClickOnRepo()
	{
		fistSearchedRepo.click();
	}
	
	public String getNoOfStars()
	{
		String noOfStars = stargazers.getText();
		return noOfStars;
	}

}
