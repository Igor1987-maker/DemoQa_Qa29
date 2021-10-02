package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperWindows extends HelperBase{
    public HelperWindows(WebDriver wd) {
        super(wd);
    }

    public void selectBrowserWindows() {
        click(By.xpath("//span[.='Browser Windows']"));
    }


}
