package StepDefinitions;

import BaseClass.BaseClass;
import PageObjects.DynamicFunctions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonSteps extends DynamicFunctions {

    public CommonSteps(BaseClass base) {
        super(base);
    }

    @And("The user click on {} btn")
    public void click(String element) throws Throwable {
        super.click(element);
        throw new PendingException();
    }

    @And("The user type {} in {}")
    public void type(String text, String field) throws Throwable{
        super.type(text, field);
        throw new PendingException();
    }

    @And("{} page is opened")
    public void pageIsOpened(String page) throws Throwable {
        assertThat(super.isOpened(page)).isTrue();
        throw new PendingException();
    }
    @And("{} page is not opened")
    public void pageIsNotOpened(String page) throws Throwable {
        assertThat(super.isNotOpened(page)).isTrue();
        throw new PendingException();
    }

}

