algoritmo "Nome do Programa"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]
// Descrição   : 67 -  Crie um programa usando o "PARA" que conte quantos números pares e ímpares existem entre 1 e 100.
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : DATA_ATUAL/MES_ATUAL/ANO_ATUAL
var

par: real
contadorPar: inteiro
contadorImpar: inteiro

inicio

para par de 1 ate 100 faca
    se (par % 2 = 0) entao
        contadorPar <- contadorPar + 1
    senao
        contadorImpar <- contadorImpar + 1
    fimse

fimpara

escreval ("A Quantidade de numeros pares: ", contadorPar)
escreval ("A Quantidade de numeros impares: ", contadorImpar)


fimalgoritmo