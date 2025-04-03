package org.example;

import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {


        //Runnable interaz funcional, para imprimir un mensaje
//        Runnable work = () -> System.out.println("hola mundo");
//
//        Thread thread = new Thread(work);
//        thread.start();


        //lamba con funcion de recorrido con listas de mombres
//        List<String> nombres = Arrays.asList("ana", "luis", "pedro");
//
//        nombres.forEach(nombre -> System.out.println(nombre));




        //lambda con funcion numeros pares
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6 ,8, 3, 13, 17);
//
//        List<Integer> pares = numbers.stream()
//                .filter(n -> n %2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println(pares);


        Function<Integer, Integer> cuadrado = x -> x * x;
        System.out.println(cuadrado.apply(10));

    }
}
