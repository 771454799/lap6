import java.util.Scanner;

/**
 * Created by mashatel on 10/29/2022.
 */
public class L2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y,sum=0;
        System.out.println("entar the number");
        x=in.nextInt();
        y=in.nextInt();

        for (int i = x; i < y; i++) {
            if(i%2==0)
            {
                System.out.println("the sum even="+(sum+=i));
            }
        }
        for (int i = x; i < y; i++) {
            if(i%2!=0)
            {
                System.out.println("the sum odd="+(sum+=i));
            }
    }
}}
