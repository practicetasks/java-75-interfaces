public interface Reader {
    void takeBook(Administrator administrator, Book book);

    void returnBook();

    String getName();
}

