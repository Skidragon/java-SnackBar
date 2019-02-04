package snackBarApp;

public class Customer {
    private static int maxId = 0;
    private int id = maxId;
    private String name;
    private double cash;

    public Customer(String name, double cash) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public void makeMoney(double moneyEarned) {
        cash += moneyEarned;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getTotalCash() {
        return cash;
    }

}