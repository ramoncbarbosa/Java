public class My004Convercao {
    public static void main(String[] args){
        //conversão de tipos: int > String
        int idade = 22;
        //valor recebe a classe involucro Integer e com o método toString vou converter o número inteiro para String
        String valor = Integer.toString(idade);

        System.out.println(valor);

        //-----------------------------------

        //Conversão: String > int
        String valor1 = "20";
        int idade1 = Integer.parseInt(valor1);
        System.out.println(valor1);

    }
}
