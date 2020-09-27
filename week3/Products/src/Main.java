import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void disPlay(List<Products> list) {
        Iterator iterator = list.iterator();
        while ((iterator.hasNext())) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
    ProductService productService = new ProductService();
        List<Products> products;


        System.out.println("====Add====");
        productService.addProducts(new Products(6,"Nước uống đóng chai","5000"));
        products=productService.findAll();
        disPlay(products);


        System.out.println("====update====");
        productService.updateProducts(1,new Products(1,"Sữa hộp","250000"));
        products=productService.findAll();
        disPlay(products);


        System.out.println("====Delete====");
        System.out.println("Input id: ");
        Scanner scanner = new Scanner(System.in);
        Integer id = scanner.nextInt();
        productService.deleteProducts(id);
        System.out.println("====Befor Delete====");
        disPlay(productService.findAll());


        System.out.println("====find by id====");
        System.out.println(productService.findById(3));

        System.out.println("====Sort====");

        System.out.println("====find====");
        disPlay(productService.findByName("Sữa"));



    }
}
