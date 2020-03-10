/* Write a Java program that reads
        an integer and check whether it is negative,
        zero, or positive.*/


import java.util.Scanner;

public class Check {
public static void main(String[]args) {

      Scanner input = new Scanner(System.in);
         int a;
         System.out.println("Input the number: ");
         a = input.nextInt();
       if(a>0){
           System.out.println("Posititve integer: ");
       }
        else if(a<0) {
            System.out.println("Negative integer: ");
       }
       else{
           System.out.println("Zero");
       }




}
}
