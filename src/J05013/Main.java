package J05013;
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
        int gen_id = 1;
        List<Candidate> cd = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            double tp = sc.nextDouble();
            double pp = sc.nextDouble();
            sc.nextLine();
            cd.add(new Candidate(gen_id,name,tp,pp));
            gen_id++;
        }
        Collections.sort(cd,new compareByPoint());
        for (Candidate candidate : cd) System.out.println(candidate);
    }
}
/*
3
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
*/