package Direct000;

/*
INTRODUÇÃO:
1) Var: É como se fosse minha memória do pc
2) Nome: É como se fosse um integrande de denro da minha memória
do pc -- nome séria uma variável/integrante que esta dentro da memória
3) Recebe: O recebe seria o simbolo de igual, ele diz que minha variável vai receber um dado/conteúdo.
4) Dado: "Ramon"; -> Ramon é o valor que estou aloacando dentro da variável, seria o que minha variável esta recebendo.
 */


/* VARIÁVEIS */
//Tipo: Textos -> (Strings)
//Tipo: Números -> (Int)
//Tipo: Números Fracionados/Decimais -> (Double)
//Tipo: Booleanas -> (Verdadeiro | Falso)

/* DIFERENÇAS NO CÓDIGO */
//Entre aspas duplas é Strings
//Sem aspas e só numeros é Int
//Números com ponto entre eles é Double
//Para ele entender que é Booleano, se coloca verdadeiro ou falso, neste caso como declaramos em inglês, seria assim: true/false (verdadeiro ou falso -- neste caso só colocando uma das opções por variável)


/*
TIPOS DE DADOS
OBS: 1ª Tipo - 2ª Nome - 3ª Recebe - 4ª Conteúdo
*/
//1) Vamos definir uma string.
// -> Sring name = "Ramon";
//----------------------------
//2) Definir o tipo int:
//-> int number = 2;
//----------------------------
//3) Definir o tipo Double:
//-> double cash = 100.00;
//----------------------------
//4) Denifir o tipo booleano:
//-> bool rain = true/false;






public class My001Variaveis {
    public static void main(String[] args){
        //var é como se fosse minha memória do pc
        //nome é como se fosse um integrande de denro da minha memória do pc -- nome séria uma variável/integrante que esta dentro da memória
        //"Ramon"; -> Ramon é o valor que estou aloacando dentro da variável
        var nome = "Ramon";
        System.out.println(nome);

        var number1 = 10;
        System.out.println(number1);


        //POSSO DECLARAR O TIPO SEM ATRIBUIR UM VALOR? POSSO
        //VAMOS DECLARAR UMA VAR
        int number2;
        number2 = 100;
        System.out.println(number2);

        //POSSO FAZER UMA SOMA DENTRO DO PRINT? POSSO KKKKK
        System.out.println(number2 + 10);
        //DETALHE QUE SE PODE NÃO SÓ SOMAR, COMO SUBTRAIR, DIVIDIR, MULTIPLICAR E POR AÍ VAI.


    }

}
