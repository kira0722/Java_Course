package org.example;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("favor ingresar el primer numero");
        double num1 = sc.nextDouble();

        System.out.println("favor ingresar el segundo numero");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Favor ingresar una opcion, para la operacion que desea realizar: ");
        String option = sc.nextLine();

        if (option.equalsIgnoreCase("sum")){
            double sum = num1 + num2;
            System.out.println("la suma de los numeros es: " + sum);
        } else if (option.equalsIgnoreCase("rest")) {
            double rest = num1 - num2;
            System.out.println("la resta de los numeros es: " + rest);
        } else if (option.equalsIgnoreCase("mult")) {
            double mult = num1 * num2;
            System.out.println("la multiplicacion es "+ mult);
        } else if (option.equalsIgnoreCase("div")) {
            if (num1 != 0 && num2 != 0){
                double div = num1 / num2;
                System.out.println("la division de los numeros es: " + div);
            }else{
                System.out.println("no se puede realizar divisiones con el numero 0");
            }
        }else{
                System.out.println("favor ingresar un valor disponible");
        }
        sc.close();
    }
}
