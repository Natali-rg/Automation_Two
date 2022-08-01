import org.junit.*;
import pages.NewsPage;

public class TestBlogPage extends Base{
    private static String MAIN_URL = "https://ithillel.ua/";
    private static NewsPage newsPage;

    @BeforeClass
    public static void before(){
        driver.get(MAIN_URL);
        newsPage=new NewsPage(driver);
    }
    /*@Before
    public void openMainPage(){
        if (!driver.getCurrentUrl().equals(MAIN_URL)) {
            driver.get(MAIN_URL);
        }
        if (newsPage == null) {
            newsPage = new NewsPage(driver);
        }
    }*/
    @After
    public void nenuznuyMetod() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void clickBlogNews() {
        newsPage.clickBlogButton();
        Assert.assertEquals(driver.getTitle(),"Корисні матеріали: статті та новини IT-індустрії | Комп'ютерна школа Hillel");
        newsPage=new NewsPage(driver);
    }

    @Test
    public void TestFrontEnd() {
        newsPage.printHrefListBlogMenu();
        newsPage.clickBlogMenu("frontend");
        System.out.println("frontend ="+newsPage.getListNewsSize());
        driver.navigate().back();

    }
    @Test
    public void TestBackEnd(){
        newsPage.clickBlogMenu("backend");
        System.out.println("backend ="+newsPage.getListNewsSize());
        driver.navigate().back();
    }
    /*@Test
    public void TestDevops(){
        newsPage.clickBlogMenu("devops");
        System.out.println("devops ="+newsPage.getListNewsSize());
    }*/





}
