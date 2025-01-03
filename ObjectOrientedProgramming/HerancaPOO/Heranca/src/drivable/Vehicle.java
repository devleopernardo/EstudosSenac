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

public class Vehicle {
    public String brand;
    public int year;

    // Constructor
    public Vehicle (String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    // Details Method
    public void details(){
        System.out.printf("The Brand's Vehicle is %s and year of Manufactured is %d \n", brand, year);
    }
}
