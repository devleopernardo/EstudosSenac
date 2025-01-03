// Exercícios 11 OOP - Crie uma classe Cidade com os atributos nome e população.
// Utilize métodos getter e setter para manipular esses atributos.
// No método main, defina os valores de nome e população, e depois exiba-os.


//Criando a Classe Town (Cidade)
public class Town {
    
    // Criando os Atributos
    public String name;
    public int population;

     // Colocando o metodo Getter para buscar os atributos criados
     public String getName(){
        return name;
     }
     public int getPopulation(){
        return population;
     }
    
    // Colocando o metodo Setter para montar e modificar os Atributos buscados
    public void setName(String name){
        this.name = name;
    }
    public void setPopulation(int population){
        this.population = population;
    }

    public static void main(String[] args) {
        Town neighborhood = new Town();
        neighborhood.setName("South");
        neighborhood.setPopulation(150564);

        System.out.println("The Population of " + neighborhood.getPopulation() + " people lives in " + neighborhood.getName());
    }

   

    
}
