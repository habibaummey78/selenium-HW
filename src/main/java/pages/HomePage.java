package pages;

import static common.CommonActions.clickElement;
import static common.CommonActions.inputText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// WebElements are created

	@FindBy(id = "SignIn-submitButton")
	WebElement signIn;

	@FindBy(xpath = "//input[@id= 'SignIn-emailInput']")
	WebElement userId;

	@FindBy(xpath = " //input[@id='SignIn-passwordInput']")
	WebElement passwordId;

	@FindBy(id = "SignIn-createAccountButton")
	WebElement creatingAccount;

	@FindBy(xpath = "//img[@class='Image']")
	WebElement logo;

	@FindBy(id = "SignIn-forgotPassword")
	WebElement forgotUserId;

	// methods are created from WebElements

	public void clickUserId() {
		userId.click();
	}

	public void clickPasswordId() {
		passwordId.click();
	}

	public void clickSignIn() {
		signIn.click();
	}

	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}
	// Sendkeys method is created here

	public void inputInLoginField() {
		userId.sendKeys("habibaummey78@gmail.com");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Use of common method clickElement(WebElement)
	public void clickForgotUserId() {
		clickElement(forgotUserId);
	}

	// common action methods are created here for clicking and sending keys
	public void clickingAndSendingKeys() throws InterruptedException {
		inputText(userId, "habibaummey78@gmail.com");
		inputText(passwordId, "Familyissweet1@");
		Thread.sleep(3000);
		clickElement(signIn);
		Thread.sleep(4000);
	}
}
