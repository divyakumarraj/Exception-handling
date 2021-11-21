import java.util.Scanner;
public class MathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int avg =0;

            System.out.println("Enter size of array");
            int n = sc.nextInt();
            try {
            System.out.println("Enter element of array");
            int arr[]= new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
                avg=sum/n;
            }
                System.out.println("the sum is "+sum);
                System.out.println("the average is "+avg);
            }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
