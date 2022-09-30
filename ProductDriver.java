import java.io.*;
import java.util.Scanner;

public class ProductDriver {
	public static void main(String[] args) throws IOException{
		File file = new File("./Inventory.txt");
		Product[] Inventory = new Product[100];
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()){
			String temp = scanner.nextLine();
			String[] tokens = temp.split("//");
			int id = Integer.valueOf(tokens[0]);
			String name = tokens[1];
			double price = Double.valueOf(tokens[2]);
			char type = tokens[3].charAt(0);
			switch(type){
				case 'X':
					Inventory[Product.count] = new ProductX(id, name, price, type);
					break;
				case 'Y':
					Inventory[Product.count] = new ProductY(id, name, price, type);
					break;
				case 'Z':
					Inventory[Product.count] = new ProductZ(id, name, price, type);
					break;
				default:
					System.out.println("Invalid Product in the list");
					System.exit(0);
					break;
			}
			Product.count++;
		}
		scanner.close();

		Scanner scanner2  = new Scanner(System.in);
		// welcome and ask user's name
		System.out.println("Welcome");
		System.out.println("Input your first name");
		String first = scanner2.nextLine();
		System.out.println("Input your last name");
		String last = scanner2.nextLine();
		User user = new User(first, last);

		// Printing out the inventory
		System.out.println("Inventory:");
		for(int i = 0; i<Product.count; i++){
			Product x = Inventory[i];
			System.out.println(x.getid() + " " + x.getname() + " " + x.dollarANDcents() + " " + x.gettype());
		}

		boolean cont = true;
		do{
		System.out.println("Enter choice");
		int choice = scanner2.nextInt();
		System.out.println("Enter the Amount");
		int amount = scanner2.nextInt();
		System.out.println("Please input the purchasing date: mm/dd/yyyy");
		String string_date = scanner2.nextLine();
		Date date = new Date(string_date);
		int index = choice - 1;
		if(index >= Product.count || index < 0){
			System.out.println("Wrong input");
			System.exit(0);
		}
		Order order = new Order(date,user,Inventory[index],amount);
		order.output();
		System.out.println("\nContinue? (0/1): {0 for No} {1 for Yes} ");
		int ans = scanner2.nextInt();
		if(ans == 0){
			cont = false;
		}
		}while(cont == true);
		scanner2.close();
	}
	
}
