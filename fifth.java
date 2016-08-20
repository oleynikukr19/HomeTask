/**
 * Created by Aleksandr on 20.08.2016.
 */
import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        int num = 10;

        double m;
        double n;
        Scanner in = new Scanner(System.in);
        System.out.println("введите m");
        m = in.nextInt();
        System.out.println("введите n");
        n = in.nextInt();
        double a = Math.abs(n - num);
        double b = Math.abs(num - m);
        if (a > b) {
            System.out.println(m + " = Ближайшее");
        } else if (a < b) {
            System.out.println(n + " = Ближайшее");
        } else if (n > num) {
            double c = Math.abs(n - num);
            double d = Math.abs(num - m);
            if (c > d) {
                System.out.println(m + " = Ближайшее");
            } else if (c < d) {
                System.out.println(n + " = Ближайшее");
            }
        }
    }
}


