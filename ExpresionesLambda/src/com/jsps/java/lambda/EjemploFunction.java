package com.jsps.java.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {

        /* Expresión lambda function declarada de forma explícita
        *
        *   Function<String, String> f1 = valor -> {
                return "Hola que tal " + valor;
            };
        *
        * */
        Function<String, String> f1 = valor -> "Hola que tal " + valor;

        System.out.println(f1.apply("Sebastian"));

        /*  Expresión lambda function declarada de forma explícita y referenciar un método
            Function<String, String> f2 = valor -> {
                return valor.toUpperCase();
            };

            System.out.println(f2.apply("sebastian"));
        */

        //  Expresión lambda function declaración implícita y referencia de un método
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("sebastian"));

        /*  Expresión lambda BiFunction declaración explícita
            BiFunction<String, String, String> f3 = (a,b) -> {
            return a.toUpperCase().concat(b.toUpperCase());
        };
            System.out.println(f3.apply("juan \t","rodriguez"));
        */

        //  Expresión lambda BiFunction declaración implícita y método de referencia.
        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println(f3.apply("juan \t","rodriguez"));

        /*  Expresión lambda BiFunction declaración explícita
        BiFunction<String, String, Integer> f4 = (a,b) -> a.compareTo(b);
        System.out.println(f4.apply("andres", "andres"));
        */

        //  Expresión lambda BiFunction declaración implícita y método de referencia.
        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("andres", "andres"));

        /*  Expresión lambda BiFunction declaración explícita

            BiFunction<String, String, String> f52 = (a,b) -> {
            return a.concat(b);
            };

            System.out.println(f52.apply("Lucy", "Martinez"));
        */

        //  Expresión lambda BiFunction declaración implícita y método de referencia.
        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("Lucy \t", "Martinez"));

    }
}