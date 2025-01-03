package animais;
// Definicao da classe Catiorro, que herda de Animal

public class Catiorro extends Animal {

    // Construtor da Classe Catiorro que chama o construtor da classe pai (Animal)
    public Catiorro (String nome){
        super (nome);
    }

    // Metodo para simular o Latido
    public void latir(){
        System.out.printf("%s latiu \n", getNome());
    }

    
}