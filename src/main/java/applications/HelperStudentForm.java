package applications;

import models.StudentForm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

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
        //typeBDay(By.id("dateOfBirthInput"), model.getBirthday());
        typeBDayWithCalendar(By.id("dateOfBirthInput"), model.getBirthday());
    }

    private void typeBDayWithCalendar(By locator, String birthday) {
        //25 5 1990
        String [] data = birthday.split(" ");
        click(locator);

        new Select(wd.findElement(By.cssSelector(".react-datepicker__year-select"))).selectByValue(data[2]);
        pause(3000);
        new Select(wd.findElement(By.cssSelector(".react-datepicker__month-select"))).selectByIndex(Integer.parseInt(data[1])-1);
        pause(5000);
        /*click(By.cssSelector(".react-datepicker__month-select"));
        click(By.xpath("//option[@value='1']"));*/
        wd.findElement(By.xpath("//div[text()='25']")).click();
        pause(5000);

    }

    private void typeBDay(By locator, String birthday) {
        WebElement element = wd.findElement(locator);
        element.click();
       String os =System.getProperty("os.name");
        System.out.println( os);
        if(os.startsWith("Mac")){
            element.sendKeys(Keys.chord(Keys.COMMAND + "a"));
        }else {
            element.sendKeys(Keys.chord(Keys.CONTROL + "a"));
        }

        element.sendKeys(birthday);
        element.sendKeys(Keys.ENTER);
        pause(7000);
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


