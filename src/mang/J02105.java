/* DANH SÁCH KỀ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02105 {
    static final int mxn = 1003;
    public static void main(String[] args) {
        byte[][] mt = new byte[mxn][mxn];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                mt[i][j] = sc.nextByte();
        for(int i=1;i<=n;i++){
            System.out.print("List("+i+") = ");
            for(int j=1;j<=n;j++)
                if(mt[i][j]==1)
                    System.out.print(j+" ");
            System.out.println();
        }
    }
}
