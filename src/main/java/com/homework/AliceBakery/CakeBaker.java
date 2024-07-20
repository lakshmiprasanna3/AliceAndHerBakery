package com.homework.AliceBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {


  Frosting frosting;


   Syrup syrup;

    CakeBaker(Frosting frosting, Syrup syrup){
     this.frosting = frosting;
     this.syrup = syrup;
    }
    void bakeCake(){
        System.out.println("Baking "+frosting.getFrostingType()+" cake with "+syrup.getSyrupType());
    }
}
