algoritmo "Exercicio 73 Laço Repita"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Rafael Bomfim
// Descrição   : 73 -  Crie um programa usando o "Repita" que mostre a soma dos números de 1 a 10.
// Autor(a)    : Leonardo Alves
// Data atual  : 23/11/2024
var

sum: real
counter: inteiro

inicio

sum <- 1
counter <- 1
repita
    escreval(counter)
    counter <- counter + 1
    sum <- sum + counter
ate counter = 10

escreval ("A Soma dos números de 1 a 10 é = ", sum)



fimalgoritmo