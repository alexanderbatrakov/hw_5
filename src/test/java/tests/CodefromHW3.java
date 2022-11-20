package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import pages.components.SelectGender;
import pages.components.SelectHobbies;


public class CodefromHW3 extends TestBase {


    @Test
    void fillFormTest() {
        //text boxes filling
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String userEmail = "test@test.com";
        String userNumber = "9999999999";
        String currentAddress = "Earth";
        String gender = SelectGender.Female.getGender();
        String dayOfBirth = "01";
        String monthOfBirth = "June";
        String yearOfBirth = "1900";
        String subject = "Math";
        String hobby = SelectHobbies.Music.getHobby();
        String picPath = "src/test/resources/testfile.jpg";
        String state = "NCR";
        String city = "Delhi";
        practiceFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setAddress(currentAddress)
                .setUserNumber(userNumber)
                .selectGender(gender)
                .selectDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubject(subject)
                .setHobbies(hobby)
                .uploadFile(picPath)
                .setState(state)
                .setCity(city)
                .clickOnSubmit();
        /* verifyResult */
        practiceFormPage.checkTitle()
                .checkContent("Student Name", firstName + " " + lastName)
                .checkContent("Student Email", userEmail)
                .checkContent("Gender", gender)
                .checkContent("Mobile", userNumber)
                .checkContent("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                .checkContent("Subjects", subject)
                .checkContent("Hobbies", hobby)
                .checkContent("Picture", "testfile.jpg")
                .checkContent("Address", currentAddress)
                .checkContent("State and City", state + " " + city)
    }
}