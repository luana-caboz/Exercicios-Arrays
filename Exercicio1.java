import java.util.Scanner;

public class Exercicio1 {

    public static int[] criarVetor(int tamanho){
        int[] notas = new int[tamanho];
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.printf("Vetor[%d]: \n", i);
            notas[i] = teclado.nextInt();
        }
        return notas;
    }

    public static void imprimeNotas(int[] notas){
            System.out.println("A nota de índice 7 é "+notas[7]);
            System.out.println("A nota de índice 9 é " +notas[9]);
    }

    public static void main(String[] args) {

        int tamanho = 10;
        
        int[] notas = criarVetor(tamanho);

        imprimeNotas(notas);
        
    }

}
    
