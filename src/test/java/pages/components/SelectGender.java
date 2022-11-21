package pages.components;

public enum SelectGender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String gender;

    SelectGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

}
