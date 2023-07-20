package com.karate.bdd.runners;

import com.intuit.karate.junit5.Karate;

public class LoginUserRunner {
    @Karate.Test
    Karate loginUser(){
        return Karate.run().relativeTo(getClass());
    }
}