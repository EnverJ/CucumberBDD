package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_PF {
	@FindBy(id = "name")
	WebElement txt_usename;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login")
	WebElement btn_login;
	WebDriver driver;

	public Loginpage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void enterUserName(String username) {
		txt_usename.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickOnLogIn() {
		btn_login.click();
	}

}
