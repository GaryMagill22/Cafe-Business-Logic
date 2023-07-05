import java.util.ArrayList;


class CafeUtil {
    
    // METHODS
// Method to find out if customer gets streakGoal
    public int getStreakGoal(int numWeeks){
        int sum = 0;
for (int i=1; i<=10; i++){
    sum += i;
}
return sum;
    }

// Method to get order Total for each customer
    public double getOrderTotal(double[] prices) {

        // double[] prices = {3.5, 1.5, 4.0, 4.5};

            double sum = 0;
        for(int i=0; i<prices.length; i++){
            sum = sum + prices[i];

        }
        return sum;
    }

// Method to print out indexes of menuItems and The items themselves
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i=0; i<menuItems.size(); i++){
            System.out.println(i);
            System.out.println(menuItems.get(i));

        }
    }

// Method to tell customer how many people in front of them to order
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name.");
        // Get user input and store into variable called "username"
        String username = System.console().readLine();
        System.out.println("Hello, " + username );
    System.out.println("There are " + customers.size() + " people in front of you");
    customers.add(username);
    }

}

