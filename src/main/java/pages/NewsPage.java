package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class NewsPage {
    @FindBy(className = "site-nav_menu site-nav-menu")
    WebElement menuList;

    public NewsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickBlogLinc(){
        List<WebElement> list=new ArrayList<>(menuList.findElements(By.className("site-nav-menu_list")));
        System.out.println(list.size());
        /*for(WebElement l:list){
            if()
        }*/

    }



}
