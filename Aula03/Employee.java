public class Employee {

    //DECLARAÇÃO ATRIBUTOS DA CLASSE
    private String name, jobTitle;;
    private long id;
    private double salary;
    private Departament departament;
    private Boolean chief;

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

    public Departament getDepartament(){
        return departament;
    }

    public void setDepartament(Departament departament){
        this.departament=departament;
    }

    public Boolean getChief() {
        return chief;
    }

    public void setChief(Boolean chief) {
        this.chief = chief;
    }

    //METHODS
    public void printState() {
        System.out.println(this.id + "\t" + this.name + "\t" + this.jobTitle + "\t" + this.salary + "\t" + this.getDepartament().name);
    }

    public void getAnnualSalary(){
        System.out.println(this.salary*12);
    }

}
