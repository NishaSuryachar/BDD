package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToAppTest
{
	WebDriver driver;
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}
	@Given("Load the URL")
	public void load_the_url() {
		driver.get("http://localhost:8888/");
	    
	}
	@When("Login Page is dispalyed enter the username anad password")
	public void login_page_is_dispalyed_enter_the_username_anad_password() {
	   
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	   
	}
	@Then("validate for Home page")
	public void validate_for_home_page() {
		System.out.println("Home page displayed");
	   
	}
}
