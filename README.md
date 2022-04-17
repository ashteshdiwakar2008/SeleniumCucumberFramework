# SeleniumCucumberFramework
This project is built to execute UI automation tests using (Selenium, Cucumber, POM Design Pattern, Junit, Maven, Extent Reports) and it is BDD structured.
Completely developed version of this will be capable of driving tests in parallel using TestNG and multi threading capabilities. Remote execution of tests on Selenium Grid, Docker, BrowserStack, SauceLabs, Jenkins, etc can be acheived.

## Who can use it?
Anyone who wish to build a framework for Web UI Testing and plans to implement Behaviour Driven Development (BDD) in the project.

## Why to use this framework design?
This framework is built using all the latest and most popular libraries and with a view to create a stable framework to automate Web UI applications so that Automation ROI is actually acheived. This project is built using best possible coding practices and following industry standards be it naming conventions or package definitions.

## Objectives or Principles implemented/followed: 
1. Single Responsibility Principle
2. Page Object Model Design Pattern
3. Factory Design
4. Singleton Design
5. Clean coding practices
6. Code reuse
7. Easy maintainability

## Package structure overview: 
1. **src/main/java: **  
    - [] com.assertions : Contains a class where all common validation steps can be maintained which will be reflected in reports as well. 
    - [ ] com.constants : Contains a class which can be used to store framework level constant variables for referencing across various levels (viz, wait timeouts, etc).   
    - [ ] com.drivers : Contains classes to manage Web Driver instance and implementation for handling remote execution, parallel execution of tests for WebDriver reference.   
    - [ ] com.enums : Conatains various enums (For static value reference across project) based on requirements (viz. Browser Type, Wait type, etc.)    
    - [ ] com.pages : Contains class for each page on the web app and a Base Class for all page actions method references.  
    - [ ] com.reports : Contains class for custom Extent Report configurations. 
    - [ ] com.utilities : Contains calsses for various utility (viz. Reading Property Files data, Excel Utils, Screenshot Utils, etc.)  
    
2. **src/main/resources:**  
    - [ ] data : stores test data in excel sheets/json format 
    - [ ] config.properties : Contains project level configurations (viz. url, capture screenshot requests, browser details, etc.)    
    
3. **src/test/java:**    
    - [ ] com.hooks : Contains a class to manage application hooks i.e steps to be executed before scenario execution.  
    - [ ] com.runners : Contains class to manage test runners for various scenario based execution. 
    - [ ] com.stepdefinitions : Contains class to manage all steps as per page levels and feature file definitions. 
    
4. **src/test/resources:**    
    - [ ] features : Contains feature files per page or feature basis.
    
## How to execute the scenarios or features
1. Execute Runner files independently.
2. Execute feature files independently.

## To DO
[] Extent Reports integration.  
[] TestNG parallel execution.   
[] Log4j implementation.    
    
