package J04007;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String dateOfBirth = sc.nextLine();
        String address = sc.nextLine();
        String taxCode = sc.nextLine();
        String contrastDate = sc.nextLine();
        Employee em = new Employee(name,gender,dateOfBirth,address,taxCode,contrastDate);
        System.out.println(em);
    }
}
