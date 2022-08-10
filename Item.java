// CS202
// Cheng Lin
// chlin@pdx.edu
// Program 4
// 08/17/2021

// This class is the abstract class that has a private field called size. Three
// main food categories are derived from this class. All other kind of food
// such as toppings, sides, beverages will be just using the Simple_item class
// not this class.


public abstract class Item extends Simple_item {

    private String size;

    public Item() {
        this.size = null;
    }

    public Item(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void setSize(String size) {
       this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        String result = String.format("%-24s %.2f\n", super.toString(), getPrice()) +
               "\tsize  " + size;
        return result;
        //System.out.printf("%-24s %.2f\n", super.toString(), getPrice());

        //System.out.println("\tsize  " + size);
    }

    public abstract double calculate_price();

}
