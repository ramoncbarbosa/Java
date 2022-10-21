package atividades.atividadesdados;

public class My001PrintConvert {
    public static void main(String[] args){
    //Conversão: int para String
    int idade = 22;
    //String valor vai recer a classe invlucro Integer e converter o int para String com o comando toString
    String valor = Integer.toString(idade);
    System.out.print(valor);

    System.out.println("\n");

    //Conversão: String para int
     String valor1 = "20";
     //parseInt é para passar algo para o inteiro/int
     int idade1 = Integer.parseInt(valor1);
     System.out.println(idade1);

     System.out.println("\n");

     //Conversão: float para String
     String valor2 = "1.70";
     float altura = Float.parseFloat(valor2);
     System.out.println(altura);

    }
}
