package selenium.step3;

import org.openqa.selenium.WebElement;

public abstract class AbstractContainer implements Container {
    private WebElement wrappedElement;

    @Override
    public final void init(final WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    @Override
    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }
}
