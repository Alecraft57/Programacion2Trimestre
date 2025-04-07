package trimestre2.Examendel16deEnero.Pilas;

import java.util.LinkedList;
import java.util.Queue;

public class ExpresionesarCOLA {
    public static void main(String[] args) {
        System.out.println(evaluarCola("5 1 2 + 4 * + 3 -")); //14
        System.out.println(evaluarCola("2 4 5 3 / * +"));//6
        System.out.println(evaluarCola("6"));//6
        System.out.println(evaluarCola("3 5 4 + *")); //27
    }
    public static Integer evaluarCola(String ejercicios){
        Queue<Integer>Cola=new LinkedList<>();
        String[]Array=ejercicios.split(" ");
        int resultado=0;
        for(String numeros : Array){
            if(Character.isDigit(numeros.charAt(0))){
                Cola.offer(Integer.parseInt(numeros));
            }else{
                int n1=Cola.poll();
                int n2=Cola.poll();
                switch (numeros){
                    case "+":
                        resultado=n1+n2;
                        Cola.offer(resultado);
                        break;
                    case "-":
                        resultado=n1-n2;
                        Cola.offer(resultado);
                        break;
                    case "*":
                        resultado=n1*n2;
                        Cola.offer(resultado);
                        break;
                    case "/":
                        resultado=n1/n2;
                        Cola.offer(resultado);
                        break;
                }
            }
        }
        return Cola.poll();
    }
}
