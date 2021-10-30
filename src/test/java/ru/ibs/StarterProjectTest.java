package ru.ibs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class StarterProjectTest {
    
    @Test
    public void testMethodByStarter(){
        String line;
        try {
            Reader reader = new FileReader("txtTest.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            line = bufferedReader.readLine();
            while (line!=null){
                int i = Integer.parseInt(line);
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
