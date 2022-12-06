import business.ProductManager;
import core.loging.DataBaseLogger;
import core.loging.FileLogger;
import core.loging.Logger;
import entities.Product;
import dataAccess.HibernateProductDao;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"SamsungA30s",7000);
        Logger[] loggers = {new DataBaseLogger(),new FileLogger()};
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
    }
}