class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Harshitha";
        e1.id = 101;
        e1.salary = 30000;

        Employee e2 = new Employee();
        e2.name = "Priya";
        e2.id = 102;
        e2.salary = 35000;

        e1.display();
        e2.display();
    }
}