package aplication.entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date manufactureDate;

    public UsedProduct(String nome, Double price, Date manufactureDate) {
        super(nome, price);
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
        return getNome() + " (used) " +
                String.format("$ %.2f") +
                "(Manufacture date: " + sdf.format(manufactureDate);
    }
}