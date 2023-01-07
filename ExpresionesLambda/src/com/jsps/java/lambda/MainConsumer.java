package com.jsps.java.lambda;

import com.jsps.java.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainConsumer {
    public static void main(String[] args) {

            /*  FORMA EXPLICITA PARA DECLARAR EXPRESIÓN LAMBDA CONSUMER
                Consumer<String> consumidor = (String saludo) -> {
                System.out.println(saludo);
                };
            */

        // Forma semi-explicita para declarar expresión lambda consumer
        Consumer<String> consumidor = saludo -> System.out.println(saludo);
        consumidor.accept("Hola");

        Consumer<Date> consumidor2 = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor2.accept(new Date());

        BiConsumer<String, Integer> consumidor3 = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años");
        consumidor3.accept("pepe", 20);

        //Forma implícita o resumida para declarar expresión lambda consumer utilizando método de referencia.
        Consumer<String> c = System.out::println;
        c.accept("Hola");

        Consumer<String> c2 = System.out::println;
        List<String> nombres = Arrays.asList("Andres", "Pepe", "Luz", "paco");
        nombres.forEach(c2);

        /* FORMA EXPLICITA
        Usuario user = new Usuario();
        BiConsumer<Usuario, String> asignar = (persona,nombre) -> {
            persona.setNombre(nombre);
        };

        asignar.accept(user, "Sebastian");
        System.out.println("Nombre usuario: " + user.getNombre());
        */

        // FORMA IMPLÍCITA UTILIZANDO MÉTODO DE REFERENCIA.
        Usuario user = new Usuario();
        BiConsumer<Usuario, String> asignar = Usuario::setNombre;

        asignar.accept(user, "Sebastian");
        System.out.println("Nombre usuario: " + user.getNombre());

        /* Lambda Supplier forma explícita
        Supplier<String> proveedor = () -> {
            return "Hola mundo lambda supplier";
        };

        System.out.println(proveedor.get());
        */

        // Lambda Supplier forma implícita utilizando método de referencia.
        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";
        System.out.println(proveedor.get());

        // Lambda Supplier utilizando método de referencia y adicional implementar nuevo usuario
        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario2 = creaUsuario.get();
        asignar.accept(usuario2, "Juan");
        System.out.println("Creando usuario usando expresión lambda supplier: " + usuario2.getNombre());
    }
}