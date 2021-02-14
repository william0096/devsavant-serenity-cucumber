package co.com.avianca.ui.qa.screenplay.interactions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.IntineraryQueryPage;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Keys;

public class IntineraryQueryInteractions {

  private IntineraryQueryInteractions() {
    super();
  }

  public static void queryTravelWithCustomDates(String from, String to) {
    selectDepartureCity(from);
    selectDestinyCity(to);
    selectDefaulttDates();
    searchResults();
    swichtToResultsWindow();
  }

  private static void selectDepartureCity(String cty) {
    theActorInTheSpotlight()
        .attemptsTo(
            Enter.theValue(cty)
                .into(IntineraryQueryPage.FROM)
                .thenHit(Keys.ARROW_DOWN)
                .thenHit(Keys.ENTER));
  }

  private static void selectDestinyCity(String cty) {
    theActorInTheSpotlight()
        .attemptsTo(
            Enter.theValue(cty)
                .into(IntineraryQueryPage.TO)
                .thenHit(Keys.ARROW_DOWN)
                .thenHit(Keys.ENTER));
  }

  private static void selectDefaulttDates() {
    theActorInTheSpotlight()
        .attemptsTo(
            Click.on(IntineraryQueryPage.DEPARTURE_DATE),
                Click.on(IntineraryQueryPage.DEFAULT_INITIAL_DATE),
            Click.on(IntineraryQueryPage.END_DATE), Click.on(IntineraryQueryPage.DEFAULT_END_DATE));
  }

  private static void searchResults() {
    theActorInTheSpotlight().attemptsTo(Click.on(IntineraryQueryPage.QUERY));
  }

  private static void swichtToResultsWindow() {
    String currentHandle = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().getWindowHandle();
    theActorInTheSpotlight().attemptsTo(Switch.toWindow(getNewWindowHandle(currentHandle)));
  }

  private static String getNewWindowHandle(String currentWindowHandle) {
    for (String windowHandle :
        BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().getWindowHandles()) {
      if (!windowHandle.equals(currentWindowHandle)) {
        return windowHandle;
      }
    }
    return null;
  }
}
