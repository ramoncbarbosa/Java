public class My002TiposPrimitivosEManipucaoDeDados {
    public static void main(String[] args){
        //DECLARAÇÕES:
        //Básica
        int idade = 3;
        //typecast
        int idade1 = (int) 4;
        //Usando classes (Wrapper Class -> neste caso)
        Integer idade2 = new Integer(5); //aqui agora é um objeto
        System.out.println(idade);
        System.out.println(idade1);
        System.out.println(idade2);
//-----------------------------------------------------------


        float salario = 1600.00f;
        float salario1 = (float) 1600.00;
        Float salario2 = new Float(1600.00);

        System.out.println(salario);
        System.out.println(salario1);
        System.out.println(salario2);
//-----------------------------------------------------------



        char letra = 'R';
        char letra1 = (char) 'C';
        Character letra2 = new Character ('B');
//-----------------------------------------------------------
        String nome = "Ramon";
        String nome1 = (String) "Castro";
        String nome2 = new String("Barbosa");

        System.out.println(nome);
        System.out.println(nome1);
        System.out.println(nome2);
//-----------------------------------------------------------


        boolean solteiro = false;
        boolean namorando = (boolean) true;
        Boolean noivo = new Boolean(true);

        System.out.println(solteiro);
        System.out.println(namorando);
        System.out.println(noivo);
//-----------------------------------------------------------

//COMBINANDO: String + float Com Prin
        float nota = 9.5f;
        System.out.print("A nota é: " + nota);

//COMBINANDO: String + float Com Prinln
        System.out.println("De novo a sua nota é: " + nota);

//COMBINANDO: String + float Com  Printf
        System.out.printf("A nota é %f", nota);
        //formatando para duas casa decimais e quebrando a linha com \n
        System.out.printf("A nota é %.2f \n", nota);
    }
}
