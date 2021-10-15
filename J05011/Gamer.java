package J05011;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
/**
 *
 * @author Cuong
 */
public class Gamer {
    String playerCode;
    String name;
    String timeIn;
    String timeOut;
    long lengthOfTime = 0;
    public Gamer(String playerCode, String name, String timeIn, String timeOut) {
        this.playerCode = playerCode;
        this.name = name;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        String pattern = "hh:mm";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date1 = dateFormat.parse(this.timeIn);
            Date date2 = dateFormat.parse(this.timeOut);
            this.lengthOfTime = date2.getTime() - date1.getTime(); 
        } catch(ParseException ex){
            ex.printStackTrace();
        }
    }
    public String lengthTime(){
           long diff = this.lengthOfTime/1000;
           long min = 0,hour = 0;
           hour = diff/3600;
           min = (diff%3600)/60;
        return String.valueOf(hour)+" gio "+String.valueOf(min)+" phut";
    }
    @Override
    public String toString() {
        return this.playerCode+" "+this.name+" "+this.lengthTime();
    }
}
class compareByTime implements Comparator<Gamer>{
    @Override
    public int compare(Gamer o1, Gamer o2) {
        if(o1.lengthOfTime<o2.lengthOfTime) return 1;
        else return -1;
    } 
}
