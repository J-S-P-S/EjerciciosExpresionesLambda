package com.jsps.java.lambda;

import com.jsps.java.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        /*  Expresión lambda Predicate declarada de forma explícita.
            Predicate<Integer> validar = num -> {
            return num > 10;
            };
            System.out.println(validar.test(11));
        */

        //  Expresión lambda Predicate declarada de forma implícita, usando el método de referencia.
        Predicate<Integer> validar = num -> num > 10;
        System.out.println(validar.test(11));

        /*  Expresión lambda Predicate declarada de forma explícita.
            Predicate<String> v = rol -> {
            return rol.equals("ROLE_ADMIN");
            };
            System.out.println(v.test(""));
        */

        //  Expresión lambda Predicate declarada de forma implícita, usando el método de referencia.
        Predicate<String> v = rol -> rol.equals("ROLE_ADMIN");
        System.out.println(v.test(""));


        /*Expresión lambda BiPredicate declarada de forma explícita.
            BiPredicate<String, String> v2 = (a, b) -> {
            return a.equals(b);
            };
            System.out.println(v2.test("", ""));
        */

        //  Expresión lambda BiPredicate declarada de forma implícita, usando el método de referencia.
        BiPredicate<String, String> v2 = String::equals;
        System.out.println(v2.test("", ""));

        /*  Expresión lambda BiPredicate declaración explícita y referencia a un método
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("andrea");
        b.setNombre("andrea");

        BiPredicate<Usuario, Usuario> v3 = (ua, ub) -> {
            return ua.getNombre().equals(ub.getNombre());
        };
        System.out.println(v3.test(a, b));
        */

        //  Expresión lambda BiPredicate declaración implícita y referencia a un método
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("andrea");
        b.setNombre("andrea");

        BiPredicate<Usuario, Usuario> v3 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(v3.test(a, b));

    }
}