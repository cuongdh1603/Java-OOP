/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06006;
/**
 *
 * @author Cuong
 */
public class Product {

    String ID;
    String name;
    String unit;
    long buyPrice;
    long sellPrice;

    public Product() {
    }

    public Product(int num_id, String name, String unit, long buyPrice, long sellPrice) {
        String str_id = String.valueOf(num_id);
        while (str_id.length() < 3) str_id = '0' + str_id;
        this.ID = "MH" + str_id;
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
