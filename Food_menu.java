import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Food_menu {

    private Menu[] menu;

    public Food_menu() {
        menu = new Menu[3];
    }

    public Food_menu(String file1, String file2, String file3) throws Exception {
        menu = new Menu[3];
        menu[0] = read_Boba(file1);
    }

    public Menu read_Boba(String file_name) throws Exception {
        Menu list = new Menu();
        try {
            Scanner readFile = new Scanner(new File("src/" + file_name + ".txt"));
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] token = line.split("@");
                if (token.length == 1) {
                   list.setName(token[0]);
                }
                else if (token.length == 2) {
                    Simple_item item = new Simple_item(token[0], Double.parseDouble(token[1]));
                    list.add(item);
                }
                else {
                    Boba item = new Boba(token[0], Double.parseDouble(token[1]), token[2]);
                    System.out.println(item);
                    list.add(item);
                }
            }
            readFile.close();
        }
        catch (FileNotFoundException e) {
           menu[0] = null;
        }
        return list;
    }
    public void read_Pizza(String file_name) {}
    public void read_Fast_food(String file_name) {}

    public void display() {
        menu[0].display();
    }

    private class Menu {
        public Item_node head;
        public Menu next;
        public Menu prev;
        public String name;

        public Menu() {
            this(null, null, null, null);
        }

        public Menu(String name) {
            this(null, name, null, null);
        }

        public Menu(Item_node head, String name, Menu next, Menu prev) {
            this.head = head;
            this.name = name;
            this.next = next;
            this.prev = prev;
        }

        public void connect_next(Menu connection) {
            this.next = connection;
        }

        public void connect_prev(Menu connection) {
            this.prev = connection;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void add(Simple_item item) {
            head = add(head, item);
        }

        private Item_node add(Item_node head, Simple_item item) {
            if (head == null) {
                Item_node newNode = new Item_node(item);
                head = newNode;
                return head;
            }
            head.next = add(head.next, item);
            head.next.prev = head;
            return head;
        }

        public void display() {
            display(head);
        }

        private void display(Item_node head) {
            if (head == null)
                return;
            System.out.println(head.toString());
            display(head.next);
        }
    }

    private class Item_node {

        public Simple_item data;
        public Item_node next;
        public Item_node prev;

        public Item_node(Simple_item data) {
            this(data, null, null);
        }

        public Item_node(Simple_item data, Item_node next, Item_node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public void connect_next(Item_node connection) {
            this.next = connection;
        }

        public void connect_prev(Item_node connection) {
            this.prev = connection;
        }

        public String toString() {
            return data.toString();
        }
    }
}
