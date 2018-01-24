public class AppMain {

    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        service.addEditions();
        service.printEditions();
        service.addPupils();
        service.printPupils();
    }
}
