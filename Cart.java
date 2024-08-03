public class Cart {
    private float totalCost = 0;
    private int itemCount = 0;
    private Product myCart[] = new Product[100];
    private int quantityCart[] = new int[100];

    public float getTotalCost() {
        return totalCost;
    }

    public void addItem(Product product, int quantity) {
        myCart[itemCount] = product;
        quantityCart[itemCount] = quantity;
        totalCost += product.getPrice()*quantity;
        itemCount++;
    }

    public void removeItem(String choice){
        for (int i=0; i < itemCount; i++){
            if (myCart[i] == null){
                continue;
            }
            if (myCart[i].getProductName().equals(choice)){
                myCart[i] = null;
            }
        }
    }
    
    public void displayProducts(){
        if (itemCount == 0){
            System.out.println("\nCart is empty!!!");
            return;
        }
        System.out.println("\nItems in Cart: ");
        for (int i=0; i< itemCount; i++){
            if (myCart[i] == null){
                continue;
            }
            System.out.printf("%d %s %.2f %d\n", i+1, myCart[i].getProductName(), myCart[i].getPrice(), quantityCart[i]);
        }
    }

    public void updateQuantity(String choice, int quantity){
        for (int i=0; i < itemCount; i++){
            if (myCart[i].getProductName() == null){
                continue;
            }
            if (myCart[i].getProductName().equals(choice)){
                quantityCart[i] = quantity;
            }
        }
    }

    public void calculateTotalPrice(){
        for (int i=0; i< itemCount; i++){
            if (myCart[i] == null){
                continue;
            }
            totalCost += myCart[i].getPrice() * quantityCart[i];
        }
    }

    public void deleteCart(){
        for (int i=0; i< itemCount; i++){
            myCart[i] = null;
        }
        totalCost = 0;
        itemCount = 0;
    }
}