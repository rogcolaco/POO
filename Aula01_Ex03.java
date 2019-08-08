import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double ano = leitor.nextDouble();

        if ((ano % 400) == 0 || (ano % 4 ==0 && ano % 100 != 0)){
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano nao bissexto");
        }
    }
}
