package Examendel16deEnero.Pilas;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Stack;

public class Expresionesar {
    public static void main(String[] args) {
        System.out.println(evaluarPila("5 1 2 + 4 * + 3 -")); //14
        System.out.println(evaluarPila("2 4 5 3 / * +"));//6
        System.out.println(evaluarPila("6"));//6
        System.out.println(evaluarPila("3 5 4 + *")); //27
    }
    public static Integer evaluarPila(String expr) {
        Stack<Integer> pila = new Stack<>();
        String[] Array = expr.split(" ");
        int res = 0;
        for (String token : Array) {
            if (Character.isDigit(token.charAt(0)))
            {
                pila.push(Integer.parseInt(token));
            } else {
                int n1 = pila.pop();
                int n2 = pila.pop();
                switch (token) {
                    case "+":
                        res = (n2 + n1);
                        pila.push(res);
                        break;
                    case "-":
                        res = (n2 - n1);
                        pila.push(res);
                        break;
                    case "*":
                        res = (n2 * n1);
                        pila.push(res);
                        break;
                    case "/":
                        res = (n2 / n1);
                        pila.push(res);
                        break;
                    default:
                }

            }
        }
        return pila.pop();
    }
}
