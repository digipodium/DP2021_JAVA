package pack2;

public class Library {
    public String[] books = new String[100];
    public String librarian;
    private int bookCount;

    public Library(String name, int count) {
        bookCount = count;
        librarian = name;
    }

    protected void addBook(int pos, String title) {
        books[pos] = title;
    }

    protected void showBooks() {
        System.out.println("The Library has following books");
        for (String book : books) {
            if (book != null) {
                System.out.println(">>" + book);
            }
        }
    }
}
