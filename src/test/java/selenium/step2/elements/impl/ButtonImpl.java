package selenium.step2.elements.impl;

import org.openqa.selenium.WebElement;
import selenium.step2.elements.Button;

class ButtonImpl extends AbstractElement implements Button {
    protected ButtonImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public void click() {
        wrappedElement.click();
    }
}
