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

        //EMPREGADO SEM DADOS PARA INICIALIZAR O ARRAY
        Employee employeeSet = new Employee ("set","set",000,000);


        //PROBLEMA PARA SER RESOLVIDO COMO O OBJETO PODE SER CRIADO COM ASSOCIAÇÃO COM DEPARTAMENT?
        Employee employee1 = new Employee("Rogério","Desocupado",101,1.000);
        employee1.setDepartament(departament1);
        Employee employee3 = new Employee(103);
        employee3.setDepartament(departament1);
        employee3.setName("Monica");

        employee1.printState();
        employee3.printState();

        System.out.println("\n");
        for(i=0;i<departamentList1.length;i++){
            employeeSet = new Employee("set", "set", 000, 000);
            departamentList1[i]=employeeSet;
        }

        departamentList1[0]=employee1;

        departament1.setEmployees(departamentList1);

        System.out.println("\n");
        departament1.printState();
        d=departament1.sizeOfEmployees();
        System.out.printf("A quantidade de funcionarios no departamento 1 é: %d \n", d);
        System.out.println("\n");
        departament1.addEmployee(employee3);
        departament1.printState();
    }
}
