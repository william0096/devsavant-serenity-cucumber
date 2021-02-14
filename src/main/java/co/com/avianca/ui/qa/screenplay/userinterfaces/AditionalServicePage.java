package co.com.avianca.ui.qa.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AditionalServicePage extends PageObject {

  private AditionalServicePage() {
    super();
  }

  /** Locators for Module */
  public static final Target ADITIONAL_SERVICE_MODULE =
      Target.the("Modulo de servicios adicionales")
          .locatedBy(".ng-star-inserted > .fixed-card.fixed-card-container");

  public static final Target CONTINUE_CTA =
      Target.the("Continuar").locatedBy(".content-cart-created [aria-describedby]");

  public static final Target LOADING_ICON =
      Target.the("Icono de carga").locatedBy(".loading-image");
}
