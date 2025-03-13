package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements Syrup{

    public String getSyrupType(){
        return "Chocolate Syrup";

    }
}
