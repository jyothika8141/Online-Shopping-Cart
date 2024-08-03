public class Product {
    private String productID;
    private String productName;
    private int quantityAvailable;
    private double price;
    private String productType;

    public Product(String Id, String Name, int quantityAvailable, double price, String Type) {
        this.productID = Id;
        this.productName = Name;
        this.quantityAvailable = quantityAvailable;
        this.price = price;
        this.productType = Type;
    }

    //setters
    public void setProductID(String productID){
        this.productID = productID;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setQuantityAvailable(int quantityAvailable){
        this.quantityAvailable = quantityAvailable;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQroductType(String productType){
        this.productType = productType;
    }

    //getters
    public String getProductID(){
        return productID;
    }

    public String getProductName(){
        return productName;
    }

    public int getQuantityAvailable(){
        return quantityAvailable;
    }

    public double getPrice(){
        return price;
    }

    public String getProductType(){
        return productType;
    }

    //method functions
    public void updateQuantity(int quantityAvailable){
        this.quantityAvailable = quantityAvailable;
    }

    public void updatePrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("\n" +
                        "Product Type:    %s\n" +
                        "Product ID:      %s\n" +
                        "Product Name:    %s\n" +
                        "Price:           Rs%.2f\n",
                productType, productID, productName, price
        );
    }
}
