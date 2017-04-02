

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Product {
    int ID;
    String name;
    String type;
    String description;
    double unit_price;

    public Product(int ID, String name, String type, String description, double unit_price) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.description = description;
        this.unit_price = unit_price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getUnit_price() {
        return unit_price;
    }

    @Override
    public String toString() {
 
        return "Product{" + "ID=" + ID + ", name=" + name + ", unit_price=" + unit_price + "}";

    }
    
    
}
