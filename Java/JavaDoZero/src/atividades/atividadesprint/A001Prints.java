package zeroum.introducao.atividades;

public class A001Prints {
    public static void main(String[] args){
        int idade = 22;
        String nome = "Ramon";
        float altura = 1.73f;

        System.out.format("Meu nome é %s e eu tenho %d anos\nTenho %.2f de altura", nome, idade, altura);

        System.out.format("Meu nome é: %s", nome);
    }
}
