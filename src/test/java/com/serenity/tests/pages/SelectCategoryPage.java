package com.serenity.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class SelectCategoryPage extends PageObject{
	
	public void selectEnglish() {
		//getting the web element by using CSS Selector
		WebElement englishLink = getDriver().findElement(By.cssSelector("a#js-link-box-en"));
		
		//just checking the string obtained from the link
		String str = element(englishLink).getText();
		System.out.println("Text before clicking link: " + str);
		
		//performing a click function on the obtained element
		element(englishLink).click();
	}
	
	public void selectOther() {
		//getting the web element by using CSS Selector
		WebElement otherLink = getDriver().findElement(By.cssSelector("a#js-link-box-es"));
		
		//just checking the string obtained from the link
		String str = element(otherLink).getText();
		System.out.println("Text before clicking other link: " + str);
		
		//performing a click function on the obtained element
		element(otherLink).click();
	}
}
