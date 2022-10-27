import java.util.Scanner;

public class My010Condi {
    public static void main(String[] args){
        Scanner output = new Scanner(System.in);
        float n1 = output.nextFloat();
        float n2 = output.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println(m);

        if (m>9){
            System.out.println("Parabéns");
        } else if (m<=4.9) {
            System.out.println("Lamento carinha");
        } else {
            System.out.println("Legal");
        }
    }
}
