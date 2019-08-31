import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String word1, word2;
        boolean anagrama;

        Scanner leitor = new Scanner(System.in);

        word1=leitor.nextLine();
        word2=leitor.nextLine();
        char[] newWord1 = word1.toCharArray();
        char[] newWord2 = word2.toCharArray();

        anagrama=true;
        if(word2.length()==word1.length()) {

            label:
            for (char i : newWord1) {
                for (char j : newWord2) {
                    if (i == j) {
                        int qtdChar1=0;
                        int qtdChar2=0;
                        for (char m : newWord1){
                            if(i==m){
                                qtdChar1++;
                            }
                        }
                        for (char n: newWord2){
                            if(i==n){
                                qtdChar2++;
                            }
                        }
                        if(qtdChar1==qtdChar2){
                            anagrama = true;
                            break;
                        } else {
                            anagrama=false;
                            break label;
                        }
                    } else {
                        anagrama = false;
                    }
                }
                if (anagrama == false) {
                    break label;
                }
            }
        } else{
            anagrama=false;
        }

        if(anagrama==true){
            System.out.println("Sim");
        }
        else{
            System.out.println("Nao");
        }
    }
}
