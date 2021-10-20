/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05032;
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
        List<Person> ps = new ArrayList<>();
        while (t-- > 0) {
            String s[] = sc.nextLine().split(" ");
            ps.add(new Person(s[0], s[1]));
        }
        Collections.sort(ps, new compareByAge());
        System.out.println(ps.get(ps.size() - 1) + "\n" + ps.get(0));
    }
}
