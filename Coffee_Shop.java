package coffeeq;

public class Coffee_Shop {
    public static void main(String[] args) {
        double price = 50 + (33 * 2);
        int quantity = 2 + (3 % 5);

        CoffeeOrder order = new CoffeeOrder("Matcha", price, quantity);
        order.showReceipt();
    }
}