import java.util.Scanner;

/**
 * Created by mashatel on 11/14/2022.
 */
public class Lap62 {
    public static void main(String[] args) {
        int yaers=0;
        Scanner input=new Scanner(System.in);
        System.out.println("entar the balance");
        double investmentblance= input.nextDouble();
        System.out.printf("enter interest");
        double interset= input.nextDouble();
        while (investmentblance<1000000);
        {
            investmentblance=investmentblance+interset;
            yaers++;}

        System.out.printf("the number of yares it takes for the invesment "+yaers);

    }
}
