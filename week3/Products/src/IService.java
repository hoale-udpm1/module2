import java.util.List;

public interface IService<T>{
        void addProducts(T object);
        void updateProducts(Integer id, T newObject);

        void updateProducts(Integer id, Object newObject);

        void deleteProducts(Integer id);
        T findById(Integer id);
        List<T> findByName(String name);
        List<T> findAll();
        List<T> sortByPrice();
    }
