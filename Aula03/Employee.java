public class Employee {

    //DECLARAÇÃO ATRIBUTOS DA CLASSE
    String name, jobTitle;;
    long id;
    double salary;

    //CONSTRUCTORS
    public Employee(long id) {
        this.id = id;
    }

    public Employee(String name, long id) {
        this.name = name;
        this.id = id;
    }
    
    public Employee(String name, String jobTitle, long id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    //SETS AND GETS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //METHODS
    public void printState(){
        System.out.println(this.id+"\t"+this.name+"\t"+this.jobTitle+"\t"+this.salary);
    }

    public void getAnnualSalary(){
        System.out.println(this.salary*12);
    }

}
