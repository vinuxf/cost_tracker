import java.util.ArrayList;

public class CostTracker {

   private final ArrayList<Cost> costs;

    public CostTracker() {
        this.costs = new ArrayList<>();
    }

    public void addCosts(String date, String category, double amount){

        Cost cost = new Cost(date , category, amount);
        costs.add(cost);
        System.out.println("Successfully added the cost");

    }

    public void displayCosts(){

        System.out.println("Date\t\tCategory\t\tAmount");
        System.out.println("-----------------------------------------");

        for(Cost cost : costs){
            System.out.println(cost.date+"\t"+cost.category+"\t"+cost.amount);
        }
        System.out.println("-----------------------------------------");
    }

    public double totalCost(){

        double total = 0;

        for (Cost cost : costs){
            total += cost.amount;
        }
        return total;

    }
}
