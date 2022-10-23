package atividades.atividadesdecisoes;

import java.util.Scanner;

public class M001 {
    public static void main(String[] args){
        Scanner output = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int nasc = output.nextInt();
        int idade = 2022 - nasc;
        System.out.println("Sua idade é " + idade);

        if (idade >= 18 && idade < 70){
            System.out.println("Você precisa votar");
        } else if (idade >= 70) {
            System.out.println("Você não precisa votar, se não quiser");
        }else {
            System.out.println("Menores de idade não voltam");
        }
    }
}
