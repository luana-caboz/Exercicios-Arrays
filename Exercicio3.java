import java.util.Scanner;

public class Exercicio3 {

    private static final String Sysou = null;
    static int tamanho = 9;

    public static int[] criarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.printf("Vetor[%d] = ", i);
            int nota = teclado.nextInt();
            if (nota % 2 == 0) {
                vetor[i] = nota * 10;
            } else if (nota % 2 != 0) {
                vetor[i] = nota + 5;
            }
        }
        return vetor;
    }

    public static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.printf("Vetor[%d] = %d \n", i, vetor[i]);
        }
    }

    public static void main(String[] args) {

        int[] vetor = criarVetor(tamanho);
        imprimirVetor(vetor, tamanho);
    }

}