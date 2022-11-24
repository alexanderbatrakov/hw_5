package tests;

import org.junit.jupiter.api.Test;
import static tests.TestData.*;

public class PracticeFormPageTest extends TestBase {

    @Test
    void fillFormTest() {
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
              .checkContent("State and City", state + " " + city);
    }
}
