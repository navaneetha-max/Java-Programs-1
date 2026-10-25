
class PersonalReadingTracker {

    int totalPages = 300;
    int pagesRead = 120;

    synchronized void displayReading() {

        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        int remainingPages = totalPages - pagesRead;

        System.out.println("Reading Status: Book Reading Started");
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Pages Read: " + pagesRead);
        System.out.println("Remaining Pages: " + remainingPages);
    }

    synchronized void updateReading() {

        double percentage = (pagesRead * 100.0) / totalPages;

        System.out.println("Updating Reading Status...");
        System.out.println("Reading Progress: " + percentage + "%");

        notify();
    }
}

class MyThread extends Thread {

    PersonalReadingTracker p;

    MyThread(PersonalReadingTracker p) {
        this.p = p;
    }

    public void run() {
        p.displayReading();
    }
}

public class Program10 {

    public static void main(String[] args) {

        PersonalReadingTracker p = new PersonalReadingTracker();

        MyThread t1 = new MyThread(p);
        t1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        p.updateReading();
    }
}
