package co.com.avianca.ui.qa.screenplay.questions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.ResumeBookingPage;
import co.com.avianca.ui.qa.utilities.Constans;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ResumeBookingQuestions {

  private ResumeBookingQuestions() {
    super();
  }

  public static void validateResumePageIsDisplayed() {
    theActorInTheSpotlight()
        .attemptsTo(
            WaitUntil.the(ResumeBookingPage.LOADING_ICON, WebElementStateMatchers.isNotVisible())
                .forNoMoreThan(Constans.EXPLICIT_WAIT_SPINNER_DISSAPEAR)
                .seconds(),
            WaitUntil.the(
                    ResumeBookingPage.CONFIRMATION_STATUS, WebElementStateMatchers.isVisible())
                .forNoMoreThan(Constans.EXPLICIT_WAIT_SPINNER_DISSAPEAR)
                .seconds(),
            Ensure.that(ResumeBookingPage.RESUME_MODULE_HEADER).isDisplayed(),
            Ensure.that(ResumeBookingPage.CONFIRMATION_STATUS).isDisplayed());
  }
}
