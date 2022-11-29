package justForFun;

import java.util.Scanner;

public class heya_trial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input one number");
        int i = sc.nextInt();
        System.out.println("Input second number");
        int j = sc.nextInt();

//        int num1 = 25;
//        int num2 = 30;
//        int product = num1 * num2;
        System.out.println("enter your choice of what you want to do 1 - sum , 2 - product, 3 - subtraction");
        int choice = sc.nextInt();
        if ( choice == 1)
            System.out.println("sum = "+ i+j);
        else if (choice == 2 )
            System.out.println("product = "+i*j);
        else
            System.out.println("subtracted result = "+(i-j));



    }

}
