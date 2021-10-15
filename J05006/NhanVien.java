package J05006;
/**
 *
 * @author Cuong
 */
public class NhanVien {
    int id;
    String ID;
    String name;
    String gender;
    String dateOfBirth;
    String address;
    String taxCode;
    String contrastDate;
    public NhanVien() {
    }

    public NhanVien(int id,String name, String gender, String dateOfBirth,
            String address, String taxCode, String contrastDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.taxCode = taxCode;
        this.contrastDate = contrastDate;
    }

    public String getID() {
        String strId = String.valueOf(this.id);
        char c = '0';
        while (strId.length() < 5) {
            strId = c + strId;
        }
        return strId;
    }
    @Override
    public String toString() {
        return this.getID()+" "+this.name+" "+this.gender+" "+this.dateOfBirth+
                " " + this.address+" "+this.taxCode+ " " + this.contrastDate;
    }
}
