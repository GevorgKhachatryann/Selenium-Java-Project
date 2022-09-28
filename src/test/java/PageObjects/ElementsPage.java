package PageObjects;

import BaseClass.BaseClass;
import Selectors.Selectors;
import org.openqa.selenium.By;

import java.util.HashMap;

public class ElementsPage {

    private final BaseClass base;
    private final HashMap<String, String> selectors;

    public ElementsPage(BaseClass base) {
        this.base = base;
        selectors = new Selectors().selectors;
    }

}
