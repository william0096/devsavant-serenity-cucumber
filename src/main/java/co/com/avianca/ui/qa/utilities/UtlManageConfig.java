package co.com.avianca.ui.qa.utilities;

import java.io.File;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.configuration.SystemPropertiesConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;

public class UtlManageConfig {

  @SuppressWarnings("rawtypes")
  private static final Configuration CONFIGURATION =
      new SystemPropertiesConfiguration(SystemEnvironmentVariables.createEnvironmentVariables());

  private static final EnvironmentVariables environmentVariables =
      CONFIGURATION.getEnvironmentVariables();
  private static final String CONFIGPATH = new File("").getAbsolutePath() + "/src/main/resources";

  public static final String HOME =
      EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("base.url");

  public static final String NOTFOUND =
      EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("base.url");

  private UtlManageConfig() {
    super();
  }
}
