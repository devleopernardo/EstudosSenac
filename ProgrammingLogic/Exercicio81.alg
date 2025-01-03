algoritmo "Exercicio 81 Laço Enquanto"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Rafael Bomfim]

// Descrição   : 81 -  Crie um programa que solicite o usuário quantos
// números ele deseja digitar, depois digite os números e encontre o maior número entre N.

// Autor(a)    : Leonardo Alves
// Data atual  : 25/11/2024

var

numero: real
quantosNumeros: inteiro
contador: inteiro
maiorNumero: real

inicio

escreval("Digite quantos números deseja digitar:")
leia(quantosNumeros)


enquanto (quantosNumeros > contador) faca
    escreval("Digite um Número:")
    leia(numero)
    contador <- contador + 1
    se (numero > maiorNumero) entao
        maiorNumero <- numero
    fimse    
   
fimenquanto

escreval ("O maior número entre os digitados é: ", maiorNumero)

fimalgoritmo