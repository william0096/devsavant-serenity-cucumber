package co.com.avianca.ui.qa.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IntineraryResultsPage extends PageObject {

  private IntineraryResultsPage() {
    super();
  }

  /** Locators for Results Module */
  public static final Target SORT_BY_DEPARTURE_TIME =
      Target.the("Filtrar por Hora de salida")
          .locatedBy(
              "/html//input[@id='mainContent_GrillaItinerariosIda_GridVuelos_LinkSortHoraSale_0']");

  public static final Target RESULTS_MODULE =
      Target.the("Modulo de resultados").locatedBy("/html//div[@id='mainContent_ResultadosIda']");
}
