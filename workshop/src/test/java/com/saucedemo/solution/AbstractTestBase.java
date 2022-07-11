package com.saucedemo.solution;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.saucelabs.saucebindings.SauceOptions;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AbstractTestBase {
    public static final String buildName =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    @Rule
    public TestName testName = new TestName() {
        public String getMethodName() {
            return String.format("%s", super.getMethodName());
        }
    };
    @Rule
    public SauceTestWatcher resultReportingTestWatcher = new SauceTestWatcher();

    protected static final String SAUCE_USERNAME = System.getenv("SAUCE_USERNAME");
    protected static final String SAUCE_ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
    protected RemoteWebDriver driver;

    /**
     * Custom TestWatcher for Sauce Labs projects.
     */
    public class SauceTestWatcher extends TestWatcher {
        @Override
        protected void succeeded(Description description) {
            if (driver != null) {
                driver.executeScript("sauce:job-result=passed");
                driver.quit();
            }
        }

        @Override
        protected void failed(Throwable e, Description description) {
            if (driver != null) {
                driver.executeScript("sauce:job-result=failed");
                driver.quit();
            }
        }
    }

}
