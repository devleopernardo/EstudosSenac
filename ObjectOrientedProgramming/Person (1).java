// Exercícios 15 OOP - Crie uma classe chamada Pessoa com atributos para nome e Idade, garantindo que a idade não seja negativa.
// Obs: Use o (if e else).

// Creating the Class
public class Person {
    public String name;
    public int age;

    // Builder
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // Setter method + IF and ELSE
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
        if (age > 0) {
            System.out.println("The Age is Valid");
        }
        else {
            System.out.println("Invalid!");
        }
    }

    // Main Method for running
    public static void main(String[] args) {
        // Creating the object
        Person loko = new Person("Leo", 81);
        loko.setName("Leozera");
        loko.setAge(55);

        System.out.println("Muitcho LOKO " + loko.name);
        System.out.println(loko.getAge());
    }
}
