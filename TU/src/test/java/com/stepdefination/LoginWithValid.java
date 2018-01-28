package com.stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginWithValid {
	public static WebDriver driver;

	@Given("^I am in Home page$")
	public void i_am_in_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tuclothing.sainsburys.co.uk");
	}

	@When("^I Select on Login Link$")
	public void i_Select_on_login_link() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(By.linkText("Tu Log In / Register")).click();
	}
	@And("^I should see the login page$")
	public void i_should_see_the_login_page() throws Throwable {
		Assert.assertEquals("Returning Tu customers", driver.findElements(By.cssSelector("h2")).get(2).getText());
	}

	@And("^I enter the valid email address and valid password$")
	public void i_enter_the_valid_email_address_and_valid_password() throws Throwable {
		driver.findElement(By.cssSelector("#j_username")).clear();
		  driver.findElement(By.cssSelector("#j_username")).sendKeys("farheen.fatima13@yahoo.com");
		  driver.findElement(By.cssSelector("#j_password")).clear();
		  driver.findElement(By.cssSelector("#j_password")).sendKeys("najeeb05");
		  driver.findElement(By.cssSelector(".hide-show-button")).click();
	}

	@When("^I click login buuton$")
	public void i_click_login_buuton() throws Throwable {
		driver.findElement(By.className("loginButtonMain")).click();
	}


	@Then("^i should see the welcome page$")
	public void i_should_see_the_welcome_page() throws Throwable {
		Assert.assertEquals("Hello farheen fatima", driver.findElement(By.cssSelector("li[class='logged_in']")).getText());
		}

	
}
