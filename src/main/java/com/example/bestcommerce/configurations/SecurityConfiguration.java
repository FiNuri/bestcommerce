package com.example.bestcommerce.configurations;

import com.example.bestcommerce.exeptions.MerchantNotFoundExeption;
import com.example.bestcommerce.models.Merchant;
import com.example.bestcommerce.services.MerchantService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/productList").authenticated()
                .and()
                .httpBasic();
    }

//    @Override
//    protected UserDetailsService userDetailsService() {
//        MerchantService merchantService = new MerchantService();
//        List<Merchant> merchants = null;
//        List<UserDetails> userList = new ArrayList<>();
//        try {
//            merchants =  merchantService.getAllMerchants();
//        } catch (MerchantNotFoundExeption merchantNotFoundExeption) {
//            merchantNotFoundExeption.printStackTrace();
//        }
//        for (Merchant merch: merchants) {
//            UserDetails user = User.builder()
//                    .username(merch.getName())
//                    .password(merch.getPassword())
//                    .build();
//             userList.add(user);
//        }
//        return new InMemoryUserDetailsManager(userList);
//    }
}
