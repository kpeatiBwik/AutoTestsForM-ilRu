package vitaha.testNG;

public class Constants {
	public static final String USER_LOGIN = ConfigProperties.getProperty("userLogin").trim();
	public static final String USER_PASSWORD = ConfigProperties.getProperty("userPassword").trim();
	public static final String MAIL_RU = ConfigProperties.getProperty("mailru").trim();
}
