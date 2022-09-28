package StepDefinitions;

import BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Hooks extends BaseClass {

    private final BaseClass base;

    public Hooks(BaseClass base) {
        this.base = base;
    }

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\Selenium-Java-Project\\Driver\\chromedriver.exe");
        base.driver = new ChromeDriver();
        driver.get(base.baseURL);
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
    }

    @After
    public void tearDown() {
        base.driver.quit();
    }
}
