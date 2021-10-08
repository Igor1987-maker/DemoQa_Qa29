package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HelperWindows extends HelperBase {
    public HelperWindows(WebDriver wd) {
        super(wd);
    }

    public void selectBrowserWindows() {
        hideFooter();
        click(By.xpath("//span[.='Browser Windows']"));
    }


    public void clickOnNewTabWindow() {
        click(By.id("tabButton"));
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));
        System.out.println(wd.findElement(By.id("sampleHeading")).getText());

    }


    /*public void clickSmaleTabWindow() {
        click(By.id("windowButton"));
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));
        pause(2000);
        wd.switchTo().window(tabs.get(0));
        pause(3000);*/

        public void clickOnNewWindow () {

            click(By.id("windowButton"));
            List<String> tabs = new ArrayList<>(wd.getWindowHandles());
            wd.switchTo().window(tabs.get(1));
            System.out.println(wd.findElement(By.id("sampleHeading")).getText());
        }


        public void clickOnNewWindowMessage () {
            click(By.id("messageWindowButton"));
            List<String> tabs = new ArrayList<>(wd.getWindowHandles());
            wd.switchTo().window(tabs.get(1));
            String str = (wd.findElement(By.cssSelector("body")).getText());
            System.out.println(str);

        }
    }
