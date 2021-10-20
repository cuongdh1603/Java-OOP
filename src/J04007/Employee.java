package J04007;
/**
 *
 * @author Cuong
 */
public class Employee {
    private String ID = "00001";
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String taxCode;
    private String contrastDate;
    public Employee() {
    }
    public Employee(String name, String gender, String dateOfBirth,
            String address, String taxCode, String contrastDate) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.taxCode = taxCode;
        this.contrastDate = contrastDate;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public String getTaxCode() {
        return taxCode;
    }
    public String getContrastDate() {
        return contrastDate;
    }
    @Override
    public String toString() {
        return this.ID + " " + this.getName() + " "+this.getGender()+" " + this.getDateOfBirth() + " "
                + this.getAddress() + " " + this.getTaxCode() + " " + this.getContrastDate();
    }
}
