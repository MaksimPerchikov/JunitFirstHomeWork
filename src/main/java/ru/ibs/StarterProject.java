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
         //String arStrFin = "txt.txt";
        //starterProject.methodByStarter(arStrFin);
///////////////////////////////////////////////////////////////////////////////////////////////////
     }

    public  void methodByStarter(String str) {
       //Изначальный,работающий код!
        StarterProject starterProject = new StarterProject();
        String line;
        try {
            Reader reader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(reader);
            line = bufferedReader.readLine();
            while (line != null) {
                int i = Integer.parseInt(line);
                if (i % 3 == 0 && i % 5 == 0) {
                    starterProject.showResult("FizzBuzz");
                } else if (i % 3 == 0) {
                    starterProject.showResult("Fizz");
                } else if (i % 5 == 0) {
                    starterProject.showResult("Buzz");

                } else System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showResult(String str){
        System.out.println(str);
    }
}
