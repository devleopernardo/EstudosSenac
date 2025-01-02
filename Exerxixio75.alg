algoritmo "Exercicio 75 Loop Do-While"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Rafael Bomfim]
// Descrição   : 75 -  Crie um programa usando o "Repita" que imprima a 
// soma dos números positivos até o usuário digitar zero.
// Autor(a)    : Leonardo Alves
// Data atual  : 23/11/2024
var

numbers: real
sum: real

inicio

repita
    escreval ("Digite números positivos e retornarei a soma deles (Digite 0 para encerrar o programa):")
    leia (numbers)
    se (numbers < 0) entao
        escreval ("Número Inválido, tente novamente")
    senao
        sum <- sum + numbers
    fimse
ate numbers = 0

escreval (sum)

fimalgoritmo