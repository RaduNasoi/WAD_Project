
package WADproject;

import java.util.Objects;

public class Food {
    int ID;
    String name;
    int weight;
    double price;

    public Food(int ID, String name, int weight, double price) {
        this.ID = ID;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Food{" + "ID=" + ID + ", name=" + name + ", weight=" + weight + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    

  

 

 
    
}
