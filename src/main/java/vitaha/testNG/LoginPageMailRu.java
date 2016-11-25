package vitaha.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Страница авторизации Mail Ru
 * 
 * @author kpeatiBwik
 *
 */
public class LoginPageMailRu extends MailRuMainPage {
	protected WebDriver driver;

	public LoginPageMailRu(WebDriver driver, String url) {
		this.driver = driver;
		driver.manage().deleteAllCookies();
		driver.get(url);
		PageFactory.initElements(driver, this);
		validatePage(userLoginField);
	}

	@FindBy(id = "mailbox__login")
	private WebElement userLoginField;

	@FindBy(id = "mailbox__password")
	private WebElement userPasswordField;

	@FindBy(id = "mailbox__auth__button")
	private WebElement enter;

	public InBoxPageMailRu login(String name, String password) {
		date(" Залогиниваемся в почтовый ящик");
		userLoginField.clear();
		userLoginField.sendKeys(name);
		userPasswordField.sendKeys(password);
		enter.click();
		return new InBoxPageMailRu(driver);
	}
}
