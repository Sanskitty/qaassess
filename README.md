# Web Automation on SauceDemo Website with Selenium TestNG

## Technology used:
- Selenium Webdriver
- TestNG Framework
- Java
- Maven
- Intellij idea/VSCode
- ExtentReports

## How to run this project

- Clone this project
- Hit the following command into the terminal:
 ```mvn clean test```
  mvn test - to run the execution of tests using pom.xml 

## Scenerio:

- Login into SauceDemo site: https://www.saucedemo.com/
- Add a few username and passwords 
- Land on Product page and select item

## Test case check list based on the Scenerio:

- Customer Login with valid credentials.
- Customer login with locked_out-invalid credentials.
- Customer Login with performance_glitch-slowresponse credentials. 
- ItemNumberSelected on productpage
  
