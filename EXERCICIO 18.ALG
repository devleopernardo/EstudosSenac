Algoritmo "Exercicio 18"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Rafael
// Descrição   : 18 - Faça um programa que leia o preço de um produto,
// calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.
// Autor(a)    : Leonardo
// Data atual  : 09/10/2024
Var
   // Seção de Declarações das variáveis

   preco : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreval ("Qual o valor do produto: R$ ")
   leia (preco)

   preco <- preco - preco * (5/100)

   escreval ("O novo preco com desconto de 5% é: ", preco)




Fimalgoritmo