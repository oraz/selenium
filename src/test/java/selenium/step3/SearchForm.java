package selenium.step3;

import org.openqa.selenium.support.FindBy;
import selenium.step2.elements.Button;
import selenium.step2.elements.TextField;

public class SearchForm extends AbstractContainer {
    @FindBy(id = "text")
    private TextField searchField;

    @FindBy(css = "input[type=\"submit\"]")
    private Button searchButton;

    public void search(final String query) {
        searchField.clearAndType(query);
        searchButton.click();
    }
}
