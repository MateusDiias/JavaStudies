package Inheritance_polymorphism.Entities;

import Inheritance_polymorphism.Entities.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name + "(used) $" + price + "(Manufacture date:" + sdf.format(manufactureDate) + ")";
    }
}
