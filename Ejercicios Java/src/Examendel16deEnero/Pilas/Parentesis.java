package Examendel16deEnero.Pilas;

import javax.print.DocFlavor;
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
//        Stack<Integer> paren = new Stack<Integer>();
        Stack<Character> corch = new Stack<Character>();
//        int contadorpar = 0;
        int contadorcor = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '(' || frase.charAt(i) == '[') {
                corch.push(frase.charAt(i));
            }
            if (frase.charAt(i) == ')') {
                if (corch.peek() == '(') {
                    corch.pop();
                }
            } else if (frase.charAt(i) == ']'){
                if(corch.peek() == '['){
                    corch.pop();
                }
            }
        }
//        if (paren.isEmpty() || corch.isEmpty()) {
        if (corch.isEmpty()) {
                System.out.println("Esta bien parentizado");
            } else {
                System.out.println("No esta bien parentizado");
            }
        }
    }
//}
