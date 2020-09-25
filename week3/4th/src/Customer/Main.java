package Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void display(List<Customer> customers){
        Iterator<Customer> iterator= customers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }
    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        System.out.println("====FinfAll====");
        List<Customer> customers = new ArrayList<>();
        customers = customerService.findAll();
        display(customers);

        System.out.println("===Add model.Custorm===");
        Customer addNew= new Customer(10L,"hname","Sai Gon");
        customerService.add(addNew);
        customers = customerService.findAll();
        display(customers);

         addNew = new Customer(1L,"aname","Hn");
         customerService.add(addNew);
         customers = customerService.findAll();
         display(customers);

        System.out.println("====Edit model.Customer=====");
        System.out.println("Input id: ");
        Scanner sc = new Scanner(System.in);
        Long id= sc.nextLong();
        System.out.println("Name: ");
        sc.nextLine();
        String newName = sc.nextLine();
        String newAddress = sc.nextLine();
        Customer editNew = new Customer(id,newName, newAddress);
        customerService.update(id,editNew);
        customers = customerService.findAll();
        display(customers);

    }
}
