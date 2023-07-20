package com.karate.bdd.runners;

import com.intuit.karate.junit5.Karate;

public class SignupUserRunner {
    @Karate.Test
    Karate signupUser(){
        return Karate.run().relativeTo(getClass());
    }
}
