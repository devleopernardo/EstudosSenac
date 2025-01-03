// Exercícios 10 OOP - Crie uma nova classe Filme com os atributos públicos que contenha Titulo, Ator, Diretor 
// e escolha mais dois de sua escolha não esqueça de adicionar o método getter para esses atributos.
// No método main, crie um objeto "Filme" e exiba os valores desses atributos usando os getters.

// Obs: Coloque os comentários no seu código em seus devidos lugares
// Atributos da classe
// Construtor da classe
// Métodos getters para acessar os atributos
// Método main para criar um objeto e definir os valores dos atributos
// Criando um objeto da classe Filme definindo os valores dos atributos
// Exibindo os valores dos atributos do objeto

// Definindo os Atributos
public class Movie {
    public String title;
    public String actor;
    public String director;
    public String gender;
    public int launch;

    // Building oh the Class
    public Movie(String title, String actor, String director, String gender, int launch){
        this.title = title;
        this.actor = actor;
        this.director = director;
        this.gender = gender;
        this.launch = launch;
    }
    
    // Metodo Getter
    public String getTitle(){
        return title;
    }
    public String getActor(){
        return actor;
    }
    public String getDirector(){
        return director;
    }
    public String getGender(){
        return gender;
    }
    public int getLaunch(){
        return launch;
    }

    // Metodo principal para Executar o Java
    public static void main(String[] args) {
        // Instanciando o Objeto e definindo os Atributos
        Movie comedyMovie = new Movie("Ai que Vida", "Ze Comeia", "Seu Ze", "Comedy", 2012);
    
    // Exibindo os Valores usando o metodo Getter
    
        System.out.println("Did you saw the movie " + comedyMovie.getTitle() + "? It is really funny the scenes os " + comedyMovie.getActor() + "!");
        System.out.println("The main Director is: " + comedyMovie.getDirector() + ". This Movie Breath " + comedyMovie.getGender());
    
    
    
    }

    

}
