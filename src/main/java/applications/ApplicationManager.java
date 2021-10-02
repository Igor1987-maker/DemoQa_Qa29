package applications;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    HelperStudentForm studentForm;
    HelperWindows windows;
    HelperAlert alert;



    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");
        studentForm = new HelperStudentForm(wd);
        windows = new HelperWindows(wd);
        alert = new HelperAlert(wd);


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

    public void stop() {
        wd.quit();
    }
}
