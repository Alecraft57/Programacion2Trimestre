package Examendel16deEnero.Pilas;

import java.util.Stack;

public class Expresionesar {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        System.out.println(evaluarPila("5 1 2 + 4 * + 3 -")); //14
        System.out.println(evaluarPila("2 4 5 3 / * +"));//6
        System.out.println(evaluarPila("6"));//6
        System.out.println(evaluarPila("3 5 4 + *")); //27
    }

    public static String evaluarPila(String expr){



    }
}
