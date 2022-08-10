// CS202
// Cheng Lin
// chlin@pdx.edu
// Program 4
// 08/19/2021

// This class is where the main method located and is used to test the program for
// now. A menu will be created later for the food menu to choose.

import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class program4 {

    public static void main(String[] args) throws Exception {
        //Item i = new Item("Honey Green ", 2.50f, "M");
        //i.setSize("L");
        //System.out.println(i.toString());
//        Simple_item item= new Boba("Milk Tea", 2.50, "L", 50, 30);
//        Simple_item topping1 = new Simple_item("Tapioca", 0.5);
//        Simple_item topping2 = new Simple_item("Aloe", 0.5);
//        item.add_toppings(topping1);
//        ((Boba)item).add_toppings(topping2);
//        System.out.println(item.toString());
//
//        Simple_item p = new Pizza("Pepperoni Pizza", 8.50, "12\"");
//        Simple_item topping3 = new Simple_item("Sausage", 0.5);
//        Simple_item topping4 = new Simple_item("Mushroom", 0.6);
//        Simple_item topping5 = new Simple_item("Bacon", 0.25);
//        p.add_toppings(topping3);
//        p.add_toppings(topping4);
//        p.add_toppings(topping5);
//        System.out.println(p);
//
//        Simple_item f = new Fast_food("Big Mac", 5.56, "M");
//        Simple_item c = new Simple_item("Coke", 1.12);
//        Simple_item fries = new Simple_item("Fries", 2.25);
//        f.add_drink(c);
//        f.add_side(fries);
//        //f.add_toppings(c);
//        System.out.println(f);
        Food_menu m = new Food_menu("Boba", "Pizza", "Fast_food");
        m.display();
    }

}
