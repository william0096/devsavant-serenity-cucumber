package co.com.avianca.ui.qa.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.avianca.ui.qa.screenplay.interactions.*;
import co.com.avianca.ui.qa.screenplay.questions.HomeQuestions;
import co.com.avianca.ui.qa.screenplay.questions.IntineraryResultsQuestions;
import co.com.avianca.ui.qa.screenplay.questions.ResumeBookingQuestions;
import co.com.avianca.ui.qa.screenplay.questions.ResumeFligthsQuestions;
import co.com.avianca.ui.qa.screenplay.task.Navegar;
import co.com.avianca.ui.qa.utilities.SessionUtls;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class BookTravelSteps {

  @Dado("{} ingresa a la pagina de {}")
  public void userNavigateTo(String userName, String pageName) {
    theActorCalled(userName).attemptsTo(Navegar.a(pageName));
    SessionUtls.setUser(userName);
  }

  @Dado("{} busca vuelos con destino a Miami")
  public void searchFlights(String userName) {
    userNavigateTo(userName, "Home");
    searchFlightsTo();
    acceptCovidForm();
    validateDepartureResultsAreDisplayed();
  }

  @Dado("{} consulta un vuelo por horario a Cartagena")
  public void queryFlightsByHour(String userName) {
    userNavigateTo(userName, "Home");
    HomeInteractions.queryFligthsByHour();
    IntineraryQueryInteractions.queryTravelWithCustomDates("BOG", "CTG");
  }

  @Cuando("selecciona un viaje de ida y vuelta con destino a Miami")
  public void queryTravelTo() {
    HomeInteractions.selectCitiesWhtiDefaultDates("BOG", "MIA");
  }

  @Cuando("Busca un viaje de ida y vuelta con destino a Miami")
  public void searchFlightsTo() {
    HomeInteractions.searchFlighsWhitDefaultDates("BOG", "MIA");
  }

  @Cuando("Selecciona los vuelos de Ida y Vuelta")
  public void selectCheapFlights() {
    ResumeFlightsInteractions.selectCheapFlight();
  }

  @Cuando("Aplica un filtro por los vuelos que salen mas tarde")
  public void sortResultByDepartureTime() {
    IntineraryResultInteractions.sortResultsByDepartureTime();
  }

  @Y("El usuario acepta la alerta del protocolo COVID-19")
  public void acceptCovidForm() {
    HomeInteractions.readForCovidForm();
  }

  @Y("Registra su detalle de contacto")
  public void registerContactInfo() {
    ContactInteractions.enterDefaultContactInfo();
    AditionalServiceInteractions.continueTPaymentSection();
  }

  @Y("selecciona como metodo de pago Efecty")
  public void selectEfectyasPaymentMethod() {
    PaymentInteractions.selectEfectyPaymentMethod();
  }

  @Entonces("El modulo de busqueda desplegara los datos ingresados")
  public void validateInformationIsRetained() {
    HomeQuestions.validateDepartureCityContains("Bog");
    HomeQuestions.validateDestinyCityContains("Miami");
  }

  @Entonces("El modulo mostrara los resultados para los vuelos de ida")
  public void validateDepartureResultsAreDisplayed() {
    ResumeFligthsQuestions.validateResultPageIsDisplayed();
  }

  @Entonces("El sistema reservara el vuelo seleccionado")
  public void validateResumeBookingIsDisplayed() {
    ResumeBookingQuestions.validateResumePageIsDisplayed();
  }

  @Entonces("El sistema muestra los vuelos en el orden solicitado")
  public void validateResultsAreDisplayed() {
    IntineraryResultsQuestions.validateResultModuleDisplayed();
  }
}
