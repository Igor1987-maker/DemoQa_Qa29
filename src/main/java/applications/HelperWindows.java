package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HelperWindows extends HelperBase{
    public HelperWindows(WebDriver wd) {
        super(wd);
    }

    public void selectBrowserWindows() {
        click(By.xpath("//span[.='Browser Windows']"));
    }


    public void clickOnNewTabWindow() {
        click(By.id("tabButton"));
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
       wd.switchTo().window(tabs.get(1));
        System.out.println(wd.findElement(By.id("sampleHeading")).getText());

    }
}
