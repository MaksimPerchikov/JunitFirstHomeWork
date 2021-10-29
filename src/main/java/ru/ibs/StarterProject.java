package ru.ibs;

import java.io.*;
import java.util.Arrays;

public class StarterProject {
    public static void main(String[] args) {

        //System.out.println("HI");
       /* String [] arrayString = new String[10];
        for (int i = 0; i < args.length; i++) {
            arrayString[i] = args[i];
        }
        String arStrFin = Arrays.toString(arrayString);*/
        String arStrFin = "M:/projects/txt.txt";

        methodByStarter(arStrFin);
    }
    public static void methodByStarter(String str){
        try {
            Reader reader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (bufferedReader.readLine() != null)
                System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
