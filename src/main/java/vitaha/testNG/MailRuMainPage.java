package vitaha.testNG;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Все классы унаследованы от этого класса
 * 
 * @author kpeatiBwik
 *
 */
public abstract class MailRuMainPage {

	protected WebDriver driver = null;

	/**
	 * метод определяет на нужной ли странице мы находимся
	 * 
	 * @param element
	 *            веб-элемент по которому производим поиск
	 * @return true - в случае когда элемент найден, false - в случае когда
	 *         элемента нет
	 */
	public boolean validatePage(WebElement element) {
		try {
			Thread.sleep(3000);
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			date(" Мы находимся НЕ на нужной странице");
			Assert.fail();
			return false;
		}
	}

	public static void date(String s) {
		System.out.println(new Date(System.currentTimeMillis()) + s);
	}

}
