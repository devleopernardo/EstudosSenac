/* Classe Professor (herda de Person):
  -Atributo adicional: disciplina(String).
  -Método sobrescrito: apresentar(), que exibe nome, idade e disciplina. */

package people;

public class Teacher extends Person {
  // Definindo o unico atributo expecifico da classe Teacher
  private String discipline;

  // Construtor da Classe Teacher que chama o construtor da classe Person (Pai)
  public Teacher(String name, int age, String discipline) {
    super(name, age);
    this.discipline = discipline;
  }

  // Metodos herdados da classe Superior
  public void show() {
    super.show();
    System.out.printf("Discipline: %s %n", discipline);
  }

}
