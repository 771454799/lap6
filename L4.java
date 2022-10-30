/**
 * Created by mashatel on 10/29/2022.
 */
public class L4 {
    public static void main(String[] args) {
        for (int num=2 ; num <20 ; num++) {
            boolean f=true;
            for (int i = 2; i < num; ++i) {
                if(num%i==0)
                    f=false;

            }
            if (f)
                System.out.println(num);

        }
    }
}
