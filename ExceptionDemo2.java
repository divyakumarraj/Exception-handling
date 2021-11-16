public class ExceptionDemo2{
	public static void main(String[] args) {
		System.out.println("main method begins");
		try
		{
		System.out.println(10/0);
		System.out.println(args[2]);
	}
	catch(ArithmeticException | IndexOutOfBoundsException obj)
	{
		obj.printStackTrace();
	}
	System.out.println("end of main method");
}
}

//output
// main method begins
// java.lang.ArithmeticException: / by zero
// 	at exception.main(exception.java:6)
// end of main method
