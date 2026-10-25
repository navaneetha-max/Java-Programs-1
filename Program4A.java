
class ReadingTracker {

    int totalPages = 500;
    int pagesRead = 320;

    void displayDetails() {
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Pages Read: " + pagesRead);
    }
}

class Book extends ReadingTracker {

    void remainingPages() {
        int remaining = totalPages - pagesRead;
        System.out.println("Remaining Pages: " + remaining);
    }
}

class Magazine extends ReadingTracker {

    void readingPercentage() {
        double percentage = (pagesRead * 100.0) / totalPages;
        System.out.println("Reading Percentage: " + percentage + "%");
    }
}

public class Program4A {

    public static void main(String[] args) {

        Book b = new Book();
        Magazine m = new Magazine();

        System.out.println("Book Details");
        b.displayDetails();
        b.remainingPages();

        System.out.println();

        System.out.println("Magazine Details");
        m.displayDetails();
        m.readingPercentage();
    }
}
