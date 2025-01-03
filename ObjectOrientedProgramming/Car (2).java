public class Car {
// Atributos da Classe Carro
    
    String Brand;
    String Model;
    String Color;
    
    // Escrevendo os metodos do carro que estamos criando
    
    void virar (String direction){
        System.out.println("The car will to turn " + direction);
    }
    void acelerar (){
        System.out.println("O CArro esta acelerando");
    }
    void frear (){
        System.out.println("O Carro esta freando");
    }

    // Criando Metodo principal para executar o programa

    public static void main(String[] args) {
    
        // Criando o meu primeiro objeto (um Fiat Uno)
        Car firstCar = new Car();
        firstCar.Brand = "Fiat";
        firstCar.Model = "Uno";
        firstCar.Color = "Red";
    }
}