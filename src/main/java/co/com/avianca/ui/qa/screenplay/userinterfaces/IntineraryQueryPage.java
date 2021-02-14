package co.com.avianca.ui.qa.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IntineraryQueryPage extends PageObject {

  private IntineraryQueryPage() {
    super();
  }

  /** Locators for Query Module */
  public static final Target FROM =
      Target.the("Ciudad de origen").locatedBy("/html//input[@id='origenIter']");

  public static final Target TO =
      Target.the("Ciudad Destino").locatedBy("/html//input[@id='destinoIter']");

  public static final Target DEPARTURE_DATE =
      Target.the("Fecha de salida").locatedBy("/html//input[@id='fechaIdaIter']");

  public static final Target END_DATE =
      Target.the("Fecha final").locatedBy("/html//input[@id='fechaRegresoIter']");

  public static final Target QUERY =
      Target.the("Consultar").locatedBy("/html//input[@id='mainContent_Ir']");

  /** Locators for Default Selections */
  public static final Target DEFAULT_INITIAL_DATE =
      Target.the("Fecha inicio")
          .locatedBy(
              "/html//form[@id='ConsultaItinerarioForm']/div/div[@class='contenedor-herramientas']//div[@class='calendar-container hidden-xs']/div[1]/table//td[@class='cal1']/div[@class='number-days']/table/tbody/tr[4]/td[3]/div[@class='intern-day']");

  public static final Target DEFAULT_END_DATE =
      Target.the("Fecha Fin")
          .locatedBy(
              "/html//form[@id='ConsultaItinerarioForm']/div/div[@class='contenedor-herramientas']//div[@class='col-sm-6 col-xs-12 fecha-regreso']/div[3]/div[1]/table//td[@class='cal2']/div[@class='number-days']/table/tbody/tr[4]/td[5]/div[@class='intern-day']");
}
