import java.util.Scanner;

abstract class ReadingTracker {

String name;

String bookName;

String author;

int pages;

int rating;

String status;

void getDetails() {

Scanner sc= new Scanner(System.in);

System.out.print("Enter Reader Name: ");

name =sc.nextLine();



System.out.println("Enter Book Name: ");

bookName= sc.nextLine();

System.out.print("Enter Author Name: ");

author= sc.nextLine();

System.out.print("Enter Number of Pages: ");

pages= sc.nextInt();

System.out.print("Enter Rating (1-5): ");

rating =sc.nextInt();

sc.nextLine();

System.out.print("Enter Reading Status: ");



status = sc.nextLine();
}

abstract void display();
}

class PersonalReading extends ReadingTracker {

void display() {
    System.out.println("\n----- Personal Reading Tracker");

System.out.println("Reader Name:" + name);

System.out.println("Book Name" + bookName);

System.out.println("Author:" + author);

System.out.println("Pages"+pages);

System.out.println("Rating"+ rating + "/5");

System.out.println("Status :" + status);

}

}

public class Program6A {

public static void main(String[] args) {

ReadingTracker obj = new PersonalReading();

obj.getDetails();

obj.display();

}

}
