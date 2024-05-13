import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis para armazenar notas e quantidade de notas
        double nota = 0;
        int quantidadeNotas = 0;
        double somaNotas = 0;

        // Loop para ler as notas do aluno
        while (true) {
            System.out.print("Digite a nota (ou 0 para finalizar): ");
            nota = sc.nextDouble();

            if (nota == 0) {
                break; // Sai do loop se o usuário digitar 0
            }

            somaNotas += nota;
            quantidadeNotas++;
        }

        // Calcula e imprime a média das notas
        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.printf("A média das notas é: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        sc.close();
    }
}
