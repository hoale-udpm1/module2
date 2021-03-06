package Product;

public class Product implements Comparable<Product> {
    private String id;
    private Integer price;
    private String name;

    public Product (String id, String name, Integer price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                '}';
    }
    @Override
    public int compareTo(Product product) {
        return this.getId().compareTo(product.getId());
    }
}
