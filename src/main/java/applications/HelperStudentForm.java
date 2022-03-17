package applications;

import models.StudentForm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.List;

public class HelperStudentForm extends applications.HelperBase {

    public HelperStudentForm(WebDriver wd) {

        super(wd);
    }


    public void selectItemForms() {
        if (isElementPresent(By.id("close-fixedban"))) {
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
        hideFooter();
        type(By.id("firstName"), model.getFirstName());
        type(By.id("lastName"), model.getLastName());
        type(By.id("userEmail"), model.getEmail());
        selectGender(model.getGender());
        type(By.id("userNumber"), model.getPhone());
        //typeBDay(By.id("dateOfBirthInput"), model.getBirthday());
        typeBDayWithCalendar(By.id("dateOfBirthInput"), model.getBirthday());
        addSubjectByEnter(model.getSubject());
        selectHobbies(model.getHobbies());
        type(By.id("currentAddress"), model.getAddress());
        typeState(model.getState());
        typeCity(model.getCity());

    }

    private void typeCity(String city) {

        //setTimeout(()=>console.log(document.querySelector('.subjects-auto-complete__menu').innerHTML),10000);

        click(By.xpath("//div[text()='Select City']"));
        pause(500);
        switch (city) {
            case "Delhi":
                click(By.id("react-select-4-option-0"));
                break;
            case "Gurgaon":
                click(By.id("react-select-4-option-1"));
                break;
            case "Noida":
                click(By.id("react-select-4-option-2"));
                break;


        }

       /* wd.findElement(By.id("react-select-4-input")).sendKeys(city);

        wd.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);*/
        //pause(5000);


    }

    private void typeState(String state) {
        //scroll(0,300);
        click(By.xpath("//div[text()='Select State']"));
        wd.findElement(By.id("react-select-3-input")).sendKeys(state);

        wd.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
        //pause(5000);
    }

    private void selectHobbies(String hobby) {
        String[] hobbies = hobby.split(" ");
        for (String s : hobbies) {
            switch (s) {
                case "Sports":
                    click(By.xpath("//label[text()='Sports']"));
                    break;
                case "Reading":
                    click(By.xpath("//label[text()='Reading']"));
                    break;
                case "Music":
                    click(By.xpath("//label[text()='Music']"));
                    break;
            }
        }

        pause(5000);
    }

    private void addSubjectByEnter(String subject) {
        type(By.id("subjectsInput"), subject);
        //wd.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER); //this choice for one item
        click(By.id("react-select-2-option-0"));// you can use autocomplete and then "Switch" if you want chose several items
    }

    private void typeBDayWithCalendar(By locator, String birthday) {
        //25 5 1990
        String[] data = birthday.split(" ");
        click(locator);

        new Select(wd.findElement(By.cssSelector(".react-datepicker__year-select"))).selectByValue(data[2]);
        new Select(wd.findElement(By.cssSelector(".react-datepicker__month-select"))).selectByIndex(Integer.parseInt(data[1]) - 1);

        int day = Integer.parseInt(data[0]);
        String loc = String.format("//div[text()='%s']", day);

        List<WebElement> list = wd.findElements(By.xpath(loc)); // list of amount same-days if displayed two month of calendar
        WebElement el;

        if (list.size() > 1 && day > 15) {
            el = list.get(1);
        } else {
            el = list.get(0);
        }
        el.click();


    }

    private void typeBDay(By locator, String birthday) {
        WebElement element = wd.findElement(locator);
        element.click();
        String os = System.getProperty("os.name");
        System.out.println(os);
        if (os.startsWith("Mac")) {
            element.sendKeys(Keys.chord(Keys.COMMAND + "a"));
        } else {
            element.sendKeys(Keys.chord(Keys.CONTROL + "a"));
        }

        element.sendKeys(birthday);
        element.sendKeys(Keys.ENTER);
        pause(7000);
    }

    private void selectGender(String gender) {
        if (gender.equals("Male")) {
            click(By.xpath("//label[@for='gender-radio-1']"));
        } else if (gender.equals("Female")) {
            click(By.xpath("//label[@for='gender-radio-2']"));
        } else {
            click(By.xpath("//label[@for='gender-radio-3']"));
        }
    }

}


