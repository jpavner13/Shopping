public class Order{
    private double totalCost = 0;
    private double totalWithTax = 0;
    private double tax = 0;

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
        totalCost = Math.round(totalCost * 100.0) / 100.0;
        tax = this.salesTax * this.totalCost;
        totalWithTax = totalCost + tax;
    }

    public double getTotalCost(){
        return totalCost;
    }

    public void displayOrder(){
        
        String leftAlignFormat = "| %-30s | %-8.2f | %-7d | %n";
        String leftAlignFormat2 = "| %-30.2f | %-8.2f | %-7.2f | %n";

        System.out.format("+--------------------------------+----------+---------+%n");
        System.out.format("| Item                           | Price    | SKU     |%n");
        System.out.format("+--------------------------------+----------+---------+%n");

        for (Item item : items) {
           // System.out.format(leftAlignFormat, item.getName(), item.getDollars());
            System.out.format(leftAlignFormat, item.getName(), item.getDollars(), item.getsku());

           // %.2f %n, item.getDollars());
        }

        System.out.format("+--------------------------------+----------+---------+%n");
        
        System.out.format("+--------------------------------+----------+----------+%n");
        System.out.format("| Total                          | Tax      | Final    |%n");
        System.out.format("+--------------------------------+----------+----------+%n");

        System.out.format(leftAlignFormat2, this.totalCost, this.tax, this.totalWithTax);
        System.out.format("+--------------------------------+----------+----------+%n");

        // System.out.println("Your order: ");
        // for (Item item : items) {
        //     System.out.println("$" + item.getDollars());   
        // }
        // System.out.println("\nTotal:\n$" + totalCost);
    }
}