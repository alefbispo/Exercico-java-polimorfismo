package aplication.entites;

public class ImportedProduct extends Product{
    private Double customsFree;

    public ImportedProduct(String nome, Double price, Double customsFree) {
        super(nome, price);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }
    public Double totalPrice(){
        double totPRice = getPrice() + customsFree;
        return totPRice;
    }

    @Override
    public String priceTag() {
        return super.priceTag() +
                String.format(" (Customs free: $ %.2f)", totalPrice());
    }
}
