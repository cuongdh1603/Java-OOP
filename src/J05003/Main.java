package J05003;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int gen_id = 1;
        while(t-->0){
            String name = sc.nextLine();
            String className = sc.nextLine();
            String DOB = sc.nextLine();
            double GPA = Double.parseDouble(sc.nextLine());
            SinhVien sv = new SinhVien(gen_id,name,className,DOB,GPA);
            System.out.println(sv);
            gen_id++;
        }
    }
}
/*
1
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
*/