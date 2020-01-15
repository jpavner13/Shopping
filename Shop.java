public class Shop{
    public static void main(String[] args){
        Item[] items = new Item[10];
        Customer[] customer = new Customer[10];

        items[0] = new Item("Pigeon Head Pillow"            , 69693, 10.69);
        items[1] = new Item("Pigeon Head"                   , 35253, 100.69);
        items[2] = new Item("Pigeon"                        , 83415, 0.00);
        items[3] = new Item("Head Pillow Shaped Like Pigeon", 62393, 4.20);
        items[4] = new Item("Pigeon Mug(Its A Real Pigeon)" , 35969, 5.27);
        items[5] = new Item("Pigeon Foot Massage"           , 73235, 59.99);
        items[6] = new Item("Diamond Baby Pigeon Passifier" , 69693, 10000.69);
        items[7] = new Item("Odly Shaped Pigeon"            , 85392, -5.32);
        items[8] = new Item("Vintage Pigeon Tshirt"         , 23553, 69.42);
        items[9] = new Item("Duck named Pigeon"             , 57372, 500.99);

        Order order1 = new Order(items);
        
        order1.displayOrder();

        customer[1] = new Customer("Little Timmy P.", "datboidabdab@yourmom.com", 4206969, items, 13579);
    }
} 