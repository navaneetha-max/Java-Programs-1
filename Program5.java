import java.util.Scanner;

class ReadingTracker {

String bookName;

int totalPages;

int pagesRead;

void getDetails() {



Scanner sc = new Scanner(System.in);

System.out.print("Enter Book Name: ");

bookName = sc.nextLine();

System.out.print("Enter Total Pages: ");

totalPages= sc.nextInt();

System.out.print("Enter Pages Read: ");

pagesRead = sc.nextInt();
}

void display(){

System.out.println("Book Name:"+bookName);

System.out.println("Total Pages: "+totalPages);
}
}

class PersonalReading extends ReadingTracker {

void calculateProgress() {

double progress= ((double) pagesRead/totalPages)*100;

System.out.println("Reading Progress: " + progress + "%");
}

void display() {

System.out.println("\n-- Personal Reading---");

System.out.println("Book Name:" + bookName);

System.out.println("Pages Read:" + pagesRead);
calculateProgress();
}}

class StudentReading extends PersonalReading {

void display(){

System.out.println("\n--- Student Reading Tracker-");

System.out.println("Book Name: " + bookName);

System.out.println("Total Pages: " + totalPages);

System.out.println("Pages Read: " + pagesRead);

double progress = ((double) pagesRead/totalPages)* 100;

System.out.println("Reading Progress: " + progress + "%");
}}

public class Program5 {

public static void main(String[] args) {

StudentReading obj = new StudentReading();

obj.getDetails();

obj.display();

}

}