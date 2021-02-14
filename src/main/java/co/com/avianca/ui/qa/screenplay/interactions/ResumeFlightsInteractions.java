package co.com.avianca.ui.qa.screenplay.interactions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.ResultFligthsPage;
import co.com.avianca.ui.qa.utilities.Constans;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ResumeFlightsInteractions {

  private ResumeFlightsInteractions() {
    super();
  }

  public static void selectCheapFlight() {
    theActorInTheSpotlight()
        .attemptsTo(
            Click.on(ResultFligthsPage.DEFAULT_SELECTION),
            Click.on(ResultFligthsPage.CONTINUE_CTA),
            WaitUntil.the(ResultFligthsPage.LOADING_ICON, WebElementStateMatchers.isNotVisible())
                .forNoMoreThan(Constans.EXPLICIT_WAIT_SPINNER_DISSAPEAR)
                .seconds(),
            Click.on(ResultFligthsPage.DEFAULT_SELECTION),
            Click.on(ResultFligthsPage.CONTINUE_CTA));
  }
}
