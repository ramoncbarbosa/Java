package zeroum.introducao.atividades;

import java.util.Scanner;
public class My001PrintScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        float i = scan.nextFloat();
        scan.close();

        System.out.printf("Olá: %s\nSua nota foi: %.2f", s, i);

    }
}
