import java.util.Scanner;
import java.util.*;
public class Student {
    public static void main(String[] args) {
        System.out.println("Enter marks of 1st student");
        Scanner sc =new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int sum2 = 0;
        int avg2= 0;
        try {
            if(sc.hasNextInt());
            int n1= sc.nextInt();
            int n2= sc.nextInt();
            int n3= sc.nextInt();
            sum=n1+n2+n3;
            avg=sum/3;
            System.out.println("Average marks of student 1 is "+avg);
            System.out.println("Enter marks of 2nd student");
            int m1= sc.nextInt();
            int m2= sc.nextInt();
            int m3= sc.nextInt();
            sum2 =m1+m2+m3;
            avg2 =sum2/3;
            System.out.println("Average marks of student 2 is "+avg2);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
//        catch (NumberFormatException o)
//        {
//            System.out.println("NumberFormatException");
//        }
    }
}
