algoritmo "Exercicio 77 Tabuada - Loop Do-While"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]
// Descrição   : 77 -  Crie um programa usando o "Repita" que imprima a tabuada de um número digitado pelo usuário.
// Autor(a)    : Leonardo Alves
// Data atual  : 23/11/2024
var

number: inteiro
counter: inteiro

inicio

escreval ("Digite um número e retornarei sua Tabuada:")
leia (number)
counter <- 1
repita
    escreval (counter," X ", number, " = ", counter * number)
    counter <- counter + 1
ate counter > 10

fimalgoritmo