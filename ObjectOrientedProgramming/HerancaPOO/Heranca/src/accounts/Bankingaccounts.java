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

Classe ContaPoupanca (herda de ContaBancaria):    -Atributo adicional: taxaDeJuros (double).
    -Construtor: Inicializa o número, o saldo e a taxa de juros.
   -Método sobrescrito: exibirDetalhes(), que exibe todos os detalhes da classe base e a taxa de juros.

Classe Principal App:
   -Crie instâncias de ContaCorrente e ContaPoupanca, e chame o método exibirDetalhes() para cada uma. */

// Creating the class
package accounts;

public class Bankingaccounts {
    // Creating the fields of the class Banking accounts
    private String number;
    private double balance;

    // Construtor method, created for inherit the methods for other 2 classes
    public Bankingaccounts(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    // Getter method
    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method
    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Show Details method, most be inherit for the other classes
    public void showdetails(){
        System.out.printf("The number's account is %s the balance is %.2f ", number, balance);
    }

}