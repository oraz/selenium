package selenium.step3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.SearchPage;
import selenium.step2.ExtendedFieldDecorator;

public class SearchPageWithSearchForm implements SearchPage {
    @FindBy(tagName = "form")
    private SearchForm searchForm;

    @Override
    public void search(final String query) {
        searchForm.search(query);
    }

    @Override
    public void init(final WebDriver driver) {
        PageFactory.initElements(new ExtendedFieldDecorator(driver), this);
    }
}
