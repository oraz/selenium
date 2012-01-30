package selenium.step2.elements.impl;

import org.openqa.selenium.WebElement;
import selenium.step2.elements.Element;

abstract class AbstractElement implements Element {
    protected final WebElement wrappedElement;

    protected AbstractElement(final WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    @Override
    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }
}
