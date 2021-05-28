package prototype;

public class Item implements Cloneable {
    private String name;
    private double price; //HACK: BigDecimal to be added, but double is for the sake of the example

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
