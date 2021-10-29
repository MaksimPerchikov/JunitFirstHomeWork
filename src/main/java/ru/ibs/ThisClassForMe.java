package ru.ibs;

public class ThisClassForMe {
    public String operation(String a,String b){
        return a+b;
    }



    //это я для себя написал
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double length(){
        return a+b;
    }
}
