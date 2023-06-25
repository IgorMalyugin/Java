package guru.qa;

public enum Category {

    SHOES ("\"Обувь\""),
    BABY ("\"Детям\"");

    private final String title;

    Category(String title){
        this.title = title;
    }
}
