public class ReaderImpl implements Reader {
    String name;

    @Override
    public void takeBook(Administrator administrator, Book book) {
        System.out.println("Читатель ... берет книгу с названием ... у администратора ...");
    }

    @Override
    public void returnBook() {
        System.out.println("Читатель ... возвращает книгу ...");
    }

    public String getName() {
        return name;
    }
}
