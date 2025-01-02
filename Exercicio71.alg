algoritmo "Exercicio 71 Laço REPITA"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]
// Descrição   : 71 -  Crie um programa usando o "Repita" que imprima na tela o calculo da média de 4 números.
// Autor(a)    : Leonardo
// Data atual  : 17/11/2024
var

contador: inteiro
numeros: real
media: real

inicio

contador <- 1
repita
    escreval("Digite um número:")
    leia (numeros)
    contador <- contador + 1
    media <- media + numeros
ate contador > 4

escreval ("A média dos 4 números digitados = ", media/4)


fimalgoritmo