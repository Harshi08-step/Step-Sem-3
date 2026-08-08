class Student {
    String name;
    int rollNumber;
    String department;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alex Vance";
        s1.rollNumber = 101;
        s1.department = "Computer Science";

        s1.display();
    }
}