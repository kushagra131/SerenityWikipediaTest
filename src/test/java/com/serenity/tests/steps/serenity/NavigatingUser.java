package com.serenity.tests.steps.serenity;

import com.serenity.tests.pages.*;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {
	//Scenario Step Library Class
	
	WikipediaHomePage wikiHomePage;
	CategoryNavigation categoryNavigation;
	CurrentPage currentPage;
	
	@Step
	public void is_at_the_Homepage() {
		wikiHomePage.open();
	}

	@Step
	public void clicks_on_English(String language) {
		categoryNavigation.selectCategory(language);
	}
	
	@Step
	public void should_see_page_in_English(String stringTitle) {
		assertThat(currentPage.isPageInEnglish()).containsIgnoringCase(stringTitle); //isEqualToIgnoringCase(stringTitle);
	}
	
	@Step
	public void should_not_see_page_in_English(String stringTitle) {
		assertThat(currentPage.isPageInEnglish()).containsIgnoringCase(stringTitle); //isEqualToIgnoringCase(stringTitle);
	}
}
