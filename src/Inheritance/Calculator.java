package Inheritance;

public class Calculator {
    String nameOfCal,typeOfCal;
    int numOfBatteries =3;

    public int add(int num1, int num2){
        int total = num1 + num2;
        return total;
    }
    public int subtract(int num1,int num2){
        int total =  num1 - num2;
        return total;
    }
}
