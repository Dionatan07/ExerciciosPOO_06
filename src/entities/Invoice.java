package entities;

public class Invoice {

    private int number;
    private String name;
    private int amount;
    private double price;

    public Invoice() {
    }

    public Invoice(int number, String name, int amount, double price) {
        this.number = number;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount(){
        return amount * price;
    }

    public String toString(){
        return "Nº " + number + "\n"
                + "Description: " + name + "\n"
                + "Amount: " + amount + "\n"
                + "Price: " + String.format("%.2f", price);
    }

}
