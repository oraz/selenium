package selenium.step2;

import org.openqa.selenium.WebElement;
import selenium.step2.elements.Element;

public interface ElementFactory {
    <E extends Element> E create(Class<E> elementClass, WebElement wrappedElement);
}
