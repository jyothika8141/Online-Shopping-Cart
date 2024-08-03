public class Electronics extends Product{
    private String brand;
    private int warrantyPeriod;

    // Parameterized constructor
    public Electronics(String pId, String pName, int quantityAvailable, double price, String pType, String brand, int warrantyPeriod) {
        super(pId, pName, quantityAvailable, price, pType);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }


    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // functions
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

                                                                                 
}
