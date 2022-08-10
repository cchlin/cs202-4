// CS202
// Cheng Lin
// chlin@pdx.edu
// Program 4
// 08/21/2021

// This Fast_food class derived from Item class, so it has a name, a price, a size, a
// drink that is a Simple_item class and a side that is also a Simple_item class. For
// the fast food menu this is a representation of a combo meal so the drink and side
// is required. All other individual items will just be Simple_item objects.

public class Fast_food extends Item {

    private Simple_item drink;
    private Simple_item side;

    public Fast_food() {
        drink = null;
        side = null;
    }

    public Fast_food(String name, double price, String size) {
        super(name, price, size);
        drink = null;
        side = null;
    }

    public void add_drink(Simple_item drink) {
        this.drink = drink;
    }

    public void add_side(Simple_item side) {
        this.side = side;
    }

    public double calculate_price() {
        double total = getPrice();
        //if (drink != null)
            total += drink.getPrice();
        //if (side != null)
            total += side.getPrice();
        //if (drink != null && side != null)  //if drink and side are not null it's a combo
            total = total * 0.95;
        return total;
    }

    public Fast_food select() {
        selected = 1;
        return this;
    }

    public String toString() {
        if (selected == 1) {
            String result = super.toString() +
                            "\n\t" +
                            drink.toString() +
                            "\n\t" +
                            side.toString() +
                            "\n\t" +
                            String.format("%-18s %1s %-3.2f\n", "Total:", "$", calculate_price());
            return result;
        }
        else
            return super.toString();
    }
}
