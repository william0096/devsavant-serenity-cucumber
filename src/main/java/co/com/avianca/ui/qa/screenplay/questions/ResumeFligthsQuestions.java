package co.com.avianca.ui.qa.screenplay.questions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.ResultFligthsPage;
import co.com.avianca.ui.qa.utilities.Constans;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ResumeFligthsQuestions {

  private ResumeFligthsQuestions() {
    super();
  }

  public static void validateResultPageIsDisplayed() {
    theActorInTheSpotlight()
        .attemptsTo(
            WaitUntil.the(ResultFligthsPage.LOADING_ICON, WebElementStateMatchers.isNotVisible())
                .forNoMoreThan(Constans.EXPLICIT_WAIT_SPINNER_DISSAPEAR)
                .seconds(),
            Ensure.that(ResultFligthsPage.RESUME_MODULE).isDisplayed(),
            Ensure.that(ResultFligthsPage.CALENDAR_INFO).isDisplayed(),
            Ensure.that(ResultFligthsPage.RESULTS).isDisplayed());
  }
}
