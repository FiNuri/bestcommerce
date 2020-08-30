package com.example.bestcommerce.services;

import com.example.bestcommerce.exeptions.IllegalEmailAdressExeption;
import com.example.bestcommerce.exeptions.IllegalPassWordExeprion;
import com.example.bestcommerce.exeptions.MerchantAlreadyExistExeption;
import com.example.bestcommerce.exeptions.MerchantNotFoundExeption;
import com.example.bestcommerce.models.Merchant;
import dao.MockDB;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import sun.plugin.liveconnect.SecurityContextHelper;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class MerchantService {
    private static final String PASS_PATTERN = "^[a-zA-Z0-9]+$";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    synchronized public void addMerchant(Merchant merchant) throws MerchantAlreadyExistExeption,
            IllegalPassWordExeprion,
            IllegalEmailAdressExeption {

        List<Merchant> merchants = MockDB.getMerchantDB();
        Pattern patternForPass = Pattern.compile(PASS_PATTERN, Pattern.CASE_INSENSITIVE);
        Pattern patternForEmail = Pattern.compile(EMAIL_PATTERN);
        Matcher passMatcher = patternForPass.matcher(merchant.getPassword());
        Matcher emailMatcher = patternForEmail.matcher(merchant.getMail());

        if (merchant.getPassword().length() < 6 || !passMatcher.matches()) {
            throw new IllegalPassWordExeprion();
        }
        if (!emailMatcher.matches()) {
            throw new IllegalEmailAdressExeption();
        }

        for (Merchant merch : merchants) {
            if (merchant.getName().equals(merch.getName())) {
                throw new MerchantAlreadyExistExeption();
            }
        }
        MockDB.getMerchantDB().add(merchant);
    }
    synchronized public Merchant getMerchantByName(String name) throws MerchantNotFoundExeption {
        List<Merchant> merchants = MockDB.getMerchantDB();

        for (Merchant merch: merchants) {
            if (merch.getName().equals(name)){
                return merch;
            }
        }
        throw new MerchantNotFoundExeption();
    }

    synchronized public List<Merchant> getAllMerchants() throws MerchantNotFoundExeption {
        List<Merchant> merchants = MockDB.getMerchantDB();
        if(merchants.isEmpty()){
            throw new MerchantNotFoundExeption();
        }else return merchants;
    }
}
