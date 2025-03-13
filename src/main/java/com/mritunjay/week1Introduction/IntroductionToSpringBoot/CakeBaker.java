package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    ChocolateFrosting chocolateFrosting;
    @Autowired
    StrawberryFrosting strawberryFrosting;
    @Autowired
    ChocolateSyrup chocolateSyrup;
    @Autowired
    StrawberrySyrup strawberrySyrup;


    public String bakeCake(String type){
        if(type.equals("Chocolate")){
            return "Baker is baking Chocolate cake with "+chocolateFrosting.getFrostingType() + " and " +chocolateSyrup.getSyrupType();
        }
        else{
            return "Baker is baking Chocolate cake with "+strawberryFrosting.getFrostingType() + " and " +strawberrySyrup.getSyrupType();
        }
    }
}
