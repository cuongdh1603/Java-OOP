package J04006;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Cuong
 */
public class Student {
    private String name;
    private String ID = "B20DCCN001";
    private String dateOfBirth;
    private String classRoom;
    private float GPA;

    public Student() {
        name = null;
        classRoom = null;
        dateOfBirth = null;
        GPA = 0;
    }

    public Student(String name, String dateOfBirth, String classRoom, float GPA) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classRoom = classRoom;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getDateOfBirth() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(this.dateOfBirth);
            return dateFormat.format(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return dateOfBirth;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public float getGPA() {
        return GPA;
    }
    
    @Override
    public String toString() {
        return this.ID+" "+this.name+" "+this.getClassRoom()+" "+
                this.getDateOfBirth()+" "+String.format("%.2f",this.getGPA());
    }
}
