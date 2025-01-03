algoritmo "Exercicio 52"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]

// Descrição   : Exercício 52
// Faça um programa que solicite ao usuário para digitar números e no final "some todos os números que o usuário digitou " de uma vez. 
// O programa deve parar quando o usuário digitar "0".

// Autor(a)    : Leonardo Alves
// Data atual  : DATA_ATUAL/MES_ATUAL/ANO_ATUAL

var

numbers, sum: real

inicio

numbers <- 1
enquanto (numbers <> 0) faca
    escreval ("Digite um Numero:")
    leia (numbers)
    sum <- numbers + sum
fimenquanto

escreval("A Soma de todos os Numeros digitados eh: ", sum)

fimalgoritmo