/******************************************************************************


*******************************************************************************/
public class Byte
{
	public static void main(String[] args) {
	
        // Integer Data Types
        byte b = 100;
        short s = 20000;
        int i = 100000;
        long l = 10000000000L;

        // Floating Point Data Types
        float f = 12.34f;
        double d = 12345.6789;

        // Character Data Type
        char c = 'A';

        // Boolean Data Type
        boolean flag = true;
        String s1 = "Harshi";

        System.out.println("===== Java Primitive Data Types =====");

        System.out.println("byte    : " + b + " | Size = 1 byte (8 bits)");
        System.out.println("short   : " + s + " | Size = 2 bytes (16 bits)");
        System.out.println("int     : " + i + " | Size = 4 bytes (32 bits)");
        System.out.println("long    : " + l + " | Size = 8 bytes (64 bits)");

        System.out.println("float   : " + f + " | Size = 4 bytes (32 bits)");
        System.out.println("double  : " + d + " | Size = 8 bytes (64 bits)");

        System.out.println("char    : " + c + " | Size = 2 bytes (16 bits)");

        System.out.println("boolean : " + flag + " | Size = JVM dependent but in gernal Size is 1 bits");
        System.out.println("String : " + s1 + " | Size = JVM department but in gernal Size is 1 bits");
        }
}