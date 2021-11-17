import java.util.*;
import java.util.Scanner;
public class Array{
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter array element");
			try
			{
			for (var i=0;i<arr.length ;i++ ) {
				arr[i]=sc.nextInt();				
			}
			}
			catch(InputMismatchException e)			
			{
				System.out.println("NumberFormatException");
			}			
			int num;
			try{
			 System.out.println("Enter the index of the array you want to access ");	
			int nuum=sc.nextInt();
			System.out.println("The array element at index"+" "+nuum+"="+arr[nuum]);
			System.out.println("The array element successfully accessed");
			}
			catch(ArrayIndexOutOfBoundsException obj)			
			{
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			}			
		}	

