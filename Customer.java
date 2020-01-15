public class Customer{
    String name;
    String email;
    int ssn;
    Item[] items; 

    Item[] objects = new Item[10];

    public Customer(String name, String email, int ssn, Shop shop){
        this.name  = name;
        this.email = email;
        this.ssn   = ssn;
        items = Shop.getItems();
    }

    
}