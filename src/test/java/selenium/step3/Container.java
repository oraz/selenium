package selenium.step3;

import org.openqa.selenium.WebElement;
import selenium.step2.elements.Element;

public interface Container extends Element {
    void init(WebElement wrappedElement);
}
