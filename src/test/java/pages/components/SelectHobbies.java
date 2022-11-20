package pages.components;

public enum SelectHobbies {
    Sports("Sports"),
    Reading("Reading"),
    Music("Music");

    private final String hobby;

    SelectHobbies(String hobby){
        this.hobby = hobby;
    }
    public String getHobby(){

        return hobby;
    }
}
