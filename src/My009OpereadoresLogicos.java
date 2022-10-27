package pac1;

import javax.annotation.processing.SupportedSourceVersion;

public class My009OpereadoresLogicos {
    public static void main(String[] args){
        int x, y, z;
        x = 10;
        y = 20;
        z = 15;
        boolean r;
        r = (x>y && y<z)?true:false;
        System.out.println(r);

        int a, b, c;
        a = 2;
        b = 4;
        c = 6;
        boolean d;
        d = (a != b ^ b == c)?true:false;
        // a != b = verdadeiro
        // b == c = falso
        // verdadeiro OU EXCLUSIVO falso = verdadeiro
        //só posso ter um verdadeiro para ter um true
        System.out.println(d);

        int ab, cd, ef;
        ab = 10;
        cd = 15;
        ef = 20;
        boolean zeta;
        zeta = (ab >= cd || ef == cd)?true:false;
        System.out.println(zeta);

    }
}
