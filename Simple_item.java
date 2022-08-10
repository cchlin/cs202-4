// CS202
// Cheng Lin
// chlin@pdx.edu
// Program 4
// 08/19/2021

// This class is the simplest item class that has a name and a price. All the
// menu items are build from this class such as a single burger or the toppings
// of the pizza. This is the parent of all the menu classes.

public class Simple_item {

    private String name;
    private double price;
    protected int selected;


    public Simple_item() {
        this.name = null;
        this.price = 0.0;
        this.selected = 0;
    }

    public Simple_item(String name, double price) {
        this.name = name;
        this.price = price;
        this.selected = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name;
    }

    public void add_toppings(Simple_item topping) {
        System.out.println("Wrong method used");
    }
    public void add_drink(Simple_item drink) {
        System.out.println("Wrong method used");
    }
    public void add_side(Simple_item side) {
        System.out.println("Wrong method used");
    }

}
