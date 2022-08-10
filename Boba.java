import java.util.Vector;

// CS202
// Cheng Lin
// chlin@pdx.edu
// Program 4
// 08/20/2021

// This class is derived from Item class so this class has a name, a price, and a size
// plus the sweetness and the ice_level and a list of toppings store in a vector
// container. Name, price, size, sweetness and ice_level have to be set if using
// the constructor with parameters. Adding topping is optional.

public class Boba extends Item {

    private int sweetness;
    private int ice_level;
    private Vector<Simple_item> toppings;

    public Boba() {
        sweetness = 0;
        ice_level = 0;
        toppings = new Vector<>();
    }

    public Boba(String name, double price, String size) {
        this(name, price, size, 0, 0);
    }

    public Boba(String name, double price, String size, int sweetness, int ice_level) {
        super(name, price, size);
        this.sweetness = sweetness;
        this.ice_level = ice_level;
        toppings = new Vector<>();
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    public void setIce_level(int ice_level) {
        this.ice_level = ice_level;
    }

    public void add_toppings(Simple_item topping) {
        toppings.add(topping);
    }

    @Override
    public double calculate_price() {
        double total = getPrice(); //get the price from super class first
        for (int i = 0; i < toppings.size(); ++i) {
            total += toppings.get(i).getPrice(); //if toppings has element, add the price of
        }                                        //each one
        return total;
    }

    public Boba select() {
        selected = 1;
        return this;
    }

    public String toString() {
        if (selected == 1) {
            String result = super.toString();
            result += "\n\tSweetness  " + sweetness + "%\n";
            result += "\tIce level  " + ice_level + "%\n";
            for (int i = 0; i < toppings.size(); ++i) {
                result += "\t";
                result += String.format("%-20s %.2f\n", toppings.get(i).toString(), toppings.get(i).getPrice());
            }
            result += "\t";
            result += String.format("%-18s %1s %-3.2f\n", "Total:", "$", calculate_price());
            return result;
        }
        else
            return super.toString();
    }
}
