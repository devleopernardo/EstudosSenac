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
    public String macaddress;

    // Construtor da classe
    public Computer(String brand, String type, String processor, String macaddress) {
        this.brand = brand;
        this.type = type;
        this.processor = processor;
        this.macaddress = macaddress;
    }

    // Metodo Getter que pega e mostra os atributos
    public String getBrand(){
        return brand;
    }
    public String getType(){
        return type;
    }
    public String getProcessor(){
        return processor;
    }
    public String getMacaddress(){
        return macaddress;
    }

    // Metodo main para Executar o programa
    public static void main(String[] args) {
        // Instanciando o objeto na Classe
        Computer leocomputer = new Computer("Del", "Laptop", "i9", "2C:54:91:88:C9:E3");

        // Exibindo os Valores do Objeto leocomputer atraves do metodo Getter
        
        System.out.println("I'm Leo and I have a Computer of the brand " + leocomputer.getBrand());
        System.out.println("This Computer is a kind of a " + leocomputer.getType());
        System.out.println("His processor is a " + leocomputer.getProcessor() + " and his MACAddress is " + leocomputer.getMacaddress());
        

    }   

}
