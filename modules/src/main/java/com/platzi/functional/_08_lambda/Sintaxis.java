package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java","Functional");

        cursos.forEach(curso -> System.out.println(curso)); //sabemos que es una lamba porque no esta almacenada en ningun lugar

        usarZero(()->2);

        usarPredicado(text -> text.isEmpty());

        usarBiFuntion((x, y) -> x * y);

        //Se pueden agregar llavaes para realizar un cuerpo mas complejo
        usarBiFuntion((x,y) -> {
            System.out.println("X: " + x + ", Y:" +y);
            return x-y;
        });

        ////////////
        usarNada(()->{
            System.out.println("Hola alumno");
        }); //No recibo nada y no genero nada (es decir una funcion que no recibe ningun dato y no retorna ningun dato)

        usarBiFuntion((Integer x,Integer y) -> x*y);
    }

    static void usarZero(ZeroArgumentos zeroArgumentos){

    }

    static void usarPredicado(Predicate<String> predicado){

    }

    static void usarBiFuntion(BiFunction<Integer, Integer,Integer> operacion){

    }

    static void usarNada(OperarNada operarNada){

    }

    @FunctionalInterface
    interface ZeroArgumentos{
        int get();
    }

    @FunctionalInterface
    interface OperarNada{
        void nada();
    }
}
