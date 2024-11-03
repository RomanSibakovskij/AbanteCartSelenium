#Abante Cart Selenium Test Suite (Register/Login/Logout)

Simple Selenium test suite on user account registration/login/logout functionality

#Tech Requirements:
 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE


## Test Case List

1.	//Test 001 -> navigate to signup page test
2.	//Test 002 -> valid user account creation test
3.	//Test 002a -> invalid user account creation test (no first name)
4.	//Test 002b -> invalid user account creation test (no last name)
5.	//Test 002c -> invalid user account creation test (no email address)
6.	//Test 002d -> invalid user account creation test (no user address)
7.	//Test 002e -> invalid user account creation test (no user city)
8.	//Test 002f -> invalid user account creation test (no user region)
9.	//Test 002g -> invalid user account creation test (no user zip code)
10.	//Test 002h -> invalid user account creation test (no user country)
11.	//Test 002i -> invalid user account creation test (no user login name)
12.	//Test 002j -> invalid user account creation test (no user password)
13.	//Test 002k -> invalid user account creation test (no user confirm password)
14.	//Test 002l -> invalid user account creation test (too long first name)
15.	//Test 002m -> invalid user account creation test (too long last name)
16.	//Test 002n -> invalid user account creation test (invalid email address)
17.	//Test 002o -> invalid user account creation test (too short user address)
18.	//Test 002p -> invalid user account creation test (too long user address)
19.	//Test 002q -> invalid user account creation test (too short user city)
20.	//Test 002r -> invalid user account creation test (too long user city)
21.	//Test 002s -> invalid user account creation test (invalid user city region) (the account gets created)
22.	//Test 002t -> invalid user account creation test (too short user zip code)
23.	//Test 002u -> invalid user account creation test (too long user zip code) (the account gets created)
24.	//Test 002v -> invalid user account creation test (too short user login name)
25.	//Test 002w -> invalid user account creation test (too long user login name)
26.	//Test 002x -> invalid user account creation test (too short user password)
27.	//Test 002y -> invalid user account creation test (too long user password)
28.	//Test 002z -> invalid user account creation test (mismatch user confirm password)
29.	//Test 002aa -> invalid user account creation test (do not click 'privacy policy' checkbox)
30.	//Test 003 -> valid user account logout test
31.	//Test 004 -> valid user account login
32.	//Test 004a -> invalid user account login - no login name
33.	//Test 004b -> invalid user account login - no password
34.	//Test 004c -> invalid user account login - invalid login name
35.	//Test 004d -> invalid user account login - invalid password

