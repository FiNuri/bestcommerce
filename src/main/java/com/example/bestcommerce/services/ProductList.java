package com.example.bestcommerce.services;

import com.example.bestcommerce.models.Merchant;
import com.example.bestcommerce.models.Product;
import dao.MockDB;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductList {
    private List<Product> productList;

    public ProductList() {
    }

    public ProductList(String price, String inventory) {
    }

    public ProductList(int page, int pageSize) {
    }

    public ProductList(int page, int pageSize, String price, String inventory) {
    }

    synchronized public List<Product> getProductList(){

        List<Product> products = MockDB.getProductDb();

//        for (Product product:
//              MockDB.getProductDb()) {
//            Merchant merchant = product.getOwnerMerch();
//        }
        return products;

    }
}
