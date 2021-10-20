package J05012;
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
        List<Bill> pr = new ArrayList<>();
        while(t-->0){
            String ID = sc.nextLine();
            String name = sc.nextLine();
            int quantity = sc.nextInt();
            long price = sc.nextLong();
            long discount = sc.nextLong();
            sc.nextLine();
            pr.add(new Bill(ID,name,quantity,price,discount));
        }
        Collections.sort(pr,new CompareByTotalPrice());
        for (Bill product : pr) {
            System.out.println(product);
        }
    }
}
/*
3
ML01
May lanh SANYO
12
4000000
2400000
ML02
May lanh HITACHI
4
2550000000
0
ML03
May lanh NATIONAL
5
3000000
150000
*/