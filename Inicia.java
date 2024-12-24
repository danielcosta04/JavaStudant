import java.util.ArrayList;

public class Inicia {
    public static void main(String[] args) {
        
        /* //tipos primitivos
        int idade = 25;
        //faixa de inteiros - 100, 23484, 1, 128, 858585858585 
        byte = 8 bits = -128 a 127;
        short = 16 bits = 32768 a 332767;
        int = 32 bits = -2.147.483.648 a 2.147.483.647;
        long 64 bits = -9.223.372.854.775.808 a 9.223.372.854.775.807;

        //numeros decimais = 1.2, 3.4, 5.6, 9.0;

        float = 32 bits = 1.4e-45 a 3.4028235e+38;
        float 32 bits = precisão simples = 3.32;
        double 64 bits = precisão dupla
        
        String = representar palavras e frases;
        char meuChar = 'A';

        Boolean = true ou false; */

        byte b = 100;
        short s = 10000;
        //int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = true;
        String str= "Fernanda";

        String[] nomesArr = new String[5];

        nomesArr[0] = "Fernanda";
        nomesArr[1] = "Feliz";
        nomesArr[2] = "João";
        nomesArr[3] = "Java";
        nomesArr[4] = "Novo";

        //vetor

        int[] colecaoInteiros = {1, 2, 3, 4, 6, 444444};
        int[] meusNumeros = new int[4];

        //int colecaoArray[4];

        //condicionais

        if(bool){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        if(b > 99){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        if(str.isBlank()){
            System.out.println("Verdadeiro");
        }else if(str == "Fernanda"){
            System.out.println("Falso");
        }

        System.out.println(colecaoInteiros[5]);
        System.out.println(colecaoInteiros.length);
        

        //Array list
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");
        nomes.add("Leo");

        //System.out.println(nomes.get(2));

        //nomes.remove(0);

        //System.out.println(nomes.get(0));

        //loop
        /* for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        } */

        /* for(int meuInterador = 0; meuInterador < nomesArr.length; meuInterador++){
            System.out.println(nomesArr[meuInterador]);
        }
 */
        for(String nome : nomesArr){
            System.out.println(nome);
        }

        int contador = 0;
        while (contador < 10) {
            System.out.println("Estou no while");
            contador++;
            
        }

        
        //video em 47:44mim - https://www.youtube.com/watch?v=nODe5lFcGpg
         //casting 

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        System.out.println("meuInt");
        System.err.printf(" %d", meuInt);

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);
    }
 
}
