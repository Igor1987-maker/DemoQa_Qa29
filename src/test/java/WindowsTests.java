import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTests extends TestBase{

    @BeforeMethod
    public void preconditions(){
        app.alert().selectItemAlert();
        app.windows().selectBrowserWindows();
    }

    @Test
    public void newTabButtonTest(){

    app.windows().clickOnNewTabWindow();

    }

    @Test
    public void newWindowTest(){


        app.windows().clickOnNewWindow();

    }

    @Test
    public void NewWindowMessageTest(){

        app.windows().clickOnNewWindowMessage();

    }
   @AfterMethod
    public void dfsdf(){

   }

}
