package J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
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
    public String getName() {
        StringTokenizer st = new StringTokenizer(this.name," ");
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()){
            String tok = st.nextToken();
            tok = tok.substring(0,1).toUpperCase() + tok.substring(1).toLowerCase();
            sb.append(tok);
            sb.append(" ");

        }
        sb.delete(sb.length()-1,sb.length());
        return String.valueOf(sb);
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
        return this.getStudentCode()+" "+this.getName()+" "+this.className
                +" "+this.getDateOfBirth()+" "+String.format("%.2f",this.GPA);
    }    
}
