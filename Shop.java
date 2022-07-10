import java.util.Scanner;
// Shop Class
public class Shop {
    private static double totalAmount = 0.00;
    private static Product[] inventory = {
            new Product("Business Ritual Women\'s Long Sleeve Top", 65.39, "Apparel", 4, 'L',"Blue"),
            new Product("The Art of Computer Programming", 190.54,  "Books", 9,  "Donald E. Knuth"),
            new Product("Men\'s Business Casual Shirt", 57.10, "Apparel", 2, 'M',"Teal"),
            new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1),
            new Product("First Design Pattern", 37.35, "Books", 3,  "Eric Freeman") };

    public static void main (String[] args) {
        int userInput = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            displayMenu();
            userInput = Integer.parseInt(input.nextLine());
            if ((userInput >= 0) && (userInput <= 4)) {
                if (inventory[userInput].buy( )) {
                    System.out.println ("Your purchase was successful");
                    totalAmount += inventory[userInput].getPrice();
                }
                else System.out.println ("Sorry! This product is out of stock.");
            }
            else break;
        }
        System.out.println ("Thank you for shopping with us! The total amount is " + totalAmount);
        input.close();
    }
    private static void displayMenu() {
        System.out.println("Enter the product index (0 to 4) you want to buy.To exit the shopping cart, enter any number other than 0 to 4");

        for (int i = 0; i < inventory.length; i++) {
            System.out.println(i + ":" + inventory[i].getName() );
        }
    }
}

