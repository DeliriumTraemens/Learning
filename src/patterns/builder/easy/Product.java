package patterns.builder.easy;

public class Product {
    private Description descript;
    private String name;
    private String description;
    private int price;
    private int artikul;

    public Product() {
        this.descript=new Description();
        this.name = "No name";
        this.description = "No description";
        this.price = 0;
        this.artikul = 12345;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        if (this.price == 0) {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", price= PRICELESS" +
                    ", artikul=" + artikul +
                    '}';
        } else
            return "Product{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", price=" + price +
                    ", artikul=" + artikul +
                    '}';
    }

    public Product setArtikul(int artikul) {
        this.artikul = artikul;
        return this;
    }
}
