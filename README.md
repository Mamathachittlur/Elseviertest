# Elsevier test automation task:

This project is to verify that summer dresses can be added to the cart and it’s possible to proceed to the Sign in section

## Concepts Included
*	Page Object pattern
*	Common web page interaction methods
*	Cucumber step definitions
*	Commonly used test utility classes

## Tools
*	Maven
*	Cucumber-JVM
*	JUnit
*	Selenium Webdriver

## Requirements
To utilise this project, you need to have the following installed locally:
*	Maven 3
*	Java 1.8

## Usage
* To run the test, navigate to ElsevierTest directory and run:
   `mvn clean install`
* To run test with tags
  `mvn test -Dcucumber.filter.tags="@Elseviertest"`
  `mvn test -Dcucumber.filter.tags="@<tag_name>"`
## Reporting
* After each successful run, reports will generate under /target directory 
