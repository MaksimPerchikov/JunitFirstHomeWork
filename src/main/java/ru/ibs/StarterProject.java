package ru.ibs;

import java.io.*;
import java.util.Arrays;

public class StarterProject {
    public static void main(String[] args) {
    /*   String [] arrayString = new String[10];
        for (int i = 0; i < args.length; i++) {
            arrayString[i] = args[i];
        }
        String arStrFin = Arrays.toString(arrayString);
*/

        //Если вставить прямую ссылку на файл - все работает!//
        //  String arStrFin = "M:/projects/txt.txt";
         // String arStrFin = "/projects/txt.txt";
          String arStrFin = "txt.txt";

        methodByStarter(arStrFin);
    }
    public static void methodByStarter(String str){
     String line;
        try {
            Reader reader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(reader);
            line = bufferedReader.readLine();
            while (line!= null) {
                int i = Integer.parseInt(line);


                if(i%3 == 0 && i%5 == 0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3 ==0){
                    System.out.println("Fizz");
                }else if(i%5 == 0){
                    System.out.println("Buzz");
                }else  System.out.println(line);

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
