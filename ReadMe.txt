Framework Project for LookingGlass Cyber Solutions
================================================

The purpose of this project is to demonstrate automation coding skills to the fine folks at LookingGlass Cyber Solutions in order to entice them to add Ali Ghafoor to their team.

Prerequisites
================================================
The following are recommended in order to run this code:

- JDK7
- Maven environment variables configured on system.
- IntelliJ IDEA 2019.2.3

Dependencies:
================================================
- Selenium-java 3.141.59
- testNG 7.0
- Surefire Plugin 3.0.0
- WebDriverManager 3.7.1 
- ExtentReports 3.1.5

How to Run
================================================
Download and run this code from the testrunner.xml file in IntelliJ. Be sure to specify whether you want the test to
run in chrome or firefox.

Since WebDriverManager dependency is used, there is no need to download or configure drivers, the library will do that
independently. Therefore this test should run in either Windows, OSx, or Linux.

Alternatively this can be run using the terminal using the following commands:

For Chrome based test:> mvn test -Dentry=chrome
For Firefox based test:> mvn test -Dentry=firefox


