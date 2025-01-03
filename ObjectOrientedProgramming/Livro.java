// Exercícios 08 OOP - Crie uma classe Livro com os atributos titulo e autor e escolha mais dois.
// Em seguida, crie um objeto dessa classe e defina os valores dos atributos
// e adicione um método à classe Livro e exiba os valores desses atributos.


public class Livro {
    // Definindo Atributos
    
    public String titulo;
    public String autor;
    public String editora;
    public int tiragem;
    
    // Construtor da Classe Livro

    public Livro(String titulo, String autor, String editora, int tiragem){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.tiragem = tiragem;
    }

    // Definindo Metodos para a Classe Livro

    void abrir(){
        System.out.println("O Livro esta se abrindo ...");
    }

    void revelando(){
        System.out.println("O Livro esta revelando o Grande Conflito que envolve toda a Humanidade!!");
    }

    // Executando o Metodo Main
    public static void main(String[] args) {
        
        // Instanciando um Objeto (um Livro ae)
        Livro greatcontroversy = new Livro("Great Controversy", "Ellen G. White", "Casa Publicadora Brasileira", 198655622);
        
        // Imprimindo os Atributos do Objeto (greatcontroversy) criados

        System.out.println("The Title of the Book is " + greatcontroversy.titulo);
        System.out.println("The Autor is Called " + greatcontroversy.autor);
        System.out.println("The publisher house is " + greatcontroversy.editora);
        System.out.println("The print run number is " + greatcontroversy.tiragem);
       

        // Invocando os Metodos da Classe Livro que defini na linha 23

        greatcontroversy.abrir();
        greatcontroversy.revelando();

        

        
    }




}
