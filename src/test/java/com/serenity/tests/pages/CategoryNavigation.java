package com.serenity.tests.pages;

import net.serenitybdd.core.pages.PageObject;

public class CategoryNavigation extends PageObject{
	//CategoryNavigation Page Object Class
	
	SelectCategoryPage selectCategory;
	
	public void selectCategory(String language){
		
		String checkLang = new String(language);
		
		if(checkLang.equalsIgnoreCase("English")){
			selectCategory.selectEnglish();
		}
		else{
			selectCategory.selectOther();	
		}
	}
}
