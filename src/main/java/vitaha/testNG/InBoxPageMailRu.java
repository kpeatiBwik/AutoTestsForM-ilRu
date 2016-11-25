package vitaha.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Страница с письмами
 * 
 * @author kpeatiBwik
 *
 */
public class InBoxPageMailRu extends MailRuMainPage {

	protected WebDriver driver = null;

	public InBoxPageMailRu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		validatePage(LEGO);
	}

	@FindBy(id = "LEGO")
	private WebElement LEGO;

	@FindBy(id = "PH_logoutLink")
	private WebElement exit;

	@FindBy(className = "b-datalist__empty")
	private WebElement emptyMailBox;

	@FindBy(className = "b-checkbox__box")
	private WebElement checkAll;

	@FindBy(xpath = "//*[text()='Удалить']")
	private WebElement buttonForDeleteAllMessage;

	@FindBy(xpath = ".//*[@class='js-item-checkbox b-datalist__item__cbx']")
	private WebElement checkOne;

	@FindBy(className = "b-datalist__item")
	public WebElement mailBox;

	/**
	 * метод удаляет первое письмо
	 */
	public void checkOneAndDelete() {
		try {
			emptyMailBox.isDisplayed();
			date(" Ваш почтовый ящик пуст");
		} catch (Exception e) {
			date(" Удаляю письмо");
			checkOne.click();
			buttonForDeleteAllMessage.click();
			exit.click();
		}
	}

	/**
	 * метод удаляет все письма
	 */
	public void checkAllAndDelete() {
		try {
			emptyMailBox.isDisplayed();
			date(" Ваш почтовый ящик пуст");
		} catch (Exception e) {
			date(" Удаляю письма");
			checkAll.click();
			buttonForDeleteAllMessage.click();
			exit.click();
		}

	}
}
