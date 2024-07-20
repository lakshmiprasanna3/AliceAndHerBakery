package com.homework.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env",havingValue = "dev")
public class ChocolateFrostingImpl implements Frosting{
    @Override
    public String getFrostingType() {
       return "ChocolateFrosting";
    }

}
