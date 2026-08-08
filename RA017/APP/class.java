/******************************************************************************

*******************************************************************************/
public class Main
{
	
	//public void main(String[] args)           // ❌ Not static
	//public static int main(String[] args)     // ❌ Return type must be void
//	public static void Main(String[] args)    // ❌ Method name must be exactly "main"

	// public static void main(String[] args)
	//public static void main(String args[])
	//static public void main(String[] args)
	//public static void main(String... args)
public static final void main(String[] args)
//	public final static void main(String[] args)
	//	public static void main(String[] args)
	{
		System.out.println("Hello World");

		System.out.println("	Meaning of Each Keyword ");

		System.out.println("1. public \n Makes the method accessible from anywhere. \n The JVM must be able to access it to start the program.");


		System.out.println("2. static \n The method belongs to the class, not to an object.\n The JVM calls main() without creating an object.");


		System.out.println("3. void \n Means the method does not return any value.");


		System.out.println("4. main \n This is the method name recognized by the JVM as the program's entry point.");
		System.out.println("5. String[] args \n Stores command-line arguments. \n args is simply a variable name and can be changed."); // This is also valid because the variable name is arbitrary.
	}



}