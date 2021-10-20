/* DANH SÁCH DOANH NGHIỆP NHẬN SINH VIÊN THỰC TẬP - 2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05029;
import java.util.Comparator;
/**
 *
 * @author Cuong
 */
public class Enterprise {

    String ID;
    String name;
    int numberStudentReceive;

    public Enterprise(String iD, String name, int numberStudentReceive) {
        ID = iD;
        this.name = name;
        this.numberStudentReceive = numberStudentReceive;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.name + " " + this.numberStudentReceive;
    }
}

class compareByNumber implements Comparator<Enterprise> {
    @Override
    public int compare(Enterprise o1, Enterprise o2) {
        if (o1.numberStudentReceive < o2.numberStudentReceive) return 1;
        else if (o1.numberStudentReceive > o2.numberStudentReceive) return -1;
        else return o1.ID.compareTo(o2.ID);
    }
}
