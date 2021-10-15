package J05015;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Competitor> cp = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            String time = sc.nextLine();
            cp.add(new Competitor(name,unit,time));      
        }
        Collections.sort(cp,new compareByVelocity());
        for (Competitor competitor : cp) {
            System.out.println(competitor);
        }
    }
}
