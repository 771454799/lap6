import java.util.Scanner;

/**
 * Created by mashatel on 10/29/2022.
 */
public class L3 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("entrar the name");
        String name=r.next();
        for (int i =name.length(); i <0 ; i--) {
            System.out.println(name.charAt(i));

        }

    }
}
