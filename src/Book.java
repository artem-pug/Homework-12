//Создание класса книга
public class Book {
    String title;
    Author author;
    int yearOfPublication;
// конструктор
    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication=yearOfPublication;
    }

    //Создание геттеров
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    //Создание сеттера для года публикации
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication=yearOfPublication;
    }


}
