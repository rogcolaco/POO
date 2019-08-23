import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int i,d;
        String nome;

        //PROBLEMA: TENHO QUE CRIAR E SETAR UMA LISTA POR DEPARTAMENTO
        Employee[] departamentList1= new Employee[10];


        //INICIALIZA SCANNER
        Scanner leitor = new Scanner(System.in);


        Departament departament1 = new Departament("WEB",001);


        //PROBLEMA PARA SER RESOLVIDO COMO O OBJETO PODE SER CRIADO COM ASSOCIAÇÃO COM DEPARTAMENT?
        Employee employee1 = new Employee(101);
        employee1.setName("Rogerio");
        employee1.setDepartament(departament1);
        Employee employee3 = new Employee(103);
        employee3.setDepartament(departament1);

        employee1.printState();
        employee3.printState();

        System.out.println("\n");

        departamentList1[0]=employee1;

        departament1.setEmployees(departamentList1);

        System.out.println("\n");
        departament1.printState();
        d=departament1.sizeOfEmployees();
        System.out.println(d);

    }
}
