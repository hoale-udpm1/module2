package Customer;

public class Customer {
    private long Id;
    private String Name;
    private String Address;



    public Customer(Long id, String name) {
        Id = id;
        Name = name;
    }

    public Customer(Long id, String name, String address) {
        Id = id;
        Name = name;
        Address = address;
    }

    public long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
