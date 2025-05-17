public class App {
    public static void main(String[] args) {
        //Создаем авторов
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Jack", "London");
        //Создаем книги
        Book book1 = new Book("Dead Zone", author1, 1979);
        Book book2 = new Book("Martin Eden", author2, 1909);
        //Выводим
        System.out.println("Книга:" + book1.getTitle() + ", Автор:" + book1.getAuthor().getName()
                + " " + book1.getAuthor().getSurname() + ", Дата публикации:" + book1.getYearOfPublication());
        System.out.println("Книга:" + book2.getTitle() + ", Автор:" + book2.getAuthor().getName()
                + " " + book2.getAuthor().getSurname() + ", Дата публикации:" + book2.getYearOfPublication());
        //Вносим измение даты с помощью сеттера
        book2.setYearOfPublication(1923);
        System.out.println("Изменение даты публикации книги: " + book2.getTitle() + ": " + book2.getYearOfPublication());
    }


}
