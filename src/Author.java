import java.util.Objects;

//Создание класса автор
public class Author {
    private String name;
    private String surname;

    //Контруктор
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Создание геттеров
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return "Автор книги: Имя: " + this.name + ". " + "Фамилия: " + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
