// Exercícios 09 OOP - Crie uma nova classe Computador com 4 atributos públicos do jeito que quiser, 
// não esqueça de adicionar o método getter para esses atributos. No método main, 
// crie um objeto "Computador" e exiba os valores desses atributos usando os getters.

// Obs: Coloque os comentários no seu código em seus devidos lugares:- Atributos da classe
// - Construtor da classe
// - Métodos getters para acessar os atributos
// - Método main para criar um objeto e definir os valores dos atributos
// - Criando um objeto da classe Computador e definindo os valores dos atributos
// - Exibindo os valores dos atributos do objeto

// Criando a Classe Computer
public class Computer {
    public String brand;
    public String type;
    public String processor;
    public int macaddress;

    // Construtor da classe
    public Computer(String brand, String type, String processor, int macaddress) {
        this.brand = brand;
        this.type = type;
        this.processor = processor;
        this.macaddress = macaddress;
    }

}
