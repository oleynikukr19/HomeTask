/**
 * Created by Aleksandr on 13.08.2016.
 */
/**


import java.util.Scanner;
import java.lang.Math;
public class sixth {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double p;
        double s;
        Scanner in = new Scanner(System.in);
        System.out.println("введите сторону а");
        a = in.nextInt();
        System.out.println("введите сторону b");
        b = in.nextInt();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        p = a + b + c;
        s = (0.5)*a*b;
        System.out.println("периметр "+p+" ");
        System.out.println("площадь "+s+" ");
    }
}
*/