import java.util.Scanner;

public class Check_The_Vowel {
    public static void main(String[] args) {
        int vowel= 0 , consonent=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str =sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c=='A' || c=='a' || c=='E'|| c=='e' ||c=='I'|| c=='i' ||c=='o'|| c=='O'||c=='u'||c=='U'){
                System.out.println("Vowel's is= "+c);
                vowel++;
            }else{
                System.out.println("Consonent is :"+c);
                consonent++;
            }
        }

        System.out.println("Number's of the vowel's = "+vowel);
        System.out.println("Number's of consonent= "+consonent);
    }
}