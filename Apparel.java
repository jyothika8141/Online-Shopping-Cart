public class Apparel extends Product{
    private String size;
    private String material;

    public Apparel(String pId, String pName, int quantityAvailable, double price, String pType, String size, String material) {
        super(pId, pName, quantityAvailable, price, pType);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "Size:            %s\n" +
                        "material:           %s",
                        size, material
                );
    }
}