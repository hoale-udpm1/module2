public class Products {

    private int id;
    private String name;
    private String prices;

    public Products(int id, String name, String prices) {
        this.id = id;
        this.name = name;
        this.prices = prices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
      return "Products[" +
              "id =" + id +
              ", name ='" + name + '\'' +
              ", price =" + prices + "$" +
              ']';
    }
}
