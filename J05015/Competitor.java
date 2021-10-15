package J05015;
import java.util.Comparator;
import java.util.StringTokenizer;
/**
 *
 * @author Cuong
 */
public class Competitor {
    String ID;
    String name;
    String unit;
    double lengthTime;
    String finishTime;
    long velocity;
    public String makeID(String name,String unit){
        String id = "";
        StringTokenizer tokenizer = new StringTokenizer(unit);
        while(tokenizer.hasMoreTokens()){
            id += tokenizer.nextToken().charAt(0);
        }
        tokenizer = new StringTokenizer(name);
        while(tokenizer.hasMoreTokens()){
            id += tokenizer.nextToken().charAt(0);
        }
        return id;
    }
    public long calculateVelocity(String finish){
        String time[] = finish.split(":");
        this.lengthTime = (Double.valueOf(time[0])+Double.valueOf(time[1])/60.-6.);
        return (long)(120./this.lengthTime+0.5);
    }
    public Competitor(String name, String unit, String finishTime) {
        this.ID = makeID(name, unit);
        this.name = name;
        this.unit = unit;
        this.finishTime = finishTime;
        this.velocity = calculateVelocity(finishTime);
    }
    @Override
    public String toString() {
        return this.ID+" "+this.name+" "+this.unit+" "+this.velocity+" "+"Km/h";
    }
}
class compareByVelocity implements Comparator<Competitor>{

    @Override
    public int compare(Competitor o1, Competitor o2) {
        if(o1.lengthTime>o2.lengthTime) return 1;
        else return -1;
    }
    
}
