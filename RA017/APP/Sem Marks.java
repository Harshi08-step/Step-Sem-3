class Marks {
    double mark1;
    double mark2;
    double mark3;

    void calculate() {
        double total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Marks in Subject 1: " + mark1);
        System.out.println("Marks in Subject 2: " + mark2);
        System.out.println("Marks in Subject 3: " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Marks m = new Marks();

        m.mark1 = 88.5;
        m.mark2 = 92.0;
        m.mark3 = 79.5;

        m.calculate();
    }
}