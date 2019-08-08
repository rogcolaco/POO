import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    int a = leitor.nextInt();
    int b = leitor.nextInt();
    int c = leitor.nextInt();

    if (a<=0 || b<=0 || c<=0){
      System.out.println("Erro");
    } else{
      if (a==b && a==c){
      System.out.println("Equilatero");
      } else if ((a==b && a+b>=c)  || (a==c && a+c>=b) || (b==c && b+c>=a) ) {
        System.out.println("Isosceles");
      } else if (a+b>=c && a+c>=b && b+c>=a){
        System.out.println("Escaleno");
      } else {
        System.out.println("Nao forma triangulo");
      }
    }
    
  }
}
