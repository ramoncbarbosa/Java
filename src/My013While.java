package pac1;

public class My013While {
    public static void main(String[] args) {
        int camb = 0;
        //while é enquanto algo for menor ao desejado o laço vai continuar
        while (camb < 10) {
            //contador usado para o pré-requisito do while
            camb++;
            if (camb == 5 || camb == 7) {
                //continue joga para cima do laço
                continue;
                //break para e joga para fora do laço
                //break = 7;
            }
            System.out.println("Cambalhotas: " + camb);
        }
    }
}