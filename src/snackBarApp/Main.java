package snackBarApp;

public class Main {
    private static void workWithData() {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Machines
        VendingMachine foodMachine = new VendingMachine("Food");
        VendingMachine drinkMachine = new VendingMachine("Drink");
        VendingMachine officeMachine = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, foodMachine.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, foodMachine.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, foodMachine.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drinkMachine.getId());
        Snack water = new Snack("Water", 20, 2.75, drinkMachine.getId());

        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity
        // of snack 4.
        jane.buy(soda.sellSnack(3));
        System.out.println(jane.getTotalCash());
        System.out.println(soda.getQuantity());

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity
        // of snack 3.
        jane.buy(pretzel.sellSnack(1));
        System.out.println(jane.getTotalCash());
        System.out.println(pretzel.getQuantity());

        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity
        // of snack 4.
        bob.buy(soda.sellSnack(2));
        System.out.println(bob.getTotalCash());
        System.out.println(soda.getQuantity());

        // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        jane.makeMoney(10);
        System.out.println(jane.getTotalCash());

        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity
        // of snack 2.
        jane.buy(chocolate.sellSnack(1));
        System.out.println(jane.getTotalCash());
        System.out.println(chocolate.getQuantity());

        // Snack 3 gets 12 more. Print quantity of snack 3.
        pretzel.addQuantity(3);
        System.out.println(pretzel.getQuantity());

        // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity
        // of snack 3.
        bob.buy(pretzel.sellSnack(3));
        System.out.println(bob.getTotalCash());
        System.out.println(pretzel.getQuantity());

    }

    public static void main(String[] args) {
        workWithData();
    }
}