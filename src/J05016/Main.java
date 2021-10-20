package J05016;

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
        int t = Integer.parseInt(sc.nextLine()),gen_id = 1;
        List<Customer> ct = new ArrayList<>();
        while(t-->0) {            
            String name = sc.nextLine();
            String room = sc.nextLine();
            String cInDate = sc.nextLine();
            String cOutDate = sc.nextLine();
            long cost = sc.nextLong();
            sc.nextLine();
            ct.add(new Customer(gen_id,name,room,cInDate,cOutDate,cost));
            gen_id++;
        }
        Collections.sort(ct,new compareByTotalCost());
        for (Customer customer : ct) System.out.println(customer);
    }
}
/*
3
Huynh Van Thanh   
103 
05/06/2010   
05/06/2010   
15
Le Duc Cong  
106 
08/03/2010   
01/05/2010   
220
Tran Thi Bich Tuyen   
207 
10/04/2010   
21/04/2010   
96
*/