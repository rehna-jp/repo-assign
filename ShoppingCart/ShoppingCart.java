import java.util.Scanner;

public class ShoppingCart {

    public void displayCart(Item[] items, int itemCount) {
        if (itemCount == 0) {
            System.out.println("The cart is empty");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println((i + 1) + "." + items[i].name + ":GHC " + items[i].price);
            }
        }

        double totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].price;
        }
        System.out.println("Total price: GHC " + totalPrice);
    }

    public static int addToCart(Item[] items, int itemCount, Scanner input) {
        System.out.println("Enter item name");
        String itemName = input.nextLine();

        double itemPrice;
        while (true) {
            System.out.println("Enter the item price");
            try {
                itemPrice = Double.parseDouble(input.nextLine());
                if (itemPrice >= 0) {
                    break;
                } else {
                    System.out.println("Price must be a non-negative number");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid price");
            }
        }

        items[itemCount] = new Item(itemName, itemPrice);
        itemCount++;
        System.out.println("Item added to the cart");
        return itemCount;
    }

    public static int removeFromCart(item[] items, int itemCount, Scanner input) {
        if (itemCount == 0) {
            System.out.println("Cart is empty");
        } else {
            displayCart(items, itemCount);

            int itemNumber;
            while (true) {
                System.out.println("Enter the item number to remove");
                try {
                    itemNumber = Integer.parseInt(input.nextLine());
                    if (itemNumber >= 1 && itemNumber <= itemCount) {
                        break;
                    } else {
                        System.out.println("Invalid item number");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            for (int i = itemNumber - 1; i < itemCount - 1; i++) {
                items[i] = items[i + 1];
            }
            itemCount--;
            System.out.println("Item removed from cart.");
        }
        return itemCount;
    }

    public static void main(String[] args) {

        Item[] cart = new Item[100];
        int itemCount = 0;

        Scanner option = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Add item to cart");
            System.out.println("2. View cart");
            System.out.println("3. Remove item form cart");
            System.out.println("4.Exit");
            System.out.println("Choose an option: ");
            int choice = Integer.parseInt(option.nextLine());

            switch (choice) {
                case 1:
                    itemCount = addToCart(cart, itemCount, option);
                    break;
                case 2:
                    displayCart(cart, itemCount);
                    break;
                case 3:
                    itemCount = removeFromCart(cart, itemCount, option);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    option.close();
                default:
                    System.out.println("Invalid option. Please try again");
            }
        }
    }
}