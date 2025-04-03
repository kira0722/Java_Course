package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        List<Integer> even = numbers.stream()
//                .filter(n ->  n % 2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println(even);




        //CONVIERTE EL TEXTO EN MAYUSCULA
//        List<String> words = Arrays.asList("apple", "dus", "cherry");
//        List<String> uppW = words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(uppW);





        //Elimina los elementos duplicados
//        List<Integer> numbers = Arrays.asList(1, 2, 2, 1, 5, 6, 7, 8);
//        List<Integer> disnt = numbers.stream()
//                        .distinct()
//                        .collect(Collectors.toList());
//
//        System.out.println(disnt);






        //ORDENA LOS NUMEROS EN ORDEN
//        List<Integer> numbers = Arrays.asList(1, 2, 1, 1, 5, 6, 2, 8);
//        List<Integer> sortNumber = numbers.stream()
//                        .sorted().collect(Collectors.toList());
//
//        System.out.println(sortNumber);

        //HASTA ESTE PUNTO LLEGA LAS OPERACIONES INTERMEDIAS






        //AQUI COMENZAMOS LAS OPERACIONES TERMINALES


        //FOREACH REALIZA UNA ACCION SOBRE CADA ELEMENTOO DEL STREAM
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        words.stream().forEach(System.out::println);





        //COLLECT: RECOGE LOS ELEMENTOS DE UN STREAM EN UNA COLECCION (LITA, CONJUNTO, MAPA)
        //EN ESTE CASO, COGE TODOS LOS NUMEROS DEL ARRAY Y LOS MULTIPLICA POR COMO ESTA EN LA FUNCION LAMBDA
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> doubledNumbers = numbers.stream()
//                .map(n -> n*5)
//                .collect(Collectors.toList());
//
//        System.out.println(doubledNumbers);





        //REEDUCE: REALIZA UNA OPERACION DE REDUCCION EN LOS ELEMENTOS DEL STREAM (SUMA, MULT, DIV, REST, ETC..)
        //EN ESTE CASO,
//        List<Integer> numbers = Arrays.asList(2, 2, 3, 4, 5);
//        int sum = numbers.stream()
//                .reduce(0, Integer::sum);
//
//        System.out.println(sum);






        //COUNT: CUENTA EL NUMERO DE ELEMENTOS EN EL STREAM
        //EN ESTE CASO CUENTA EL NUMERO DATOS HAY EN LA LISTA
//        List<String> words = Arrays.asList("aplle", "als", "ads", "sdas");
//        long count = words.stream().count();
//        System.out.println(count);




        //ANYMATCH | ALLMATCH | NONEMATCH: VERIFICA SI ALGUNO, TODOS O NINGUNO DE LOS ELEMENTOS
        //CUMPLE CON UNA CONDICION.
        //EN ESTE CASO, SE VERIFICO SI ALGUNOS DE LOS DATOS QUE HAY EN LA LISTA, CUMPLE CON LA CONDICION DE
        // QUE SEAN MULTIPLOS DEL 2
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        boolean haseven = numbers.stream().anyMatch(n -> n % 2 == 0);
//        System.out.println(haseven);



        //PARALELISMO CON STREAMS: LOS ELEMENTOS SE PROCESAN EN MULTIPLES HILOS, PERMITIENDO
        //QUE LAS OPERACIONES SE DISTRIBUYAN ENTRE VARIOS NUCLEOS DEL PROCESADOR PARA MEJORAR EL
        //RENDIMIENTO EN OPERACIONES INTENSIVAS DE DATOS
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream()
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
