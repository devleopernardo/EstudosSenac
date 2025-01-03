/* Exercícios 23 OOP -  Crie uma superclasse "ContaBancaria" e duas subclasses "ContaCorrente" e "ContaPoupanca", 
que herdam de "ContaBancaria". Implemente construtores nas subclasses e métodos para exibir os detalhes das contas.

Passos:
Classe ContaBancaria:
    -Atributos: numero (String), saldo (double).
   - Método: exibirDetalhes(), que exibe o número da conta e o saldo.

Classe ContaCorrente (herda de ContaBancaria):
    -Atributo adicional: limite (double).
    -Construtor: Inicializa o número, o saldo e o limite.
    -Método sobrescrito: exibirDetalhes(), que exibe todos os detalhes da classe base e o limite.

Classe ContaPoupanca (herda de ContaBancaria):   

 -Atributo adicional: taxaDeJuros (double).
    -Construtor: Inicializa o número, saldo e a taxa de juros.
   -Método sobrescrito: exibirDetalhes(), que exibe todos os detalhes da classe base e a taxa de juros.

Classe Principal App:
   -Crie instâncias de ContaCorrente e ContaPoupanca, e chame o método exibirDetalhes() para cada uma. */


// Refering the package name   
package accounts;

// Creating de Class Checking Account
public class Checkingaccount extends Bankingaccounts {
    
    // Creating the attribute specif for this class
    private double limit;

    // Constructor of the class
    public Checkingaccount (String number, double balance, double limit){
        super(number, balance);
        this.limit = limit;
    }

    //Method applied in this class
    public void showdetails(){
        super.showdetails();
        System.out.printf("The Checking account Limit is: %.2f", limit);
    }
    
    
}
