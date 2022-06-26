package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {

	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		String projectpath=System.getProperty("user.dir");// project path(CucumberEzmet)
		System.out.println(projectpath);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
		driver.manage().window().maximize();

	}

	@And("user is on the google seach box")
	public void user_is_on_the_google_seach_box() {
		System.out.println("user is on the sesarch page");
		driver.get("https://google.com");
	}

	@When("user enter a text in seach box")
	public void user_enter_a_text_in_seach_box() {
		System.out.println("User enter seach content");
		driver.findElement(By.name("q")).sendKeys("cucumber framework java");
	}

	@And("hit Enter")
	public void hit_enter() throws InterruptedException {
		System.out.println("User hit enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("User navigate to search result")
	public void user_navigate_to_search_result() {
		System.out.println("User navigate to search result");
		driver.getPageSource().contains("10 Minute Tutorial - Cucumber Documentation");
		driver.close();
		driver.quit();
	}


}
