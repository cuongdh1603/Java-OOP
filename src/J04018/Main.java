/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04018;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            String n[] = sc.nextLine().split(" ");
            Complex c1 = new Complex(Integer.valueOf(n[0]),Integer.valueOf(n[1]));
            Complex c2 = new Complex(Integer.valueOf(n[2]),Integer.valueOf(n[3]));
            System.out.println(c1.add(c2).multi(c1)+", "+c1.add(c2).multi(c1.add(c2)));
            
        }
    }
}
/*
3
1 2 3 4
2 3 4 5
1 -2 5 -6
*/