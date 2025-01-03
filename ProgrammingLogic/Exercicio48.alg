algoritmo "Exercicio48"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]

// Descrição   : Exercício 48
// Desenvolva um programa que solicite ao usuário para digitar números inteiros. 
// O programa deve contar quantos números o usuário digitou e exibir esse total quando o usuário digitar "0" para parar.

// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : DATA_ATUAL/MES_ATUAL/ANO_ATUAL
var

numeroDigitado: inteiro
counter: inteiro

inicio

counter <- 0
numeroDigitado <- 1
enquanto (numeroDigitado <> 0) faca
    escreval ("Digite um numero:")
    leia (numeroDigitado)
    counter <- counter + 1
fimenquanto

escreval("Voce digitou: ", counter-1, " numeros")

fimalgoritmo