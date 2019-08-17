import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) {
        int i, j, a, empty;
        boolean isNew;
        int[] A;
        A  = new int[10];

        label:
        try {
            Scanner leitor = new Scanner(System.in);
            for (i = 0; i < 5; i++) {
                A[i] = leitor.nextInt();
                for(a=0;a<i && i>0; a++){
                    if(A[a]==A[i]){
                        System.out.println("Erro");
                        break label;
                    }
                }
            }
            //GUARDA A POSIÇÃO DA PRÓXIMA POSIÇÃO VAZIA
            empty = 5;

            //IMPRIME VETOR
            for (i = 0; i < empty; i++) {
                System.out.printf(A[i] + " ");
            }
            System.out.printf("\n");

            //LAÇO REPETICAO
            while (empty > 0 && empty < 10) {
                leitor.nextLine();
                isNew = false;
                j = leitor.nextInt();
                for (i = 0; i < empty; i++) {
                    if (j == A[i]) {
                        while (i <= empty) {
                            A[i] = A[i + 1];
                            i++;
                        }
                        isNew = true;
                        empty--;
                        break;
                    }
                }

                if (isNew == false) {
                    A[empty] = j;
                    empty++;
                }

                //IMPRIME VETOR
                if (empty > 0) {
                    for (i = 0; i < empty; i++) {
                        System.out.printf(A[i] + " ");
                    }
                    System.out.printf("\n");
                }
            }
        }

        catch (InputMismatchException erro){
            System.out.println("Erro");
        }

    }
}
