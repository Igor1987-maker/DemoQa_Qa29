import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{

    @BeforeMethod
    public void preconditions(){
        app.alert().selectItemAlert();
        app.alert().selectAlerts();
    }


    @Test
    public void alertTestButton1(){
app.alert().clickButton1();


    }
    @Test
    public void alertTestButton2(){
        app.alert().clickButton2();

    }
    @Test
    public void alertTestButton3Cancel(){


    }

    @Test
    public void oalertTestButton3Ok(){

    }

    @Test
    public void AlertSendTextTest(){


    }
}
