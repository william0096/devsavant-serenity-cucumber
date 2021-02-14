package co.com.avianca.ui.qa.screenplay.questions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.IntineraryResultsPage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class IntineraryResultsQuestions {

  private IntineraryResultsQuestions() {
    super();
  }

  public static void validateResultModuleDisplayed() {
    theActorInTheSpotlight()
        .attemptsTo(Ensure.that(IntineraryResultsPage.RESULTS_MODULE).isDisplayed());
  }
}
