package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.initial.SimpleSearchPage;
import selenium.step1.AnnotatedSearchPage;
import selenium.step2.ExtendedSearchPage;
import selenium.step3.SearchPageWithSearchForm;

public class SearchTest {
    @Test(dataProvider = "pageObjects")
    public void testSearch(final SearchPage searchPage) {
        searchPage.init(driver);
        driver.get("http://ya.ru");
        searchPage.search("Bolek i Lolek");
    }

    @DataProvider
    private Object[][] pageObjects() {
        return new Object[][]{
                {new SimpleSearchPage()},
                {new AnnotatedSearchPage()},
                {new ExtendedSearchPage()},
                {new SearchPageWithSearchForm()}
        };
    }

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
