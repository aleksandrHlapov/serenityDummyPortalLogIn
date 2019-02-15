package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static ui.Header.USER_NAME;

public class Header implements Question<String> {
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(USER_NAME).viewedBy(actor).asString();
	}

	public static Question<String> displayedUserName() {
		return new Header();
	}
}
