public class Main {
    public static void main(String[] args) {
        CustomerList customer= new CustomerList();
        Customer cust = customer.customerOptions();

        while (true) {
            if (cust == null || cust.ifLogIn() == false) {
                cust = customer.customerOptions();
            }
            else{
                ShoppingInterface Shopping = new ShoppingInterface(cust);
            }            
        }

    }
}