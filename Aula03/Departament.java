public class Departament {

    //DECLARAÇÃO ATRIBUTOS DA CLASSE
    private String name, location;
    private int code, phoneExtention;
    private double budget;
    private Employee[] employee = new Employee[10];
    private Employee departamentCharge;

    //CONSTRUCTORS
    public Departament(String name, int code) {
        this.name = name;
        this.code = code;
    }

    //SETS AND GETS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPhoneExtention() {
        return phoneExtention;
    }

    public void setPhoneExtention(int phoneExtention) {
        this.phoneExtention = phoneExtention;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Employee[] getEmployees() {
        return employee;
    }

    public void setEmployees(Employee[] employees) {
        this.employee = employees;
    }

    public Employee getDepartamentCharge() {
        return departamentCharge;
    }

    public void setDepartamentCharge(Employee departamentCarge) {
        this.departamentCharge = departamentCarge;
    }

    //METHODS
    public void printState() {
        System.out.println("nome dpto\tlocalizacao\tcodigo\tramal\toramento");
        System.out.println(this.name + "\t" + this.location + "\t" + this.code + "\t" + this.phoneExtention + "\t" + this.budget);
        System.out.println("Funcionarios cadastrados nesse departamento");
        System.out.println("id \tnome");
        for (Employee i : this.getEmployees()) {
            if (i.name == "set") {
                break;
            } else {
                System.out.println(i.id + "\t"+i.name);
            }
        }
    }

    public void addEmployee(Employee employee){
        for (Employee i : this.getEmployees()){
            if(i.name=="set"){
                i.name=employee.name;
                i.id= employee.id;
                i.departament=employee.departament;
                i.salary=employee.salary;
                i.jobTitle=employee.jobTitle;
                break;
            }
        }

    }

    public void removeEmployee(Employee employee){
        int i, j, k;

        label:
        for (i=0;i<this.getEmployees().length;i++){
            if(this.getEmployees()[i].id==employee.id){
                j=i+1;
                while(j<this.getEmployees().length) {
                    this.getEmployees()[i] = this.getEmployees()[j];
                    j++;
                    i++;
                }
                break label;
            }
        }

        this.getEmployees()[9]=new Employee ("set","set",000,000);

    }

    public void removeEmployee(long id){
        int i, j, k;

        label:
        for (i=0;i<this.getEmployees().length;i++){
            if(this.getEmployees()[i].id==id){
                j=i+1;
                while(j<this.getEmployees().length) {
                    this.getEmployees()[i] = this.getEmployees()[j];
                    j++;
                    i++;
                }
                break label;
            }
        }

        this.getEmployees()[9]=new Employee ("set","set",000,000);

    }

    public int sizeOfEmployees(){
        int count;

        count=0;
        for(Employee i : this.getEmployees()){
            if(i.name=="set") {
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }

    public void listAllEmployess(){
        System.out.println("Os funcionários cadastrados desse departamento são: \n");
        System.out.println("id \tnome \tsalario \tcargo");
        for (Employee i : this.getEmployees()){
            if(i.name!="set"){
                System.out.println(i.id+"\t"+i.name+"\t"+i.salary+"\t"+i.jobTitle+"\n");
            } else{
                break;
            }
        }
    }
}
