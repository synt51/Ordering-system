package repos;

import java.util.Objects;

public class Product {

    /*
    should contain: id, name
     */

    int id;
    String name;
    float price;

    public Product (int id, String name){

        this.id = id;
        this.name = name;
        this.price = price;
    }


    public String getName() {

        return name;
    }




    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produktnummer: " + id +
                ", Produkt: " + name +
                ", Preis: " + price;
    }
}
