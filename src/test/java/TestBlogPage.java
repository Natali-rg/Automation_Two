import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.NewsPage;

public class TestBlogPage extends Base{
    private static String MAIN_URL = "https://ithillel.ua/";
    private static NewsPage newsPage;

    @Before
    public void openMainPage(){
        if (!driver.getCurrentUrl().equals(MAIN_URL)) {
            driver.get(MAIN_URL);
        }
        if (newsPage == null) {
            newsPage = new NewsPage(driver);
        }
    }
    @After
    public void nenuznuyMetod() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void clickBlogNews() {
        newsPage.clickBlogLinc();

    }





}