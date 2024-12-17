package Flujos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        List<Integer>numeros=new ArrayList<>();
        while(num>=0) {
            System.out.println("Dime numeros");
            num = sc.nextInt();
            if (num<0) {
                break;
            }
            numeros.add(num);
        }
        List<Integer> nums=numeros.stream()
                .filter(entre->entre>=1 && entre<=5)
                .collect(Collectors.toList());
        System.out.println(nums);
    }

}
