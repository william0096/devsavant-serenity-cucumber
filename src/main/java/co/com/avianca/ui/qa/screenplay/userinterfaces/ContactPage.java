package co.com.avianca.ui.qa.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ContactPage extends PageObject {

  private ContactPage() {
    super();
  }

  /** Locators for Pasenger */
  public static final Target NAME =
      Target.the("Nombre")
          .locatedBy(
              ".traveler-details.ng-star-inserted input[formcontrolname='firstName'][placeholder='Nombre']");

  public static final Target LAST_NAME =
      Target.the("Apellido")
          .locatedBy(
              ".traveler-details.ng-star-inserted input[formcontrolname='lastName'][placeholder='Apellido']");
  public static final Target GENDER =
      Target.the("Genero")
          .locatedBy(
              "/html/body[@class='notranslate']/app-root//travelers-page[@class='ng-star-inserted']//travelers-cont/travelers-pres/expander-elem//mat-tab-group/div/mat-tab-body[1]//traveler-details-pres/form/div[2]/mat-form-field//mat-select[@role='listbox']//span[.='Género']");
  public static final Target COUNTRY =
      Target.the("Pais de origen")
          .locatedBy(
              "/html/body[@class='notranslate']/app-root//travelers-page[@class='ng-star-inserted']//travelers-cont/travelers-pres/expander-elem//mat-tab-group/div/mat-tab-body[1]//traveler-details-pres/form//country-picker-elem/mat-form-field//mat-select[@role='listbox']//span[.='Nacionalidad']");
  public static final Target DAY =
      Target.the("Día de nacimiento")
          .locatedBy(".traveler-details.ng-star-inserted input[placeholder='Día']");
  public static final Target MONTH =
      Target.the("Mes de nacimiento")
          .locatedBy(".traveler-details.ng-star-inserted mat-select[aria-label='Mes']");
  public static final Target YEAR =
      Target.the("Año de nacimiento")
          .locatedBy(".traveler-details.ng-star-inserted input[placeholder='Año']");

  /** Locators for ContactInfo */
  public static final Target CONTACT_TAB =
      Target.the("Sección de contacto")
          .locatedBy("div[role='tablist'] > div > div:nth-of-type(2) span");

  public static final Target EMAIL =
      Target.the("Email")
          .locatedBy(".contact-section.ng-star-inserted input[placeholder='Correo']");
  public static final Target PHONE =
      Target.the("Celular")
          .locatedBy(".contact-section.ng-star-inserted input[placeholder='Número de teléfono']");
  public static final Target CONTINUE_CTA =
      Target.the("Continuar").locatedBy(".btn-primary.continue-btn.ng-star-inserted");

  /** Locators for Default Selection */
  public static final Target MALE_GENDER =
      Target.the("Genero Masculino")
          .locatedBy("[class] [role='option']:nth-of-type(1) .mat-option-text");

  public static final Target COUNTRY_COLOMBIA =
      Target.the("Colombia").locatedBy("mat-option:nth-of-type(1) > .mat-option-text");

  public static final Target JANUARY =
      Target.the("Enero").locatedBy("mat-option:nth-of-type(1) > .mat-option-text");
}
