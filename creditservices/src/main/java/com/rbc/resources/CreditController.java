package com.rbc.resources;


import com.rbc.pojo.CreditCard;
import com.rbc.service.intrf.ICreditServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditController {

    @Autowired
    private ICreditServices creditServices;
    @GetMapping
    public String getMessage(){
        return "Welcome to Gradle with spring boot";
    }

    @GetMapping("/cardNumber")
    public CreditCard getCreditDetails(@PathVariable("cardNumber") String cardNumber){
        return creditServices.getCreditDetails(cardNumber);
    }
}
