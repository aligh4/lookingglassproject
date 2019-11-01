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
- Surefire Plugin 2.12.4
- WebDriverManager3.7.1

How to Run
================================================
Download and run this code in IntelliJ. Be sure to specify whether you want the test to
run in chrome or firefox.

In the terminal:

For Chrome based test:> mvn test -Dbrowser=chrome
For Firefox based test:> mvn test -Dbrowser=firefox

Since WebDriverManager dependency is used, there is no need to download or configure drivers, the library will do that
independently. Therefore this test should run in either Windows, OSx, or Linux.




