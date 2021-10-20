package J05013;

import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class Candidate {
    String id;
    String name;
    double theoryPoint,practicePoint,averagePoint;
    String type;
    public static double toFixPoint(double point){
        while(point>10)
            point /= 10;
        return point;
    }
    public Candidate(int num_id,String name, double theoryPoint, double practicePoint) {
        String str_id = String.valueOf(num_id);
        if(str_id.length()<2) str_id = '0'+str_id;
        this.id = "TS" + str_id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
        this.averagePoint = toFixPoint((theoryPoint+practicePoint)/2);
        if(this.averagePoint>9.5)
            this.type = "XUAT SAC";
        else if(this.averagePoint>=8)
            this.type = "DAT";
        else if(this.averagePoint>5)
            this.type = "CAN NHAC";
        else this.type = "TRUOT";
    }
    @Override
    public String toString() {
        return this.id+" "+this.name+" "+String.format("%.2f",this.averagePoint)
                +" "+this.type;
    }
}
class compareByPoint implements Comparator<Candidate>{

    @Override
    public int compare(Candidate o1, Candidate o2) {
        if(o1.averagePoint<o2.averagePoint) return 1;
        else return -1;
    }
    
}