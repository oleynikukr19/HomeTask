/**
 * Created by Aleksandr on 12.08.2016.
 */
import java.util.Scanner;
public class thirrd {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        n = in.nextInt();
        if(n%2==0){
            System.out.println("Число "+n+" четное");
        }
        else {
            System.out.println("Число "+n+" - нечетное");
        }
    }
}
