package Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static final String PRODUCT_FILE_NAME = "Product.txt";
    public void write(List<Product> productList){
        FileOutputStream fos = null;
        ObjectOutputStream oss = null;
        try{
            fos = new FileOutputStream(new File(PRODUCT_FILE_NAME));
            oss = new ObjectOutputStream(fos);
            oss.writeObject(productList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            closeStream(fos);
            closeStream(oss);

        }
    }

    public List<Product> read(){
        List<Product> productList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(PRODUCT_FILE_NAME));
            ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            closeStream(fis);
            closeStream(ois);
        }
        return productList;
    }


    private void closeStream(OutputStream os) {
        if (os != null){
            try {
                os.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private void closeStream(InputStream is) {
        if (is != null){
            try {
                is.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
