package co.com.avianca.ui.qa.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaymentsPage extends PageObject {

  private PaymentsPage() {
    super();
  }

  /** Locators for Payment Module */
  public static final Target RESUME_PAYMENT =
      Target.the("Resumen de Pago").locatedBy("purchase-summary-pres .panel-primary");

  public static final Target PAY_CTA =
      Target.the("Boton de pago").locatedBy("[aria-label='Pago seguro']");

  /** Locators for Payment Options */
  public static final Target PRESENTIAL_OPTION =
      Target.the("Opción de pago prescencial")
          .locatedBy(".mat-expansion-panel-header[aria-controls='cdk-accordion-child-2']");

  public static final Target EFECTY_OPTION =
      Target.the("Opción de pago Efecty")
          .locatedBy("//mat-radio-button[@id='mat-radio-2']/label[@class='mat-radio-label']");

  public static final Target ACEPT_CONDITIONS =
      Target.the("Aceptar Terminos y condiciones")
          .locatedBy(
              "//app-root//payment-page[@class='ng-star-inserted']//payment-cont[@class='methods-of-payment']/payment-pres/methods-of-payment-cont[@class='mops ng-star-inserted']/methods-of-payment-pres[@class='mops']/mat-accordion[@class='headers-align mat-accordion']/mat-expansion-panel[3]/div[@role='region']//onsite-payment-form-cont[@class='ng-star-inserted']/onsite-payment-form-pres//gdpr-privacy-elem[@class='gdpr-privacy']//mat-checkbox//div[@class='mat-checkbox-inner-container']");
}
