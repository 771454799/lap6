import java.util.Scanner;

/**
 * Created by mashatel= on 11/14/2022.
 */
public class Lap61 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("entar the name");
        String name;
        name=input.next();
        for (int i = 0; i <name.length()-1 ; i++) {
            System.out.println( name.charAt(i));

        }
    }
}
