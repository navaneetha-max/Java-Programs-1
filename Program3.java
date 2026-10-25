import java.util.Scanner;

class Student {

int rollNo;

String name;

double cgpa;

Student(int r, String n, double c) {
rollNo = r;

name = n;

cgpa = c;
}

void display() {

System.out.println("\nStudent Details");
System.out.println("Roll No:" + rollNo);

System.out.println("Name:" +name);

System.out.println("CGPA"+ cgpa);
}
}
public class Program3 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter Roll No: ");

int roll = sc.nextInt();
sc.nextLine();

System.out.print("Enter Name: ");

String name = sc.nextLine();

System.out.print("Enter CGPA: ");

double cgpa = sc.nextDouble();

Student s1 = new Student(roll, name, cgpa);

s1.display();

sc.close();
}
}