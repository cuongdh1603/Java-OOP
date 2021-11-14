/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05038;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine()),gen_id = 1;
        List<Employee> emp = new ArrayList<>();
        while(t-->0)
            emp.add(new Employee(gen_id++,sc.nextLine(),Long.valueOf(sc.nextLine()),Long.valueOf(sc.nextLine()),sc.nextLine()));
        long sum = 0;
        for (Employee e : emp) {
            System.out.println(e);
            sum += e.salary;
        }
        System.out.println("Tong chi phi tien luong: "+sum);
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
*/