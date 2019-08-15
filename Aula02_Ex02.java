import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        int[] A, B, C;
        A  = new int[5];
        B = new int [5];
        C = new int [5];

        Scanner leitor = new Scanner (System.in);
        A[0] = leitor.nextInt();
        A[1] = leitor.nextInt();
        A[2] = leitor.nextInt();
        A[3] = leitor.nextInt();
        A[4] = leitor.nextInt();

        Scanner leitorB = new Scanner (System.in);
        B[0] = leitorB.nextInt();
        B[1] = leitorB.nextInt();
        B[2] = leitorB.nextInt();
        B[3] = leitorB.nextInt();
        B[4] = leitorB.nextInt();

        for (i=0; i<5; i++){
            C[i]=A[i]+B[i];
        }

        for (int a:C){
            System.out.printf("%d \t", a);
        }
    }
}
