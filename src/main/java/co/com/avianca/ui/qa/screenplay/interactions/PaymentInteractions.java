package co.com.avianca.ui.qa.screenplay.interactions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.PaymentsPage;
import co.com.avianca.ui.qa.utilities.Constans;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PaymentInteractions {

  private PaymentInteractions() {
    super();
  }

  public static void selectEfectyPaymentMethod() {
    theActorInTheSpotlight()
        .attemptsTo(
            WaitUntil.the(PaymentsPage.RESUME_PAYMENT, WebElementStateMatchers.isVisible())
                .forNoMoreThan(Constans.EXPLICIT_WAIT_MDL_LOAD)
                .seconds(),
            Scroll.to(PaymentsPage.PRESENTIAL_OPTION),
            Click.on(PaymentsPage.PRESENTIAL_OPTION),
            Click.on(PaymentsPage.EFECTY_OPTION),
            Click.on(PaymentsPage.ACEPT_CONDITIONS),
            Scroll.to(PaymentsPage.PAY_CTA),
            Click.on(PaymentsPage.PAY_CTA));
  }
}
