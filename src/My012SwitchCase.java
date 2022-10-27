import java.util.Scanner;

public class My012SwitchCase {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Locais Disponíveis");
        System.out.println("OPÇÕES: ");
        System.out.println("1 - Belém");
        System.out.println("2 - Marabá");
        System.out.println("3 - Moju");
        System.out.print("Insira Sua Opção Aqui: ");
        int value = entrada.nextInt();
        String local;

        switch(value){
            case 1:
               local = "Belém";
               break;
            case 2:
                local = "Marabá";
                break;
            case 3:
                local = "Moju";
                break;
            default:
                local = "Não Encontrado!";
                break;
        }
        System.out.print("Seu destino é: ");
        System.out.print(local);
    }
}
