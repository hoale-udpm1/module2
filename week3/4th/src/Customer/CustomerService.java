package Customer;

import java.util.*;

public class CustomerService implements IService<Customer> {
    static List <Customer> customers;
    static {
        customers.add(new Customer(1L,"aname","HN"));
        customers.add(new Customer(2L,"bname","HN"));
        customers.add(new Customer(3L,"cname","HN"));
        customers.add(new Customer(4L,"dname","HN"));
        customers.add(new Customer(5L,"ename","HN"));
    }

    @Override
    public void add(Customer object) {
        boolean flag = true;
        for(int i =0; i<customers.size();i++){
            if(object.getId()== customers.get(i).getId()){
                flag = false;
                break;
            }
        }
        if (flag)
            customers.add(object);
    }

    @Override
    public void update(Long id, Customer newObject) {
        for(int i =0; i<customers.size();i++) {
            if (id == customers.get(i).getId()) {
                customers.set(i, newObject);
            }
        }
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList= new ArrayList<>();
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext())
            customerList.add(iterator.next());
        return customerList;
    }
}
