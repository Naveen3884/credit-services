package com.rbc.service.impl;

import com.rbc.pojo.CreditCard;
import com.rbc.service.intrf.ICreditServices;
import org.springframework.stereotype.Service;

@Service
public class CreditServiceImpl implements ICreditServices {

    public CreditCard getCreditDetails(String cardNumber){
        CreditCard creditCard = new CreditCard();
        creditCard.setCardNumber(cardNumber);
        creditCard.setBillDate("01/08/2019");
        creditCard.setBillingAddress("NJ, 20035");
        return creditCard;
    }
}
