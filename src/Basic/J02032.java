/* SẮP XẾP NỔI BỌT - LIỆT KÊ NGƯỢC
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02032 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	List<Integer> l1 = new ArrayList<Integer>();
	List<List<Integer>> mode = new ArrayList<>();
	while(t-->0) {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
		l1.add(sc.nextInt());
		boolean hasSorted = false;	
		for(int i=0;i<n-1;i++) {
                    hasSorted = false;
                    for(int j=0;j<n-i-1;j++)
			if(l1.get(j) > l1.get(j+1)) {
                            Collections.swap(l1, j, j+1);
                            hasSorted = true;
			}
                    if(hasSorted){
			List<Integer> l2 = new ArrayList<>(l1);
			mode.add(l2);
                    }
		}
            for(int i=mode.size()-1;i>=0;i--) {
                System.out.print("Buoc "+(i+1)+": ");
                for (int j=0;j<n;j++)
                    System.out.print(mode.get(i).get(j)+ " ");
                System.out.println();
		}
		l1.clear();
		mode.clear();
            }
    }
}
