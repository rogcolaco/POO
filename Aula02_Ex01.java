import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[] temperatures;
        temperatures = new int[7];

        Scanner leitor = new Scanner (System.in);
        temperatures[0] = leitor.nextInt();
        temperatures[1] = leitor.nextInt();
        temperatures[2] = leitor.nextInt();
        temperatures[3] = leitor.nextInt();
        temperatures[4] = leitor.nextInt();
        temperatures[5] = leitor.nextInt();
        temperatures[6] = leitor.nextInt();

        int soma=0;
        for (int i:temperatures){
            soma+=i;
        }
        int media = soma/7;
        int count = 0;
        for (int i:temperatures){
            if (i>media){
                count++;
            }
        }
        System.out.println(count);

    }
}
