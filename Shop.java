public class Shop{
    public static void main(String[] args){
        Item item1 = new Item("Pigeon Head Pillow"            , 69693, 10.69);
        Item item2 = new Item("Pigeon Head"                   , 35253, 100.69);
        Item item3 = new Item("Pigeon"                        , 83415, 0.00);
        Item item4 = new Item("Head Pillow Shaped Like Pigeon", 62393, 4.20);
        Item item5 = new Item("Pigeon Mug(Its A Real Pigeon)" , 35969, 5.27);
        Item item6 = new Item("Pigeon Foot Massage"           , 73235, 59.99);
        Item item7 = new Item("Diamond Baby Pigeon Passifier" , 69693, 10000.69);
        Item item8 = new Item("Odly Shaped Pigeon"            , 85392, -5.32);
        Item item9 = new Item("Vintage Pigeon Tshirt"         , 23553, 69.42);
        Item item10 = new Item("Duck named Pigeon"            , 57372, 500.99);

        Item[] items = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        Order order1 = new Order(items);
        
        order1.displayOrder();
    }
} 