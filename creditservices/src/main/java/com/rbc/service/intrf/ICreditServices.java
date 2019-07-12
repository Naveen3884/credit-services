package com.rbc.service.intrf;

import com.rbc.pojo.CreditCard;

public interface ICreditServices {

    CreditCard getCreditDetails(String cardNumber);
}
