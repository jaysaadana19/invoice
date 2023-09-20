import java.util.Scanner;

public class InvoiceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get customer information
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        // Get item details
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter item price: $");
        double itemPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total amount
        double totalAmount = itemPrice * quantity;

        // Print invoice
        System.out.println("\nInvoice:");
        System.out.println("Customer: " + customerName);
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: $" + totalAmount);

        scanner.close();
    }
}
