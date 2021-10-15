package J04005;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.next();
        float point1 = sc.nextFloat();
        float point2 = sc.nextFloat();
        float point3 = sc.nextFloat();
        Candidate ts = new Candidate(name,date,point1,point2,point3);
        System.out.println(ts);
    }
}
/*
Nguyen Hoang Ha
11/10/2001
4.5
10.0
5.5
*/