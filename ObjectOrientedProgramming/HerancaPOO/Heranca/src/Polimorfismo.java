import animais.*;

public class Polimorfismo {
      public static void main(String[] args) {
        Animal[] coisas = new Animal[3];
        coisas[0] = new Animal("PC");
        coisas[1] = new Catiorro("Django");
        coisas[2] = new Cat("Estrelinho");

        for (Animal cachorro : coisas){
            cachorro.comer();
            cachorro.beber();
        }
    }
}
