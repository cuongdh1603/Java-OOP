/* SẮP XẾP DANH SÁCH GIẢNG VIÊN
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05025;
import java.util.Comparator;
import java.util.StringTokenizer;
/**
 *
 * @author Cuong
 */
public class Lecturer {
    String ID;
    String name,lastName;
    String major;
    public Lecturer(int num_id, String name, String major) {
	String str_id = String.valueOf(num_id);
	while(str_id.length()<2) str_id = '0' + str_id;
	this.ID = "GV"+str_id;
	this.name = name;
	this.lastName = name.substring(name.lastIndexOf(' ')+1);
	this.major = abbreMajor(major);
    }
    public static String abbreMajor(String str) {
	StringTokenizer token = new StringTokenizer(str.toUpperCase());
	String rs = "";
	while(token.hasMoreTokens()) rs += token.nextToken().charAt(0);
	return rs;
    }
    @Override
    public String toString() {
	return this.ID+" "+this.name+" "+this.major;
    }
}
class compareByLastName implements Comparator<Lecturer>{
    @Override
    public int compare(Lecturer o1, Lecturer o2) {
	return o1.lastName.compareTo(o2.lastName);
    }
}