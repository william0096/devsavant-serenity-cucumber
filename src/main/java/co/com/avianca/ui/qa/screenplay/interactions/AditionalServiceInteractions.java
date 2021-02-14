package co.com.avianca.ui.qa.screenplay.interactions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.AditionalServicePage;
import co.com.avianca.ui.qa.utilities.Constans;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AditionalServiceInteractions {

  private AditionalServiceInteractions() {
    super();
  }

  public static void continueTPaymentSection() {
    theActorInTheSpotlight()
        .attemptsTo(
            WaitUntil.the(AditionalServicePage.LOADING_ICON, WebElementStateMatchers.isNotVisible())
                .forNoMoreThan(Constans.EXPLICIT_WAIT_SPINNER_DISSAPEAR)
                .seconds(),
            WaitUntil.the(
                    AditionalServicePage.ADITIONAL_SERVICE_MODULE,
                    WebElementStateMatchers.isVisible())
                .forNoMoreThan(Constans.EXPLICIT_WAIT_MDL_LOAD)
                .seconds(),
            Click.on(AditionalServicePage.CONTINUE_CTA));
  }
}
