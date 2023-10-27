import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Use a scanner to prompt the user customer eatails
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter customer street: ");
        String street = scanner.nextLine();
        System.out.println("Enter customer city: ");
        String city = scanner.nextLine();
        System.out.println("Enter customer state: ");
        String state = scanner.nextLine();
        System.out.println("Enter customer country: ");
        String country = scanner.nextLine();

        //Create a new customer object
        Customer customer = new Customer(name, new Address("street", city, state, country));

        //Create a product object list
        Product[] products = new Product[3];
        products[0] = new Product("Product 1", 1, 10.0,1);
        products[1] = new Product("Product 2", 2, 20.0, 2);
        products[2] = new Product("Product 3", 3, 30.0, 3);

        //Create a new order object
        Order order = new Order(customer, products);

        //calculate the  total price * quantity
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }

        //Print the order details
        System.out.println("Customer name: " + order.getCustomer().getName());
        System.out.println("Customer address: " + order.getCustomer().getAddress().getStreet() + ", " + order.getCustomer().getAddress().getCity() + ", " + order.getCustomer().getAddress().getState() + ", " + order.getCustomer().getAddress().getCountry());
        System.out.println("Total price: " + totalPrice);
    }
}