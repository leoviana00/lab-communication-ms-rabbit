package io.viana.product_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;

@RestController
@RequestMapping("/api")
public class ProfileController {

    @Value("${spring.app.name}")
    private String AppProfileName;
    
    @GetMapping("profile")
    public String helloWorld(){
        return AppProfileName;
    }
    public static void main(String[] args) {
        SpringApplication.run(ProfileController.class, args);
    }
}
