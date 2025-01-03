/* Classe Aluno (herda de Pessoa):

  -Atributo adicional: curso(String).
  -Método sobrescrito: apresentar(), que exibe nome, idade e curso.
 */

package people;

public class Pupil extends Person {
    private String course;

    // Constructor method
    public Pupil(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // Show method (for show name and age of the pupil)
    public void show() {
        super.show();
        System.out.printf("Course: %s %n", course);
    }
}
