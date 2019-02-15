package features.auth;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import questions.Header;
import tasks.LogIn;
import tasks.StartPortal;
import static org.hamcrest.CoreMatchers.is;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class MyTest {
	private Actor sam = Actor.named("Sam");

	@Managed
	private WebDriver hisBrowser;

	@Before
	public void samCanBrowseWeb() {
		sam.can(BrowseTheWeb.with(hisBrowser));
	}

	@Test
	public void adminShouldBeAbleToLogIn() {
		givenThat(sam).wasAbleTo(StartPortal.onAuthPage());
		when(sam).attemptsTo(LogIn.asAdmin());
		then(sam).should(seeThat(
				Header.displayedUserName(),
				is("admin admin")
		));
	}

	@Test
	@Ignore
	public void badCredentials() {}
}
