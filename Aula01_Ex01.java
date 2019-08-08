import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    /*LINHA DE CODIGO OMITIDA APENAS PARA ENVIO NO RUN.CODES
    System.out.println("Informe a quantidade de livros adquiridos: ");*/
    Scanner leitor = new Scanner (System.in);
    
    //carrega a quantidade de livros adquiridos na variável qtddLivros
    double qtddLivros = leitor.nextDouble();
    
    if (qtddLivros<0){
      System.out.println("Erro");
    } else {
      double criterioA = (qtddLivros*0.25) + 7.5;
      double criterioB = (qtddLivros*0.5) + 2.5;

      if (criterioA>criterioB){
        System.out.println("Criterio B");
      } else if (criterioB>criterioA){
        System.out.println("Criterio A");
      } else {
        System.out.println("Indiferente");
      }
    }
  }
}
