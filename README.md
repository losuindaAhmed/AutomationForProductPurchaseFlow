## AutomationExercise Demo Test Automation (Java-Selenium) 
## Project Overview
This project automates login scenarios for "AutomationExercise" website using Data-Driven Testing and automates the entire product purchase lifecycle,
including adding products to the cart, proceeding to checkout, entering shipping and billing details, and completing the order.
## 🚀 Getting Started

### 🚧 Prerequisites
Before you can run this project, you must have the following software installed on your computer:

- Java Development Kit (JDK) version 11 or later
- Apache Maven
- Google Chrome web browser
- Eclipse IDE.

### 🔗 Dependencies

This project uses the following dependencies:

- Selenium Java version 4.13.0
- Webdrivermanager version 5.5.3
- TestNG version 7.7.0
- Apache POI version 5.3.0
- maven-surefire-plugin version 3.4.0
- maven-compiler-plugin version 3.13.0
- extentreports 5.1.2
  
## Installation
### Clone

- Clone this repository to your local machine using the command below:
```
	$ git clone https://github.com/losuindaAhmed/AutomationForProductPurchaseFlow.git
```
### 🌐 Application under test
**AutomationExercise Demo Website**:https://automationexercise.com/

 ### 👨🏼‍🔬Tests 
 The task is divided into 5 parts:
 - Part 1: Test Login
 - **Objective**: Verify that a valid user can successfully log into the Appliction by utilizing pre-generated
user credentials provided in the test data file (Data-Driven Approach).
 - Part 2: Select a Product and Add to Cart
- **Objective**: Select any product from the product listing page and add it to the cart.
-  Part 3: Proceed to Checkout
- **Objective**: Navigate to the cart page and proceed to the checkout process
- Part 4: Enter Shipping and Payment Information
- **Objective**:Input shipping and All payment details
 -  Part 5: Complete the Order
- **Objective** :Finalize the order by submitting the confirmation
  
  ### Execution

> Access project root

	$ cd /directory/AutomationForProductPurchaseFlow

 
 > Execute the command to run all tests in the project

```
	$ mvn clean test



