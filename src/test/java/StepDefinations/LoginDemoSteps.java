package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps {
//	WebDriver driver=null;
//	@Given("Browser open")
//	public void browser_open() {
//		System.out.println("Browser is open");
//		String projectpath=System.getProperty("user.dir");// project path(CucumberEzmet)
//		System.out.println(projectpath);
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
//		driver.manage().window().maximize();
//
//	}
//
//	@And("user is on the login page")
//	public void user_is_on_the_login_page() {
//		driver.get("https://example.testproject.io/web/");
//	
//
//
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) throws InterruptedException{
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//		
//	}
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigate to the home page")
//	public void user_is_navigate_to_the_home_page() {
//		driver.findElement(By.id("logout")).isDisplayed();
//		driver.close();
//		driver.quit();
//
//	}
}
