import java.util.Scanner;

interface ReaderInfo {



void getReader();
}

interface BookInfo {

void getBook();

}

class PersonalReading implements ReaderInfo, BookInfo {

Scanner sc =new Scanner(System.in);

String name;

String bookName;

String author;

int pages;

int rating;

String status;

public void getReader() {

System.out.print("Enter Reader Name:");

name = sc.nextLine();

}

public void getBook() {

System.out.print("Enter Book Name: ");

bookName = sc.nextLine();

System.out.print("Enter Author Name: ");

author= sc.nextLine();

System.out.print("Enter Number of Pages: ");

pages= sc.nextInt();

System.out.print("Enter Rating (1-5): ");

rating= sc.nextInt();
sc.nextLine();

System.out.print("Enter Reading Status: ");



status = sc.nextLine();
}

void display() {

System.out.println("\n Personal Reading Tracker");

System.out.println("Reader Name:" +name);

System.out.println("Book Name "+bookName);

System.out.println("Author:" + author);

System.out.println("Pages:" + pages);

System.out.println("Rating"+rating + "/5");

System.out.println("Status:" + status);

}

}

public class Program6B{ 

public static void main(String[] args) {

System.out.println("--- Multiple Inheritance with Interface ---");

PersonalReading obj = new PersonalReading();

ReaderInfo reader = obj;

BookInfo book = obj;

reader.getReader();

book.getBook();

obj.display(); }}
