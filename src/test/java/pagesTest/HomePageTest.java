package pagesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false)
	public void clickUserIdTest() {
		homepage.clickUserId();
	}

	@Test(enabled = false)
	public void clickPasswordIdTest() {
		homepage.clickPasswordId();
	}

	@Test(enabled = false)
	public void clickSignInTest() {
		homepage.clickSignIn();
	}

	// Logo validated

	@Test(enabled = false)
	public void clickLogoTest() {
		try {
			homepage.clickLogo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// Sendkeys method is called

	@Test(enabled = true)
	public void inputInLoginFieldTest() {
		homepage.inputInLoginField();
	}

	// Common Actions methods are called

	@Test(enabled = false)
	public void nullPointerExceptionTest() throws InterruptedException {
		homepage.clickForgotUserId();
	}

	// use of link test

	@Test(enabled = false)
	public void linkText() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create an Account")).click();
		Thread.sleep(4000);
	}

	// use partial Link test

	@Test(enabled = false)
	public void partialLinkText() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create an")).click();
		Thread.sleep(4000);
	}

	// css Selectors are written below

	@Test(enabled = false)
	public void role_in_sign_in() {
		driver.findElement(By.cssSelector("button#SignIn-submitButton")).click();
	}

	@Test(enabled = false)
	public void role_in_logo() {
		driver.findElement(By.cssSelector("//img[@class='Image']")).click();
	}

	@Test(enabled = false)
	public void role_in_create_account() {
		driver.findElement(By.cssSelector("button#SignIn-createAccountButton")).click();
	}

	// isDisplayed method

	@Test(enabled = false)
	public void isDisplayed_in_logo() {
		boolean elementDisplayed = driver.findElement(By.xpath("//img[@class='Image']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed);
	}

	// isEnabled method

	@Test(enabled = false)
	public void isEnabled_in_sign_in() {
		boolean findIdEnabled = driver.findElement(By.id("SignIn-submitButton")).isEnabled();
		System.out.println("Is the Login Button Enabled? Ans: " + findIdEnabled);
	}

	// isSelected method

	@Test(enabled = false)
	public void isSelected_in_create_account() throws InterruptedException {
		boolean createAccountSelected = driver
				.findElement(By.cssSelector(
						"kds-Button.interactive." + "palette-accent.kind-prominent.variant-border.w-full my-8"))
				.isSelected();
		System.out.println("Is the create account selected? Ans: " + createAccountSelected);
		driver.findElement(
				By.cssSelector("kds-Button.interactive.palette-accent.kind-prominent.variant-border.w-full my-8"))
				.click();
		Thread.sleep(5000);
	}

}
