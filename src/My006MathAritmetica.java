public class My006MathAritmetica {
    public static void main(String[] args){
        float valorReal = 8.3f;
        float valorReal2 = 6.7f;
        //a var 'ar' recebe a var 'valorReal' transformada de float para int e com o comando Math.float arredondou o valor para baixo
        int ar = (int) Math.floor(valorReal);
        //arredondando para cima
        int ar1 = (int) Math.ceil(valorReal);
        //arredondar aritmeticamente
        int ar2 = (int) Math.round(valorReal2);

        System.out.println(ar);
        System.out.println(ar1);
        System.out.println(ar2);


        // math.random //
        //gerar um valor double de forma aleatória
        double aleat = Math.random();
        System.out.println(aleat);

        //gerar algo aleatório porém mais controlado
        //quero algo entre 5 e 10
        double alee = 5 + Math.random() * (10-5);
        System.out.println(alee);

        //po, mas não posso fazer o mesmo com números inteiros?
        //poder? poder, mas aí vamos fazeer uma conversão de double para int e depois uma conta por ordem de prioridade
        double aleatorio0 = Math.random();
        //10 + valor/número aleatório vezes 20 - 10
        int aleatorio1 = (int) (10 + aleatorio0 * (20-10));
        System.out.println(aleatorio1);
    }
}
