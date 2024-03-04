import java.util.Scanner;

public class Main {

    public static void main (String args[]) {

        Main m1 = new Main();
        m1.menu();
    }

    public void menu(){
        CostTracker costTracker = new CostTracker();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Cost");
            System.out.println("2. Display Costs");
            System.out.println("3. Total Costs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int user = input.nextInt();

            switch (user) {
                case 1:
                    System.out.println("Enter the date in this format *yyyy/mm/dd*");
                    String date = input.next();
                    System.out.println("Enter the category");
                    String category = input.next();
                    System.out.println("Enter the amount");
                    double amount = input.nextDouble();
                    costTracker.addCosts(date, category, amount);
                    break;
                case 2:
                    costTracker.displayCosts();
                    break;
                case 3:
                    System.out.println("Total Costs are: " + costTracker.totalCost());
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}

