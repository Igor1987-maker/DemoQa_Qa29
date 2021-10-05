package applications;

import models.StudentForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperStudentForm extends applications.HelperBase {
    public HelperStudentForm(WebDriver wd) {
        super(wd);
    }
    public void selectItemForms() {
        if(isElementPresent(By.id("close-fixedban"))) {
            click(By.id("close-fixedban"));
        }
        click(By.xpath("//div[@class='category-cards']/div[2]"));
        pause(500);
    }

    public void selectPracticeForm() {
        click(By.xpath("//span[.='Practice Form']"));
    }

    public void submit() {
        click(By.id("submit"));
    }

    public void fillForm(StudentForm model) {

        type(By.id("firstName"),model.getFirstName());
        type(By.id("lastName"),model.getLastName());
        type(By.id("userEmail"),model.getEmail());
        selectGender(model.getGender());
        type(By.id("userNumber"),model.getPhone());
    }

    private void selectGender(String gender){
        if(gender.equals("Male")){
            click(By.xpath("//label[@for='gender-radio-1']"));
        }else if(gender.equals("Female")){
            click(By.xpath("//label[@for='gender-radio-2']"));
        }else{
            click(By.xpath("//label[@for='gender-radio-3']"));
        }
    }

}


