public class Food extends Product{
    private String expDate;

    public Food(String productId, String productName, int quantityAvailable, double price, String productType, String expDate) {
        super(productId, productName, quantityAvailable, price, productType);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }


    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "expDate:           %s\n", expDate);
    }
}

