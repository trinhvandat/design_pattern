package com.ptit.bridge;

import java.util.logging.Logger;

public class Paying implements PaymentAPI {

    private static final Logger logger = Logger.getLogger(String.valueOf(Paying.class));

    @Override
    public float pay(float total) {
        logger.info("pay: " + total);
        return total;
    }
}
