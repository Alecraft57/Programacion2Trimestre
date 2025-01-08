package Examendel16deEnero.Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime una frase y te digo si esta bien parentizada(tanto corchetes como parentesis)");
        String frase= sc.nextLine();
        parentizador(frase);
    }
    public static void parentizador(String frase) {
        Stack<Integer> paren = new Stack<Integer>();
        Stack<Integer> corch = new Stack<Integer>();
        int contadorpar = 0;
        int contadorcor = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '(' || frase.charAt(i) == '[') {
                contadorpar++;
                contadorcor++;
                paren.push(contadorpar);
                corch.push(contadorcor);
            } else if (frase.charAt(i) == ')' || frase.charAt(i) == ']') {
                paren.pop();
                corch.pop();
            }
        }
        if (paren.isEmpty() || corch.isEmpty()) {
            System.out.println("Esta bien parentizado");
        } else {
            System.out.println("No esta bien parentizado");
        }
    }
}
