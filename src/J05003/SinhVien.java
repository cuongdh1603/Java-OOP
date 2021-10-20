package J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Cuong
 */
public class SinhVien {
    int id;
    String studentCode;
    String name;
    String className;
    String dateOfBirth;
    double GPA;

    public SinhVien() {
        studentCode = null;
        name = null;
        className = null;
        dateOfBirth = null;
        GPA = 0;
    }
    public SinhVien(int id, String name, String className, String dateOfBirth, double GPA) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }
    public String getStudentCode() {
        String strId = String.valueOf(this.id);
        char c = '0';
        while (strId.length() < 3) {
            strId = c + strId;
        }
        return "B20DCCN" + strId;
    }
    public String getDateOfBirth() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(this.dateOfBirth);
            return dateFormat.format(date);
        } catch (ParseException ex) {
            System.out.println("Sai roi");
        }
        return dateOfBirth;
    }
    @Override
    public String toString() {
        return this.getStudentCode() + " " + this.name + " " + this.className + " "
                + this.getDateOfBirth() + " " +String.format("%.2f",this.GPA);
    }
}
