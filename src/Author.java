//Создание класса автор
public class Author {
    String name;
    String surname;
    //Контруктор
    public Author(String name, String surname) {
        this.name=name;
        this.surname=surname;
    }

    // Создание геттеров
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
