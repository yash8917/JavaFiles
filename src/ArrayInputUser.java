import java.util.Scanner;

public class ArrayInputUser {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array:-");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element's are:-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
