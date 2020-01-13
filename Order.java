public class Order{
    private double totalCost = 0;
    Item[] items = new Item[10];
    String names[] = new String[10];
    int    sku[]   = new int[10];

    double salesTax = 0.08;

    public Order(Item[] items){
        // Define lists
        this.items = items;
        
        for (Item item : items) {
            totalCost += item.getDollars();
        }
        totalCost += this.salesTax * this.totalCost;
        totalCost = Math.round(totalCost * 100.0) / 100.0;
    }

    public double getTotalCost(){
        return totalCost;
    }

    public void displayOrder(){
        
        String leftAlignFormat = "| %-15s | %-4d |%n";

        System.out.format("+-----------------+------+%n");
        System.out.format("| Item     | Price   |%n");
        System.out.format("+-----------------+------+%n");
        for (Item item : items) {
            // System.out.format(leftAlignFormat, item.getName(), "$" + item.getDollars());
            System.out.format(leftAlignFormat, item.getName(), "$" + Double.toString(item.getDollars()));

        }
        System.out.format("+-----------------+------+%n");

        // System.out.println("Your order: ");
        // for (Item item : items) {
        //     System.out.println("$" + item.getDollars());   
        // }
        // System.out.println("\nTotal:\n$" + totalCost);
    }
}