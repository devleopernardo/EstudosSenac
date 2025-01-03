package animais;


public class Cat extends Animal {

    public Cat (String nome){
        super(nome);
    }
    
    public void miar(){
        System.out.printf("%s miou\n", getNome());
    }
}
