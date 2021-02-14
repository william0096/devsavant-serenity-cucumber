package co.com.avianca.ui.qa.screenplay.interactions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.avianca.ui.qa.screenplay.userinterfaces.ContactPage;
import co.com.avianca.ui.qa.utilities.SessionUtls;
import java.util.Random;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class ContactInteractions {

  private ContactInteractions() {
    super();
  }

  public static void enterDefaultContactInfo() {
    entryDefaultPersonalData();
    entryDefaultContactInfo();
  }

  private static void entryDefaultPersonalData() {
    theActorInTheSpotlight()
        .attemptsTo(
            Enter.theValue(SessionUtls.getUser().toString()).into(ContactPage.NAME),
            Enter.theValue("Prueba").into(ContactPage.LAST_NAME),
            Click.on(ContactPage.GENDER),
            Click.on(ContactPage.MALE_GENDER),
            Click.on(ContactPage.COUNTRY),
            Click.on(ContactPage.COUNTRY_COLOMBIA),
            Enter.theValue("23").into(ContactPage.DAY),
            Click.on(ContactPage.MONTH),
            Click.on(ContactPage.JANUARY),
            Enter.theValue("1995").into(ContactPage.YEAR));
  }

  private static void entryDefaultContactInfo() {
    theActorInTheSpotlight()
        .attemptsTo(
            Click.on(ContactPage.CONTACT_TAB),
            Enter.theValue(
                    SessionUtls.getUser().toString()
                        + Integer.toString(getRandonNumber())
                        + "@gmail.com")
                .into(ContactPage.EMAIL),
            Enter.theValue("3205874875").into(ContactPage.PHONE),
            Scroll.to(ContactPage.CONTINUE_CTA),
            Click.on(ContactPage.CONTINUE_CTA));
  }

  private static int getRandonNumber() {
    Random value = new Random();
    return value.nextInt(20);
  }
}
