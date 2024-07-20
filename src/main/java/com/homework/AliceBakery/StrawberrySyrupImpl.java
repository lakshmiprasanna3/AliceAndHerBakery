package com.homework.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env",havingValue = "prod")
public class StrawberrySyrupImpl implements Syrup{


    @Override
    public String getSyrupType() {
        return "StrawberrySyrup";
    }
}
