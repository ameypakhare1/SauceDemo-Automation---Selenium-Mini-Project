package saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartFunctionality {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.id("checkout")).click();

		// Checkout: Your Information

		driver.findElement(By.id("first-name")).sendKeys("Amey");

		driver.findElement(By.id("last-name")).sendKeys("Pakhare");
		driver.findElement(By.id("postal-code")).sendKeys("424242");

		// driver.findElement(By.id("react-burger-menu-btn")).click();

		// driver.findElement(By.id("logout_sidebar_link")).click();
		// System.out.println("logged out!!");
	}

}
