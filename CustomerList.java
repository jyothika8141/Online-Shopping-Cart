import java.util.Scanner;

public class CustomerList {
    // a maximum of 20 customers shop
    Customer[] customerList = new Customer[20];
    static int customerCount = 0;
    
    public CustomerList() {}

    public Customer customerOptions() {
        Scanner Myobj = new Scanner(System.in);
        System.out.println("\n----- Login -----");
        System.out.println("1. Sign Up");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter your choice [1-3]: ");
        String choice = Myobj.next();

        switch (choice) {
            case "1":
                System.out.println("Sign up");
                return signUp();
            case "2":
                System.out.println("Login");
                return login();
            case "3":
                System.out.println("Thank you for shopping with us!");
                System.exit(0);
            default:
            System.out.println("Invalid choice");
                Customer cust = customerOptions();
                break;
        }
        return null;
    }

    public Customer login() {
        Scanner Myobj = new Scanner(System.in);
        System.out.println("\nLogin\n");
        System.out.print("Enter username: ");
        String username = Myobj.next();
        System.out.print("Enter password: ");
        String password = Myobj.next();

        int flag = 0;
        for (int i = 0; i < customerCount; i++) {
            if (customerList[i].getUsername().equals(username)) {
                if (customerList[i].getPassword().equals(password)) {
                    System.out.println("Login successful");
                    customerList[i].login();
                    customerList[i].displayUser();
                    flag = 1;
                    return customerList[i];
                }
            }
        }
        if (flag == 0) {
            System.out.println("Invalid username or password");

        }
        return null;
         
    }

    public Customer signUp() {
        Scanner Myobj = new Scanner(System.in);

        System.out.println("\nSign Up Customer details\n");

        
        try {
            System.out.print("Enter your name: ");
            String name = Myobj.next();
            System.out.print("Enter phone number: ");
            int phone = Myobj.nextInt();
            System.out.print("Enter username: ");
            String username = Myobj.next();
            System.out.print("Enter password: ");
            String password = Myobj.next();
            System.out.print("Enter address: ");
            String address = Myobj.next();

            customerList[customerCount] = new Customer(name, phone, username, password, address);
            customerCount++;
        } catch (Exception e) {
            System.out.println("Invalid phone number");
            signUp();
        }
        
        return customerList[customerCount - 1];
    }
}