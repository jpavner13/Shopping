public class Item{
    String name;
    int sku;
    double cost;

    public Item(String name, int sku, double cost){
        this.name = name;
        this.sku  = sku;
        this.cost = cost;
    }

    public static void changeName(String name){
        this.name = name;
    }

    public static void changeCost(double cost){
        this.cost = cost;
    }

    public static void changesku(int sku){
        this.sku = sku;
    }

    public static String getName(){
        return this.name;
    }

    public static double getDollars(){
        return this.cost;
    }

    public static int getCents(){
        return(this.cost * 100);
    }

    public static int getsku(){
        return this.sku;
    }
}