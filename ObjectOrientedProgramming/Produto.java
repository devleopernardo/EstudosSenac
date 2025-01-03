// Exercícios 07 OOP - Crie uma nova classe Produto com os atributos públicos que contenha nome, 
// preço e quantidade, não esqueça de adicionar o método getter para esses atributos. 
// No método main, crie um objeto "Produto" e exiba os valores desses atributos usando os getters.

public class Produto {
    // Definindo Atributos
    String nome;
    String preco;
    String quantidade;

    // Construtor da Classe
    public Produto(String nome, String preco, String quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Metodo Getter
    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    // Metodo main que Executa do Java
    public static void main(String[] args) {

        // Instanciando o Objeto xingling
        Produto xingling = new Produto("Chinelo", "US$299", "99");

        // Exibindo os Valores na Tela
        System.out.println("I Hate " + xingling.nome + " xingling from China!!");
    }
}
