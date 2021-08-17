package pack2;

public class CollegeLibrary extends Library {
    private final String college;

    public CollegeLibrary(String college, String name, int bookCount) {
        super(name, bookCount);
        this.college = college;
    }

    public static void main(String[] args) {
        CollegeLibrary cl = new CollegeLibrary("ABC", "Mishra Ji", 20);
        cl.addBook(0, "Legion");
        cl.addBook(1, "Calamity");
        cl.addBook(2, "Oasis");
        cl.addBook(3, "Mitosis");
        cl.showBooks();
        cl.lendBook("Mitosis", 2930);
    }

    public void lendBook(String title, int stdId) {
        boolean found = false;
        for (String book : books) {
            if (book != null) {
                if (book.equalsIgnoreCase(title)) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println(title + " was lent to " + stdId);
        } else {
            System.out.println(title + "not available");
        }
    }

    @Override
    protected void showBooks() {
        System.out.println(college);
        super.showBooks();
    }
}
