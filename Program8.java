
class InvalidReadingPagesException extends Exception {

    InvalidReadingPagesException(String message) {
        super(message);
    }
}

class ReadingTracker {

    String bookName;
    String author;
    int totalPages;
    int pagesRead;

    ReadingTracker(String name, String auth, int total, int read) {
        bookName = name;
        author = auth;
        totalPages = total;
        pagesRead = read;
    }

    void displayReading() {
        int remainingPages = totalPages - pagesRead;

        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Pages Read: " + pagesRead);
        System.out.println("Remaining Pages: " + remainingPages);
    }
}

public class Program8 {

    public static void main(String[] args) {

        ReadingTracker r1 = new ReadingTracker(
            "Java Programming", "Herbert Schildt", 500, 120
        );

        try {
            if (r1.totalPages <= 0) {
                throw new InvalidReadingPagesException(
                    "Total pages must be greater than 0"
                );
            }

            if (r1.pagesRead < 0 || r1.pagesRead > r1.totalPages) {
                throw new InvalidReadingPagesException(
                    "Pages read must be between 0 and total pages"
                );
            }

            r1.displayReading();

        } catch (InvalidReadingPagesException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
