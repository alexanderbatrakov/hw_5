package pages.components;

public enum SelectHobbies {
    SPORTS("Sports"),
    READING("Reading"),
    MUSIC("Music");

    private final String hobby;

    SelectHobbies(String hobby){
        this.hobby = hobby;
    }
    public String getHobby(){

        return hobby;
    }
}
