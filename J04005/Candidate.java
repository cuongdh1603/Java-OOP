package J04005;
/**
 *
 * @author Cuong
 */
public class Candidate {
    private String name,dateOfBirth;
    private float p1,p2,p3,average_p;
    public Candidate(String name, String dateOfBirth, float p1, float p2, float p3) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.average_p = (p1+p2+p3);
    }
    @Override
    public String toString() {
        return this.name+' '+this.dateOfBirth+' '+String.format("%.1f",this.average_p);
    }
}
