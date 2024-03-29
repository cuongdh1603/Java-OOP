/*
LƯỢNG MƯA TRUNG BÌNH

Trong một ngày mưa nhiều, các trạm đo mưa hoạt động hết công suất. Tại mỗi trạm đo, các cơn mưa được ghi nhận thời điểm bắt đầu, thời điểm kết thúc và lượng mưa đo được. Một trạm mưa có thể có nhiều lần mưa trong ngày.
Hãy tính lượng mưa trung bình trong 1 giờ (60 phút) của từng trạm theo đúng thứ tự trong danh sách ban đầu. Chú ý để tính lượng mưa trung bình thì cần tính tất các lần đo mưa tại trạm đó.

Input
Dòng đầu ghi số lượt đo lượng mưa.
Thông tin về một lần đo lượng mưa gồm 4 dòng:

Tên trạm
Thời điểm bắt đầu mưa (hh:mm)
Thời điểm kết thúc mưa (hh:mm)
Lượng mưa đo được
Số trạm đo khác nhau nhỏ hơn 10.

Output
Ghi ra danh sách các trạm khác nhau trong danh sách đo mưa và lượng mưa trung bình của từng trạm.
Thông tin trên mỗi dòng lần lượt gồm:
Mã trạm đo (tính từ T01). Chú ý: nếu cùng tên trong danh sách đo thì cũng sẽ cùng mà trạm.
Tên trạm đo mưa
Lượng mưa trung bình trong 1 giờ tại mỗi trạm (tính chính xác đến 2 số phần thập phân).
Các thông tin ghi cách nhau một khoảng trống.
*/
package J05019;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()),gen_id = 1;
        ArrayList<Station> sta = new ArrayList<>();
        while(t-->0){
            String n = sc.nextLine();
            boolean exit = false;
            for (Station station : sta) {
                if(station.name.equals(n)){
                    exit = true;
                    station.addNewTime(sc.nextLine(), sc.nextLine());
                    station.addNewAmount(Double.parseDouble(sc.nextLine()));
                    break;
                }
            }
            if(!exit){
                Station st = new Station(gen_id++,n);
                st.addNewTime(sc.nextLine(), sc.nextLine());
                st.addNewAmount(Double.parseDouble(sc.nextLine()));
                sta.add(st);
            }
        }
        for (Station station : sta) {
            System.out.println(station);
        }
    }
}
/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
*/