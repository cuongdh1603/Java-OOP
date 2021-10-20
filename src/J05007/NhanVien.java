/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

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
    int date,month,year;
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

    public void getInforOfDOB() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date fixedDate = dateFormat.parse(this.dateOfBirth);
            this.date = fixedDate.getDate();
            this.month = fixedDate.getMonth();
            this.year = fixedDate.getYear();
            //return dateFormat.format(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        //return dateOfBirth;
    }
     
    @Override
    public String toString() {
        return this.getID()+" "+this.name+" "+this.gender+" "+this.dateOfBirth+
                " " + this.address+" "+this.taxCode+ " " + this.contrastDate;
    }
}
class compareByAge implements Comparator<NhanVien>{
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if(o1.year>o2.year) return 1;
        else if(o1.year<o2.year) return -1;
        else
            if(o1.month>o2.month) return 1;
            else if(o1.month<o2.month) return -1;
            else
                if(o1.date>o2.date) return 1;
                else if(o1.date<o2.date) return -1;
                else return 0;
    } 
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/