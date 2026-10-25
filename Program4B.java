
import java.util.Scanner;

class ReadingTracker {

    String bookName;
    int totalPages;
    int pagesRead;

    void getBookDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Total Pages: ");
        totalPages = sc.nextInt();

        System.out.print("Enter Pages Read: ");
        pagesRead = sc.nextInt();
    }
}

class PersonalReading extends ReadingTracker {

    void calculateProgress() {
        double progress = ((double) pagesRead / totalPages) * 100;

        System.out.println("Reading Progress: " + progress + "%");
    }
}

class StudentReading extends PersonalReading {

    void displayDetails() {
        System.out.println("\n--- Personal Reading Tracker ---");
        System.out.println("Book Name: " + bookName);
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Pages Read: " + pagesRead);

        calculateProgress();
    }
}

public class Program4B {

    public static void main(String[] args) {
        StudentReading obj = new StudentReading();

        obj.getBookDetails();
        obj.displayDetails();
    }
}
