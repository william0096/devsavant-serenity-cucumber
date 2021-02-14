package co.com.avianca.ui.qa.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ResumeBookingPage extends PageObject {

  private ResumeBookingPage() {
    super();
  }

  /** Locators for Resume Booking Module */
  public static final Target RESUME_MODULE_HEADER =
      Target.the("Confirmación de reserva").locatedBy(".recap-container > .header-section");

  public static final Target CONFIRMATION_STATUS =
      Target.the("Estado de la reserva").locatedBy(".readyRM > .confirmation-purchase__panel");

  public static final Target LOADING_ICON =
      Target.the("Icono de carga").locatedBy(".loading-image");
}
