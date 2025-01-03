/* Exercícios 22 OOP -  Crie uma superclasse "Pessoa" com um método "apresentar". Crie duas subclasses, "Aluno" e "Professor", 
que sobrescrevem o método "apresentar" para fornecer informações específicas sobre alunos e professores. 

Passos:
Classe Pessoa:
  -Atributos: nome (String), idade(int).
 -Método: apresentar(), que exibe o nome e a idade da pessoa.

Classe Aluno (herda de Pessoa):

  -Atributo adicional: curso(String).
  -Método sobrescrito: apresentar(), que exibe nome, idade e curso.

Classe Professor (herda de Pessoa):
  -Atributo adicional: disciplina(String).
  -Método sobrescrito: apresentar(), que exibe nome, idade e disciplina.

Classe Principal App:
  -Crie instâncias de Aluno e Professor, e chame o método apresentar() para cada uma. */


// Dizendo que essa Classe pertence ao Package People
package people;

// Criando a Classe pessoa
public class Person {

    // Atributo privados para armazenar o nome e idade das pessoas
    private String name;
    private int age;

    // Construtor da classe pessoa que inicializa os atributos
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Metodo para simular o ato de apresentar
    public void show(){
        System.out.printf("%s Is the name and %d is the age of the person. \n", name, age);
    }

    // Metodo Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // Metodo Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    



}
