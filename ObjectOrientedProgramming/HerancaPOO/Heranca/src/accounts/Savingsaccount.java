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

package accounts;

// Creating the class Svings Account extended from Banking Accounts
public class Savingsaccount extends Bankingaccounts{

    //Creating the expecific field of this class
    private double interestrates;

    //The constructor of this class invokes the constructor of the superclass (Banking Accounts).
    public Savingsaccount (String number, double balance, double interestrates){
        super(number, balance);
        this.interestrates = interestrates; 
    }

    // Every method are reused from superclass here
    public void showdetails(){
        super.showdetails();
        System.out.printf("The interest rates of the account is %.2f", interestrates);
    }

}
