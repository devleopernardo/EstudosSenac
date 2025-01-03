public class Car {
// Atributos da Classe Carro
    String Brand;
    String Model;
    String Color;
    
    void virar (String direction){
        System.out.println("The car will to turn " + direction);
    }
    void acelerar (){
        System.out.println("O CArro esta acelerando");
    }
    void frear (){
        System.out.println("O Carro esta freando");
    }
}