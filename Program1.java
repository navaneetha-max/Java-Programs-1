class ReadingTracker {
String bookName;
String author;
int pagesRead;

ReadingTracker(String b, String a, int p)
{
    bookName =b;

author= a;

pagesRead =p;
}

void display() {



System.out.println("Book Name: "+ bookName);

System.out.println("Author:"+author);

System.out.println("Pages Read: "+pagesRead);
}
}

public class Program1 {

public static void main(String[] args) {

ReadingTracker book1= new ReadingTracker("Java Programming", "Herbert Schildt", 120);

book1.display();
}
}