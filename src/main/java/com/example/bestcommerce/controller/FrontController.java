package com.example.bestcommerce.controller;

import com.example.bestcommerce.exeptions.IllegalEmailAdressExeption;
import com.example.bestcommerce.exeptions.IllegalPassWordExeprion;
import com.example.bestcommerce.exeptions.MerchantAlreadyExistExeption;
import com.example.bestcommerce.exeptions.MerchantNotFoundExeption;
import com.example.bestcommerce.models.In;
import com.example.bestcommerce.models.Merchant;
import com.example.bestcommerce.models.Product;
import com.example.bestcommerce.services.MerchantService;
import com.example.bestcommerce.services.ProductList;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FrontController {

    @PostMapping(value = "/singUp")
    public void singUp(@RequestBody Merchant merchant) throws MerchantAlreadyExistExeption, IllegalPassWordExeprion, IllegalEmailAdressExeption {
        MerchantService merchantService = new MerchantService();
        merchantService.addMerchant(merchant);
    }

    @GetMapping(value = "/productList")
    @ResponseBody
    public List<Product> productList(@RequestParam(required = false) Integer page,
                                     @RequestParam(required = false) Integer pageSize,
                                     @RequestParam(required = false) String price,
                                     @RequestParam(required = false) String inventory) {

        ProductList productList = new ProductList();
        List<Product> products = productList.getProductList();
        for (Product p : products
             ) {
            System.out.println(productList.toString());

        }
        return products;
    }
}
