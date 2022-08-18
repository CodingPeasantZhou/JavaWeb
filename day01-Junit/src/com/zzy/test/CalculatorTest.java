package com.zzy.test;

import com.zzy.Junit.Calculator;
import org.junit.Assert;
import org.testng.annotations.Test;
public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        Assert.assertEquals(3,result);
    }
}
