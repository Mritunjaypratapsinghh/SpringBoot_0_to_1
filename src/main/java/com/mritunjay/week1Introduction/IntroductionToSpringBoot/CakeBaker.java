package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {


    private final ChocolateFrosting chocolateFrosting;

    private final StrawberryFrosting strawberryFrosting;

    private final ChocolateSyrup chocolateSyrup;

    private final StrawberrySyrup strawberrySyrup;

    public CakeBaker(ChocolateFrosting chocolateFrosting, StrawberryFrosting strawberryFrosting, ChocolateSyrup chocolateSyrup, StrawberrySyrup strawberrySyrup) {
        this.chocolateFrosting = chocolateFrosting;
        this.strawberryFrosting = strawberryFrosting;
        this.chocolateSyrup = chocolateSyrup;
        this.strawberrySyrup = strawberrySyrup;
    }


    public String bakeCake(String type){
        if(type.equals("Chocolate")){
            return "Baker is baking Chocolate cake with "+chocolateFrosting.getFrostingType() + " and " +chocolateSyrup.getSyrupType();
        }
        else if(type.equals("Strawberry")){
            return "Baker is baking Strawberry cake with "+strawberryFrosting.getFrostingType() + " and " +strawberrySyrup.getSyrupType();
        }

        return "Only 2 Flavours Available: Strawberry, Chocolate";
    }
}
