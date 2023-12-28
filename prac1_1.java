//To find sum of 2 num using class and object

import java.util.Scanner;

public class prac1_1
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter number 1 : ");
        a = sc.nextInt();
        System.out.println("\n Enter number 2 : ");
        b = sc.nextInt();

        c= a+b;
        System.out.println(a + " + " + b + " = " + c);

    }
    
}
