package Direct000;

public class My003Argumentos {
    public static void main(String[] args){
        //seria muito chato fazer varios prints, né?
        //vamos acessar indices então para tentar resolver isso
        //alias, args é uma coleção de strings, por isso vamos tentar acessar ela para colocar nomes dentro dos indices e imprimir eles

        //vou usar o cmd (windows) para acesssar.
        //cd: C:\GitHub\Java\JavaDoZero\src\Direct000\My003Argumentos.java
        // comando -> java My003Argumentos.java Ramon
        //Saída -> Ola, Ramon
        System.out.println("Ola, " + args[0]);

    }
}
