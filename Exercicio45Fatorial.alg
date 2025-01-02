algoritmo "Exercicio 45 Fatorial"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]

// Descrição   : Crie um programa Fatorial de um número.
// O fatorial de um número é o produto dele pelos seus antecessores maiores que 0. 
// O fatorial de um número é a multiplicação desse número por todos os seus antecessores maiores que zero. 
// Para representar o fatorial de um número, escrevemos o número seguido de um ponto de exclamação, 
// ou seja, n! (lê-se “n fatorial”).

// Autor(a)    : Leonardo Alves
// Data atual  : 25/10/2024

var

numeroDigitado: inteiro
fatorial: inteiro
multiplicador: inteiro
proximonumero: inteiro

inicio

escreval ("Digite um Número e retornarei seu Fatorial:")
leia (numeroDigitado)
enquanto (numeroDigitado > 0) faca
    proximonumero <- numeroDigitado - 1
    multiplicador <- proximonumero
    fatorial <- multiplicador * proximonumero
fimenquanto

escreval ("O resultado do Fatorial é: ", fatorial)


fimalgoritmo