package co.com.avianca.ui.qa.utilities;

import net.serenitybdd.core.Serenity;

public class SessionUtls {

  private static <T> void setInSession(SessionData key, T value) {
    Serenity.setSessionVariable(key.value).to(value);
  }

  private static <T> T getFromSession(SessionData key) {
    return Serenity.sessionVariableCalled(key.value);
  }

  @SuppressWarnings("unused")
  private static Boolean thereIsASessionVariableCalled(SessionData key) {
    return Serenity.hasASessionVariableCalled(key.value);
  }

  public enum SessionData {
    CURRENT_USER("currentUser");

    private String value;

    SessionData(String value) {
      this.value = value;
    }
  }

  public static void setUser(String user) {
    setInSession(SessionData.CURRENT_USER, user);
  }

  public static <T> T getUser() {
    return getFromSession(SessionData.CURRENT_USER);
  }
}
