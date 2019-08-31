import java.util.Scanner;
import java.util.StringJoiner;

class Main {
    public static void main(String[] args) {
        String user;
        StringJoiner password = new StringJoiner("*","","");

        Scanner leitor = new Scanner(System.in);
        user=leitor.nextLine();
        if(user.length()<2){
            System.out.println("Invalido");
        }
        else {
            for (int i = 0; i < user.length(); i++)
                password.add(user.substring(0, i));

            for (int i = user.length()-1; i >= 0; i--)
                password.add(user.substring(0, i));

            String finalPassword;
            finalPassword=password.toString();
            System.out.println(finalPassword.substring(1,finalPassword.length()-1));
            }

        }

    }

