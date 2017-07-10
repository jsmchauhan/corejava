package tutorial4;


/**
 * Created by mch23 on 10/07/2017.
 */
public class Application {
    public static void main(String[] args) {
        int value=1;

        boolean loop = 4 < value;

        System.out.println("Value is: "+ loop);

        while (value<=10){

            System.out.println("Value is :" + value);

            value=value+1;
        }


    }
}
