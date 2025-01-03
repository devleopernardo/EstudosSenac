// Exercícios 05 OOP - Crie uma classe Nadador com os atributos nome e idade. 
// Em seguida, crie um objeto dessa classe e defina os valores dos métodos/atributos e mostre para o usuário.

// Criando a classe Nadador

public class Swimmer {
    // Declarando os atributos da classe nadador

    String name;
    int age;
    
    // Definindo os metodos da classe Nadador

    void swim (){
        System.out.println("The Swimmer is swimming at the pool.");
    } 
    void drown (){
        System.out.println("Now he is Drownig out at the pool!");
    }

    // Criando Metodo principal para executar o programa

    public static void main(String[] args) {

        // Criando meu Segundo Objeto (um Nadador)

        Swimmer bracao = new Swimmer();
        bracao.name = "Cotoco";
        bracao.age = 18;

        // Imprimindo na Tela uma frase e usando objeto
        System.out.println("We have here a Swimmer, his name is " + bracao.name + " and his age is " + bracao.age);
        
        // Invocando os metodos do Nadador

        bracao.swim();
        bracao.drown();

    }

}
