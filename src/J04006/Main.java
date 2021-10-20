/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04006;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String classRoom = sc.nextLine();
        String date = sc.nextLine();
        float point = sc.nextFloat();
        Student st = new Student(name,date,classRoom,point);
        System.out.println(st);
    }
}
/*
Nguyen Hoa Binh
D20CQCN04-B
2/2/2002
2
*/