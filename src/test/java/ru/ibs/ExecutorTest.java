package ru.ibs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class ExecutorTest {
    @Test
    public void converterTwoTest(){
        Executor executor = new Executor();
        Assert.assertEquals("Fizz",executor.converterTwo(3));
        Assert.assertEquals("FizzBuzz",executor.converterTwo(15));
        Assert.assertEquals("23",executor.converterTwo(23));

    }

}
