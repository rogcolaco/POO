import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int i,d;
        String nome;

        Scanner leitor = new Scanner(System.in);

        /*for(i=0;i<3;i++){
            d=leitor.nextInt();
            Employee empregado = new Employee(d);
        }*/

        Employee empregado = new Employee(123);

        empregado.printState();
        empregado.setName("Rogerio");
        empregado.setSalary(1200.10);
        empregado.printState();
        empregado.getAnnualSalary();
    }
}
