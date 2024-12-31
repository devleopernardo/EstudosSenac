algoritmo "Exercicio45"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Rafael

// Descrição   : Crie um programa Fatorial de um número.
// O fatorial de um número é o produto dele pelos seus antecessores maiores que 0. O fatorial de um número é a multiplicação 
// desse número por todos os seus antecessores maiores que zero. Para representar o fatorial de um número, 
// escrevemos o número seguido de um ponto de exclamação, ou seja, n! (lê-se “n fatorial”).

// Autor(a)    : Leonardo
// Data atual  : DATA_ATUAL/MES_ATUAL/ANO_ATUAL

var

counter: real
typedNumber: real

inicio

escreval("Digite um numero e direi seu Fatorial:")
leia(typedNumber)

counter <- typedNumber

enquanto (counter > 1) faca
    counter <- counter - 1
    typedNumber <- typedNumber * (counter)
    
fimenquanto

escreval ("O Resultado do Fatorial do Numero digitado é: ", typedNumber)

fimalgoritmo