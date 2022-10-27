import javax.sound.sampled.SourceDataLine;

public class My007OperadorTernario {
    public static void main(String[] args) {
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        //Se n1 for maior que n2, irei receber 0.
        //Se não/Se(?) n2 for o maior que n1, vou receber 1
        r = (n1>n2)?0:1;
        System.out.println(r);

        int n3, n4, r2;
        n3 = 10;
        n4 = 8;
        //Se n3 for maior que n4, então vou mosrtar o valor de n3
        //Se não/Se(?) n4 for maior que n3, irei mostrar o valor de n4
        r2 = (n3>n4)?n3:n4;
        System.out.println(r2);

        //Subtração ou soma agora
        int v1, v2, s;
        v1 = 14;
        v2 = 18;
        //Se V1 for maior que V2, então some
        //Senão for, então subtraia
        s = (v1>v2)?v1+n2:v1-v2;
        System.out.println(s);
    }
}
