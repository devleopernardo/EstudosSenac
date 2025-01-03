public class Carroget {
    // Atributos
    String color;
    String brand;
    String model;

    // Construtor da Classe
    public Carroget(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    // Metodo Getter
    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Executar metodo Main
    public static void main(String[] args) {
        // Instanciando o Objeto da Classe Carroget
        Carroget unodaescada = new Carroget("Red", "Fiat", "Hatch");

        // Exibindo os Valores (imprimindo na tela)

        System.out.println("Eu tenho um Carrinho da " + unodaescada.brand + ", ele eh modelo " + unodaescada.model
                + ", e como tem uma escada no teto e eh da cor " + unodaescada.color + ", voce vai comer poeira!!");

        // Utilizando os metodos do carro
        unodaescada.virar();
        unodaescada.acelerar();
        unodaescada.frear();
        unodaescada.hit();

    }

    // Escrevendo os metodos do carro que estamos criando
    void virar() {
        System.out.println("The will to turn");
    }

    void acelerar() {
        System.out.println("The car is pumpinn the gas");
    }

    void frear() {
        System.out.println("The car is stoping");
    }

    void hit() {
        System.out.println("The car will hit you!");
    }

}
