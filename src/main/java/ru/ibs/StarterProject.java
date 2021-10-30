package ru.ibs;

import java.io.*;
import java.util.Arrays;

public class StarterProject {
    public static void main(String[] args) {
        StarterProject starterProject = new StarterProject();
        for (int i = 0; i < args.length; i++) {
            String arStrFin = args[i];
           starterProject.methodByStarter(arStrFin);
        }
        //Вставлять прямые ссылки.
        //  String arStrFin = "M:/projects/txt.txt";
        // String arStrFin = "/projects/txt.txt";
        // String arStrFin = "txt.txt";
    }

    public  void methodByStarter(String str) {
        StarterProject starterProject = new StarterProject();
       try{
           Reader reader = new FileReader(str);
           starterProject.methodTwo(reader);
       }catch (IOException e){
           e.printStackTrace();
       }

       //Изначальный,работающий код!
       /* String line;
        try {
            Reader reader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(reader);
            line = bufferedReader.readLine();
            while (line != null) {
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
*/

    }

    public void methodTwo(Reader reader) {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(reader);
            line = bufferedReader.readLine();
            while (line != null) {
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
