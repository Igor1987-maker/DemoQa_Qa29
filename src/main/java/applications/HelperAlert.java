package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperAlert extends HelperBase{
    public HelperAlert(WebDriver wd) {
        super(wd);
    }

    public void selectItemAlert() {
        if(isElementPresent(By.id("close-fixedban"))) {
            click(By.id("close-fixedban"));
        }
        click(By.xpath("//div/h5[.='Alerts, Frame & Windows']"));

    }

    public void selectAlerts() {
        click(By.xpath("//span[text()='Alerts']"));
    }


}
