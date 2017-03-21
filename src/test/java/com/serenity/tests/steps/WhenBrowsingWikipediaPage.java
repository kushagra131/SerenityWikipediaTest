package com.serenity.tests.steps;

import org.openqa.selenium.WebDriver;

import com.serenity.tests.steps.serenity.NavigatingUser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class WhenBrowsingWikipediaPage {
	// Scenario Step Definition Class
	
	@Steps
	NavigatingUser User;
	
	//injecting the driver instance into Maven by using @Managed annotation
	@Managed(driver="chrome")
	WebDriver driver;
	
	
	@Given("User goes to Wikipedia Home Page")
	public void userNavigatesToHomePage() throws Throwable{
		User.is_at_the_Homepage();
	}
	
	@When("User clicks on '(.*)'")
	public void userClicksOnEnglish(String language)throws Throwable{
		User.clicks_on_English(language);
	}
	
	@Then("User should be able to see '(.*)'")
		public void shouldSeePageInEnglish(String Title)throws Throwable{
			User.should_see_page_in_English(Title);
	}
	
	@Then("User should not see '(.*)'")
	public void shouldNotSeePageInEnglish(String Title)throws Throwable{
		User.should_not_see_page_in_English(Title);
}

}
