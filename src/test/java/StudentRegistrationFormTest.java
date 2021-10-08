import models.StudentForm;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentRegistrationFormTest extends TestBase{
    @BeforeMethod
    public void preconditions(){
        app.forms().selectItemForms();
        app.forms().selectPracticeForm();
        app.forms().hideFooter();

    }

        @Test
        public void studentRegFormTest(){

            StudentForm model = new StudentForm()
                    .firstName("John")
                    .lastName("Doe")
                    .email("john@mail.com")
                    .gender("Male")
                    .phone("1234567890")
                    .birthday("25 4 1990")
                    .subject("Maths")
                    .hobbies("Sport")
                    .address("Tel Aviv")
                    .state("NCR")
                    .city("Gurgaon");

            app.forms().fillForm(model);
            app.forms().submit();


    }
}
