algoritmo "Exercicio 72 Laco Repita"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Rafael Bomfim 
// Descrição   : 72 -  Crie um programa usando o "Repita" que mostre quantos números pares existem de 1 a 20.
// Autor(a)    : Leonardo Alves
// Data atual  : 18/11/2024
var

counter: inteiro
contador: inteiro

inicio

counter <- 1
repita
    se (counter % 2 = 0) entao
        escreval (counter)
        contador <- contador + 1
    fimse
    counter <- counter + 1
    
ate counter > 20

escreval ("A quantidade de numeros pares: ", contador)
fimalgoritmo