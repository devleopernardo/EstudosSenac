algoritmo "Exercicio 74 LOOP Repeat"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]
// Descrição   : 74 -  Crie um programa usando o "Repita" que calcula a média de 5 números.
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : DATA_ATUAL/MES_ATUAL/ANO_ATUAL
var

average: real
numbers: real
counter: inteiro

inicio

repita
    escreval("Digite 5 números:")
    leia (numbers)
    average <- average + numbers
    counter <- counter + 1
ate counter = 5

escreval (average/5)

fimalgoritmo