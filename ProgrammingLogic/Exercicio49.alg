algoritmo "Exercicio 49"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Rafael

// Descrição   : Crie um programa que peça ao usuário para digitar números. 
// O programa deve parar de pedir números quando o usuário digitar "0" e, ao final, exibir a soma de 
// todos os números digitados.

// Autor(a)    : Leonardo Alves
// Data atual  : 25/10/2024
var

numbers: real
sum: real
total: real

inicio

numbers <- 1
enquanto (numbers <> 0) faca
    escreval ("Digite alguns numeros e realizarei soma deles (Digite 0 para encerrar o Programa):")
    leia (numbers)
    sum <- sum + numbers
    total <- sum 

fimenquanto

escreval ("A Somatoria dos numeros digitados é : ", total)


fimalgoritmo