import java.util.Scanner;
public class ExceptionDemo{
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in))
		{
			System.out.print("hello");
		}
	}
}
// output = hello
