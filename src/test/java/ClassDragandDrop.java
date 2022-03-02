import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClassDragandDrop extends TestBase {

    @Test

    public void testToDrag() {
        app.action().selectInteractions();
        app.action().selectDroppable();
        app.action().droppebleTests();
    }
}
