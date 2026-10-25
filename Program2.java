class Student {

private int rollNo;

private String name;

private double cgpa;

static int totalStudents = 0;

Student(int rollNo, String name, double cgpa) {

this.rollNo = rollNo;

this.name = name;

this.cgpa = cgpa;

totalStudents++;

}

void display() {



System.out.println("Roll No:" + rollNo);

System.out.println("Name"+ name);

System.out.println("CGPA"+ cgpa);
}

void display(String message) {

System.out.println(message);

display();

}

static void totalStudentsCount() {

System.out.println("Total Students:" + totalStudents);
}
}
public class Program2 {

public static void main(String[] args) {

Student s1 = new Student(101,"Navaneetha",8.5);

Student s2 = new Student(102, "Arun", 9.1);



s1.display();

System.out.println();

s2.display("Second Student Details");

System.out.println();

Student.totalStudentsCount();
}
}