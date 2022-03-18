Feature: Login Functionality

Background: User is successfully launchedApplication
When user opens "webdriver.chrome.driver" browser with exe as "C:\\jan22Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver1.exe"
When user open URL as "https://www.flipkart.com"

@SmokeTest
Scenario: Login Functionality with valid Credentials
When user click on cancel button 
When user navigate on login  
When user click on MyProfile 
When user enter username as  "katoremayuri2014@gmail.com"
When user enter valid password as "Swami@2596"
When user click on login 
Then Application shows login successfully
