class PersonalReadingTracker extends Thread {

int totalPages = 400;

int pagesRead = 165;

public void run() {

int remainingPages= totalPages- pagesRead;

System.out.println("Total Pages: "+totalPages);

System.out.println("Pages Read:" + pagesRead);

System.out.println("Remaining Pages: "+ remainingPages);

}

}



public class Program9A {

public static void main(String[]args) {

PersonalReadingTracker r =new PersonalReadingTracker();

r.start();

System.out.println("BOOK NAME: THIRLL MOVIE ");

System.out.println("AUTHOR NAME:THIRU");

}
}