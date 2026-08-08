class Marks{
    int marks1;
    int marks2;
    int marks3;

    void calcualte() {
        int total = marks1 + marks2 + marks3;
        double avaerge = total / 3.0;

        System.out.println("Total Marks: "+ total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Marks m = new Marks();

        m.marks1 = 80;
        m.marks2 = 75;
        m.marks3 = 90;

        m.calculate();
    }
}