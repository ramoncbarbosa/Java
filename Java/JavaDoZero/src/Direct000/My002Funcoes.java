package Direct000;

public class My002Funcoes {
    public static void main(String[] args) {
       //a função criada logo a baixo.
        // ela que vai dizer os valores de X e Y
       sumaAiBicho(10, 40);
    }

    /*
    1)criando uma função
    1.1)função de soma (neste caso)
    a) static void -> Declaramos os padrões
    ------------------------------------------------------------
    b) sumaAiBicho -> Nome dado a função, geralmente usarmos verbos para definir a função. Ma função pode ter qualquer nome.
    ------------------------------------------------------------
    c) () -> Usamos para dizer o que vai chegar dentro da variável. Devemos sempre denifir o tipo da variável e depois o nome dela.
    ------------------------------------------------------------
    d) int x,y = receberei valores inteiros e colocarei dentro dessas variáveis
    ------------------------------------------------------------

     */
    static void sumaAiBicho(int x, int y) {
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }
}
