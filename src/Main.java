public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("John");
        librarian.overdueNotification(librarian);

        Supplier supplier = new Supplier();
        supplier.returnBook();

        Administrator administrator = new Administrator("Amir");
        administrator.overdueNotification(administrator);

        Reader reader = new Reader("Steve");
        reader.findBook();
    }
}
