import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String word;
        int positionIn, positionOut;

        boolean palindromo;

        Scanner leitor = new Scanner(System.in);

        word=leitor.nextLine();
        char[] charWord = word.toCharArray();
        positionOut=word.length()-1;

        palindromo=true;

        for (int i = 0; i < charWord.length; i++) {
            if(charWord[i]!=charWord[positionOut]){
                palindromo=false;
                break;
            } else{
                positionOut--;
            }
        }

        if(palindromo==true){
            System.out.println("Sim");
        }
        else{
            System.out.println("Nao");
        }
    }
}
