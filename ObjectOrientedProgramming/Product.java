// Exercícios 17 OOP - Crie uma classe chamada Produto com atributos para nome e quantidade em estoque, garantindo que a quantidade em estoque não seja negativa.

// 1 - Crie a classe Produto com os seguintes atributos privados:
// • nome (String)
// • quantidade (int)
// 2 - Implemente os métodos setter e getter para os atributos:
// • setNome(String nome): Define o nome do produto.
// • getNome(): Retorna o nome do produto.
// • setQuantidade(int quantidade): Define a quantidade em estoque, garantindo que não seja negativa.
// • getQuantidade(): Retorna a quantidade em estoque.
// 3 - No método main, crie uma instância de Produto, defina o nome e a quantidade, e exiba esses valores.

// Creating the class Product
public class Product {
    private String name;
    private int amount;

    // Builder
    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // Getter Method
    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    // Setter Method
    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        if (amount > 0) {
            System.out.println("Valid Amount!");
        }
        else {
            System.out.println("Invalid Amount!");
        }
    }

    // Main method for running
    public static void main(String[] args) {
        // Creating the object Chinelo
        Product chinelo = new Product("Havanas", 99);
        chinelo.setAmount(-2);

        System.out.println("You are buying: " + chinelo.getName());
        System.out.println("That's it! The Amount is: " + chinelo.getAmount());


    }
}
