// Exercícios 14 OOP - Crie uma classe Funcionario com os atributos nome e salario.
// Utilize métodos getter e setter para manipular esses atributos. No método main, defina os valores de nome e salario, e depois exiba-os.


public class Employee {
    public String name;
    public float salary;

    // Builder
    public Employee (String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    // Getter method
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }

    // Setter method
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }

    // Main method for runnig
    public static void main(String[] args) {
        // Creating the object CLT
        Employee clt = new Employee("Chuao", 150000);

        System.out.println("The name of the Employee of the moth is " + clt.getName());
        System.out.println("His Annual Salary is above the average: $" + clt.getSalary());
    }
}
