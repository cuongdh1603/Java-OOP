/* TRẺ NHẤT – GIÀ NHẤT
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05032;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Cuong
 */
public class Person {

    String name;
    String dateOfBirth;
    long age;

    public Person(String name, String dateOfBirth) {
        Date date = new Date();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = convertToDate(dateOfBirth).getTime() - date.getTime();
    }

    public static Date convertToDate(String s) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(s);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class compareByAge implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age > o2.age) return 1;
        else return -1;
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/
