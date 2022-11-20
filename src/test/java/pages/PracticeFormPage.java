package pages;

import com.codeborne.selenide.selector.ByText;
import pages.components.CalendarComponent;
import pages.components.CheckResult;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;


public class PracticeFormPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    CheckResult checkResult = new CheckResult();

    public PracticeFormPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        $("[id=firstName]").setValue(value);

        return this;
    }

    public PracticeFormPage setLastName(String value) {
        $("[id=lastName]").setValue(value);

        return this;
    }

    public PracticeFormPage setUserEmail(String value) {
        $("[id=userEmail]").setValue(value);

        return this;
    }

    public PracticeFormPage setAddress(String value) {
        $("[id=currentAddress]").setValue(value);

        return this;
    }

    public PracticeFormPage setUserNumber(String value) {
        $("[id=userNumber]").setValue(value);

        return this;
    }

    public PracticeFormPage selectGender(String value) {
        $("[id=genterWrapper]").$(new ByText(value)).click();

        return this;
    }

    public PracticeFormPage selectDateOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public PracticeFormPage setSubject(String subject) {
        $("#subjectsInput").setValue(subject).pressEnter();

        return this;
    }

    public PracticeFormPage setHobbies(String hobby) {
        $("[id=hobbiesWrapper]").$(new ByText(hobby)).click();

        return this;
    }

    public PracticeFormPage uploadFile(String path) {
        $("[id=uploadPicture]").uploadFile(new File(path));

        return this;
    }

    public PracticeFormPage setState(String state) {
        $("[id=state]").click();
        $("[id=stateCity-wrapper]").$(new ByText(state)).click();

        return this;
    }

    public PracticeFormPage setCity(String city) {
        $("[id=city]").click();
        $("[id=stateCity-wrapper]").$(new ByText(city)).click();

        return this;
    }

    public PracticeFormPage clickOnSubmit() {
        $("[id=submit]").click();

        return this;
    }

    public PracticeFormPage checkTitle() {
        checkResult.visibleOfTitle();

        return this;
    }

    public PracticeFormPage checkContent(String key, String value) {
        checkResult.checkContentAtTable(key, value);

        return this;
    }


}
