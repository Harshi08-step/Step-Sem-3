public class operator {
    public static void main(String[] args) {

        int a = 20, b = 10;

        // Arithmetic Operators
        System.out.println("===== Arithmetic Operators =====");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Assignment Operators
        System.out.println("\n===== Assignment Operators =====");
        int x = 10;
        System.out.println("x = " + x);

        x += 5;
        System.out.println("x += 5 : " + x);

        x -= 3;
        System.out.println("x -= 3 : " + x);

        x *= 2;
        System.out.println("x *= 2 : " + x);

        x /= 4;
        System.out.println("x /= 4 : " + x);

        x %= 3;
        System.out.println("x %= 3 : " + x);

        // Relational Operators
        System.out.println("\n===== Relational Operators =====");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\n===== Logical Operators =====");
        boolean p = true;
        boolean q = false;

        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p : " + (!p));

        // Increment & Decrement Operators
        System.out.println("\n===== Increment & Decrement =====");
        int n = 5;
        System.out.println("n = " + n);
        System.out.println("n++ = " + n++);
        System.out.println("After n++ = " + n);
        System.out.println("++n = " + (++n));
        System.out.println("n-- = " + n--);
        System.out.println("After n-- = " + n);
        System.out.println("--n = " + (--n));

        // Bitwise Operators
        System.out.println("\n===== Bitwise Operators =====");
        int m = 5, k = 3;
        System.out.println("m & k = " + (m & k));
        System.out.println("m | k = " + (m | k));
        System.out.println("m ^ k = " + (m ^ k));
        System.out.println("~m = " + (~m));

        // Shift Operators
        System.out.println("\n===== Shift Operators =====");
        int s = 8;
        System.out.println("s << 1 = " + (s << 1));
        System.out.println("s >> 1 = " + (s >> 1));
        System.out.println("s >>> 1 = " + (s >>> 1));

        // Ternary Operator
        System.out.println("\n===== Ternary Operator =====");
        int max = (a > b) ? a : b;
        System.out.println("Largest Number = " + max);

        // instanceof Operator
        System.out.println("\n===== instanceof Operator =====");
        String str = "Java";
        System.out.println(str instanceof String);
        /* The instanceof operator in Java is used to check whether an object belongs 
        to a particular class or implements a particular interface.
        It returns a boolean value:
        true → the object is an instance of the specified class/interface.
        false → it is not.*/

        // Type Casting
        System.out.println("\n===== Type Casting =====");
      
         double d = 25.89;
        int nums = (int) d;   // Manual conversion

        System.out.println("Double = " + d);
        System.out.println("Integer = " + nums);
         /*Type casting is the process of converting one data type into another data type.
        There are two types of type casting in Java:
        Implicit (Widening) Type Casting – Done automatically by Java.
        Explicit (Narrowing) Type Casting – Done manually by the programmer.*/
         int num = 100;
        double dd = num;   // Automatic conversion

        System.out.println("Integer = " + num);
        System.out.println("Double = " + dd);
    }
}