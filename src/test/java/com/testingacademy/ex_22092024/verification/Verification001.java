package com.testingacademy.ex_22092024.verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification001 {
    @Test
    public void test_verify(){
        String responseName = "JayShankar";
        Assert.assertEquals("JayShankar",responseName);
    }
}
