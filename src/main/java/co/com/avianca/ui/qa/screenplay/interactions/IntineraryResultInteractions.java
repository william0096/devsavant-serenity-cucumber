package co.com.avianca.ui.qa.screenplay.interactions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.IntineraryResultsPage;
import net.serenitybdd.screenplay.actions.Click;

public class IntineraryResultInteractions {

  private IntineraryResultInteractions() {
    super();
  }

  public static void sortResultsByDepartureTime() {
    theActorInTheSpotlight().attemptsTo(Click.on(IntineraryResultsPage.SORT_BY_DEPARTURE_TIME));
  }
}
