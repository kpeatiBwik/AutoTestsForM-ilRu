package vitaha.testNG;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class SuperTest {

	public static void date(String s) {
		System.out.println(new Date(System.currentTimeMillis()) + s);
	}

	protected WebDriver driver = null;

	@BeforeClass
	public void startBrowser() {
		date(" Старт браузера");
		this.driver = new FirefoxDriver();
	}

	@AfterClass
	public void finishBrowser() {
		this.driver.close();
		date(" Стоп браузера");
	}

}
