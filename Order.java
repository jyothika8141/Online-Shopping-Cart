// Purpose: This file contains the Order class which is used to create an order object and display the order details.


public class Order {
     String orderDate = "";
    //  String s = new String("hi");

     int x = 10;
     char c ='h';
     Integer i = 5;
    private String orderStatus;
    private String paymentStatus;

    Cart order = new Cart();

    public Order() {
        orderDate = "12/12/2021";
        orderStatus = "Processing";
        paymentStatus = "Completed";
    }

    public void makeOrder(Cart cart) {
        this.order = cart;
        System.out.println("Items: ");
        this.order.displayProducts();
        System.out.println("Total cost: " + this.order.getTotalCost());
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Payment Status: " + paymentStatus);
    }
}
