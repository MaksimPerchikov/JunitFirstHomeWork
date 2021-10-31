package ru.ibs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Executor {

    private BufferedReader bufferedReader;
    private String line;
    public void updater(String str){
        try{
            Reader  reader = new FileReader(str);
            bufferedReader = new BufferedReader(reader);
            line = bufferedReader.readLine();
            converter(line);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Integer converter(String line){
        while(line!= null){
            int i = Integer.parseInt(line);
            converterTwo(i);
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
    public String converterTwo(Integer i){
         if (i % 3 == 0 && i % 5 == 0) {
             return printNum("FizzBuzz");
        } else if (i % 3 == 0) {
             return printNum("Fizz");
        } else if (i % 5 == 0) {
             return printNum("Buzz");
        } else System.out.println(i);
        return i.toString();
    }

    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
    }
    public String printNum(String str){
        System.out.println(str);
        return str;
    }
}


/*public class Executor {

    private BufferedReader bufferedReader;
    private String line;
    public void updater(String str){
        try{
            Reader  reader = new FileReader(str);
            bufferedReader = new BufferedReader(reader);
            line = bufferedReader.readLine();
            converter(line);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public  void converter(String line){
        while(line!= null){
            int i = Integer.parseInt(line);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(line);
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}*/
