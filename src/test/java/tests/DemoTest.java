package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.Platform;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoTest {



    AndroidDriver driver ;
    AppiumDriverLocalService service;



@BeforeClass
public void setup() {

    AppiumServiceBuilder builder = new AppiumServiceBuilder()
            .withTimeout(Duration.ofSeconds(50));
    service = AppiumDriverLocalService.buildService(builder);
    service.start();

    }


@Test
public void testDemo() {
    UiAutomator2Options options = new UiAutomator2Options();
    options.setPlatformName(Platform.ANDROID.name());
    options.noReset();
    options.setDeviceName("Medium Phone1");
    options.setApp("./src/test/resources/ApiDemos-debug.apk");
    try {
        driver = new AndroidDriver(
                new URI("http://127.0.0.1:4723").toURL(), options );
    } catch (MalformedURLException | URISyntaxException e) {
        throw new RuntimeException(e);
    }
        driver.quit();
}


@AfterClass
    public  void tearDown() {
    service.stop();
    }

}
