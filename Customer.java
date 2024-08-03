// Purpose: This file contains the Customer class which is used to create a customer object.
// The customer object is used to store the customer details and the customer's cart and previous orders.
// The customer object is also used to display the customer details.
// The customer object is also used to edit the customer profile.
// The customer object is also used to create a new order.
// The customer object is also used to display the orders.
// The customer object is also used to get the cart and order objects.

public class Customer {
    private String name;
    private int phone;
    private String username;
    private String password;
    private String address;
    private boolean logged_in = false;
    private static int orderCount = -1;

    private Cart cart = new Cart();
    private Order myOrder[] = new Order[10];

    public Customer(String name, int phone, String username, String password, String address) {
        this.name = name;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.address = address;
        System.out.println("Profile created successfully");
    }

    public String getUsername() {
        return username;
    }

    public Cart getCart() {
        return cart;
    }

    public Order getOrder() {
        orderCount++;
        myOrder[orderCount] = new Order();
        return myOrder[orderCount];
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public boolean ifLogIn() {
        if (logged_in)
            return true;
        else
            return false;
    }

    public void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Username: " + username);
        System.out.println("Address: " + address);
    }

    public void login() {
        if (logged_in) {
            System.out.println("Already logged in");
        } else {
            this.logged_in = true;
            System.out.println("Logged in successfully");
        }
    }

    public void Logout() {
        if (logged_in) {
            this.logged_in = false;
            // System.out.println("Logged out");
            return;
        } else
            System.out.println("Already logged out");
    }

    public void showOrder() {
        for (int i = 0; i < orderCount; i++) {
            System.out.println("Order " + (i + 1));
            System.out.println("Items: ");
            myOrder[i].order.displayProducts();
            System.out.println("Total cost: " + myOrder[i].order.getTotalCost());
        }
    }
}
