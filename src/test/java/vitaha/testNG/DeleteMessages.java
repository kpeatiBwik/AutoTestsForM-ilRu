package vitaha.testNG;

import org.testng.annotations.Test;

public class DeleteMessages extends SuperTest {

	private LoginPageMailRu loginPageMailRu = null;
	private InBoxPageMailRu inBoxPageMailRu = null;

	@Test(priority = 1)
	public void deleteOneMessage() {
		loginPageMailRu = new LoginPageMailRu(driver, Constants.MAIL_RU);
		inBoxPageMailRu = loginPageMailRu.login(Constants.USER_LOGIN, Constants.USER_PASSWORD);
		date(" Выполняется удаление одного письма");
		inBoxPageMailRu.checkOneAndDelete();
	}

	@Test(priority = 2)
	public void deleteAllMessages() {
		loginPageMailRu = new LoginPageMailRu(driver, Constants.MAIL_RU);
		inBoxPageMailRu = loginPageMailRu.login(Constants.USER_LOGIN, Constants.USER_PASSWORD);
		date(" Выполняется удаление всех писем");
		inBoxPageMailRu.checkAllAndDelete();
	}

}
