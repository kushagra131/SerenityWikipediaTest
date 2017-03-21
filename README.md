# SerenityWikipediaTest
#This project is developed to automate Wikipedia. Different steps/test cases involved are:
Scenario 1 -->
1. User will go to Wikipedia Home Page
2. English language will be selected
3. Welcome to Wikipedia page should be displayed in English
Scenario 2 -->
1. User will go to Wikipedia Home Page
2. Espanol language will be selected
3. Welcome to Wikipedia page should be displayed in Espanol

Pre-requisites -->
1. Install Google Chrome.
2. Install eclipse.

How to Run on ECLIPSE -->
1. Import the project as Existing Maven Project, select Run As, select Run Configuration, select browse, select your project folder, click Ok.
2. In Goals, enter -->"clean verify serenity:aggregate -Dmaven.test.failure.ignore=true"
3. Click Run.

How to Run from CMD Line -->
1. Navigate inside the directory/folder of the test.
2. Type "mvn clean verify serenity:aggregate -Dmaven.test.failure.ignore=true"

NOTE -->
1. Chrome.exe is provided in the root folder of the project
2. Maven Dependencies to run the project are already included required to run the project
3. Feature file is present in --> /mytest/src/test/resources/features/wikiEnglishPageFeatures/wikiEnglishPageCheck.feature


