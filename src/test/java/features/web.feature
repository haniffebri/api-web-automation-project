Feature: Automation Testing Web Demoblaze Feature

  @web
  Scenario: Test user register with unregistered data
    Given user is on home page
    And user click menu Sign up
    And verify sign up menu pop-up will be displayed
    When user input sign up username unregistered
    And user input sign up password unregistered
    And user click sign up button
    Then verify display alert message "Sign up successful."

  @web
  Scenario: Test user register without input username
    Given user is on home page
    And user click menu Sign up
    And verify sign up menu pop-up will be displayed
    When user input sign up password unregistered
    And user click sign up button
    Then verify display alert message "Please fill out Username and Password."

  @web
  Scenario: Test user register without input password
    Given user is on home page
    And user click menu Sign up
    And verify sign up menu pop-up will be displayed
    When user input sign up username unregistered
    And user click sign up button
    Then verify display alert message "Please fill out Username and Password."

  @web
  Scenario: Test user register without input username and password
    Given user is on home page
    And user click menu Sign up
    And verify sign up menu pop-up will be displayed
    And user click sign up button
    Then verify display alert message "Please fill out Username and Password."

  @web
  Scenario: Test user register with already registered data
    Given user is on home page
    And user click menu Sign up
    And verify sign up menu pop-up will be displayed
    When user input sign up username "kucing"
    And user input sign up password "kucing"
    And user click sign up button
    Then verify display alert message "This user already exist."

  @web
  Scenario: Test user close sign up pop-up using close button
    Given user is on home page
    And user click menu Sign up
    And verify sign up menu pop-up will be displayed
    When user click close sign up button
    Then verify the sign up pop-up is not displayed

  @web
  Scenario: Test user close sign up pop-up using X button
    Given user is on home page
    And user click menu Sign up
    And verify sign up menu pop-up will be displayed
    When user click X sign up button
    Then verify the sign up pop-up is not displayed

  @web
  Scenario: Test user login with registered data
    Given user is on home page
    And user click menu log in
    And verify login menu pop-up will be displayed
    When user input log in username "kucingnjir"
    And user input log in password "kucing"
    And user click log in button
    Then validation user has been logged in "Welcome kucingnjir"

  @web
  Scenario: Test user login without input password
    Given user is on home page
    And user click menu log in
    And verify login menu pop-up will be displayed
    When user input log in username "kucingnjir"
    And user click log in button
    Then verify display alert message "Please fill out Username and Password."

  @web
  Scenario: Test user login without input username
    Given user is on home page
    And user click menu log in
    And verify login menu pop-up will be displayed
    When user input log in password "kucing"
    And user click log in button
    Then verify display alert message "Please fill out Username and Password."

  @web
  Scenario: Test user login without input username and password
    Given user is on home page
    And user click menu log in
    And verify login menu pop-up will be displayed
    And user click log in button
    Then verify display alert message "Please fill out Username and Password."

  @web
  Scenario: Test user close login pop-up using close button
    Given user is on home page
    And user click menu log in
    And verify login menu pop-up will be displayed
    And user click close login button
    Then verify the login pop-up is not displayed

  @web
  Scenario: Test user close login pop-up using X button
    Given user is on home page
    And user click menu log in
    And verify login menu pop-up will be displayed
    And user click X login button
    Then verify the login pop-up is not displayed

  @web
  Scenario: Test user logout after do login
    Given user is on home page
    And user has been logged in
    When user click menu Log out
    Then user successfully logged out

  @web
  Scenario: Test user send message on the contact pop-up
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    When user input Contact Email "kucinglucu@demo.com"
    And user input Contact Name "kucinglucu"
    And user input Message "aku lucu ga?"
    And user click button Send Message
    Then verify display alert message "Thanks for the message!!"

  @web
  Scenario: Test user send message on the contact pop-up without input name
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    When user input Contact Email "kucinglucu@demo.com"
    And user input Message "aku lucu ga?"
    And user click button Send Message
    Then verify display alert message "Thanks for the message!!"

  @web
  Scenario: Test user send message on the contact pop-up without input email
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    When user input Contact Name "kucinglucu"
    And user input Message "aku lucu ga?"
    And user click button Send Message
    Then verify display alert message "Thanks for the message!!"

  @web
  Scenario: Test user send message on the contact pop-up without input message
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    When user input Contact Email "kucinglucu@demo.com"
    And user input Contact Name "kucinglucu"
    And user click button Send Message
    Then verify display alert message "Thanks for the message!!"

  @web
  Scenario: Test user send message on the contact pop-up with input email only
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    When user input Contact Email "kucinglucu@demo.com"
    And user click button Send Message
    Then verify display alert message "Thanks for the message!!"

  @web
  Scenario: Test user send message on the contact pop-up with input name only
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    When user input Contact Name "kucinglucu"
    And user click button Send Message
    Then verify display alert message "Thanks for the message!!"

  @web
  Scenario: Test user send message on the contact pop-up with input message only
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    When user input Message "aku lucu ga?"
    And user click button Send Message
    Then verify display alert message "Thanks for the message!!"

  @web
  Scenario: Test user send message on the contact pop-up without input email, name, message
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    And user click button Send Message
    Then verify display alert message "Thanks for the message!!"

  @web
  Scenario: Test user close contact pop-up using close button
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    And user click close button
    Then verify the contact pop-up is not displayed

  @web
  Scenario: Test user close contact pop-up using X button
    Given user is on home page
    And user click menu contact
    And verify contact menu pop-up will be displayed
    And user click X contact button
    Then verify the contact pop-up is not displayed

  @web
  Scenario: Test user play video on the about us pop-up
    Given user is on home page
    And user click menu about us
    And verify about us menu pop-up will be displayed
    When user click button play video
    Then verify the video is played

  @web
  Scenario: Test user close about us pop-up using close button
    Given user is on home page
    And user click menu about us
    And verify about us menu pop-up will be displayed
    When user click close about us button
    Then verify the about us pop-up is not displayed

  @web
  Scenario: Test user close about us pop-up using X button
    Given user is on home page
    And user click menu about us
    And verify about us menu pop-up will be displayed
    When user click x about us button
    Then verify the about us pop-up is not displayed

  @web
  Scenario: Test user click Phones category
    Given user is on home page
    When user click Phones category
    Then user can see one of the products "Samsung galaxy s6"

  @web
  Scenario: Test user click Laptops category
    Given user is on home page
    When user click Laptops category
    Then user can see one of the products "Sony vaio i5"

  @web
  Scenario: Test user click Monitors category
    Given user is on home page
    When user click Monitors category
    Then user can see one of the products "Apple monitor 24"

  @web
  Scenario: Test user add item to cart
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    Then verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price

  @web
  Scenario: Test user add more than one item to cart
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user back to home page
    And user click Phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    Then verify product should be added in the cart page "Samsung galaxy s6, Nokia lumia 1520"
    And verify user can see total price

  @web
  Scenario: Test user delete item from cart
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And user click delete button for "Samsung galaxy s6"
    Then product successfully deleted from cart

  @web
  Scenario: Test user delete more than one item from cart
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user back to home page
    And user click Phones category
    And user click product "Nokia lumia 1520"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6, Nokia lumia 1520"
    And user click delete button for "Samsung galaxy s6"
    And user click delete button for "Nokia lumia 1520"
    Then product successfully deleted from cart

  @web
  Scenario: Test user do checkout the item
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user input name "hanif"
    And user input country "hanif"
    And user input city "hanif"
    And user input credit card "hanif"
    And user input month "hanif"
    And user input year "hanif"
    And user click purchase button
    Then user see the pop-up successfully order
    And user click OK button on the pop-up successfully order

  @web
  Scenario: Test user do checkout without item in cart
    Given user is on home page
    And user go to cart menu
    When user click place order button
    And verify order form pop-up will be displayed
    And user input name "hanif"
    And user input country "hanif"
    And user input city "hanif"
    And user input credit card "hanif"
    And user input month "hanif"
    And user input year "hanif"
    And user click purchase button
    Then user see the pop-up successfully order
    And user click OK button on the pop-up successfully order

  @web
  Scenario: Test user do checkout the item without input data order
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @web
  Scenario: Test user do checkout the item with input name only
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user input name "hanif"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @web
  Scenario: Test user do checkout the item with input country only
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user input country "hanif"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @web
  Scenario: Test user do checkout the item with input city only
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user input city "hanif"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @web
  Scenario: Test user do checkout the item with input credit card only
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user input credit card "hanif"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @web
  Scenario: Test user do checkout the item with input month only
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user input month "hanif"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @web
  Scenario: Test user do checkout the item with input year only
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user input year "hanif"
    And user click purchase button
    Then verify display alert message "Please fill out Name and Creditcard."

  @web
  Scenario: Test user do checkout the item with input name , credit card only
    Given user is on home page
    When user click Phones category
    And user click product "Samsung galaxy s6"
    And user click add to cart
    And verify display alert message "Product added"
    And user go to cart menu
    And verify product should be added in the cart page "Samsung galaxy s6"
    And verify user can see total price
    And user click place order button
    And verify order form pop-up will be displayed
    And user input name "hanif"
    And user input credit card "hanif"
    And user click purchase button
    Then user see the pop-up successfully order
    And user click OK button on the pop-up successfully order

  @web
  Scenario: Test user close pop-up place order using close button
    Given user is on home page
    And user go to cart menu
    And user click place order button
    And verify order form pop-up will be displayed
    When user click close place order button
    Then verify order form pop-up is not displayed

  @web
  Scenario: Test user close pop-up place order using X button
    Given user is on home page
    And user go to cart menu
    And user click place order button
    And verify order form pop-up will be displayed
    When user click X place order button
    Then verify order form pop-up is not displayed
