# AUTOMATION HAPPYFRESH ANDRID
This is an project for Happyfresh Assessment Test - Senior QA Engineer


~~~~
# Important
Make sure you have JAVA 10 or above installed to run this test
~~~~
# Stack
1. Framework -> Cucumber
2. Scenario -> Gherkin
3. Language -> Java
4. IDE -> IntelliJ IDEA

# Equipment
1. Phone -> Emulator Google Pixel 3A and Real devices samsung s20+
2. OS -> Android 11 & 12

# How to Execute
1. Clone this project
2. Set device information in config.properties
3. Execute from maven command line
~~~~
cd {paste your local path)
mvn clean verify -Dtesting.dtd.http=true
~~~~
3. Execute from IDE
~~~~
open this project using any IDE, prefer IntelliJ IDEA
go to src/java/features
run file Login.feature or Product.feature
~~~~

# Reporting
I am using `maven-cucumber` plugin for reporting that can be appear when you execute using mvn command.
Report can see inside target folder




