package models;

public class StudentForm {
    String firstName;
    String lastName;
    String email;
    String gender;
    String phone;
    String birthday;
    String subject;
    String hobbies;
    String address;
    String state;
    String city;

    public StudentForm firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentForm lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentForm email(String email) {
        this.email = email;
        return this;
    }

    public StudentForm gender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentForm phone(String phone) {
        this.phone = phone;
        return this;
    }

    public StudentForm birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public StudentForm subject(String subject) {
        this.subject = subject;
        return this;
    }

    public StudentForm hobbies(String hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public StudentForm address(String address) {
        this.address = address;
        return this;
    }

    public StudentForm state(String state) {
        this.state = state;
        return this;
    }

    public StudentForm city(String city) {
        this.city = city;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSubject() {
        return subject;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}
