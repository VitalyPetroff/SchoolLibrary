public class AppMain {

    public static LibraryService service = new LibraryService();

    public static void main(String[] args) {
        service.addEditions();
        service.printEditions();


        service.addPupils();
        service.printPupils();
    }
}