/* SẮP XẾP CHỌN - LIỆT KÊ NGƯỢC
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02031 {
    public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<Integer>();
	List<List<Integer>> mode = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=0;i<n;i++) l1.add(sc.nextInt());
	for(int i=0;i<n-1;i++) {
	    int minvl = l1.get(i);
            for(int j=i+1;j<n;j++)
		minvl = Math.min(minvl, l1.get(j));
		int pvl = l1.indexOf(minvl);
		Collections.swap(l1, i, pvl);
		List<Integer> l2 = new ArrayList<>(l1);
		mode.add(l2);
            }
            for(int i=n-2;i>=0;i--) {
		System.out.print("Buoc "+(i+1)+": ");
		for (int j=0;j<n;j++) System.out.print(mode.get(i).get(j)+ " ");
		System.out.println();
            }
	}
}
