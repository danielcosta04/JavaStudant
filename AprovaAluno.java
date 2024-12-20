import java.util.Scanner;

public class AprovaAluno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        //entrada de dados
        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        //cálculo da média
        media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        //verificação de aprovação
        System.out.printf("Média: %.2f%n", media);
        if(media >= 7.0) {
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
        scanner.close();
    }
}
