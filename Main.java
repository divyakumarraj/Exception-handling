public class Main{
	public static void main(String[] args) {
		try{
			throw 10;
		}
		catch(int e)
		{
			System.out.print("Got the exception"+e);
		}
	}
}
//output ||
//exception.java:4: error: incompatible types: int cannot be converted to Throwable
//			throw 10;
//			^
//exception.java:6: error: unexpected type
//		catch(int e)
//		      ^
//  required: class
//  found:    int
//2 errors
