algoritmo "Exercicio 46"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]

// Descrição   : 46 -  Crie um programa que peça ao usuário para digitar um número de cada vez. 
// O programa deve continuar pedindo números até que o usuário digite '0' para parar. 
// Depois que o usuário parar de inserir números, o programa deve calcular e mostrar a média de 
// todos os números digitados (sem contar o '0'). Use a estrutura de repetição 'enquanto'.

// Autor(a)    : Leonardo Alves
// Data atual  : 25/10/2024

var

typedNumbers: real
sum: real
total: real
counter: real

inicio

typedNumbers <- 1
counter <- 0
enquanto (typedNumbers <> 0) faca
    escreval ("Digite alguns números:")
    leia (typedNumbers)
    counter <- counter + 1
    sum <- sum + typedNUmbers 
    total <- sum
fimenquanto

escreval ("A média dos Números digitados é: ", total/(counter-1))


fimalgoritmo