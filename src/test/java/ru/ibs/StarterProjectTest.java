package ru.ibs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class StarterProjectTest {
   /* private StarterProject starterProject;
    @Before
    void init(){
        starterProject = new StarterProject();
    }*/
   @Test
    public void testMethodByStarter() throws FileNotFoundException {
       StarterProject starterProject = new StarterProject();
        Reader reader = new FileReader("txtTest.txt");
        starterProject.methodTwo(reader);
    }

    @Test
    public void testMethodTwo()throws FileNotFoundException{
       Reader reader = new FileReader("txtTest.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        
    }
}
