// Purpose: This file contains the ShoppingInterface class which is used to create a shopping interface object.
// The shopping interface object is used to display the shopping menu.
// The shopping interface object is used to add/remove/display product to/from the cart.    
// The shopping interface object is used to make an order.


import java.util.Scanner;

public class ShoppingInterface implements ShopManager {
    private Product[] productCart = new Product[20];
        
    Customer customer;
    Scanner MyObj = new Scanner(System.in);

    public ShoppingInterface(Customer customer) {
        this.customer = customer;
        loadProducts();
        shoppingMenu();
    }

    public void shoppingMenu() {
        boolean exit = true;
        while (exit) {
            System.out.println("\n----- Shopping Menu -----");
            System.out.println("1. Add product to cart");
            System.out.println("2. Change quantity of product");
            System.out.println("3. Delete product from cart");
            System.out.println("4. Display items in Cart");
            System.out.println("5. Place Order");
            System.out.println("6. Log out");
            System.out.print("Enter your choice [1-6]: ");
            String choice = MyObj.next();
            switch (choice) {
                case "1":
                    addProductToCart();
                    break;
                case "2":
                    customer.getCart().displayProducts();
                    System.out.print("Enter the product Name to update: ");
                    String choice1 = MyObj.next();
                    System.out.print("Enter the quantity: ");
                    int quantity = MyObj.nextInt();
                    customer.getCart().updateQuantity(choice1, quantity);
                    break;
                case "3":
                    removeProductFromCart();
                    break;
                case "4":
                    customer.getCart().displayProducts();
                    break;
                case "5":
                    makeOrder();
                    break;
                case "6":
                    customer.Logout();
                    System.out.println("Logged out successfully");
                    return;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }

    @Override
    public void addProductToCart() {
        displayProducts();
        System.out.print("Enter the product ID: ");
        int choice = MyObj.nextInt();
        System.out.print("Enter the quantity: ");
        int quantity = MyObj.nextInt();
        switch (choice){
            case 1:
                productCart[0].updateQuantity(productCart[0].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[0], quantity);
                break;
            case 2:
                productCart[1].updateQuantity(productCart[1].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[1], quantity);
                break;
            case 3:
                productCart[2].updateQuantity(productCart[2].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[2], quantity);
                break;
            case 4:
                productCart[3].updateQuantity(productCart[3].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[3], quantity);
                break;  
            case 5:
                productCart[4].updateQuantity(productCart[4].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[4], quantity);
                break;
            case 6:
                productCart[5].updateQuantity(productCart[5].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[5], quantity);
                break;  
            case 7:
                productCart[6].updateQuantity(productCart[6].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[6], quantity);
                break;
            case 8:
                productCart[7].updateQuantity(productCart[7].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[7], quantity);
                break;
            case 9:
                productCart[8].updateQuantity(productCart[8].getQuantityAvailable() - 1);
                customer.getCart().addItem(productCart[8], quantity);
                break;           
            default:
                System.out.println("Invalid choice, please try again");
                break;
        }
    }

    @Override
    public void removeProductFromCart() {
        System.out.print("Enter the product Name to delete: ");
        String choice = MyObj.next();
        customer.getCart().removeItem(choice);    
    }

    @Override
    public void displayProducts() {
        for (int i = 0; i < 9; i++) {
            System.out.println(productCart[i]);
        } 
    }

    @Override
    public void loadProducts() {
        productCart[0] = new Apparel("1", "Shirt", 10, 20.0, "Apparel", "M", "Cotton");
        productCart[1] = new Apparel("2", "Pants", 10, 30.0, "Apparel", "M", "Cotton");
        productCart[2] = new Apparel("3", "Dress", 10, 40.0, "Apparel", "M", "Cotton");

        productCart[3] = new Electronics("4", "Laptop", 10, 1000.0, "Electronics", "Dell", 12);
        productCart[4] = new Electronics("5", "Phone", 10, 500.0, "Electronics", "Apple", 12);
        productCart[5] = new Electronics("6", "Tablet", 10, 300.0, "Electronics", "Samsung", 12);

        productCart[6] = new Apparel("7", "Shirt", 10, 20.0, "Apparel", "M", "Cotton");
        productCart[7] = new Apparel("8", "Pants", 10, 30.0, "Apparel", "M", "Cotton");
        productCart[8] = new Apparel("9", "Dress", 10, 40.0, "Apparel", "M", "Cotton");
    }

    @Override
    public void makeOrder() {  
        customer.getOrder().makeOrder(customer.getCart());
        System.out.println("Order placed successfully");
        customer.getCart().deleteCart();
    }
}
