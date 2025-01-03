/* Exercícios 24 OOP -  Crie uma superclasse "Veiculo" com um método "detalhes". Crie duas subclasses, "Carro" e "Moto", 
que sobrescrevem o método "detalhes" para fornecer informações específicas sobre carros e motos.

Passos:
Classe Veiculo:
Atributos: marca (String), ano (int).
Método: detalhes(), que exibe a marca e o ano do veículo.

Classe Carro (herda de Veiculo):
Atributo adicional: numPortas (int).
Método sobrescrito: detalhes(), que exibe a marca, o ano e o número de portas.

Classe Moto (herda de Veiculo):
Atributo adicional: cilindradas (int).
Método sobrescrito: detalhes(), que exibe a marca, o ano e as cilindradas.

Classe Principal App:
 Crie instâncias de Carro e Moto, e chame o método detalhes() para cada uma. */


package drivable;

public class Bike extends Vehicle{
    public int ccs;


    // Constructor
    public Bike (String brand, int year, int ccs){
        super(brand,year);
        this.ccs = ccs;
    }

    // Overwritten Method
    public void details(){
        super.details();
        System.out.printf("The displacement of the Motorcycle Engine is %d", ccs);
    }

    
}
