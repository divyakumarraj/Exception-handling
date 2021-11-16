public class Exception3{
	static ArithmeticException obj;
	public static void main(String[] args) {
		throw obj;
	}
}
//Exception in thread "main" java.lang.NullPointerException
//	at exception.main(exception.java:4)
