public class Order{
    String names[] = new names[10];
    int    cost[]  = new cost[10];
    int    sku[]   = new sku[10];

    double salesTax = 0.08;

    public Order(Item items[]){
        // Define lists
    }

    public static int getTotalCost(){
        int totalCost;
        for(n = 0; n < 10; n++){
            totalCost += this.cost[n];
        }
        return (totalCost + (this.salesTax * totalCost));
    }

    public static displayOrder(){

    }
}