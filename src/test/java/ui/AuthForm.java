package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AuthForm extends PageObject {
	public static Target LOG_IN_FIELD = Target.the("'Email or password' field").locatedBy("some css or xpath");
	public static Target PASSWORD_FIELD = Target.the("'Password' field").locatedBy("some css or xpath");
	public static Target LOG_IN_BUTTON = Target.the("'Log in' button").locatedBy("some css or xpath");
}
