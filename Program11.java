
class ReadingResource {

    String resourceName;

    ReadingResource(String name) {
        resourceName = name;
    }
}

class ReaderThread extends Thread {

    ReadingResource book;
    ReadingResource notes;

    ReaderThread(String name, ReadingResource book,ReadingResource notes) {
        super(name);
        this.book = book;
        this.notes = notes;
    }

    public void run() {

        synchronized (book) {
            System.out.println(
                getName() + " locked " + book.resourceName
            );

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            System.out.println(
                getName() + " is waiting for " + notes.resourceName
            );

            synchronized (notes) {
                System.out.println(
                    getName() + " locked " + notes.resourceName
                );
            }
        }
    }
}

public class Program11 {

    public static void main(String[] args) {

        ReadingResource book =
            new ReadingResource("Java Book");

        ReadingResource notes =
            new ReadingResource("Reading Notes");

        ReaderThread reader1 =
            new ReaderThread("Reader 1", book, notes);

        ReaderThread reader2 =
            new ReaderThread("Reader 2", notes, book);

        reader1.start();
        reader2.start();
    }
}
