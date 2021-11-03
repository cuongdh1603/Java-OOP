package lap_trinh_java_co_ban;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J01004 {
    public static boolean check(long n){
        for(long i=2;i<=sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            System.out.println(check(sc.nextLong())?"YES":"NO");       
        }
    }
}
/*
3
123456
997
111111111
*/