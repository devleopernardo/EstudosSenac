// Exercícios 13 OOP - Crie uma classe Curso com os atributos nome e duracao (em horas).
// Utilize métodos getter e setter para manipular esses atributos. No método main, defina os valores de nome e duracao, e depois exiba-os.

// Obs: Coloque os comentários no seu código em seus devidos lugares
// Atributos da classe
// Métodos getters/Setters para ver e modificar os atributos
// Método main para criar um objeto e definir os valores dos atributos
// Criando um objeto da classe definindo os valores dos atributos
// Exibindo os valores dos atributos do objeto

// Creating the class Course
public class Course {
    private String name;
    private int time;  // in Hours

    // Builder

    public Course(String name, int time) {
        this.name = name;
        this.time = time;
    }

    // Getter Method 
    public String getName() {
        return name;
    }

    public int getTime(){
        return time;
    }

    // Setter method
    public void setName(String name){
        this.name = name;        
    }
    public void setTime(int time){
        this.time = time;
    }

    // Main method for running
    public static void main(String[] args) {
        // Creating the object
        Course technical = new Course("Systems Development", 1200);

        System.out.println("I am Studying a Technical of " + technical.getName());
        System.out.println("And our Time Charge is " + technical.getTime());
    }


}
