package co.com.avianca.ui.qa.screenplay.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.avianca.ui.qa.utilities.UtlManageConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Navegar implements Task {

  private String url;

  public Navegar(String pageName) {
    switch (pageName.toUpperCase()) {
      case "HOME":
        url = UtlManageConfig.HOME;
        break;
      default:
        url = UtlManageConfig.NOTFOUND;
        break;
    }
  }

  @Step("{0} abre la pagina principal")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url(url));
  }

  public static Performable a(String pageName) {
    return instrumented(Navegar.class, pageName);
  }
}
