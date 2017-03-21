package com.serenity.tests.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class CurrentPage extends PageObject{
	//CurrentPage Page Object Class

	public String isPageInEnglish() {
		//getting the Web element instance by using CSS Selector
		WebElement englishText = getDriver().findElement(By.cssSelector("div#mw-content-text table table div"));
		
		//used to check the string obtained from web element
		String obtainedString = englishText.getText();
		System.out.println("String OBTAINED is: " + obtainedString);
		
		//returning the result
		return obtainedString;
	}
}



//table#mp-topbanner table div

//div#mw-content-text table table div

//div#mw-content-text table table div