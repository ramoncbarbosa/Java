package zeroum.introducao.atividades;
import java.util.Scanner;
public class My002PrintScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //String nome = scan.nextLine();
        //int idade = scan.nextInt();
        //scan.close();

        System.out.printf("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.printf("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.printf("Seu nome é: %s\nE sua idade é: %d anos", nome, idade);
    }
}