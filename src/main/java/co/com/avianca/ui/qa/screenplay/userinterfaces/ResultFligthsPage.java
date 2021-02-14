package co.com.avianca.ui.qa.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ResultFligthsPage extends PageObject {

  private ResultFligthsPage() {
    super();
  }

  /** Locators for Resume Module */
  public static final Target RESUME_MODULE =
      Target.the("Resumen de Busqueda")
          .locatedBy(".modify-search-header-panel.modify-search-header-panel-closed");

  public static final Target CALENDAR_INFO =
      Target.the("Información de Calendario").locatedBy(".ng-star-inserted > air-calendar-pres");
  public static final Target RESULTS = Target.the("Resultados").locatedBy(".readyRM");
  public static final Target LOADING_ICON =
      Target.the("Icono de carga").locatedBy(".loading-image");

  /** Locators for Default Selection */
  public static final Target DEFAULT_SELECTION =
      Target.the("Primera Opción Ecónomica")
          .locatedBy(
              "/html/body[@class='notranslate']/app-root//avail-page[@class='ng-star-inserted']//avail-cont/avail-pres[@class='ng-star-inserted']/avail-list-pres[@class='ng-star-inserted readyRM']/expander-elem[1]/div/div[1]//div[@role='main']/div[@class='recap-price']/div[1]/button[@class='select-cabin-button']/div[@class='recap-information']/div[@class='recap-radio-button']/div[@class='radio-button-unchecked']");

  public static final Target CONTINUE_CTA =
      Target.the("Continuar")
          .locatedBy("[stickuntil] [context='Cart']:nth-of-type(1) [aria-describedby]");
}
