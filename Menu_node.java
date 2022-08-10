import java.awt.*;

public class Menu_node<E> {

   private Simple_item food_type;
   private Menu_node next;
   private Menu_node prev;

   public Menu_node() {
      this.food_type = null;
      next = prev = null;
   }

   public Menu_node(Simple_item obj) {
       if (obj instanceof Boba)
          food_type = (Boba)obj;
       if (obj instanceof Pizza)
          food_type = (Pizza)obj;
       if (obj instanceof Fast_food)
          food_type = (Fast_food)obj;
       next = prev = null;
   }

   public void connect_next(Menu_node connection) {
      next = connection;
   }

   public void connect_prev(Menu_node connection) {
      prev = connection;
   }

   public Menu_node go_next() {
      return next;
   }

   public Menu_node go_prev() {
      return prev;
   }
}
