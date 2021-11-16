public class Exception{
	public static void main(String[] args) {
		System.out.println("main method begins");
		try
		{
		System.out.println(10/0);
		System.out.println(args[2]);
	}
	catch(ArithmeticException | Exception obj)
	{
		obj.printStackTrace();
	}
	System.out.println("end of main method");
}
}

// output = exception.java:88: error: Alternatives in a multi-catch statement cannot be related by subclassing
// 	catch(ArithmeticException | Exception obj)
// 	                            ^
//   Alternative ArithmeticException is a subclass of alternative Exception
// 1 error
