public class Customer{
    String name;
    String email;
    int ssn;
    Item[] items = Shop.getItems();

    Item[] objects = new Item[10];

    public Customer(String name, String email, int ssn){
        this.name  = name;
        this.email = email;
        this.ssn   = ssn;
    }


}