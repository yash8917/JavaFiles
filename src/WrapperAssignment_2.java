import java.util.Scanner;

public class WrapperAssignment_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the Number:\n");

//        Using Command line argument and store the wrapper Class
        Integer a= sc.nextInt(){
            
//        Print the Values
        System.out.println("Binary Equivalant: "+Integer.toBinaryString(a));
        System.out.println("\nHexa Equivalant: "+Integer.toHexString(a));
        System.out.println("\nOctal Equivalant: "+Integer.toOctalString(a));

    }
}
