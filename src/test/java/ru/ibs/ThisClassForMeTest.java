package ru.ibs;

import org.junit.Assert;
import org.junit.Test;

public class PlusTwoStringTest {

    @Test
    public void testOperation(){
        PlusTwoString plusTwoString = new PlusTwoString();

        Assert.assertEquals("aabb",plusTwoString.operation("aa","bb"));
    }

    @Test
    public void testLength(){
        PlusTwoString plusTwoString = new PlusTwoString();
        Assert.assertEquals(0,plusTwoString.length(),1e-9);
    }
}
