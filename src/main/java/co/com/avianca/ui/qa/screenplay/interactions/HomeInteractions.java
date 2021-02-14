package co.com.avianca.ui.qa.screenplay.interactions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.Home;
import co.com.avianca.ui.qa.utilities.Constans;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class HomeInteractions {

  private HomeInteractions() {
    super();
  }

  public static void queryFligthsByHour() {
    theActorInTheSpotlight().attemptsTo(Click.on(Home.MORE_OPTIONS), Click.on(Home.FLIGTH_HOURS));
  }

  public static void selectCities(String from, String to) {
    selectDepartureCity(from);
    selectDestinyCity(to);
  }

  public static void selectCitiesWhtiDefaultDates(String from, String to) {
    selectCities(from, to);
    selectDefaulttDates();
  }

  public static void searchFlighsWhitDefaultDates(String from, String to) {
    selectCities(from, to);
    selectDefaulttDates();
    searchResults();
  }

  private static void selectDepartureCity(String cty) {
    theActorInTheSpotlight()
        .attemptsTo(
            Enter.theValue(cty).into(Home.FROM).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER));
  }

  private static void selectDestinyCity(String cty) {
    theActorInTheSpotlight()
        .attemptsTo(Enter.theValue(cty).into(Home.TO).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER));
  }

  private static void selectDefaulttDates() {
    theActorInTheSpotlight()
        .attemptsTo(
            Click.on(Home.DATE_MODULE), Click.on(Home.INITIAL_DATE), Click.on(Home.END_DATE));
  }

  private static void searchResults() {
    theActorInTheSpotlight().attemptsTo(Click.on(Home.SEARCH_CTA));
  }

  public static void readForCovidForm() {
    theActorInTheSpotlight()
        .attemptsTo(
            WaitUntil.the(Home.COVID_19_FORM, WebElementStateMatchers.isVisible())
                .forNoMoreThan(Constans.EXPLICIT_WAIT_MDL_LOAD)
                .seconds(),
            Click.on(Home.CONTINUE_CTA));
  }
}
