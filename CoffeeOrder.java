package coffeeq;

public class CoffeeOrder {
    private String menuName;
    private double price;
    private int quantity;

    public CoffeeOrder(String menuName, double price, int quantity) {
        this.menuName = menuName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calTotal() {
        return price * quantity;
    }

    public double calDiscount() {
        double total = calTotal();
        if (total >= 500) {
            return total * 0.10;
        }
        return 0;
    }

    public void showReceipt() {
        double total = calTotal();
        double discount = calDiscount();
        double net = total - discount;

        System.out.println("============= Receipt =============");
        System.out.println("Menu name : " + menuName);
        System.out.println("Price     : " + price + " Baht");
        System.out.println("Quantity  : " + quantity);
        System.out.println("-----------------------------------");
        System.out.println("Total price : " + total + " Baht");
        System.out.println("Discount    : " + discount + " Baht");
        System.out.println("Net price   : " + net + " Baht");
        System.out.println("===================================");
    }
}