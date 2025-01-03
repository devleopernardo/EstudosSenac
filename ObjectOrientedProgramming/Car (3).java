public class Car {
// Atributos da Classe Carro
    
    String Brand;
    String Model;
    String Color;
    int Year;
    
    
    // Escrevendo os metodos do carro que estamos criando
    
    void virar (String direction){
        System.out.println("The car will to turn " + direction);
    }
    void acelerar (){
        System.out.println("O Carro esta acelerando");
    }
    void frear (){
        System.out.println("O Carro esta freando");
    }
    void hit (){
        System.out.println("The car will hit you!!");
    }

    // Criando Metodo principal para executar o programa

    public static void main(String[] args) {
    
        // Criando o meu primeiro objeto (um Fiat Uno)
        Car firstCar = new Car();
        firstCar.Brand = "Fiat";
        firstCar.Model = "Uno";
        firstCar.Color = "Red";
        firstCar.Year = 1998;

        System.out.println("My car is a " + firstCar.Brand + " " + firstCar.Model + " the color is " + firstCar.Color + " and year of manufactured is " + firstCar.Year + ".");
    

        // Utilizando os metodos do carro
        firstCar.virar("LEFT");
        firstCar.acelerar();
        firstCar.frear();
        firstCar.hit();
    }
}