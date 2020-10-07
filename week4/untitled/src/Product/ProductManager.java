package Product;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Product> productList;
    private ProductDao productDao;

    public ProductManager(){
        productDao = new ProductDao();
        productList = productDao.read();
    }

    public void add(){
        int id = (productList.size() > 0) ? (productList.size() + 1) : 1;
        System.out.println("product id = " +id);
        String name = inputName();
        String producer = inputProducer();
        long price = inputPrice();
        Product product = new Product(id, name, producer, price);
        productList.add(product);
        productDao.write(productList);

    }

    public void edit(int id) {
        boolean isExisted = false;
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            if (productList.get(i).getId() == id) {
                isExisted = true;
                productList.get(i).setName(inputName());
                productList.get(i).setProducer(inputProducer());
                productList.get(i).setPrice(inputPrice());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            productDao.write(productList);
        }
    }


    public void delete(int id) {
        Product product = null;
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            if (productList.get(i).getId() == id) {
                product = productList.get(i);
                break;
            }
        }
        if (product != null) {
            productList.remove(product);
            productDao.write(productList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    public void sortProductByName() {
        Collections.sort(productList, new SortProductByName());
    }

    public void sortStudentById() {
        Collections.sort(productList, new SortProductById());
    }

    public void show() {
        for (Product product : productList) {
            System.out.format("%5d | ", product.getId());
            System.out.format("%20s | ", product.getName());
            System.out.format("%5d | ", product.getProducer());
            System.out.format("%20s | ", product.getPrice());
        }
    }

    public int inputId() {
        System.out.print("Input product id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input product id again: ");
            }
        }
    }


    private long inputPrice() {
        System.out.print("Input product price: ");
        return scanner.nextLong();
    }

    private String inputName() {
        System.out.print("Input product name: ");
        return scanner.nextLine();
    }

    private String inputProducer() {
        System.out.print("Input product producer: ");
        return scanner.nextLine();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
