package pages.components;

public enum SelectGender {
    Male("Male"),
    Female("Female"),
    Other("Other");

    private final String gender;

    SelectGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

}
