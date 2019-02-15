package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.AuthForm.LOG_IN_BUTTON;
import static ui.AuthForm.LOG_IN_FIELD;
import static ui.AuthForm.PASSWORD_FIELD;

public class LogIn implements Task {
	private final String login_, password_;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(login_).into(LOG_IN_FIELD),
				Enter.theValue(password_).into(PASSWORD_FIELD),
				Click.on(LOG_IN_BUTTON)
		);
	}

	public static Performable asAdmin() {
		return instrumented(LogIn.class, "login", "password");
	}

	public LogIn(String login, String password) {
		login_ = login;
		password_ = password;
	}
}
