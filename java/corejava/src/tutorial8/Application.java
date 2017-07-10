package tutorial8;

import java.util.Scanner;

/**
 * Created by mch23 on 10/07/2017.
 */
public class Application {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int value;



        do{

            System.out.println("Enter a number");
            value=input.nextInt();

        }
        while(value!=5);

        System.out.println("Value is 5!");

    }
}
