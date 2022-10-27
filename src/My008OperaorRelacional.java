public class My008OperaorRelacional {
    public static void main(String[] args){
        String nome1 = "Ramon";
        String nome2 = "Ramon";
        String nome3 = new String("Ramon");
        String res;
        //res vai receber "igual" ou "diferente", dependendo de:
        //a) se nome 1 for igual a nome2, receberei "igual"
        //b) ou se nome 1 for diferente de nome2, receberei "diferente"

        //nome1 é igual a nome2?
        //res = (nome1==nome2)?"Igual":"Diferente";
        //System.out.println(res);

        //nome1 é igual a nome3?
        res = (nome1==nome3)?"Igual":"Diferente";
        System.out.println(res);



        //.equals é para verifiar se o conteudo de um objeto é igual ao conteudo de outro metodo
        //uso iso para classe involucros // para objetos
        String res1;
        res1 = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res1);
    }
}
