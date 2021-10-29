package ru.ibs;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusTwoStringTest {

    private PlusTwoString plusTwoString;

    @BeforeEach
    void init(){
        plusTwoString = new PlusTwoString();
    }

    @Test
    public void testOperation(){
        assertEquals("HelloWorld",plusTwoString.operation("Hello","World"));
    }
}
