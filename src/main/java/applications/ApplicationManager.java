package applications;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    HelperStudentForm studentForm;
    HelperWindows windows;
    HelperAlert alert;
    String browser;
    ActionHelper action;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        }

        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");
        studentForm = new HelperStudentForm(wd);
        windows = new HelperWindows(wd);
        alert = new HelperAlert(wd);
        action = new ActionHelper(wd);

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('footer').style.display='none';");
    }

    public HelperStudentForm forms() {
        return studentForm;
    }

    public HelperWindows windows() {
        return windows;
    }

    public HelperAlert alert() {
        return alert;
    }

    public ActionHelper action() {
        return action;
    }


    public void stop() {
        wd.quit();
    }
}
