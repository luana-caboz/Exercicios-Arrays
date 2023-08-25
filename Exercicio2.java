import java.util.Scanner;

public class Exercicio2 {

    public static int[] criarVetor(int tamanho) {
        int[] notas = new int[tamanho];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d]: \n", i);
            notas[i] = teclado.nextInt();
        }
        return notas;
    }

    public static void imprimirAprovacao(int[] notas, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            if (notas[i] >= 7) {
                System.out.printf("A nota foi de %d pontos e o aluno foi aprovado! \n", notas[i]);
            } else if (notas[i] < 7) {
                System.out.printf("A nota foi de %d pontos e o aluno foi reprovado! \n", notas[i]);

            }
        }
    }

    public static void main(String[] args) {

        int tamanho = 10;

        int[] notas = criarVetor(tamanho);

        imprimirAprovacao(notas, tamanho);

    }

}
