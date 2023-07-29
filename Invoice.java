public class Invoice implements Payable {
    String partNumber,partDescription;
    int quantity;
    double price;
    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        if(quantity < 0 || price < 0.0) throw new IllegalArgumentException();
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if(quantity < 0) throw new IllegalArgumentException();
        else this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price < 0.0) throw new IllegalArgumentException();
        else this.price = price;
    }
    @Override
    public double getPaymentAmount() {
        return quantity * price;
    }
    @Override
    public String toString() {
        return partNumber + " " + partDescription + " " + quantity + " " + price;
    }
}
