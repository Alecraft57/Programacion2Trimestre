package VueltadeVacaciones.Estructurabasica.Repetir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int numero = 0;
            ArrayList<Integer> numeros = new ArrayList<>();
            while (numero >= 0) {
                System.out.println("Dime numeros(si es negativo se acaba)");
                if (numero >= 0) {
                    numero = sc.nextInt();
                    numeros.add(numero);
                } else {
                    break;
                }
            }
            List<Integer> nums = numeros.stream()
                    .filter(num -> num >= 1 && num <= 5)
                    .collect(Collectors.toList());
            System.out.println(nums);
        }catch (Exception e){
            System.out.println("Tiene que ser un numero");
        }
    }
}
