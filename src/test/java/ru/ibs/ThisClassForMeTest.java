package ru.ibs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThisClassForMeTest {

    private ThisClassForMe thisClassForMe;

    @Before
    public void createNew(){
        thisClassForMe = new ThisClassForMe();
    }

    @Test
    public void testOperation(){
        Assert.assertEquals("aabb",thisClassForMe.operation("aa","bb"));
    }

    @Test
    public void testLength(){
        Assert.assertEquals(0,thisClassForMe.length(),1e-9);

    }
}
