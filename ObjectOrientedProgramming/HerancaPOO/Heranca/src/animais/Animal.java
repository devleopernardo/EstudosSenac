// Package Animais: Define que esta classe pertence ao pacote Animais.
// Pacotes sao usados organizar classes relacionadas em grupos.

package animais;

// Creating Animal Class
public class Animal {

    // Atributo privado para armazenar nome do Animal
    private String nome;

    //Construtor da classe Animal que inicializa o nome
    public Animal(String nome){
        this.nome = nome;
    } 

    // Metodo para simular o ato de comer
    public void comer(){
        System.out.printf("%s comeu \n", nome);
    }

    // Metodo para simular o ato de beber
    public void beber(){
        System.out.printf("%s bebeu \n", nome);
    }

    // Metodo Getter
    public String getNome(){
        return nome;
    }

    // Metodo Setter
    public void setNome(String nome){
        this.nome = nome;
    }
}