package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	

	@FindBy(id="Email")
	WebElement loginEmail;
	
	@FindBy(id="Password")
	WebElement loginpassword;
	
	@FindBy(xpath="(//div[@class='form-fields'])/descendant::input[5]")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}
	

	public void user_login() {
		loginEmail.sendKeys("seleniumjava");
		loginpassword.sendKeys("sel123");
		loginbtn.click();
		
	}


}
