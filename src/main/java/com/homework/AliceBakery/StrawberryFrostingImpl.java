package com.homework.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env",havingValue = "prod")
public class StrawberryFrostingImpl implements Frosting {
    @Override
    public String getFrostingType() {
        return "StrawberryFrosting";
    }
}
