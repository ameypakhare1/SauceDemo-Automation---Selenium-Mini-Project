# SauceDemo Automation - Selenium Mini Project

This is a Selenium automation mini project that demonstrates basic login, add-to-cart, and checkout functionality on the [SauceDemo](https://www.saucedemo.com/) e-commerce demo site.

## Tech Stack

- **Language**: Java  
- **Automation Tool**: Selenium WebDriver  
- **Browser**: Chrome

## Project Files

- `AddToCart.java` – Logs in, adds an item to the cart, opens the menu, and logs out.
- `CartFunctionality.java` – Logs in, adds an item to the cart, navigates to the cart, and performs checkout.

## What the Scripts Do

### `AddToCart.java`
- Opens SauceDemo.
- Logs in with demo credentials.
- Adds a product to the cart.
- Logs out of the application.

### `CartFunctionality.java`
- Logs in and adds a product to the cart.
- Navigates to the cart.
- Performs a mock checkout by filling out the user's information.

## ▶How to Run

1. Install **Java** and **Selenium WebDriver**.
2. Download and set up **ChromeDriver**.
3. Add the ChromeDriver path in the code or system environment:
   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

## Compile and run the scripts:

javac AddToCart.java
java saucedemo.AddToCart

javac CartFunctionality.java
java saucedemo.CartFunctionality

## Author
Amey Pakhare
