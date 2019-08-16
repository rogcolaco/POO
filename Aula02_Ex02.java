import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        int[] A, B, C;
        A  = new int[5];
        B = new int [5];
        C = new int [5];

        Scanner leitor = new Scanner (System.in);
        for (i=0;i<5;i++){
            A[i]=leitor.nextInt();
        }

        for (i=0;i<5;i++){
            B[i]=leitor.nextInt();
        }

        for (i=0; i<5; i++){
            C[i]=A[i]+B[i];
        }

        System.out.println(C[0]+", "+C[1]+", "+C[2]+", "+C[3]+", "+C[4]);
    }
}
