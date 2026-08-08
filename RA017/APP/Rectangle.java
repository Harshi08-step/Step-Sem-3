class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateAndDisplayArea() {
        double area = length * breadth;
        System.out.println("Length: " + length + " m");
        System.out.println("Breadth: " + breadth + " m");
        System.out.println("Floor Area: " + area + " sq.m");
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle room = new Rectangle(12.5, 8.0);
        room.calculateAndDisplayArea();
    }
}