package co.com.avianca.ui.qa.screenplay.questions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.Home;
import net.serenitybdd.screenplay.ensure.Ensure;

public class HomeQuestions {

  private HomeQuestions() {
    super();
  }

  public static void validateDepartureCityContains(String text) {
    theActorInTheSpotlight().attemptsTo(Ensure.that(Home.FROM).value().startsWith(text));
  }

  public static void validateDestinyCityContains(String text) {
    theActorInTheSpotlight().attemptsTo(Ensure.that(Home.TO).value().isEqualTo(text));
  }
}
