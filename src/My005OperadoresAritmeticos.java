public class My005OperadoresAritmeticos {
    public static void main(String[] args){
        //somando as notas e dividindo para ter a nota
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;

        System.out.println(m);


        int numero = 5;
        numero++; // a++ = a + a
        System.out.println(numero);


        int numeroDecremento = 5;
        numeroDecremento--;
        System.out.println(numeroDecremento);

        //o incremento depois da soma não vai aparecer, o programa vai mostrar primeiro o valor somado e imprimir e depois de imprimir que ele vai incrementar o ++
        //OU = faça todas as operações e só depois some um número
        int valor1 = 5;
        int numero1 = 5 + valor1++;
        System.out.println(numero1);

        //incremento antes da impressão
        //OU = incremente antes e depois some
        int valor2 = 5;
        int numero2 = 5 + ++valor2;
        System.out.println(numero2);


        //
        int valor3 = 5;
        int numero3 = 5 + valor3--;
        System.out.println(numero3);

        //
        int valor4 = 5;
        int numero4 = 5 + --valor4;
        System.out.println(numero4);


        //ATRIBUIÇÃO: Veja no notion as anotações
        //c) Incremento genérico: +=  ou a += b ou a = a + b
        int x = 4;
        x += 2; // x = x + 2 //ou// a = a + b
        System.out.println(x);

    }
}
