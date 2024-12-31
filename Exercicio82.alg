algoritmo "Exercício 82 Ultimo UC lógica de Programação Senac"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Rafael Bomfim]
// Descrição   : 82 - Crie um programa que Encontrar o menor número entre N (Usando laço de repetição Enquanto).
// Autor(a)    : Leonardo Alves
// Data atual  : 25/11/2024
var

quantosNumeros: inteiro
numero: real
contador: inteiro
menorNumero: real

inicio

escreval("Digite quantos números deseja digitar:")
leia(quantosNumeros)

menorNumero <- 10000000000000000000000000000000000
 enquanto (quantosNumeros > contador) faca
    escreval("Digite um Número:")
    leia(numero)
    
    se (numero < menorNumero) entao
        menorNumero <- numero
    fimse 

    contador <- contador + 1
 fimenquanto

escreval ("O menor número entre os digitados é: ", menorNumero)

fimalgoritmo