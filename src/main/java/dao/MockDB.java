package dao;

import com.example.bestcommerce.models.Category;
import com.example.bestcommerce.models.Merchant;
import com.example.bestcommerce.models.PaymentOptions;
import com.example.bestcommerce.models.Product;

import java.util.ArrayList;
import java.util.List;

public class MockDB {
    private static List<Product> productDb = new ArrayList<>();
    private static List<Merchant> merchantDB = new ArrayList<>();

    static {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        product1.setCategory(Category.FOODS);
        product1.setDeliveryOptions("free");
        product1.setDescription("very delishes");
        product1.setInventory(10);
        product1.setName("lays");
        product1.setPaymentOptions(PaymentOptions.DIRECT);
        product1.setPrice(3);

        product2.setCategory(Category.ELECTRONICS);
        product2.setDeliveryOptions("free");
        product2.setDescription("nice");
        product2.setInventory(56);
        product2.setName("asus");
        product2.setPaymentOptions(PaymentOptions.DIRECT);
        product2.setPrice(300);

        product3.setCategory(Category.FASHION);
        product3.setDeliveryOptions("free");
        product3.setDescription("good for you");
        product3.setInventory(9);
        product3.setName("Tshirt");
        product3.setPaymentOptions(PaymentOptions.DIRECT);
        product3.setPrice(3);

        productDb.add(product1);
        productDb.add(product2);
        productDb.add(product3);

        Merchant merchant = new Merchant();
        merchant.setAddress("baku");
        merchant.setMail("faridf60@gmail.com");
        merchant.setName("MyShop");
        merchant.setOwnerName("Farid");
        merchant.setPassword("f05121992");
        merchant.setType("virtual");
        merchant.setPhoneNumber("0553301208");

        merchantDB.add(merchant);
    }

    public static List<Product> getProductDb() {
        return productDb;
    }

    public static void setProductDb(List<Product> productDb) {
        MockDB.productDb = productDb;
    }

    public static List<Merchant> getMerchantDB() {
        return merchantDB;
    }

    public static void setMerchantDB(List<Merchant> merchantDB) {
        MockDB.merchantDB = merchantDB;
    }
}
