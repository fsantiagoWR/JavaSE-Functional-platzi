package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {

    public static void main(String[] args) {
        List<String> profesores = getList("Nicolas", "Juan", "Zulema");

        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);
        System.out.println("///////////////////////");
        profesores.forEach(System.out::println); //:: indica que busque el metodo definido en el objeto Syste,out

    }

    static <T> List<T> getList(T ... elements) { //getList(T ... elements) indica que recibira una cantidad indefinida de elementos
        return Arrays.asList(elements);
    }
}
