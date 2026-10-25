
class ReadingTracker implements Runnable {

    int totalPages = 800;
    int pagesRead = 765;

    public void run() {

        int remainingPages = totalPages - pagesRead;

        System.out.println("Total Pages: " + totalPages);
        System.out.println("Pages Read: " + pagesRead);
        System.out.println("Remaining Pages: " + remainingPages);
    }
}

public class Program9B {

    public static void main(String[] args) {

        ReadingTracker r = new ReadingTracker();

        Thread t = new Thread(r);
        t.start();

        System.out.println("Book Name: THRILL MOVIE");
        System.out.println("Author Name: THIRU");
    }
}
