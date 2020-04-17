package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order ord = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			Product prod = new Product(productName, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, price, prod);
			
			ord.addItem(orderItem);
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(ord);
		
		sc.close();

	}

}
