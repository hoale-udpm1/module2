import java.util.ArrayList;
import java.util.List;

public class ProductService implements IService<Products> {
    static List<Products> products;

    static {
        products = new ArrayList<>();
        products.add(new Products(1, "Sữa", "45000"));
        products.add(new Products(2, "Bánh mì", "10000"));
        products.add(new Products(3, "Cơm", "30000"));
        products.add(new Products(4, "Mì", "12000"));
        products.add(new Products(5, "Kem", "15000"));
        products.add(new Products(6, "Thịt", "45000"));
    }

    @Override
    public void addProducts(Products object) {
        boolean flag = true;
        for (int i = 0; i < products.size(); i++) {
            if (object.getId() == products.get(i).getId()) {
                flag = false;
                break;
            }
        }

    }

    @Override
    public void updateProducts(Integer id, Object newObject) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.set(i, newObject);
                break;
            }
        }
    }

    @Override
    public void updateProducts(Integer id, Object newObject) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.set(i,newObject);
                break;
            }
        }
    }

    @Override
    public void deleteProducts(Integer id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
                break;
            }
        }
    }

    @Override
    public Products findById(Integer id) {
        Products outputProducts = null;
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                outputProducts = products.get(i);
            }

        }
        return outputProducts;
    }

    @Override
    public List findByName(String name) {
        List<Products> outputProduct = new ArrayList<>();
        for (Products products : products) {
            if (products.getName().equals(name)) {
                outputProduct.add(products);
            }
        }
        return outputProduct;
    }

    @Override
    public List findAll() {
        return null;
    }
}
