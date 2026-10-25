import reader.ReadingTracker;

public class PersonalReadingTracker {

    public static void main(String[] args) {

        ReadingTracker r1 = new ReadingTracker(
            "Java Programming", "Herbert Schildt", 500, 120
        );

        r1.displayReading();
    }
}
