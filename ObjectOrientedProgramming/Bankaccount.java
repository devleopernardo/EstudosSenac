// Exercícios 12 OOP - Crie uma classe ContaBancaria com os atributos numero e saldo.
// Utilize métodos getter e setter para manipular esses atributos. No método main, defina os valores de numero e saldo, e depois exiba-os.

// Obs: Coloque os comentários no seu código em seus devidos lugares
// Atributos da classe
// Métodos getters/Setters para ver e modificar os atributos
// Método main para criar um objeto e definir os valores dos atributos
// Criando um objeto da classe definindo os valores dos atributos
// Exibindo os valores dos atributos do objeto


public class Bankaccount {
    
    // Atributos da Classe
    public int number;
    public int balance;
    
    // Builder
    public Bankaccount(int number, int balance){
        this.number = number;
        this.balance = balance;
    }

    // Metodo Getter
    public int getNumber(){
        return number;
    }
    public int getBalance(){
        return balance;
    }

    // Metodo Setter
    public void setNumber(){
        this.number = number;
    }
    public void setBalance(){
        this.balance = balance;
    }

    // Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {
        // Criando um objeto da classe definindo os valores dos atributos
        Bankaccount savings = new Bankaccount(22040, 1500);
        

        System.out.println("The Savings of the account number: " + savings.getNumber() + " is $ " + savings.getBalance());
        
    }
}
