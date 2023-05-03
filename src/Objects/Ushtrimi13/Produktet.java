package Objects.Ushtrimi13;

public class Produktet {

    private String name;
    public int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Produktet(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
