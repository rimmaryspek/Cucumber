package utils;

import org.openqa.selenium.support.ui.Wait;

public class Constants {

    public static final String CONFIGURATION_FILEPATH =
            System.getProperty("user.dir") + "/src/test/resources/config/config.properties";
    public static final int EXPLICIT_WAIT = 20;
    public static final int IMPLICIT_WAIT = 10;
    public static final String TESTDATA_FILEPATH =
            System.getProperty("user.dir") + "/src/test/resources/testdata1/Book2.xlsx";


    public static final String SCREENSHOT_FILEPATH =   System.getProperty("user.dir") + "/screenshots/";
}
