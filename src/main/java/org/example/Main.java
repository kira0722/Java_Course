package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hola java");

        try{
            int result = 10/0;
        } catch (ArithmeticException e){
            System.out.println("no se puede dividir por cero");
        }


    }
}