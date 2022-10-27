//o java não vem com método de entrada, então precisamos importar a biblioteca scanner
import java.util.Scanner;
public class My003EntradaDeDados {
    public static void main(String[] args){
        //int idade = 22;
        //float altura = 1.73f;
        //String nome = "Ramon";

        //System.in -> vai monitorar minha entrada padrão de dado
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        float i = scan.nextFloat();
        scan.close();

        System.out.printf("Olá: %s\nSua nota foi: %.2f", s, i);
    }
}
