import java.util.Vector;

// CS202
// Cheng Lin
// chlin@pdx.edu
// Program 4
// 08/21/2021

// This Pizza is derived from the Item class and has a name, a price, a size, and a list
// of toppings store in a vector container. The name, price, and size is required if using
// the constructor with parameters. Adding toppings is optional.

public class Pizza extends Item {

    private Vector<Simple_item> toppings;

    public Pizza() {
        toppings = new Vector<>();
    }

    public Pizza(String name, double price, String size) {
        super(name, price, size);
        toppings = new Vector<>();
    }

    public void add_toppings(Simple_item topping) {
       toppings.add(topping);
    }

    @Override
    public double calculate_price() {
        double total = getPrice(); //get the price from super class first
        for (Simple_item topping : toppings) {
            total += topping.getPrice(); //add price of each topping if they exist
        }
        return total;
    }

    public Pizza select() {
        selected = 1;
        return this;
    }

    public String toString() {
        if (selected == 1) {
            String result = super.toString();
            result += "\n";
            for (Simple_item topping : toppings) {
                result += "\t";
                result += String.format("%-20s %.2f\n", topping.toString(), topping.getPrice());
            }
            result += "\t";
            result += String.format("%-18s %1s %-3.2f\n", "Total:", "$", calculate_price());
            return result;
        }
        else
            return super.toString();
    }
}
