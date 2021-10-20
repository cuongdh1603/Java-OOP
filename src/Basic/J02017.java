/* THU GỌN DÃY SỐ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> lt = new ArrayList<Integer>();
        for(int i=0;i<n;i++) lt.add(sc.nextInt());
        boolean check = false;
        while(!check){
            check = true;
            for(int i=1;i<lt.size();i++)
                if((lt.get(i)+lt.get(i-1))%2==0){
                    check = false;
                    lt.remove(i-1);
                    lt.remove(i-1);
                }
            if(check) break;
        }
        System.out.println(lt.size());
    }
}
