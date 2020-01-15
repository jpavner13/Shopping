public class Customer{
    String name;
    String email;
    int ssn;
    Shop shop; 

    Item[] objects = new Item[10];
    Item[] purchaces = new Item[10];

    public Customer(String name, String email, int ssn, Item[] items, int buyingItems){
        this.name  = name;
        this.email = email;
        this.ssn   = ssn;
        objects = items;
        //System.out.println(objects[0].getName());

        int newbuyingItems = buyingItems;
        for(int num = 0; num < String.valueOf(newbuyingItems).length() + 4; num ++){
            int lastNum = newbuyingItems % 10;
            purchaces[num] = objects[lastNum];
            newbuyingItems = newbuyingItems / 10 ;
            System.out.println(purchaces[num].getName());
        }
    }

}