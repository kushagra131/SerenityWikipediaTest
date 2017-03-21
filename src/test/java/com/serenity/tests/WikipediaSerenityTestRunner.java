package com.serenity.tests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

	
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/wikiEnglishPageFeatures/wikiEnglishPageCheck.feature", tags = {})

public class WikipediaSerenityTestRunner {
	//A Scenario Test Runner Class
}



