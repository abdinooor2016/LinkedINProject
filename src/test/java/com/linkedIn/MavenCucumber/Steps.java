package com.linkedIn.MavenCucumber;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps {
	
	public WebDriver driver;
	public int text1;
	
	@Given("^I am on the Home page$")
	public void I_am_on_the_Home_page() throws Throwable {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	   
	}
	@When("^I enter my user email address$")
	public void I_enter_my_user_email_address() throws Throwable {
		driver.findElement(By.id("login-email")).sendKeys("mary4463@gmail.com");
	}

	@When("^I enter my user password$")
	public void I_enter_my_user_password() throws Throwable {
	    driver.findElement(By.id("login-password")).sendKeys("Monday1");
	}

	@When("^I click Signin button$")
	public void I_click_Signin_button() throws Throwable {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	}

	@Then("^I am logged in$")
	public void I_am_logged_in() throws Throwable {
		  driver.findElement(By.cssSelector("img.nav-profile-photo")).click();
		    driver.findElement(By.linkText("Sign Out")).click();
	}

	@When("^I enter all the user data in the Registration form$")
	public void I_enter_all_the_user_data_in_the_Registration_form() throws Throwable {
		driver.findElement(By.id("first-name")).clear();
	    driver.findElement(By.id("first-name")).sendKeys("Abdul");
	    driver.findElement(By.id("last-name")).sendKeys("Raman");
	    
	       char[] chars = "adefy".toCharArray();
           StringBuilder sb = new StringBuilder();
           Random random = new Random();
           for (int i = 0; i < 8; i++) {
               char c = chars[random.nextInt(chars.length)];
               sb.append(c);
           }
           String name = sb.toString();
           System.out.println(name);

        driver.findElement(By.id("join-email")).sendKeys("raman" + name + "@gmail.com");
	    driver.findElement(By.id("join-password")).sendKeys("Password1");
	}

	@When("^I click the Join now button$")
	public void I_click_the_Join_now_button() throws Throwable {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("^I enter post code$")
	public void I_enter_post_code() throws Throwable {
		 driver.findElement(By.id("zip-code")).clear();
		 driver.findElement(By.id("zip-code")).sendKeys("SE3 8NG");
		 driver.findElement(By.cssSelector("input.save-profile")).click();
		 Thread.sleep(3000);
	}

	@When("^I enter Job Title$")
	public void I_enter_Job_Title() throws Throwable {
	    driver.findElement(By.id("job-title")).sendKeys("Software Developer");
	    driver.findElement(By.cssSelector("strong > strong")).click();
	}

	@When("^I enter company$")
	public void I_enter_company() throws Throwable {
		driver.findElement(By.cssSelector("strong > strong")).click();
		driver.findElement(By.id("company")).clear();
	    driver.findElement(By.id("company")).sendKeys("NeXT");
	    driver.findElement(By.cssSelector("input.save-profile")).click();
	    driver.findElement(By.xpath("//ul[@id='uno-goals-options']/li[5]/button")).click();
	}

	@When("^I select what i am most interested in$")
	public void I_select_what_i_am_most_interested_in() throws Throwable {
	   driver.findElement(By.xpath("//body[@id='pagekey-uno-onboarding-takeover']/div[4]/div/div[2]/button[2]")).click();
	}

	@When("^I click continue$")
	public void I_click_continue() throws Throwable {
	    driver.findElement(By.id("abk-skip-btn")).click();
	    driver.findElement(By.cssSelector("button.abk-hopscotch-skip")).click(); 
	}

	@Then("^I am registered$")
	public void I_am_registered() throws Throwable {
	Assert.assertEquals("Let's confirm your email", driver.findElement(By.cssSelector("h1.title")).getText());	 
	
	}

}
