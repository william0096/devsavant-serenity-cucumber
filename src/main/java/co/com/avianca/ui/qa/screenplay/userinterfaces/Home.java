package co.com.avianca.ui.qa.screenplay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Home extends PageObject {

  private Home() {
    super();
  }

  /** Locators for Home Header Module */
  public static final Target COMPANY_LOGO =
      Target.the("Logo Avianca").locatedBy(".header-padding > div:nth-of-type(1) .hidden-xs");

  public static final Target HEADER = Target.the("Header Avianca").locatedBy(".bkg-menu > .header");
  public static final Target MORE_OPTIONS =
      Target.the("Más opciones").locatedBy(".icon-menu .material-icons");

  /** Locators into More Options */
  public static final Target FLIGTH_HOURS =
      Target.the("Horarios de Vuelo")
          .locatedBy(
              ".container-links-menu-desktop.visible-lg.visible-md > .container-box.row > div > div:nth-of-type(3) > div > ul[role='list'] > li:nth-of-type(1) > a[role='link']");

  /** Locators for Travel Search Module */
  public static final Target TRAVEL_SEARCH_MODULE =
      Target.the("Load item header")
          .locatedBy("div#tab_reservatuvuelo .col-md-12.col-sm-12.paddingHero");

  public static final Target ROUND_TRIP_OPTION =
      Target.the("Opción Ida y Vuelta")
          .locatedBy(".innertab-control-general  ul[role='tablist'] > li:nth-of-type(1)");
  public static final Target FROM =
      Target.the("Ciudad de Origen")
          .locatedBy(
              "/html//div[@id='tab_reservatuvuelo']/div[@class='container-fluid']/div/div/div/section/div[@class='innertab-control-general']/div[4]/div[1]/div[@class='group-of-validators']/form[@role='form']//input[@data-name='pbOrigen']");
  public static final Target TO =
      Target.the("Ciudad de Destino")
          .locatedBy(
              "/html//div[@id='tab_reservatuvuelo']/div[@class='container-fluid']/div/div/div/section/div[@class='innertab-control-general']/div[4]/div[1]/div[@class='group-of-validators']/form[@role='form']//input[@data-name='pbDestino']");
  public static final Target DATE_MODULE =
      Target.the("Selección de fechas de viaje").locatedBy("[data-txt-ida]");
  public static final Target INITIAL_DATE =
      Target.the("Fecha de origen")
          .locatedBy("[data-alwaysshow] .cal1 .week:nth-of-type(4) [issel='1']:nth-of-type(2)");
  public static final Target END_DATE =
      Target.the("Fecha destino")
          .locatedBy("[data-alwaysshow] .cal2 .week:nth-of-type(4) [issel='1']:nth-of-type(2)");
  public static final Target SEARCH_CTA =
      Target.the("Buscar Vuelos")
          .locatedBy(
              "[class='col-xs-12 campo-pasajerosboton col-sm-12 col-md-5  new-margin-r-booking  new-margin-l-booking comoViajas-container'] [type='submit']");

  /** Locators for Covid-19 Form */
  public static final Target COVID_19_FORM =
      Target.the("COVID-19 Avianca Alert").locatedBy("div#modal-warning  .modal-content");

  public static final Target CONTINUE_CTA =
      Target.the("COVID-19 Avianca Alert Continue")
          .locatedBy(
              "div#modal-warning > div[role='document']  .modal-footer > button:nth-of-type(1)");
}
