package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import ui.ApplicationHomePage;

public class StartPortal implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		Open.browserOn().the(ApplicationHomePage.class).performAs(actor);
	}

	public static Performable onAuthPage() {
		return new StartPortal();
	}
}
